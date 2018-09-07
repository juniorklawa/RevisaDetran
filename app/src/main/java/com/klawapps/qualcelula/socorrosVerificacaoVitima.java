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


public class socorrosVerificacaoVitima extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socorros_verificacao_vitima);


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
        htmlTextView.setHtml("<p>&nbsp;</p>\n" +
                        "<h3>Verifica&ccedil;&atilde;o das condi&ccedil;&otilde;es gerais da v&iacute;tima</h3>\n" +
                        "<p>Primeiramente, fa&ccedil;a contato com a v&iacute;tima. Fale calmamente, informe o que aconteceu, ou&ccedil;a suas queixas e permane&ccedil;a pr&oacute;ximo. Mantenha a calma, a v&iacute;tima precisa sentir- se amparada por algu&eacute;m que lhe transmita seguran&ccedil;a e confian&ccedil;a. Informe aos acidentados que o aux&iacute;lio j&aacute; est&aacute; a caminho.</p>\n" +
                        "<p>Quando se aproximar da cena do acidente, tenha certeza de que est&aacute; protegido (evite ser atropelado, por exemplo), pois &eacute; necess&aacute;rio que voc&ecirc; ajude os outros e n&atilde;o seja mais uma v&iacute;tima. N&atilde;o solte o cinto de seguran&ccedil;a, A N&Atilde;O SER que esteja dificultando a respira&ccedil;&atilde;o da v&iacute;tima. Neste caso, tome cuidado para n&atilde;o moviment&aacute;-la.</p>\n" +
                        "<p>Fa&ccedil;a perguntas simples e diretas visando identificar se a v&iacute;tima est&aacute; consciente. Caso haja mais pessoas no local, tente identificar a presen&ccedil;a de algu&eacute;m que tenha experi&ecirc;ncia com primeiros socorros.</p>\n" +
                        "<p><em>Cubra a v&iacute;tima com uma vestimenta dispon&iacute;vel para proteg&ecirc;-la do sol, chuva ou frio e aguarde a chegada do socorro, pois a movimenta&ccedil;&atilde;o da v&iacute;tima ou a identifica&ccedil;&atilde;o de um problema mais grave exige treinamento pr&aacute;tico em primeiros socorros.</em></p>\n" +
                        "<p><strong>ATEN&Ccedil;&Atilde;O!</strong></p>\n" +
                        "<p><em>Por outro lado, algu&eacute;m que n&atilde;o &eacute; especialista em primeiros socorros precisa obrigatoriamente saber o que n&atilde;o se pode fazer com uma v&iacute;tima de acidentes. </em><em>Essas a&ccedil;&otilde;es proibidas est&atilde;o relacionadas a seguir:</em></p>\n" +
                        "<ul>\n" +
                        "<li><strong><em>N&Atilde;O </em></strong><em>movimente a v&iacute;tima.</em></li>\n" +
                        "<li><strong><em>N&Atilde;O </em></strong><em>fa&ccedil;a torniquetes para estancar hemorragias.</em></li>\n" +
                        "<li><strong><em>N&Atilde;O </em></strong><em>retire o capacete de um motociclista.</em></li>\n" +
                        "<li><strong><em>N&Atilde;O </em></strong><em>d&ecirc; l&iacute;quidos nem alimentos para a v&iacute;tima.</em></li>\n" +
                        "</ul>\n" +
                        "<p><em>Os primeiros socorros s&atilde;o procedimentos imediatos e tempor&aacute;rios, prestados a algu&eacute;m em caso de acidente ou de mal s&uacute;bito, com a finalidade de manter as fun&ccedil;&otilde;es vitais da v&iacute;tima e evitar o agravamento da situa&ccedil;&atilde;o, at&eacute; a chegada de socorro m&eacute;dico.</em></p>",

                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Primeiros socorros");
        toolbarprincipal.setSubtitle("Verificação da condição da vítima");
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
