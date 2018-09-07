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


public class direcaoComoEvitarAcidentes extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direcao_como_evitar_acidentes);


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
        htmlTextView.setHtml("<h4>Dist&acirc;ncias de seguran&ccedil;a no tr&acirc;nsito</h4>\n" +
                        "<p>A partir do momento em que o condutor v&ecirc; um obst&aacute;culo enquanto est&aacute; dirigindo, ele come&ccedil;a a frear. O intervalo de tempo entre o momento em que ele v&ecirc; o obst&aacute;culo e o momento em que de fato aciona os freios &eacute; chamado de TR (Tempo de Rea&ccedil;&atilde;o) Podemos entender que o TR &eacute; o intervalo de tempo entre a observa&ccedil;&atilde;o do obst&aacute;culo (outro ve&iacute;culo, buracos, pedestres etc.) e a rea&ccedil;&atilde;o necess&aacute;ria (mudan&ccedil;a de dire&ccedil;&atilde;o, redu&ccedil;&atilde;o, parada, entre outras rea&ccedil;&otilde;es).</p>\n" +
                        "<p>O TR varia de indiv&iacute;duo para indiv&iacute;duo, pois est&aacute; relacionado com sua capacidade de reagir aos est&iacute;mulos visuais. Al&eacute;m disso, o TR pode ser afetado pelas condi&ccedil;&otilde;es f&iacute;sicas e ps&iacute;quicas do condutor, por exemplo, seu estado de fadiga e o grau de alcoolemia do indiv&iacute;duo. Normalmente, o intervalo m&eacute;dio de rea&ccedil;&atilde;o &eacute; de aproximadamente 0,75 segundos.</p>\n" +
                        "<p>A dist&acirc;ncia percorrida durante o DTR (Tempo de Rea&ccedil;&atilde;o) varia em fun&ccedil;&atilde;o da velocidade em que se encontra o ve&iacute;culo; observe alguns exemplos na tabela a seguir:</p>\n" +
                        "<p><img src=\"direcaoreacao\" width=\"300\" height=\"300\" /></p>" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Ap&oacute;s acionados os freios, sejam eles convencionais ou com ABS (Sistema Antitravamento), cada ve&iacute;culo leva um tempo at&eacute; parar completamente. Esse tempo &eacute; denominado TF (Tempo de Frenagem).</p>\n" +
                        "<p>A dist&acirc;ncia percorrida pelo ve&iacute;culo entre o momento em que o condutor aciona os freios e aquele em que o ve&iacute;culo para completamente &eacute; chamada DF (Dist&acirc;ncia de Frenagem). Essa dist&acirc;ncia pode variar de acordo com o tipo de ve&iacute;culo; por exemplo, um ve&iacute;culo em condi&ccedil;&otilde;es normais de manuten&ccedil;&atilde;o e condu&ccedil;&atilde;o, que trafega a uma velocidade de 40 km/h, percorre aproximados 6,4 metros.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>A seguir veremos alguns elementos que podem interferir, aumentando ou reduzindo a Dist&acirc;ncia de Frenagem, quais sejam:</p>\n" +
                        "<p>&nbsp;I)  Ve&iacute;culo especialmente quanto ao estado de conserva&ccedil;&atilde;o do sistema de frenagem (convencional ou ABS);</p>\n" +
                        "<p>&nbsp;II)  Velocidade desenvolvida pelo ve&iacute;culo;</p>\n" +
                        "<p>III)  Ader&ecirc;ncia dos pneus do ve&iacute;culo &agrave; pista, que varia em fun&ccedil;&atilde;o do estado de conserva&ccedil;&atilde;o dos pneus, do estado de conserva&ccedil;&atilde;o da pista e do estado em que ela se encontra (seca, molhada, com &oacute;leo ).</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>O TP (Tempo de Parada) corresponde ao intervalo do Tempo de Rea&ccedil;&atilde;o acrescido ao Tempo de Frenagem.</p>\n" +
                        "<p>A Dist&acirc;ncia DTP (Dist&acirc;ncia Total de Parada) &eacute; aquela percorrida pelo ve&iacute;culo desde o momento em que o condutor percebeu o obst&aacute;culo at&eacute; o momento em que o ve&iacute;culo parou por completo.</p>\n" +
                        "<p>Para que voc&ecirc; possa ter ideia da import&acirc;ncia de conhecer e respeitar essas dist&acirc;ncias, um ve&iacute;culo trafegando a 50 km/h pode parar em 45 metros. No entanto, se ele estiver a 70 km/h, precisar&aacute; de 70 metros para parar.</p>\n" +
                        "<p>Ao trafegar atr&aacute;s de outro ve&iacute;culo, &eacute; preciso manter dist&acirc;ncia para evitar uma colis&atilde;o se ele frear bruscamente. Uma boa dist&acirc;ncia permite que voc&ecirc; tenha tempo de reagir e acionar os freios diante de uma situa&ccedil;&atilde;o de emerg&ecirc;ncia, e que haja tempo, tamb&eacute;m, para que o ve&iacute;culo, uma vez freado, pare antes de colidir.</p>\n" +
                        "<p>&nbsp;</p>",
                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Direção defensiva");
        toolbarprincipal.setSubtitle("Como evitar acidentes");
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
