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


public class legislacaoDiretoseDeveres extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legislacao_diretose_deveres);


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
        htmlTextView.setHtml("<h4>Direitos e deveres do cidad&atilde;o</h4>\n" +
                        "<p>O Cap&iacute;tulo V do CTB estabelece, nos seus artigos 72 e 73, os direitos do cidad&atilde;o referentes ao tr&acirc;nsito. Dada a sua import&acirc;ncia, esses artigos s&atilde;o reproduzidos na &iacute;ntegra a seguir:</p>\n" +
                        "<p><strong>Art. 72. </strong>Todo cidad&atilde;o ou entidade civil tem o direito de solicitar, por escrito, aos &oacute;rg&atilde;os ou as entidades do Sistema Nacional de Tr&acirc;nsito sinaliza&ccedil;&atilde;o, fiscaliza&ccedil;&atilde;o e implanta&ccedil;&atilde;o de equipamentos de seguran&ccedil;a, bem como sugerir altera&ccedil;&otilde;es em normas, legisla&ccedil;&atilde;o e outros assuntos pertinentes a esse c&oacute;digo.</p>\n" +
                        "<p><strong>Art. 73. </strong>Os &oacute;rg&atilde;os ou as entidades pertencentes ao Sistema Nacional de Tr&acirc;nsito t&ecirc;m o dever de analisar as solicita&ccedil;&otilde;es e responder, por escrito, dentro de prazos m&iacute;nimos, sobre a possibilidade ou n&atilde;o de atendimento, esclarecendo ou justificando a an&aacute;lise efetuada e, se pertinente, informando ao solicitante quando tal evento ocorrer&aacute;.</p>\n" +
                        "<p>Par&aacute;grafo &uacute;nico: as campanhas de tr&acirc;nsito devem esclarecer quais as atribui&ccedil;&otilde;es dos &oacute;rg&atilde;os e entidades pertencentes ao Sistema Nacional de Tr&acirc;nsito ecomo proceder atais solicita&ccedil;&otilde;es.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Por outro lado, o Cap&iacute;tulo VI do CTB relaciona os direitos do cidad&atilde;o relativos &agrave; educa&ccedil;&atilde;o para o tr&acirc;nsito. Cabe destacar o artigo 74 desse cap&iacute;tulo:</p>\n" +
                        "<p><strong>Art. 74. </strong>A educa&ccedil;&atilde;o para o tr&acirc;nsito &eacute; direito de todos e constitui dever priorit&aacute;rio para os componentes do Sistema Nacional de Tr&acirc;nsito.</p>\n" +
                        "<ul>\n" +
                        "<li>&nbsp;<strong>&sect;&nbsp;</strong>2&ordm; O tr&acirc;nsito, em condi&ccedil;&otilde;es seguras, &eacute; um direito de todos e dever dos &oacute;rg&atilde;os e entidades componentes do Sistema Nacional de Tr&acirc;nsito, a esses cabendo, no &acirc;mbito das respectivas compet&ecirc;ncias, adotar as medidas destinadas a assegurar esse direito.</li>\n" +
                        "</ul>\n" +
                        "<p>J&aacute; os deveres do cidad&atilde;o em rela&ccedil;&atilde;o ao tr&acirc;nsito consistem no respeito &agrave;s leis do CTB e &agrave;s outras legisla&ccedil;&otilde;es vigentes, podendo-se afirmar que um preceito b&aacute;sico que gera o dever de todo cidad&atilde;o no tr&acirc;nsito &eacute; integr&aacute;-lo, proporcionando condi&ccedil;&otilde;es seguras para todos os demais part&iacute;cipes.</p>",

                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Legislação de trânsito");
        toolbarprincipal.setSubtitle("Diretos e deveres do cidadão");
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
