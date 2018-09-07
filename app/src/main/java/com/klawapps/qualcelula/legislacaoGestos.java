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


public class legislacaoGestos extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legislacao_gestos);


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
        htmlTextView.setHtml("<h4>Gestos<strong>&nbsp;</strong></h4>\n" +
                        "<p>De acordo com a resolu&ccedil;&atilde;o do Contran no 160/04, os gestos utilizados na sinaliza&ccedil;&atilde;o vi&aacute;ria se dividem em:</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>a)&nbsp; Gestos de Agentes da Autoridade de Tr&acirc;nsito</h4>\n" +
                        "<p>As ordens emanadas por gestos de Agentes da Autoridade de Tr&acirc;nsito prevalecem sobre as regras de circula&ccedil;&atilde;o e as normas definidas por outros sinais de tr&acirc;nsito. S&atilde;o exemplos:</p>\n" +
                        "<p><img src=\"gestoum\" width=\"300\" height=\"300\" /></p>" +
                        "<p><img src=\"gestodois\" width=\"300\" height=\"300\" /></p>" +
                        "<p><img src=\"gestotres\" width=\"300\" height=\"300\" /></p>" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>b)&nbsp; Gestos de Condutores</h4>\n" +
                        "<p>Sinais que os condutores realizam quando v&atilde;o executar alguma manobra. Vale ressaltar que os gestos dos condutores n&atilde;o possuem uma regulamenta&ccedil;&atilde;o no C&oacute;digo de Tr&acirc;nsito Brasileiro. S&atilde;o, portanto, utilizados apenas para auxiliar na fluidez do tr&acirc;nsito, n&atilde;o prevalecendo sobre as normas e regras de circula&ccedil;&atilde;o. Um motorista precavido e atento sempre saber&aacute; quando h&aacute; a necessidade da utiliza&ccedil;&atilde;o de gestos.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Exemplos:</p>\n" +
                        "<p><img src=\"gestoquatro\" width=\"300\" height=\"300\" /></p>" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Sinais Sonoros</h4>\n" +
                        "<p>Os sinais sonoros somente devem ser utilizados em conjunto com os gestos dos agentes, lembrando ainda que eles prevalecem sobre as regras de circula&ccedil;&atilde;o e as normas definidas por outros sinais de tr&acirc;nsito.</p>\n" +
                        "<p><img src=\"gestocinco\" width=\"300\" height=\"300\" /></p>",

                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Legislação de trânsito");
        toolbarprincipal.setSubtitle("Gestos");
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
