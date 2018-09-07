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


public class direcaoAcidentes extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direcao_acidentes);


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
        htmlTextView.setHtml("<h4>&nbsp;Acidente evit&aacute;vel ou n&atilde;o evit&aacute;vel<strong>&nbsp;</strong></h4>\n" +
                        "<p>Acidente evit&aacute;vel &eacute; aquele em que os motoristas envolvidos n&atilde;o fizeram tudo o que pode ser feito para evitar que o acidente aconte&ccedil;a. J&aacute; o acidente inevit&aacute;vel ou n&atilde;o evit&aacute;vel &eacute; aquele em que o motorista fez tudo o que era poss&iacute;vel fazer, mas n&atilde;o conseguiu evitar.</p>\n" +
                        "<p><em>Todo</em> <em>acidente</em> <em>&eacute; evit&aacute;vel? A resposta &eacute; sim, porque sempre haver&aacute; algo que poderia ter sido feito por algu&eacute;m para evit&aacute;-lo, caso o respons&aacute;vel tivesse usado a raz&atilde;o, o bom senso e as t&eacute;cnicas de dire&ccedil;&atilde;o defensiva.</em></p>\n" +
                        "<p><em>&nbsp;</em></p>\n" +
                        "<p>Acidentes acontecem devido a um fator ou a uma combina&ccedil;&atilde;o de fatores desencadeadores. A dire&ccedil;&atilde;o defensiva ajuda a prever esses fatores e ensina t&eacute;cnicas para control&aacute;-los, de forma a evitar que os acidentes ocorram. Por&eacute;m, n&atilde;o existe uma divis&atilde;o clara entre esses dois tipos de acidentes, de maneira que muitas vezes fica imposs&iacute;vel classific&aacute;-los.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Normalmente as pessoas perguntam quem &eacute; o culpado, sendo que a pergunta correta &eacute;: &ldquo;quem poderia ter evitado o acidente?&rdquo;. Uma das mais recorrentes causas de acidentes &eacute; o comportamento do pr&oacute;prio condutor do ve&iacute;culo.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>De acordo com as estat&iacute;sticas apresentadas pelo Detran/SP, considerando os acidentes de tr&acirc;nsito no Brasil:</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>75% s&atilde;o causados por falhas humanas;</li>\n" +
                        "<li>12% s&atilde;o causados por falhas mec&acirc;nicas dos ve&iacute;culos;</li>\n" +
                        "<li>6% s&atilde;o causados por m&aacute;s condi&ccedil;&otilde;es das vias;</li>\n" +
                        "<li>7% por outras.</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Dessa forma, considerando que a produ&ccedil;&atilde;o e conserva&ccedil;&atilde;o dos ve&iacute;culos e a constru&ccedil;&atilde;o e manuten&ccedil;&atilde;o das estradas tamb&eacute;m s&atilde;o responsabilidades humanas, podemos dizer que o homem, no m&iacute;nimo, &eacute; respons&aacute;vel direta ou indiretamente por 93 dos acidentes.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>A pr&aacute;tica da dire&ccedil;&atilde;o defensiva tem o objetivo de evitar acidentes, e seu principal componente &eacute; a preven&ccedil;&atilde;o.</p>",
                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Direção defensiva");
        toolbarprincipal.setSubtitle("Acidentes");
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
