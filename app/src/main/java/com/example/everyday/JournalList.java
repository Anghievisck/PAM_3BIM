package com.example.everyday;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class JournalList extends AppCompatActivity {
    TextView txtPagina;
    Button btnJournal1;
    Button btnJournal2;
    Button btnJournal3;
    Button btnJournal4;
    Button btnJournal5;
    Button btnAnterior;
    Button btnProximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal_list);

        txtPagina = (TextView) findViewById(R.id.txtPagina);
        btnJournal1 = (Button) findViewById(R.id.btnJournal1);
        btnJournal2 = (Button) findViewById(R.id.btnJournal2);
        btnJournal3 = (Button) findViewById(R.id.btnJournal3);
        btnJournal4 = (Button) findViewById(R.id.btnJournal4);
        btnJournal5 = (Button)findViewById(R.id.btnJournal5);
        btnAnterior = (Button) findViewById(R.id.btnAnterior);
        btnProximo = (Button) findViewById(R.id.btnProximo);

            btnProximo.setOnClickListener(this::OnClickListener);
            btnAnterior.setOnClickListener(this:: OnClickListener2);

    }
    public int c = 0;
    private int OnClickListener(View view) {
        c = c + 1;
        PaginaDef(c);
        int pag = c ;
        if(pag > 2) {
            Toast.makeText(JournalList.this, "Não existem listas posteriores",Toast.LENGTH_SHORT).show();
            btnProximo.setVisibility(View.INVISIBLE);
            txtPagina.setText("Página 2 de 2");
        }
        else {
            txtPagina.setText("Página " + pag + " de 2");
        }
        return c;
    }

    private int OnClickListener2(View view) {
        c = c - 1;
        PaginaDef(c);
        int pag = c ;
        if(pag <= 0) {
            Toast.makeText(JournalList.this, "Não existem listas anteriores",Toast.LENGTH_SHORT).show();
            btnAnterior.setVisibility(View.INVISIBLE);
            txtPagina.setText("Página 1 de 2");
        }
        else {
            txtPagina.setText("Página " + pag + " de 2");
        }

        return c;
    }
    public void PaginaDef(int c) {
        btnAnterior.setVisibility(View.VISIBLE);
        btnProximo.setVisibility(View.VISIBLE);
        String JornaisFav[] =  {"https://estadao.com", "https://https://www.uol.com.br", "https://www.espn.com.br",
                "https://jornal.usp.br", "https://oglobo.globo.com", "https://veja.abril.com.br", "https://tecnologia.ig.com.br",
                "https://oantagonista.com.br", "https://jornalggn.com.br", "https://www.nytimes.com"};
        if (c < 0) {
            btnAnterior.setVisibility(View.INVISIBLE);
            c = 1;
        }
        switch (c) {

            case 1:
                btnJournal1.setText(JornaisFav[0]);
                btnJournal2.setText(JornaisFav[1]);
                btnJournal3.setText(JornaisFav[2]);
                btnJournal4.setText(JornaisFav[3]);
                btnJournal5.setText(JornaisFav[4]);
            break;

            case 2:
                btnJournal1.setText(JornaisFav[5]);
                btnJournal2.setText(JornaisFav[6]);
                btnJournal3.setText(JornaisFav[7]);
                btnJournal4.setText(JornaisFav[8]);
                btnJournal5.setText(JornaisFav[9]);
                break;
        }
   }
}