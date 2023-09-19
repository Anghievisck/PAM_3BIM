package com.example.everyday;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.AsyncTaskLoader;
import androidx.loader.content.Loader;

import com.example.models.WeatherModel;
import com.example.request.*;
import com.example.storage.DatabaseHelper;
import com.example.validations.CurrencyChecks;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<MainPageModel> {
  private TextView adviceSentence;
  private TextView currencySentense;

  private EditText txtConvertFrom;
  private EditText txtConvertTo;
  private TextView climateSentence;
  private DatabaseHelper db;

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adviceSentence = findViewById(R.id.adviceSentence);
        currencySentense = findViewById(R.id.currency);

        climateSentence = findViewById(R.id.climate);

        txtConvertFrom = findViewById(R.id.convert_from);
        txtConvertTo = findViewById(R.id.convert_to);


      if (getSupportLoaderManager().getLoader(0) != null) {
            getSupportLoaderManager().initLoader(0, null, this);
        }

      Bundle query = new Bundle();

      query.putString("MONEY_FROM", "EUR");
      query.putString("MONEY_TO", "BRL");

      getSupportLoaderManager().restartLoader(0, query, this);

      db = new DatabaseHelper(this);

  }

    @NonNull
    @Override
    public Loader<MainPageModel> onCreateLoader(int id, @Nullable Bundle args) {
        return new MainPageLoader(this, args);
    }

    @Override
    public void onLoadFinished(@NonNull Loader<MainPageModel> loader, MainPageModel data) {
      if (data.hasError()) {
          Toast.makeText(this, data.getError(), Toast.LENGTH_LONG);
          return;
      }

        // adviceSentence.setText(String.valueOf(data.getWeather().getTemp()));
      adviceSentence.setText(String.valueOf(data.getRandomAdvice()));
      currencySentense.setText(CurrencyChecks.decimalNumbers(data.getCurrencyTo()));
     climateSentence.setText(String.valueOf(data.getWeather().toString()));

    }

    @Override
    public void onLoaderReset(@NonNull Loader<MainPageModel> loader) { /* Not implmented */ }

    public void convertMoney(View v){
        Bundle query = new Bundle();

        String from = CurrencyChecks.parseCoin(txtConvertFrom.getText().toString());
        String to = CurrencyChecks.parseCoin(txtConvertTo.getText().toString());

        try{
            CurrencyChecks.validCoin(from);
            CurrencyChecks.validCoin(to);
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(),Toast.LENGTH_SHORT).show();
            return;
        }


        // query.putString("API", FreeCurrencyUtils.API_ID);
        query.putString("MONEY_FROM", from);
        query.putString("MONEY_TO", to);

        db.addHistory(from, to);

        getSupportLoaderManager().restartLoader(0, query, this);
    }

    public void toHistoryActivity(View v){
        Intent intent = new Intent(this, history.class);
        startActivity(intent);
    }
    public void toJournalList(View v){
        Intent intent = new Intent(this, JournalList.class);
        startActivity(intent);
    }
}

class MainPageModel{
    private final String randomAdvice;
    private final WeatherModel weather;

    private final double currency;

    public String usingAPI = null;
    private final String error;

    public MainPageModel(String error) {
        this.randomAdvice = "";
        this.currency= 0;
        this.weather = new WeatherModel();
        this.error = error;
    }

    public MainPageModel(String randomAdvice, WeatherModel weather, double currency){
        this.randomAdvice = randomAdvice;
        this.weather = weather;
        this.currency = currency;

        this.error = null;
    }

    public String getRandomAdvice(){
        return this.randomAdvice;
    }

    public WeatherModel getWeather(){
        return this.weather;
    }

    public String getError() {
        return error;
    }

    public boolean hasError() {
        return error != null;
    }

    public double getCurrencyTo(){ return currency; }

}


class MainPageLoader extends AsyncTaskLoader<MainPageModel> {
    private Bundle query;

    public MainPageLoader(Context context, Bundle query) {
        super(context);
        this.query = query;
    }

    @Override
    protected void onStartLoading(){
        super.onStartLoading();
        forceLoad();
    }

    @Override
    @Nullable
    public MainPageModel loadInBackground(){
        String money_from = query.getString("MONEY_FROM");
        String money_to = query.getString("MONEY_TO");

        Log.d("API_MONEY", money_from);
        Log.d("API_MONEY", money_to);

        try {
            String advice = AdviceUtils.getRandomAdvice();
            WeatherModel weather = WeatherUtils.getCurrentWhether();
            double currency = FreeCurrencyUtils.convertedAmmount(
                    money_from,
                    money_to
            );

            return new MainPageModel(advice, weather, currency);
        } catch (Exception e) {
            return new MainPageModel(e.getMessage());
        }
    }
}
