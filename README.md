Dupla: Rafaella Medeiros Trexler Mourão e Pedro Luís Anghievisck
[Design](https://design.penpot.app/#/view/eed6a2fa-084f-808f-8002-58b5f5d6a4c6?page-id=eed6a2fa-084f-808f-8002-58b5f5d6a4c7&section=interactions&index=0&share-id=5d8c4d0a-1e64-8116-8002-74622cab1a29)

[Vídeo](https://youtube.com/shorts/dZXKlwzCGLU?feature=share)

# Diagrama de Classes

<img src="img-1e2bim/Disgrama de classes.png" height="250px">

# DER

<img src="img-1e2bim/DER.png" height="250px">

# Descrição do App

O nosso aplicativo "EveryDay" foi desenvolvido para fornecer informações importantes para o dia a dia do usuário de maneira fácil e conveniente. Com apenas uma tela, o usuário pode ter acesso a diversas informações úteis.

Começamos exibindo as condições climáticas em tempo real, com base na localização do usuário. Isso é possível graças à API "Weather api" e à API "FreeIP api", que trabalham juntas para identificar a localização do usuário com base no endereço IP do dispositivo. Com esta informação, podemos fornecer dados precisos sobre a temperatura, previsão do tempo, umidade e outras informações relacionadas ao clima em sua região.

Além disso, o aplicativo apresenta uma frase inspiradora do dia, selecionada aleatoriamente da API "Advice Slip". Essas mensagens inspiradoras podem ajudar o usuário a começar o dia com uma mentalidade positiva e motivadora.

Logo abaixo, exibimos as taxas de câmbio de várias moedas. Com esta funcionalidade, o usuário pode pesquisar uma moeda específica e obter informações atualizadas sobre sua cotação. Isso pode ser útil para quem trabalha com câmbio ou precisa fazer viagens internacionais, por exemplo.

Nosso objetivo é fornecer informações úteis e relevantes para o usuário em apenas uma tela, de forma clara e fácil de entender. Dessa forma, esperamos facilitar a vida do usuário e tornar seu dia a dia mais produtivo e agradável.

# API do Clima
Base URL: [http://api.weatherapi.com/v1](https://www.weatherapi.com/docs/#)
<br>
<h2> Tipos de retorno </h2>
A API Weather retorna objetos nos seguintes formatos: 

**Objeto Location:** Retorna informações sobre a localização, incluindo pontos geográficos, nome, região, informações de país e fuso horário
<table class="table table-bordered">
                                <tbody><tr>
                                    <th _msttexthash="59371" _msthash="1878">Campo</th>
                                    <th _msttexthash="153296" _msthash="1879">Tipo de dado</th>
                                    <th _msttexthash="177697" _msthash="1880">Descrição</th>
                                </tr>
                                <tr>
                                    <td _msttexthash="30576" _msthash="1881">Lat</td>
                                    <td _msttexthash="93808" _msthash="1882">decimal</td>
                                    <td _msttexthash="485199" _msthash="1883">Latitude em grau decimal</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="31330" _msthash="1884">Lon</td>
                                    <td _msttexthash="93808" _msthash="1885">decimal</td>
                                    <td _msttexthash="524030" _msthash="1886">Longitude em grau decimal</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="47437" _msthash="1887">name</td>
                                    <td _msttexthash="60762" _msthash="1888">string</td>
                                    <td _msttexthash="177944" _msthash="1889">Nome do local</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="96356" _msthash="1890">region</td>
                                    <td _msttexthash="60762" _msthash="1891">string</td>
                                    <td _msttexthash="1698723" _msthash="1892">Região ou estado da localização, se disponívela</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="62959" _msthash="1893">country</td>
                                    <td _msttexthash="60762" _msthash="1894">string</td>
                                    <td _msttexthash="433004" _msthash="1895">País de localização</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="62309" _msthash="1896">tz_id</td>
                                    <td _msttexthash="60762" _msthash="1897">string</td>
                                    <td _msttexthash="390143" _msthash="1898">Nome do fuso horário</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="286221" _msthash="1899">localtime_epoch</td>
                                    <td _msttexthash="34567" _msthash="1900">inteiro</td>
                                    <td _msttexthash="659295" _msthash="1901">Data e hora locais na hora unix</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="135161" _msthash="1902">localtime</td>
                                    <td _msttexthash="60762" _msthash="1903">string</td>
                                    <td _msttexthash="284362" _msthash="1904">Data e hora locais</td>
                                </tr>
                            </tbody></table>

<br></br>
**Alertas Meteorológicos:** Este formato retorna alertas e avisos emitidos por agências governamentais como uma matriz, se disponível, para o local fornecido.
Por padrão, os alertas não são retornados. Para receber alertas de volta na resposta devemos passar o parâmetro  **alerts=yes**.
**Observação:** alguns dos alertas podem estar no idioma local do local.

<table class="table table-bordered table-correct">
                                <tbody><tr>
                                    <th _msttexthash="59371" _msthash="1909">Campo</th>
                                    <th class="new-width" _msttexthash="153296" _msthash="1910">Tipo de dado</th>
                                    <th _msttexthash="177697" _msthash="1911">Descrição</th>
                                </tr>
                                <tr>
                                    <td _msttexthash="114361" _msthash="1912">manchete</td>
                                    <td _msttexthash="60762" _msthash="1913">string</td>
                                    <td _msttexthash="273364" _msthash="1914">Título de alerta</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="96694" _msthash="1915">msgType</td>
                                    <td _msttexthash="60762" _msthash="1916">string</td>
                                    <td _msttexthash="203944" _msthash="1917">Tipo de alerta</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="155649" _msthash="1918">severidade</td>
                                    <td _msttexthash="60762" _msthash="1919">string</td>
                                    <td _msttexthash="344175" _msthash="1920">Gravidade do alerta</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="131547" _msthash="1921">urgência</td>
                                    <td _msttexthash="60762" _msthash="1922">string</td>
                                    <td _msttexthash="128635" _msthash="1923">Urgência</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="70291" _msthash="1924">Áreas</td>
                                    <td _msttexthash="60762" _msthash="1925">string</td>
                                    <td _msttexthash="293176" _msthash="1926">Áreas abrangidas</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="135135" _msthash="1927">categoria</td>
                                    <td _msttexthash="60762" _msthash="1928">string</td>
                                    <td _msttexthash="132223" _msthash="1929">Categoria</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="97799" _msthash="1930">certeza</td>
                                    <td _msttexthash="60762" _msthash="1931">string</td>
                                    <td _msttexthash="94887" _msthash="1932">Certeza</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="235729" _msthash="1933">acontecimento</td>
                                    <td _msttexthash="60762" _msthash="1934">string</td>
                                    <td _msttexthash="232817" _msthash="1935">Acontecimento</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="47736" _msthash="1936">nota</td>
                                    <td _msttexthash="60762" _msthash="1937">string</td>
                                    <td _msttexthash="44824" _msthash="1938">Nota</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="77857" _msthash="1939">eficaz</td>
                                    <td _msttexthash="45370" _msthash="1940">date</td>
                                    <td _msttexthash="74945" _msthash="1941">Eficaz</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="76947" _msthash="1942">Expira</td>
                                    <td _msttexthash="60762" _msthash="1943">string</td>
                                    <td _msttexthash="76947" _msthash="1944">Expira</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="43017" _msthash="1945">Desc</td>
                                    <td _msttexthash="60762" _msthash="1946">string</td>
                                    <td _msttexthash="177697" _msthash="1947">Descrição</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="186082" _msthash="1948">instrução</td>
                                    <td _msttexthash="60762" _msthash="1949">string</td>
                                    <td _msttexthash="183170" _msthash="1950">Instrução</td>
                                </tr>
                                
**Exemplo:** Retorna um alerta
```json    

{
  "alerts": {
    "alert": [
      {
        "headline": "Flood Warning issued January 05 at 9:47PM EST until January 07 at 6:15AM EST by NWS",
        "msgtype": "Alert",
        "severity": "Moderate",
        "urgency": "Expected",
        "areas": "Calhoun; Lexington; Richland",
        "category": "Met",
        "certainty": "Likely",
        "event": "Flood Warning",
        "note": "Alert for Calhoun; Lexington; Richland (South Carolina) Issued by the National Weather Service",
        "effective": "2021-01-05T21:47:00-05:00",
        "expires": "2021-01-07T06:15:00-05:00",
        "desc": "...The Flood Warning continues for the following rivers in South\nCarolina...\nCongaree River At Carolina Eastman affecting Richland, Calhoun\nand Lexington Counties.\nCongaree River At Congaree National Park-Gadsden affecting\nCalhoun and Richland Counties.\nNorth Fork Edisto River At Orangeburg affecting Orangeburg County.\n...The Flood Warning is now in effect until Thursday morning...\nThe Flood Warning continues for\nthe Congaree River At Carolina Eastman.\n* Until Thursday morning.\n* At 9:28 PM EST Tuesday the stage was 115.6 feet.\n* Flood stage is 115.0 feet.\n* Minor flooding is occurring and minor flooding is forecast.\n* Recent Activity...The maximum river stage in the 24 hours ending\nat 9:28 PM EST Tuesday was 118.2 feet.\n* Forecast...The river will rise to 115.7 feet just after midnight\ntonight. It will then fall below flood stage tomorrow morning to\n114.2 feet and begin rising again tomorrow evening. It will rise\nto 114.3 feet early Thursday morning. It will then fall again and\nremain below flood stage.\n* Impact...At 115.0 feet, Flooding occurs in low lying areas of the\nCarolina Eastman Facility and at the Congaree National Park.\n* Flood History...This crest compares to a previous crest of 116.3\nfeet on 12/03/2020.\n&&",
        "instruction": "A Flood Warning means that flooding is imminent or occurring. All\ninterested parties should take necessary precautions immediately.\nMotorists should not attempt to drive around barricades or drive\ncars through flooded areas.\nCaution is urged when walking near riverbanks.\nAdditional information is available at www.weather.gov.\nThe next statement will be issued Wednesday morning at 1000 AM EST."
      },
      {
        "headline": "Flood Warning issued January 05 at 9:47PM EST until January 09 at 4:00AM EST by NWS",
        "msgtype": "Alert",
        "severity": "Moderate",
        "urgency": "Expected",
        "areas": "Calhoun; Richland",
        "category": "Met",
        "certainty": "Likely",
        "event": "Flood Warning",
        "note": "Alert for Calhoun; Richland (South Carolina) Issued by the National Weather Service",
        "effective": "2021-01-05T21:47:00-05:00",
        "expires": "2021-01-09T04:00:00-05:00",
        "desc": "...The Flood Warning continues for the following rivers in South\nCarolina...\nCongaree River At Carolina Eastman affecting Richland, Calhoun\nand Lexington Counties.\nCongaree River At Congaree National Park-Gadsden affecting\nCalhoun and Richland Counties.\nNorth Fork Edisto River At Orangeburg affecting Orangeburg County.\n...The Flood Warning is now in effect until early Saturday morning...\nThe Flood Warning continues for\nthe Congaree River At Congaree National Park-Gadsden.\n* Until late Friday night.\n* At 9:00 PM EST Tuesday the stage was 16.5 feet.\n* Flood stage is 15.0 feet.\n* Minor flooding is occurring and minor flooding is forecast.\n* Recent Activity...The maximum river stage in the 24 hours ending\nat 9:00 PM EST Tuesday was 17.2 feet.\n* Forecast...The river is expected to fall below flood stage early\nFriday morning and continue falling to 12.4 feet Sunday evening.\n* Impact...At 15.0 feet, Flooding begins in the Congaree National\nPark. This will begin to produce flooding of portions of the lower\nboardwalk.\n* Impact...At 17.0 feet, The access road to the Sandy Run\nsubdivision becomes flooded. The lower boardwalk in the Congaree\nNational Park becomes flooded by Cedar Creek.\n* Impact...At 18.0 feet, Several homes in the Sandy Run subdivision\nalong the river become flooded. At 18 feet the river covers the\nWeston Lake overlook in the Congaree National Park. Between 18 and\n18.5 feet the river begins to cover sections of the elevated\nboardwalk.\n* Flood History...This crest compares to a previous crest of 16.3\nfeet on 12/03/2020.\n&&",
        "instruction": "A Flood Warning means that flooding is imminent or occurring. All\ninterested parties should take necessary precautions immediately.\nMotorists should not attempt to drive around barricades or drive\ncars through flooded areas.\nCaution is urged when walking near riverbanks.\nAdditional information is available at www.weather.gov.\nThe next statement will be issued Wednesday morning at 1000 AM EST."
      }
    ]
  }
}                  
```
<br></br>
**Dados de qualidade do ar:** Os dados de Qualidade do Ar são retornados na API em Tempo Real para o local determinado em json e xml.
Por padrão, os dados de qualidade do ar não são retornados. Para obter dados de qualidade devemos passar o parâmetro  **aqi=yes**.

<table class="table table-bordered table-correct">
                                <tbody><tr>
                                    <th _msttexthash="59371" _msthash="5192">Campo</th>
                                    <th class="new-width" _msttexthash="153296" _msthash="5193">Tipo de dado</th>
                                    <th _msttexthash="177697" _msthash="5194">Descrição</th>
                                </tr>
                                <tr>
                                    <td _msttexthash="20553" _msthash="5195">co</td>
                                    <td _msttexthash="100412" _msthash="5196">float</td>
                                    <td _msttexthash="816712" _msthash="5197">Monóxido de carbono (μg/m3)</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="15405" _msthash="5198">o3</td>
                                    <td _msttexthash="100412" _msthash="5199">float</td>
                                    <td _msttexthash="302289" _msthash="5200">Ozono (μg/m3)</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="62348" _msthash="5201">podar</td>
                                    <td _msttexthash="100412" _msthash="5202">float</td>
                                    <td _msttexthash="675883" _msthash="5203">Dióxido de azoto (μg/m3)</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="71279" _msthash="5204">assim2</td>
                                    <td _msttexthash="100412" _msthash="5205">float</td>
                                    <td _msttexthash="767624" _msthash="5206">Dióxido de enxofre (μg/m3)</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="47307" _msthash="5207">pm2_5</td>
                                    <td _msttexthash="100412" _msthash="5208">float</td>
                                    <td _msttexthash="273689" _msthash="5209">PM2,5 (μg/m3)</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="33501" _msthash="5210">pm10</td>
                                    <td _msttexthash="100412" _msthash="5211">float</td>
                                    <td _msttexthash="249002" _msthash="5212">PM10 (μg/m3)</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="191516" _msthash="5213">us-epa-index</td>
                                    <td _msttexthash="99255" _msthash="5214">inteiro</td>
                                    <td><font _mstmutation="1" _msttexthash="226707" _msthash="5215">EUA - padrão EPA. </font><ul>
                                            <li _msttexthash="217516" _msthash="5216">1 significa Bom</li>
                                            <li _msttexthash="367471" _msthash="5217">2 significa Moderado</li>
                                            <li _msttexthash="1362517" _msthash="5218">3 significa insalubre para o grupo sensível</li>
                                            <li _msttexthash="406445" _msthash="5219">4 significa Insalubre</li>
                                            <li _msttexthash="607126" _msthash="5220">5 significa Muito insalubre</li>
                                            <li _msttexthash="376142" _msthash="5221">6 significa Perigoso</li>
                                        </ul>
                                    </td>
                                </tr>
                                <tr>
                                    <td _msttexthash="239577" _msthash="5222">gb-defra-index</td>
                                    <td _msttexthash="99255" _msthash="5223">inteiro</td>
                                    <td _msttexthash="1480440" _msthash="5224">Índice Defra do Reino Unido (Veja a tabela abaixo) </td>
                                </tr>

<br></br>                
*Tabela - UK DEFRA INDEX:* Índice Defra do Reino Unido
<table class="table table-bordered">
                                <thead>
                                    <tr>
                                        <th _msttexthash="85358" _msthash="6844">Índice</th>
                                        <th _msttexthash="4459" _msthash="6845">1</th>
                                        <th _msttexthash="4550" _msthash="6846">2</th>
                                        <th _msttexthash="4641" _msthash="6847">3</th>
                                        <th _msttexthash="4732" _msthash="6848">4</th>
                                        <th _msttexthash="4823" _msthash="6849">5</th>
                                        <th _msttexthash="4914" _msthash="6850">6</th>
                                        <th _msttexthash="5005" _msthash="6851">7</th>
                                        <th _msttexthash="5096" _msthash="6852">8</th>
                                        <th _msttexthash="5187" _msthash="6853">9</th>
                                        <th _msttexthash="9451" _msthash="6854">10</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <th _msttexthash="55835" _msthash="6855">Banda</th>
                                        <td class="bg_low1" _msttexthash="59852" _msthash="6856">Baixo</td>
                                        <td class="bg_low2" _msttexthash="59852" _msthash="6857">Baixo</td>
                                        <td class="bg_low3" _msttexthash="59852" _msthash="6858">Baixo</td>
                                        <td class="bg_moderate4" _msttexthash="111917" _msthash="6859">Moderado</td>
                                        <td class="bg_moderate5" _msttexthash="111917" _msthash="6860">Moderado</td>
                                        <td class="bg_moderate6" _msttexthash="111917" _msthash="6861">Moderado</td>
                                        <td class="bg_high7" _msttexthash="45149" _msthash="6862">Alto</td>
                                        <td class="bg_high8" _msttexthash="45149" _msthash="6863">Alto</td>
                                        <td class="bg_high9" _msttexthash="45149" _msthash="6864">Alto</td>
                                        <td class="bg_very_high10" _msttexthash="138554" _msthash="6865">Muito alto</td>
                                    </tr>
                                    <tr>
                                        <th><font _mstmutation="1" _msttexthash="110461" _msthash="6866">μgm</font><sup _msttexthash="9399" _msthash="6867">-3</sup></th>
                                        <td class="bg_low1" _msttexthash="21151" _msthash="6868">0-11</td>
                                        <td class="bg_low2" _msttexthash="28717" _msthash="6869">12-23</td>
                                        <td class="bg_low3" _msttexthash="29432" _msthash="6870">24-35</td>
                                        <td class="bg_moderate4" _msttexthash="29289" _msthash="6871">36-41</td>
                                        <td class="bg_moderate5" _msttexthash="29822" _msthash="6872">42-47</td>
                                        <td class="bg_moderate6" _msttexthash="30004" _msthash="6873">48-53</td>
                                        <td class="bg_high7" _msttexthash="30394" _msthash="6874">54-58</td>
                                        <td class="bg_high8" _msttexthash="30472" _msthash="6875">59-64</td>
                                        <td class="bg_high9" _msttexthash="29705" _msthash="6876">65-70</td>
                                        <td class="bg_very_high10" _msttexthash="107692" _msthash="6877">71 ou mais</td>
                                    </tr>
                                </tbody>
                            </table>

<h2> EndPoints </h2>
A solicitação para a API Weather consiste em URL base (<a href = "https://www.weatherapi.com/docs/#"> http://api.weatherapi.com/v1</a>) e método de API. Podemos fazer requests HTTP ou HTTPS para a API. Vale, ressaltar que para ter os retorno é necessária uma API Key.

<table class="table table-bordered table-correct">
                                <tbody><tr>
                                    <th _msttexthash="22776" _msthash="76">API</th>
                                    <th _msttexthash="130637" _msthash="77">Método API</th>
                                </tr>
                                <tr>
                                    <td _msttexthash="158743" _msthash="78">Tempo atual</td>
                                    <td _msttexthash="717548" _msthash="79">/current.json ou /current.xml</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="137813" _msthash="80">Previsão</td>
                                    <td _msttexthash="800280" _msthash="81">/forecast.json ou /forecast.xml</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="1101022" _msthash="82">Pesquisa ou Preenchimento Automático</td>
                                    <td _msttexthash="612274" _msthash="83">/search.json ou /search.xml</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="133939" _msthash="84">Histórico</td>
                                    <td _msttexthash="725829" _msthash="85">/history.json ou /history.xml</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="94796" _msthash="86">Marinho</td>
                                    <td _msttexthash="615446" _msthash="87">/marine.json ou /marine.xml</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="80938" _msthash="88">Futuro</td>
                                    <td _msttexthash="629512" _msthash="89">/future.json ou /future.xml</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="207428" _msthash="90">Fuso horário</td>
                                    <td _msttexthash="808886" _msthash="91">/timezone.json ou /timezone.xml</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="163176" _msthash="92">Esportes</td>
                                    <td _msttexthash="723138" _msthash="93">/sports.json ou /sports.xml</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="158548" _msthash="94">Astronomia</td>
                                    <td _msttexthash="963612" _msthash="95">/astronomy.json ou /astronomy.xml</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="191490" _msthash="96">Pesquisa por IP</td>
                                    <td _msttexthash="322946" _msthash="97">/ip.json ou /ip.xml</td>
                                </tr>

**Parâmetros dos Requests**
<table class="table table-bordered">
                                <tbody><tr>
                                    <th _msttexthash="153426" _msthash="1730">Parâmetro</th>
                                    <th></th>
                                    <th _msttexthash="177697" _msthash="1731">Descrição</th>
                                </tr>
                                <tr>
                                    <td _msttexthash="42861" _msthash="1732">.key</td>
                                    <td _msttexthash="179036" _msthash="1733">Obrigatório</td>
                                    <td _msttexthash="133328" _msthash="1734">Chave de API</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="10283" _msthash="1735">q</td>
                                    <td _msttexthash="179036" _msthash="1736">Obrigatório</td>
                                    <td>
                                        <p _msttexthash="4465045" _msthash="1737"> Parâmetro de consulta com base no qual
 os dados são enviados de volta. Pode ser
 seguinte: </p>
                                        <ul>
                                            <li _msttexthash="2219789" _msthash="1738">Latitude e longitude (grau decimal), por exemplo:
 q=48,8567,2,3508</li>
                                            <li _msttexthash="885846" _msthash="1739">nome da cidade, por exemplo: q=Paris</li>
                                            <li _msttexthash="620087" _msthash="1740">Zip dos EUA, por exemplo: q=10001</li>
                                            <li _msttexthash="1413555" _msthash="1741">Código postal do Reino Unido, por exemplo: q=SW1</li>
                                            <li _msttexthash="1088789" _msthash="1742">Canadá código postal, por exemplo: q=G2J</li>
                                            <li _msttexthash="1460147" _msthash="1743">metar:&lt;código metar&gt; por exemplo:
 q=metar:EGLL</li>
                                            <li _msttexthash="2606747" _msthash="1744">iata: código de aeroporto de &lt; de 3 dígitos&gt; por exemplo:
 q=iata:DXB</li>
                                            <li _msttexthash="1113047" _msthash="1745">auto:ip IP lookup por exemplo: q=auto:ip</li>
                                            <li _msttexthash="1965418" _msthash="1746">Endereço IP (IPv4 e IPv6 suportados), por exemplo: q=100.0.0.1</li>
                                            <li><font _mstmutation="1" _msttexthash="78169" _msthash="1747">granel </font><span class="badge badge-pill badge-danger" _msttexthash="46878" _msthash="1748">Novo</span></li>
                                        </ul>
                                    </td>
                                </tr>
                                <tr>
                                    <td _msttexthash="43407" _msthash="1749">Dias</td>
                                    <td _msttexthash="1663337" _msthash="1750">Obrigatório apenas com o método de API de previsão.</td>
                                    <td>
                                        <p _msttexthash="1127061" _msthash="1751"> Número de dias de previsão
 Necessário. </p>
                                        <p _msttexthash="3034486" _msthash="1752"> intervalos de valores de parâmetros days
 entre 1 e 14. por exemplo: dias=5 </p>
                                        <p _msttexthash="3737890" _msthash="1753"> Se nenhum parâmetro de dias for fornecido
 então só o tempo de hoje é
 Retornado. </p>
                                    </td>
                                </tr>
                                <tr>
                                    <td _msttexthash="1527032" _msthash="1754">dt (Obrigatório para a API de Histórico e Futuro)</td>
                                    <td _msttexthash="2811068" _msthash="1755">Restrinje a saída de data para o método API de Previsão e Histórico.</td>
                                    <td>
                                        <p _msttexthash="5880004" _msthash="1756">Para o histórico, a API 'dt' deve estar em ou após 1º de janeiro de 2010 no formato aa-MM-dd (ou seja, dt=2010-01-01)</p>
                                        <p _msttexthash="5535023" _msthash="1757">Para a previsão API 'dt' deve ser entre hoje e os próximos 14 dias no formato aa-MM-dd (ou seja, dt = 2010-01-01)</p>
                                        <p _msttexthash="7205666" _msthash="1758">Para a API futura 'dt' deve ser entre 14 dias e 300 dias a partir de hoje no futuro no formato aaaa-MM-dd (ou seja, dt = 2023-01-01)</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td _msttexthash="305201" _msthash="1759">(Opcional) unixdt</td>
                                    <td _msttexthash="2111655" _msthash="1760">Unix Timestamp usado pelo método Forecast and History API.</td>
                                    <td>
                                        <p _msttexthash="10167677" _msthash="1761">unixdt tem a mesma restrição que o parâmetro 'dt'. Por favor, passe 'dt' ou 'unixdt' e não ambos no mesmo pedido. por exemplo: unixdt=1490227200</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td _msttexthash="1851447" _msthash="1762">(Opcional) end_dt (Disponível para API de Histórico)</td>
                                    <td _msttexthash="2166632" _msthash="1763">Restrinje a saída de data para o método da API de histórico.</td>
                                    <td>
                                        <p _msttexthash="6355752" _msthash="1764">Para a API de histórico, 'end_dt' deve estar em ou após 1 de janeiro de 2010 no formato aa-MM-dd (ou seja, dt=2010-01-01)</p>
                                        <p _msttexthash="6713772" _msthash="1765">A end_dt» deve ser superior ao parâmetro «dt» e a diferença não deve ser superior a 30 dias entre as duas datas.</p>
                                        <p><b _msttexthash="1040065" _msthash="1766">Só funciona para API no plano Pro e acima.</b></p>
                                    </td>
                                </tr>
                                <tr>
                                    <td _msttexthash="412646" _msthash="1767">unixend_dt (Opcional)</td>
                                    <td _msttexthash="2126371" _msthash="1768">Carimbo de data/hora do Unix usado pelo método History API.</td>
                                    <td>
                                        <p _msttexthash="13707434" _msthash="1769">unixend_dt tem a mesma restrição que o parâmetro 'end_dt'. Por favor, passe 'end_dt' ou 'unixend_dt' e não ambos na mesma request. por exemplo: unixend_dt=1490227200</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td _msttexthash="238329" _msthash="1770">(Opcional) hora</td>
                                    <td _msttexthash="4732975" _msthash="1771">Restringe a previsão ou a saída do histórico a uma hora específica em um determinado dia.</td>
                                    <td>
                                        <p _msttexthash="2592824" _msthash="1772">Deve ser em 24 horas. Por exemplo, 5 pm deve ser hora = 17, 6 am como hora = 6</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td><font _mstmutation="1" _msttexthash="353314" _msthash="1773">Alertas (opcionais) </font><span class="badge badge-pill badge-danger" _msttexthash="46878" _msthash="1774">Novo</span></td>
                                    <td _msttexthash="1533441" _msthash="1775">Desabilitar alertas na saída da API de previsão</td>
                                    <td>
                                        <p _msttexthash="646763" _msthash="1776">alerts=yes or alerts=no</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td><font _mstmutation="1" _msttexthash="209807" _msthash="1777">(Opcional) aqi </font><span class="badge badge-pill badge-danger" _msttexthash="46878" _msthash="1778">Novo</span></td>
                                    <td _msttexthash="2920463" _msthash="1779">Ativar/desativar dados de qualidade do ar na saída da API de previsão</td>
                                    <td>
                                        <p _msttexthash="342160" _msthash="1780">aqi=yes ou aqi=no</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td><font _mstmutation="1" _msttexthash="308347" _msthash="1781">Marés (opcionais) </font><span class="badge badge-pill badge-danger" _msttexthash="46878" _msthash="1782">Novo</span></td>
                                    <td _msttexthash="2059902" _msthash="1783">Ativar/desativar dados de maré na saída da API marítima</td>
                                    <td>
                                        <p _msttexthash="537797" _msthash="1784">tides=yes or tides=no</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td><font _mstmutation="1" _msttexthash="187837" _msthash="1785">(Opcional) tp </font><span class="badge badge-pill badge-danger" _msttexthash="46878" _msthash="1786">Novo</span></td>
                                    <td _msttexthash="8157552" _msthash="1787">Obtenha dados de intervalo de 15 minutos para a API de Previsão e Histórico. Disponível apenas para clientes Enterprise.</td>
                                    <td>
                                        <p _msttexthash="43290" _msthash="1788">tp=15</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td _msttexthash="236509" _msthash="1789">(Opcional) lang</td>
                                    <td _msttexthash="2138942" _msthash="1790">Retorna o campo 'condition:text' na API no idioma desejado</td>
                                    <td>
                                        <p _msttexthash="2589522" _msthash="1791">Por favor, passe o código do idioma, de acordo com a tabela abaixo. Por exemplo: lang=fr</p>
                                        <table class="table table-striped table-bordered">
                                            <tbody><tr>
                                                <th _msttexthash="74477" _msthash="1792">Idioma</th>
                                                <th _msttexthash="170456" _msthash="1793">código lang</th>
                                            </tr>
                                            <tr class="whiterow">
                                                <td _msttexthash="67951" _msthash="1794">Árabe</td>
                                                <td class="last" _msttexthash="20683" _msthash="1795">ar</td>
                                            </tr>
                                            <tr class="grayrow">
                                                <td _msttexthash="133965" _msthash="1796">Bengalês</td>
                                                <td class="last" _msttexthash="17446" _msthash="1797">Bn</td>
                                            </tr>
                                            <tr class="whiterow">
                                                <td _msttexthash="108446" _msthash="1798">Búlgaro</td>
                                                <td class="last" _msttexthash="16718" _msthash="1799">Bg</td>
                                            </tr>
                                            <tr class="grayrow">
                                                <td _msttexthash="398229" _msthash="1800">Chinês simplificado</td>
                                                <td class="last" _msttexthash="21918" _msthash="1801">zh</td>
                                            </tr>
                                            <tr class="whiterow">
                                                <td _msttexthash="366197" _msthash="1802">Chinês tradicional</td>
                                                <td class="last" _msttexthash="65130" _msthash="1803">zh_tw</td>
                                            </tr>
                                            <tr class="grayrow">
                                                <td _msttexthash="74711" _msthash="1804">Tcheco</td>
                                                <td class="last" _msttexthash="27937" _msthash="1805">.cs</td>
                                            </tr>
                                            <tr class="whiterow">
                                                <td _msttexthash="210041" _msthash="1806">Dinamarquês</td>
                                                <td class="last" _msttexthash="19188" _msthash="1807">da</td>
                                            </tr>
                                            <tr class="grayrow">
                                                <td _msttexthash="135148" _msthash="1808">Holandês</td>
                                                <td class="last" _msttexthash="18330" _msthash="1809">Nl</td>
                                            </tr>
                                            <tr class="whiterow">
                                                <td _msttexthash="157144" _msthash="1810">Finlandês</td>
                                                <td class="last" _msttexthash="17290" _msthash="1811">Fi</td>
                                            </tr>
                                            <tr class="grayrow">
                                                <td _msttexthash="113971" _msthash="1812">Francês</td>
                                                <td class="last" _msttexthash="18226" _msthash="1813">Fr</td>
                                            </tr>
                                            <tr class="whiterow">
                                                <td _msttexthash="92911" _msthash="1814">Alemão</td>
                                                <td class="last" _msttexthash="19604" _msthash="1815">de</td>
                                            </tr>
                                            <tr class="grayrow">
                                                <td _msttexthash="59397" _msthash="1816">Grego</td>
                                                <td class="last" _msttexthash="17511" _msthash="1817">El</td>
                                            </tr>
                                            <tr class="whiterow">
                                                <td _msttexthash="58357" _msthash="1818">Hindi</td>
                                                <td class="last" _msttexthash="18109" _msthash="1819">Oi</td>
                                            </tr>
                                            <tr class="grayrow">
                                                <td _msttexthash="109226" _msthash="1820">Húngaro</td>
                                                <td class="last" _msttexthash="18720" _msthash="1821">Hu</td>
                                            </tr>
                                            <tr class="whiterow">
                                                <td _msttexthash="113035" _msthash="1822">Italiano</td>
                                                <td class="last" _msttexthash="31772" _msthash="1823">ela</td>
                                            </tr>
                                            <tr class="grayrow">
                                                <td _msttexthash="116025" _msthash="1824">Japonês</td>
                                                <td class="last" _msttexthash="19734" _msthash="1825">ja</td>
                                            </tr>
                                            <tr class="whiterow">
                                                <td _msttexthash="114907" _msthash="1826">Javanês</td>
                                                <td class="last" _msttexthash="19006" _msthash="1827">Jv</td>
                                            </tr>
                                            <tr class="grayrow">
                                                <td _msttexthash="93899" _msthash="1828">Coreano</td>
                                                <td class="last" _msttexthash="18369" _msthash="1829">Ko</td>
                                            </tr>
                                            <tr class="whiterow">
                                                <td _msttexthash="112203" _msthash="1830">Mandarim</td>
                                                <td class="last" _msttexthash="78650" _msthash="1831">zh_cmn</td>
                                            </tr>
                                            <tr class="grayrow">
                                                <td _msttexthash="74763" _msthash="1832">Marata</td>
                                                <td class="last" _msttexthash="19409" _msthash="1833">Sr</td>
                                            </tr>
                                            <tr class="whiterow">
                                                <td _msttexthash="117559" _msthash="1834">Polonês</td>
                                                <td class="last" _msttexthash="28470" _msthash="1835">.pl</td>
                                            </tr>
                                            <tr class="grayrow">
                                                <td _msttexthash="164827" _msthash="1836">Português</td>
                                                <td class="last" _msttexthash="22256" _msthash="1837">pt</td>
                                            </tr>
                                            <tr class="whiterow">
                                                <td _msttexthash="93002" _msthash="1838">Punjabi</td>
                                                <td class="last" _msttexthash="61009" _msthash="1839">papai</td>
                                            </tr>
                                            <tr class="grayrow">
                                                <td _msttexthash="77935" _msthash="1840">Romeno</td>
                                                <td class="last" _msttexthash="19006" _msthash="1841">Ro</td>
                                            </tr>
                                            <tr class="whiterow">
                                                <td _msttexthash="63908" _msthash="1842">Russo</td>
                                                <td class="last" _msttexthash="19630" _msthash="1843">Ru</td>
                                            </tr>
                                            <tr class="grayrow">
                                                <td _msttexthash="92794" _msthash="1844">Sérvio</td>
                                                <td class="last" _msttexthash="22321" _msthash="1845">sr</td>
                                            </tr>
                                            <tr class="whiterow">
                                                <td _msttexthash="133276" _msthash="1846">Sinhalese</td>
                                                <td class="last" _msttexthash="21385" _msthash="1847">si</td>
                                            </tr>
                                            <tr class="grayrow">
                                                <td _msttexthash="77675" _msthash="1848">Slovak</td>
                                                <td class="last" _msttexthash="21593" _msthash="1849">sk</td>
                                            </tr>
                                            <tr class="whiterow">
                                                <td _msttexthash="95381" _msthash="1850">Spanish</td>
                                                <td class="last" _msttexthash="21151" _msthash="1851">es</td>
                                            </tr>
                                            <tr class="grayrow">
                                                <td _msttexthash="95277" _msthash="1852">Swedish</td>
                                                <td class="last" _msttexthash="22737" _msthash="1853">sv</td>
                                            </tr>
                                            <tr class="whiterow">
                                                <td _msttexthash="59579" _msthash="1854">Tamil</td>
                                                <td class="last" _msttexthash="20644" _msthash="1855">ta</td>
                                            </tr>
                                            <tr class="grayrow">
                                                <td _msttexthash="78975" _msthash="1856">Telugu</td>
                                                <td class="last" _msttexthash="21060" _msthash="1857">te</td>
                                            </tr>
                                            <tr class="whiterow">
                                                <td _msttexthash="97591" _msthash="1858">Turkish</td>
                                                <td class="last" _msttexthash="22412" _msthash="1859">tr</td>
                                            </tr>
                                            <tr class="grayrow">
                                                <td _msttexthash="133835" _msthash="1860">Ukrainian</td>
                                                <td class="last" _msttexthash="21775" _msthash="1861">uk</td>
                                            </tr>
                                            <tr class="whiterow">
                                                <td _msttexthash="46501" _msthash="1862">Urdu</td>
                                                <td class="last" _msttexthash="22503" _msthash="1863">ur</td>
                                            </tr>
                                            <tr class="grayrow">
                                                <td _msttexthash="156741" _msthash="1864">Vietnamese</td>
                                                <td class="last" _msttexthash="21658" _msthash="1865">vi</td>
                                            </tr>
                                            <tr class="whiterow">
                                                <td _msttexthash="286442" _msthash="1866">Wu (Shanghainese)</td>
                                                <td class="last" _msttexthash="83486" _msthash="1867">zh_wuu</td>
                                            </tr>
                                            <tr class="grayrow">
                                                <td _msttexthash="59306" _msthash="1868">Xiang</td>
                                                <td class="last" _msttexthash="80158" _msthash="1869">zh_hsn</td>
                                            </tr>
                                            <tr class="whiterow">
                                                <td _msttexthash="231062" _msthash="1870">Yue (Cantonese)</td>
                                                <td class="last" _msttexthash="81250" _msthash="1871">zh_yue</td>
                                            </tr>
                                            <tr class="grayrow">
                                                <td _msttexthash="48204" _msthash="1872">Zulu</td>
                                                <td class="last" _msttexthash="23270" _msthash="1873">zu</td>
                                            </tr>

<h2> EndPoints que serão usados</h2>
Foram selecionados os EndPoints responsáveis por informar o clima atual e a previsão do tempo.

<table class="table table-bordered table-correct">
                                <tbody><tr>
                                    <th _msttexthash="22776" _msthash="76">API</th>
                                    <th _msttexthash="130637" _msthash="77">Método API</th>
                                </tr>
                                <tr>
                                    <td _msttexthash="158743" _msthash="78">Tempo atual</td>
                                    <td _msttexthash="717548" _msthash="79">/current.json ou /current.xml</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="137813" _msthash="80">Previsão</td>
                                    <td _msttexthash="800280" _msthash="81">/forecast.json ou /forecast.xml</td>
                                </tr>

                                 
                              
                                
                                
                      


</table>
</table>


# Documentação da API Advice Slip

Base URL: https://api.adviceslip.com/

A API Advice Slip retorna objetos nos formatos Slip, Search ou Message. A seguir, explicamos como cada um deles é estruturado.

**Slip**
Representa uma mensagem. Contém os seguintes campos:
|  campo |  tipo  |               descrição              |
|:------:|:------:|:------------------------------------:|
|   id   |   inteiro  |      O identiticador da mensagem     |
| advice | String | A mensagem em si |
| date | Date | Opcional. Data de publicação da mensagem?|

**Search**
A resultado de uma busca, contendo uma lista das mensagens com encontradas pela busca.
|     campo     |   tipo  |                              descrição                              |
|:-------------:|:-------:|:-------------------------------------------------------------------:|
| total_results |   inteiro   |                  O número de resultados encontrados                 |
|     query     |  String |                      A pesquisa que foi usada.                      |
|     slips     | Array de Slip | Uma lista de Slips, contendo as mensagens relacionadas à pesquisa. |

**Message**
Em caso de erro, este objeto é retornado
| campo |   tipo  |                               descrição                              |
|:-----:|:-------:|:--------------------------------------------------------------------:|
|  type |  String | O tipo da mensagem. Pode ser "warning" para avisos ou "error" para erros |
|  text |  String |                         O corpo da mensagem.                         |

### Endpoints disponíveis

**GET** /advice

Retorna uma mensagem aleatória em formato Slip.

**Exemplo:**

```bash
curl https://api.adviceslip.com/advice/
```

```json
{
  "slip": {
    "id": 101,
    "advice": "Alway do anything for love, but don't do that."
  }
}
```

**GET** /advice/{slip-id}

Retorna a mensagem específica com o identificador {slip-id} em formato Slip.

**Exemplo:**

```bash
curl https://api.adviceslip.com/advice/213
```

```json
{
  "slip": {
    "id": 213,
    "advice": "Quality beats quantity."
  }
}
```

**GET** /advice/search/{query}

Retorna uma lista de mensagens relacionadas à pesquisa em formato Search.

**Exemplo:**

```bash
curl https://api.adviceslip.com/advice/search/food
```

```json
{
  "total_results": "3",
  "query": "food",
  "slips": [
    {
      "id": 72,
      "advice": "Don't eat anything your grandparents wouldn't recognise as food.",
      "date": "2016-11-06"
    },
    {
      "id": 73,
      "advice": "Eat food. Not too much, mostly plants.",
      "date": "2016-04-22"
    },
    {
      "id": 206,
      "advice": "Don't waste food.",
      "date": "2016-09-01"
    }
  ]
}
```

# Documentação da API Kucoin

Base URL: https://api.kucoin.com

Documentação: https://docs.kucoin.com/

# Tipos de Retorno

Ao menos que seja especificado, todos os timestamps (data e hora) são retornados em milissegundos (exemplo, **1546658861000**), ou seja, grandes números inteiros.

Números são retornados como String, com a intenção de preservar precisar entre plataformas. Ao fazer requisições, é recomendando converter os números em Strings, para evitar problemas de precisão.

# Endpoints

## Dados do Mercado

Esses Endpoints não precisam de nenhum método de autenticação.

#### Get Lista de Mercado

Este Endpoint retorna todas as moedas para o mercado inteiro.

**GET** /api/v1/markets

**Parâmetros:**
N/A

**Exemplo:**

```bash
curl "https://api.kucoin.com/api/v1/markets"
```

```json
{
  "code": "200000",
  "data": [
    "USDS",
    "Hong-Kong",
    "BTC",
    "KCS",
    "ALTS",
    "NFT-ETF",
    "FIAT",
    "Arbitrum",
    "DeFi",
    "Shanghai-Upgrade",
    "AI",
    "NFT",
    "Metaverse",
    "Polkadot",
    "ETF"
  ]
}
```


#### Get Symbols List

**GET** /api/v2/symbols

Retorna uma lista de símbolos monetários para serem usados em outras requisições.

**Parâmetros:**
| Parâmetro |  Tipo  |                               descrição                              |
|:---------:|:------:|:--------------------------------------------------------------------:|
|   market (opcional)  | String | O Mercado que está sendo usado. |

**Exemplo**:

```bash
curl "https://api.kucoin.com/api/v2/symbols?market=BTC"
```

```json
{
    "code": "200000",
    "data": [
        {
            "symbol": "GALAX-USDT",
            "name": "GALA-USDT",
            "baseCurrency": "GALAX",
            "quoteCurrency": "USDT",
            "feeCurrency": "USDT",
            "market": "USDS",
            "baseMinSize": "10",
            "quoteMinSize": "0.001",
            "baseMaxSize": "10000000000",
            "quoteMaxSize": "99999999",
            "baseIncrement": "0.0001",
            "quoteIncrement": "0.00001",
            "priceIncrement": "0.00001",
            "priceLimitRate": "0.1",
            "minFunds": "0.1",
            "isMarginEnabled": true,
            "enableTrading": true
        },
        {
            "symbol": "XLM-USDT",
            "name": "XLM-USDT",
            "baseCurrency": "XLM",
            "quoteCurrency": "USDT",
            "feeCurrency": "USDT",
            "market": "USDS",
            "baseMinSize": "0.1",
            "quoteMinSize": "0.01",
            "baseMaxSize": "10000000000",
            "quoteMaxSize": "99999999",
            "baseIncrement": "0.0001",
            "quoteIncrement": "0.000001",
            "priceIncrement": "0.000001",
            "priceLimitRate": "0.1",
            "minFunds": "0.1",
            "isMarginEnabled": true,
            "enableTrading": true
        }
    ]
}
```

#### Get Ticker

Solicite através deste endpoint para obter Dados de Mercado de Nível 1. O valor retornado inclui o melhor preço e tamanho de lance, o melhor preço e tamanho de venda, bem como o último preço negociado e o último tamanho negociado.


**GET** /api/v1/market/orderbook/level1

**Parâmetros:**
| Parâmetro |  Tipo  |                               descrição                              |
|:---------:|:------:|:--------------------------------------------------------------------:|
|   symbol  | String | O Símbolo monetário |


**Exemplo:**

```bash
curl "https://api.kucoin.com/api/v1/market/orderbook/level1?symbol=BTC-USDT"
```

```json
{
  "code": "200000",
  "data": {
    "time": 1680641029328, 
    "sequence": "7122717002",
    "price": "28267.6",
    "size": "0.14831924",
    "bestBid": "28268.1",
    "bestBidSize": "0.33550136",
    "bestAsk": "28268.2", 
    "bestAskSize": "0.34865313"
  }
}
```


#### Get All Tickers

Solicite tickers de mercado para todos os pares de negociação no mercado (incluindo volume de 24h).

**GET** /api/v1/market/allTickers

**Parâmetros:**
N/A

**Exemplo:**

```bash
curl "https://api.kucoin.com/api/v1/market/allTickers"
```

```json
{
  "code": "200000",
  "data": {
    "time": 1680641481002,
    "ticker": [
      {
        "headline": "Flood Warning issued January 05 at 9:47PM EST until January 09 at 4:00AM EST by NWS",
        "msgtype": "Alert",
        "severity": "Moderate",
        "urgency": "Expected",
        "areas": "Calhoun; Richland",
        "category": "Met",
        "certainty": "Likely",
        "event": "Flood Warning",
        "note": "Alert for Calhoun; Richland (South Carolina) Issued by the National Weather Service",
        "effective": "2021-01-05T21:47:00-05:00",
        "expires": "2021-01-09T04:00:00-05:00",
        "desc": "...The Flood Warning continues for the following rivers in South\nCarolina...\nCongaree River At Carolina Eastman affecting Richland, Calhoun\nand Lexington Counties.\nCongaree River At Congaree National Park-Gadsden affecting\nCalhoun and Richland Counties.\nNorth Fork Edisto River At Orangeburg affecting Orangeburg County.\n...The Flood Warning is now in effect until early Saturday morning...\nThe Flood Warning continues for\nthe Congaree River At Congaree National Park-Gadsden.\n* Until late Friday night.\n* At 9:00 PM EST Tuesday the stage was 16.5 feet.\n* Flood stage is 15.0 feet.\n* Minor flooding is occurring and minor flooding is forecast.\n* Recent Activity...The maximum river stage in the 24 hours ending\nat 9:00 PM EST Tuesday was 17.2 feet.\n* Forecast...The river is expected to fall below flood stage early\nFriday morning and continue falling to 12.4 feet Sunday evening.\n* Impact...At 15.0 feet, Flooding begins in the Congaree National\nPark. This will begin to produce flooding of portions of the lower\nboardwalk.\n* Impact...At 17.0 feet, The access road to the Sandy Run\nsubdivision becomes flooded. The lower boardwalk in the Congaree\nNational Park becomes flooded by Cedar Creek.\n* Impact...At 18.0 feet, Several homes in the Sandy Run subdivision\nalong the river become flooded. At 18 feet the river covers the\nWeston Lake overlook in the Congaree National Park. Between 18 and\n18.5 feet the river begins to cover sections of the elevated\nboardwalk.\n* Flood History...This crest compares to a previous crest of 16.3\nfeet on 12/03/2020.\n&&",
        "instruction": "A Flood Warning means that flooding is imminent or occurring. All\ninterested parties should take necessary precautions immediately.\nMotorists should not attempt to drive around barricades or drive\ncars through flooded areas.\nCaution is urged when walking near riverbanks.\nAdditional information is available at www.weather.gov.\nThe next statement will be issued Wednesday morning at 1000 AM EST."
      }
    ]
  }
}                  
```
<br></br>
**Dados de qualidade do ar:** Os dados de Qualidade do Ar são retornados na API em Tempo Real para o local determinado em json e xml.
Por padrão, os dados de qualidade do ar não são retornados. Para obter dados de qualidade devemos passar o parâmetro  **aqi=yes**.

<table class="table table-bordered table-correct">
                                <tbody><tr>
                                    <th _msttexthash="59371" _msthash="5192">Campo</th>
                                    <th class="new-width" _msttexthash="153296" _msthash="5193">Tipo de dado</th>
                                    <th _msttexthash="177697" _msthash="5194">Descrição</th>
                                </tr>
                                <tr>
                                    <td _msttexthash="20553" _msthash="5195">co</td>
                                    <td _msttexthash="100412" _msthash="5196">float</td>
                                    <td _msttexthash="816712" _msthash="5197">Monóxido de carbono (μg/m3)</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="15405" _msthash="5198">o3</td>
                                    <td _msttexthash="100412" _msthash="5199">float</td>
                                    <td _msttexthash="302289" _msthash="5200">Ozono (μg/m3)</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="62348" _msthash="5201">podar</td>
                                    <td _msttexthash="100412" _msthash="5202">float</td>
                                    <td _msttexthash="675883" _msthash="5203">Dióxido de azoto (μg/m3)</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="71279" _msthash="5204">assim2</td>
                                    <td _msttexthash="100412" _msthash="5205">float</td>
                                    <td _msttexthash="767624" _msthash="5206">Dióxido de enxofre (μg/m3)</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="47307" _msthash="5207">pm2_5</td>
                                    <td _msttexthash="100412" _msthash="5208">float</td>
                                    <td _msttexthash="273689" _msthash="5209">PM2,5 (μg/m3)</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="33501" _msthash="5210">pm10</td>
                                    <td _msttexthash="100412" _msthash="5211">float</td>
                                    <td _msttexthash="249002" _msthash="5212">PM10 (μg/m3)</td>
                                </tr>
                                <tr>
                                    <td _msttexthash="191516" _msthash="5213">us-epa-index</td>
                                    <td _msttexthash="99255" _msthash="5214">inteiro</td>
                                    <td><font _mstmutation="1" _msttexthash="226707" _msthash="5215">EUA - padrão EPA. </font><ul>
                                            <li _msttexthash="217516" _msthash="5216">1 significa Bom</li>
                                            <li _msttexthash="367471" _msthash="5217">2 significa Moderado</li>
                                            <li _msttexthash="1362517" _msthash="5218">3 significa insalubre para o grupo sensível</li>
                                            <li _msttexthash="406445" _msthash="5219">4 significa Insalubre</li>
                                            <li _msttexthash="607126" _msthash="5220">5 significa Muito insalubre</li>
                                            <li _msttexthash="376142" _msthash="5221">6 significa Perigoso</li>
                                        </ul>
                                    </td>
                                </tr>
                                <tr>
                                    <td _msttexthash="239577" _msthash="5222">gb-defra-index</td>
                                    <td _msttexthash="99255" _msthash="5223">inteiro</td>
                                    <td _msttexthash="1480440" _msthash="5224">Índice Defra do Reino Unido (Veja a tabela abaixo) </td>
                                </tr>

<br></br>                
**Tabela - UK DEFRA INDEX:** Índice Defra do Reino Unido
<table class="table table-bordered">
                                <thead>
                                    <tr>
                                        <th _msttexthash="85358" _msthash="6844">Índice</th>
                                        <th _msttexthash="4459" _msthash="6845">1</th>
                                        <th _msttexthash="4550" _msthash="6846">2</th>
                                        <th _msttexthash="4641" _msthash="6847">3</th>
                                        <th _msttexthash="4732" _msthash="6848">4</th>
                                        <th _msttexthash="4823" _msthash="6849">5</th>
                                        <th _msttexthash="4914" _msthash="6850">6</th>
                                        <th _msttexthash="5005" _msthash="6851">7</th>
                                        <th _msttexthash="5096" _msthash="6852">8</th>
                                        <th _msttexthash="5187" _msthash="6853">9</th>
                                        <th _msttexthash="9451" _msthash="6854">10</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <th _msttexthash="55835" _msthash="6855">Banda</th>
                                        <td class="bg_low1" _msttexthash="59852" _msthash="6856">Baixo</td>
                                        <td class="bg_low2" _msttexthash="59852" _msthash="6857">Baixo</td>
                                        <td class="bg_low3" _msttexthash="59852" _msthash="6858">Baixo</td>
                                        <td class="bg_moderate4" _msttexthash="111917" _msthash="6859">Moderado</td>
                                        <td class="bg_moderate5" _msttexthash="111917" _msthash="6860">Moderado</td>
                                        <td class="bg_moderate6" _msttexthash="111917" _msthash="6861">Moderado</td>
                                        <td class="bg_high7" _msttexthash="45149" _msthash="6862">Alto</td>
                                        <td class="bg_high8" _msttexthash="45149" _msthash="6863">Alto</td>
                                        <td class="bg_high9" _msttexthash="45149" _msthash="6864">Alto</td>
                                        <td class="bg_very_high10" _msttexthash="138554" _msthash="6865">Muito alto</td>
                                    </tr>
                                    <tr>
                                        <th><font _mstmutation="1" _msttexthash="110461" _msthash="6866">μgm</font><sup _msttexthash="9399" _msthash="6867">-3</sup></th>
                                        <td class="bg_low1" _msttexthash="21151" _msthash="6868">0-11</td>
                                        <td class="bg_low2" _msttexthash="28717" _msthash="6869">12-23</td>
                                        <td class="bg_low3" _msttexthash="29432" _msthash="6870">24-35</td>
                                        <td class="bg_moderate4" _msttexthash="29289" _msthash="6871">36-41</td>
                                        <td class="bg_moderate5" _msttexthash="29822" _msthash="6872">42-47</td>
                                        <td class="bg_moderate6" _msttexthash="30004" _msthash="6873">48-53</td>
                                        <td class="bg_high7" _msttexthash="30394" _msthash="6874">54-58</td>
                                        <td class="bg_high8" _msttexthash="30472" _msthash="6875">59-64</td>
                                        <td class="bg_high9" _msttexthash="29705" _msthash="6876">65-70</td>
                                        <td class="bg_very_high10" _msttexthash="107692" _msthash="6877">71 ou mais</td>
                                    </tr>
                                </tbody>
                            </table>
                              



#### Get preço da margem

Este endpoint retorna o preço de índice do símbolo especificado.

**GET** /api/v1/mark-price/{symbol}/current

**Parâmetros:**
| Parâmetro |  Tipo  |                               descrição                              |
|:---------:|:------:|:--------------------------------------------------------------------:|
|   symbol  | String | O Símbolo monetário |

**Exemplo:**

```bash
curl "https://api.kucoin.com/api/v1/mark-price/USDT-BTC/current"
```

```json
{
  "code": "200000",
  "data": {
    "symbol": "USDT-BTC",
    "timePoint": 1680643062000,
    "value": 3.544E-5
  }
}
```

# Get Margin Configuration Info

Este endpoint retorna informações sobre a configuração da margem.

**GET** /api/v1/margin/config

**Parâmetros:**
N/A

**Exemplo:**

```bash
curl "https://api.kucoin.com/api/v1/margin/config"
```

```json
{
  "code": "200000",
  "data": {
    "currencyList": [
            "XEM",
            "MATIC",
            "VRA",
            ...
        ],
    "maxLeverage": 5,
    "warningDebtRatio": "0.95",
    "liqDebtRatio": "0.97"
  }
}
```
# Descrição da API Personalizada

A nossa API oferece um sistema de armazenamento para os jornais favoritos dos usuários, utilizando um banco de dados. Além de fornecer funcionalidades de autenticação e login, a API também permite que os usuários aproveitem ao máximo suas leituras. Com opções pré-definidas, os usuários podem facilmente salvar sua fontes favoritas. Além disso, a API oferece a flexibilidade de marcar artigos para “ler mais tarde” ou “ler mais”. Ao selecionar “ler mais tarde”, a notícia é armazenada para acesso futuro. Já a opção “ler mais” que direcionam o usuário diretamente para o site da matéria correspondente, oferecendo uma experiência de leitura perfeita e contínua.

Combinando conveniência e funcionalidade, a nossa API proporciona uma experiência de leitura personalizada e intuitiva para os usuários.

## Diagrama de Classes
<img src="img-3bim/Diagrama de Classes.jpeg" height="500px">

## Diagrama Entidade-Relacionamento (DER)
<img src="img-3bim/DER.jpeg" height="500px">

## Modelo Entidade-Relacionamento (MER)
<img src="img-3bim/MER.jpg" height="500px">
