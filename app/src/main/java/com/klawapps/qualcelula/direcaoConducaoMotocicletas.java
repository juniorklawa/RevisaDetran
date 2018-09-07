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


public class direcaoConducaoMotocicletas extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direcao_conducao_motocicletas);


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
        htmlTextView.setHtml("<h4>Abordagem te&oacute;rica da condu&ccedil;&atilde;o de motocicletas com passageiro e/ou cargas</h4>\n" +
                        "<h5>LEMBRE-SE</h5>\n" +
                        "<p><em>Este assunto &eacute; destinado aos candidatos &agrave; primeira habilita&ccedil;&atilde;o. Portanto, voc&ecirc; s&oacute; poder&aacute; obter a CNH nas categorias &ldquo;A&rdquo; e &ldquo;B&rdquo;. Assim, se voc&ecirc; desejar conduzir motocicleta ou ve&iacute;culo similar de duas rodas dever&aacute; ser habilitado na categoria &ldquo;A&rdquo;.</em></p>\n" +
                        "<p><em>&nbsp;</em></p>\n" +
                        "<p>Voc&ecirc; n&atilde;o poder&aacute; jamais utilizar sua motocicleta para transportar passageiros ou cargas como atividade profissional. Essa possibilidade existe, mas n&atilde;o para os candidatos &agrave; primeira habilita&ccedil;&atilde;o.</p>\n" +
                        "<p>De qualquer maneira, vejamos a seguir quais s&atilde;o as exig&ecirc;ncias e requisitos necess&aacute;rios para o transporte remunerado de passageiros (motot&aacute;xi) ou mercadorias (motofrete) em motocicletas.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>De acordo com a lei no 12.009, de 29 de julho de 2009, que define as regras para o transporte remunerado de mercadorias e de passageiros em motocicletas e motonetas, os requisitos para exercer essa atividade s&atilde;o os seguintes:</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>&ndash; ter completado 21 (vinte e um) anos;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>&ndash; possuir habilita&ccedil;&atilde;o, por pelo menos 2 (dois) anos, na categoria;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>&ndash; ser aprovado em curso especializado, nos termos da regulamenta&ccedil;&atilde;o do Contran (resolu&ccedil;&atilde;o no 350/2010);</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>IV&ndash; estar vestido com colete de seguran&ccedil;a dotado de dispositivos retrorrefletivos, nos termos da regulamenta&ccedil;&atilde;o do Contran (Conselho Nacional de Tr&acirc;nsito) (resolu&ccedil;&atilde;o no 356/2010).</p>\n" +
                        "<p>Adicionalmente, para o exerc&iacute;cio da atividade de transporte de passageiros em motocicletas e motonetas (motot&aacute;xi), o condutor deve, ainda, atender aos requisitos do <strong>art. 329</strong> do CTB.</p>",
                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Direção defensiva");
        toolbarprincipal.setSubtitle("Condução de motocicletas");
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
