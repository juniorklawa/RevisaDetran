package com.klawapps.qualcelula;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import org.sufficientlysecure.htmltextview.HtmlResImageGetter;
import org.sufficientlysecure.htmltextview.HtmlTextView;


public class legislacaoPenalidades extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legislacao_penalidades);


        MainActivity.adsCount++;
        if (MainActivity.adsCount > MainActivity.maxAdsCount ) {


            mInterstitialAd = new InterstitialAd(this);
            mInterstitialAd.setAdUnitId("ca-app-pub-1120115677806043/2349263452");
            AdRequest adRequest2 = new AdRequest.Builder().build();
            mInterstitialAd.loadAd(adRequest2);
            mInterstitialAd.setAdListener(new AdListener() {
                // Listen for when user closes ad
                public void onAdLoaded() {

                    mostraAd ();


                    // When user closes ad end this activity (go back to first activity)

                }
            });




            MainActivity.adsCount = 0;


        }


        AdView AdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        AdView.loadAd(adRequest);

        toolbarprincipal = (Toolbar) findViewById(R.id.toolbarLayout);
        HtmlTextView htmlTextView = (HtmlTextView) findViewById(R.id.html_text);
        htmlTextView.setHtml("<h4>Infra&ccedil;&otilde;es e penalidades</h4>\n" +
                        "<p>Todas as infra&ccedil;&otilde;es e penalidades de tr&acirc;nsito est&atilde;o previstas no CTB, no Cap&iacute;tulo XV e XVI, <strong>artigos 161</strong> a <strong>268</strong>.</p>\n" +
                        "<p>Vamos destacar aqui algumas relativas &agrave; condu&ccedil;&atilde;o de ve&iacute;culos de duas ou mais rodas que interessam diretamente aos candidatos &agrave; primeira habilita&ccedil;&atilde;o e fazem parte do curso de forma&ccedil;&atilde;o para condutores de ve&iacute;culos automotores, conforme a resolu&ccedil;&atilde;o do Contran no 168/04.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Documenta&ccedil;&atilde;o do condutor e do ve&iacute;culo</h4>\n" +
                        "<p>As infra&ccedil;&otilde;es referentes &agrave; documenta&ccedil;&atilde;o do condutor s&atilde;o destacadas em diversos artigos do CTB, tais como:</p>\n" +
                        "<p><strong>art. 162. </strong>Dirigir ve&iacute;culo:</p>\n" +
                        "<p>I- sem possuir Carteira Nacional de Habilita&ccedil;&atilde;o ou Permiss&atilde;o para Dirigir:</p>\n" +
                        "<p><strong>Infra&ccedil;&atilde;o</strong> - grav&iacute;ssima;</p>\n" +
                        "<p><strong>Penalidade</strong> - multa (tr&ecirc;s vezes) e apreens&atilde;o do ve&iacute;culo;</p>\n" +
                        "<p>II- com Carteira Nacional de Habilita&ccedil;&atilde;o ou Permiss&atilde;o para Dirigir cassada ou com suspens&atilde;o do direito de dirigir:</p>\n" +
                        "<p><strong>Infra&ccedil;&atilde;o</strong> - grav&iacute;ssima;</p>\n" +
                        "<p><strong>Penalidade</strong> - multa (cinco vezes) e apreens&atilde;o do ve&iacute;culo;</p>\n" +
                        "<p>III - com Carteira Nacional de Habilita&ccedil;&atilde;o ou Permiss&atilde;o para Dirigir de categoria diferente da do ve&iacute;culo que esteja conduzindo:</p>\n" +
                        "<p><strong>Infra&ccedil;&atilde;o</strong> - grav&iacute;ssima;</p>\n" +
                        "<p><strong>Penalidade</strong> - multa (tr&ecirc;s vezes) e apreens&atilde;o do ve&iacute;culo;</p>\n" +
                        "<p><strong>Medida administrativa</strong> - recolhimento do documento de habilita&ccedil;&atilde;o;</p>\n" +
                        "<p>V - com validade da Carteira Nacional de Habilita&ccedil;&atilde;o vencida h&aacute; mais de 30 dias:</p>\n" +
                        "<p><strong>Infra&ccedil;&atilde;o</strong> - grav&iacute;ssima;</p>\n" +
                        "<p><strong>Penalidade</strong> &ndash; multa.</p>\n" +
                        "<p><strong>Medida administrativa</strong> - recolhimento da Carteira Nacional de Habilita&ccedil;&atilde;o e reten&ccedil;&atilde;o do ve&iacute;culo at&eacute; a apresenta&ccedil;&atilde;o de condutor habilitado;</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Estacionamento, parada e circula&ccedil;&atilde;o<strong>&nbsp;</strong></h4>\n" +
                        "<p>As infra&ccedil;&otilde;es relativas ao estacionamento em locais proibidos s&atilde;o destacadas no artigo 181 e &agrave;s referentes &agrave; parada de ve&iacute;culos nos artigos 182 e 183 do CTB.</p>\n" +
                        "<p>O art. 181 do CTB elenca todas as situa&ccedil;&otilde;es em que &eacute; proibido estacionar o ve&iacute;culo e determina as respectivas categorias de infra&ccedil;&otilde;es e de penalidades. Por exemplo, esse artigo define que &eacute; proibido estacionar o ve&iacute;culo no passeio ou sobre a faixa destinada ao pedestre, sobre a ciclovia ou ciclofaixa, bem como nas ilhas, ref&uacute;gios, ao lado ou sobre canteiros centrais, divisores de pista de rolamento, marcas de canaliza&ccedil;&atilde;o, gramados ou jardim p&uacute;blico.</p>\n" +
                        "<p>O condutor que desrespeita essa norma comete uma infra&ccedil;&atilde;o grave e &eacute; sujeito &agrave; multa e remo&ccedil;&atilde;o do ve&iacute;culo.</p>\n" +
                        "<p>Os artigos 182 e 183 do CTB determinam a categoria de infra&ccedil;&otilde;es e as penalidades respectivas para os condutores que param seus ve&iacute;culos nas cal&ccedil;adas, nos passeios, nos cruzamentos de vias, nos viadutos, em pontes e t&uacute;neis, na contram&atilde;o de dire&ccedil;&atilde;o e sobre a faixa de pedestres.</p>\n" +
                        "<p><br /> Por outro lado, as infra&ccedil;&otilde;es relativas &agrave; circula&ccedil;&atilde;o de ve&iacute;culos est&atilde;o detalhadas nos artigos 184 a 213 do CTB.</p>\n" +
                        "<p>Os artigos 218, 219 e 220 do CTB referem-se &agrave;s infra&ccedil;&otilde;es relativas aos limites de velocidade.</p>\n" +
                        "<p>Assim, o artigo 218 do CTB determina as infra&ccedil;&otilde;es e as penalidades nas situa&ccedil;&otilde;es em que o condutor transita em velocidade superior &agrave; m&aacute;xima permitida para o local, medida por instrumento ou equipamento h&aacute;bil, em rodovias, vias de tr&acirc;nsito r&aacute;pido, vias arteriais e demais vias.</p>\n" +
                        "<p>O artigo 219 estabelece a penalidade e a categoria da infra&ccedil;&atilde;o para o condutor que transita com o ve&iacute;culo em velocidade inferior &agrave; metade da velocidade m&aacute;xima estabelecida para a via, retardando ou obstruindo o tr&acirc;nsito, a menos que as condi&ccedil;&otilde;es de tr&aacute;fego e meteorol&oacute;gicas n&atilde;o o permitam, salvo se estiver na faixa da direita.</p>\n" +
                        "<p>O artigo 220 estabelece as situa&ccedil;&otilde;es em que o condutor comete infra&ccedil;&otilde;es por deixar de reduzir a velocidade do ve&iacute;culo de forma compat&iacute;vel com a seguran&ccedil;a do tr&acirc;nsito.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Seguran&ccedil;a e atitudes do condutor, passageiro, pedestre e demais atores do processo de circula&ccedil;&atilde;o</h4>\n" +
                        "<p>Os artigos <strong>167</strong> a <strong>170</strong> do CTB referem-se a atitudes do condutor que ocasionam infra&ccedil;&atilde;o de tr&acirc;nsito. Veja a classifica&ccedil;&atilde;o da infra&ccedil;&atilde;o e sua penalidade.</p>\n" +
                        "<p><strong>art. 167. </strong>Deixar o condutor ou passageiro de usar o cinto de seguran&ccedil;a, conforme previsto no art. 65:</p>\n" +
                        "<p><strong>Infra&ccedil;&atilde;o</strong> - grave;</p>\n" +
                        "<p><strong>Penalidade</strong> - multa.</p>\n" +
                        "<p><strong>art. 168. </strong>Transportar crian&ccedil;as em ve&iacute;culo automotor sem observ&acirc;ncia das normas de seguran&ccedil;a especiais estabelecidas no C&oacute;digo de Tr&acirc;nsito Brasileiro:</p>\n" +
                        "<p><strong>Infra&ccedil;&atilde;o</strong> - grav&iacute;ssima;</p>\n" +
                        "<p><strong>Penalidade</strong> - multa.</p>\n" +
                        "<p><strong>Medida administrativa</strong> - reten&ccedil;&atilde;o do ve&iacute;culo at&eacute; que a irregularidade seja sanada.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p><strong>art. 169. </strong>Dirigir sem aten&ccedil;&atilde;o ou sem os cuidados indispens&aacute;veis &agrave; seguran&ccedil;a:</p>\n" +
                        "<p><strong>Infra&ccedil;&atilde;o</strong> - leve;</p>\n" +
                        "<p><strong>Penalidade</strong> - multa.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p><strong>art. 170. </strong>Dirigir amea&ccedil;ando os pedestres que estejam atravessando a via p&uacute;blica ou os demais ve&iacute;culos:</p>\n" +
                        "<p><strong>Infra&ccedil;&atilde;o</strong> - grav&iacute;ssima;</p>\n" +
                        "<p><strong>Penalidade</strong> - multa e suspens&atilde;o do direito de dirigir.</p>\n" +
                        "<p>Tamb&eacute;m os artigos 214 a 217 do CTB trazem infra&ccedil;&otilde;es relativas a atitudes do condutor que podem prejudicar outros atores do processo de circula&ccedil;&atilde;o. Para ilustrar, cabe destacar o artigo 244 do CTB que trata de infra&ccedil;&otilde;es do condutor de motocicleta, motoneta e ciclomotor. Por outro lado, os artigos 254 e 255 do CTB referem-se a infra&ccedil;&otilde;es cometidas pelos pedestres e ciclistas.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Meio ambiente</h4>\n" +
                        "<p>O artigo <strong>231</strong> do CTB &eacute; um exemplo de infra&ccedil;&atilde;o cometida pelo condutor contra o meio ambiente. Veja parte da tipifica&ccedil;&atilde;o do artigo que trata disso:</p>\n" +
                        "<p><strong>art. 231. </strong>Transitar com o ve&iacute;culo:</p>\n" +
                        "<p>I - danificando a via, suas instala&ccedil;&otilde;es e equipamentos; II - derramando, lan&ccedil;ando ou arrastando sobre a via:</p>\n" +
                        "<p>a) carga que esteja transportando;</p>\n" +
                        "<p>b) combust&iacute;vel ou lubrificante que esteja utilizando;</p>\n" +
                        "<p>c) qualquer objeto que possa acarretar risco de acidente:</p>\n" +
                        "<p><strong>Infra&ccedil;&atilde;o</strong> - grav&iacute;ssima;</p>\n" +
                        "<p><strong>Penalidade</strong> - multa.</p>\n" +
                        "<p>III - produzindo fuma&ccedil;a, gases ou part&iacute;culas em n&iacute;veis superiores aos fixados pelo Contran;</p>\n" +
                        "<p><strong>Infra&ccedil;&atilde;o</strong> - grave;</p>\n" +
                        "<p><strong>Penalidade</strong> - multa.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Tamb&eacute;m os artigos reproduzidos abaixo tratam de infra&ccedil;&otilde;es ao meio ambiente:</p>\n" +
                        "<p><strong>art. 227. </strong>Usar buzina:</p>\n" +
                        "<p>I - em situa&ccedil;&atilde;o que n&atilde;o a de simples toque breve como advert&ecirc;ncia ao pedestre ou a condutores de outros ve&iacute;culos;</p>\n" +
                        "<p>II - prolongada e sucessivamente a qualquer pretexto; III - entre as 22h e as 6h;</p>\n" +
                        "<p>III - em locais e hor&aacute;rios proibidos pela sinaliza&ccedil;&atilde;o;</p>\n" +
                        "<p>IV - em desacordo com os padr&otilde;es e frequ&ecirc;ncias estabelecidas pelo Contran:</p>\n" +
                        "<p><strong>Infra&ccedil;&atilde;o</strong> - leve;</p>\n" +
                        "<p><strong>Penalidade</strong> - multa.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p><strong>art. 228. </strong>Usar no ve&iacute;culo equipamento com som em volume ou frequ&ecirc;ncia que n&atilde;o sejam autorizados pelo Contran:</p>\n" +
                        "<p><strong>Infra&ccedil;&atilde;o</strong> - grave;</p>\n" +
                        "<p><strong>Penalidade</strong> - multa.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p><strong>art. 229. </strong>Usar indevidamente no ve&iacute;culo aparelho de alarme ou que produza sons e ru&iacute;do que perturbem o sossego p&uacute;blico, em desacordo com normas fixadas pelo Contran:</p>\n" +
                        "<p><strong>Infra&ccedil;&atilde;o</strong> - m&eacute;dia.</p>\n" +
                        "<p><strong>Penalidade</strong> - multa e apreens&atilde;o do ve&iacute;culo.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p><strong><em>IMPORTANTE: </em></strong><em>destacamos aqui algumas das situa&ccedil;&otilde;es de tr&acirc;nsito que se constituem </em><em>em infra&ccedil;&otilde;es. Procuramos relacionar as mais frequentes. Por&eacute;m, todo condutor deve conhecer a integralidade da lei, das infra&ccedil;&otilde;es, dos crimes e das penalidades. Para&nbsp;</em><em>isso, consulte o CTB sempre que estiver com alguma d&uacute;vida.</em></p>",
                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Legislação de Trânsito");
        toolbarprincipal.setSubtitle("Infrações e penalidades");
    }





    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }


    }

    public void mostraAd(){
        if (mInterstitialAd.isLoaded()) {

            mInterstitialAd.show();
        }
    }
}
