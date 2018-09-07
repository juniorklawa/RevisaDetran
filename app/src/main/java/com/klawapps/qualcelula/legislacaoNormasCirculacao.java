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


public class legislacaoNormasCirculacao extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legislacao_normas_circulacao);


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
        htmlTextView.setHtml("<h4>&nbsp;Normas de circula&ccedil;&atilde;o e conduta</h4>\n" +
                        "<p>As regras gerais de circula&ccedil;&atilde;o definem o comportamento correto dos usu&aacute;rios das vias, principalmente dos condutores. Apesar de serem procedimentos b&aacute;sicos que todo condutor deveria seguir, os erros em manobras s&atilde;o extremamente frequentes, sendo os principais respons&aacute;veis por grande parte das infra&ccedil;&otilde;es e dos acidentes.</p>\n" +
                        "<p>De acordo com o <strong>art. 26</strong> do CTB, os usu&aacute;rios das vias terrestres devem:</p>\n" +
                        "<p>&nbsp;I - abster-se de todo ato que possa constituir perigo ou obst&aacute;culo para o tr&acirc;nsito de ve&iacute;culos, de pessoas ou de animais, ou ainda causar danos a propriedades p&uacute;blicas ou privadas;</p>\n" +
                        "<p>II - abster-se de obstruir o tr&acirc;nsito ou torn&aacute;-lo perigoso, atirando, depositando ou abandonando na via objetos ou subst&acirc;ncias, ou nela criando qualquer outro obst&aacute;culo.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>De acordo com o <strong>art. 28</strong>, o condutor dever&aacute;, a todo momento (durante toda a viagem), ter dom&iacute;nio de seu ve&iacute;culo, dirigindo-o com aten&ccedil;&atilde;o e cuidados indispens&aacute;veis &agrave; seguran&ccedil;a do tr&acirc;nsito.</p>\n" +
                        "<p>O <strong>art. 29</strong> apresenta diversas normas para circula&ccedil;&atilde;o e conduta de ve&iacute;culos nas vias terrestres. De maneira resumida, o artigo define que:</p>\n" +
                        "<p>&nbsp;I - a circula&ccedil;&atilde;o far-se-&aacute; pelo lado direito da via, admitindo-se as exce&ccedil;&otilde;es devidamente sinalizadas;</p>\n" +
                        "<p>&nbsp;II - o condutor dever&aacute; guardar dist&acirc;ncia de seguran&ccedil;a lateral e frontal entre o seu e os demais ve&iacute;culos, bem como em rela&ccedil;&atilde;o ao bordo da pista, considerando- se, no momento, a velocidade e as condi&ccedil;&otilde;es do local, da circula&ccedil;&atilde;o, do ve&iacute;culo e as condi&ccedil;&otilde;es clim&aacute;ticas;</p>\n" +
                        "<p>&nbsp;III - quando ve&iacute;culos, transitando por fluxos que se cruzem, se aproximarem de local n&atilde;o sinalizado, ter&aacute; prefer&ecirc;ncia de passagem:</p>\n" +
                        "<p>a) no caso de apenas um fluxo ser proveniente de rodovia, aquele que estiver circulando por ela;</p>\n" +
                        "<p>b) no caso de rotat&oacute;ria, aquele que estiver circulando por ela;</p>\n" +
                        "<p>c) nos demais casos, o que vier pela direita do condutor;</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>&nbsp;IV - quando houver v&aacute;rias faixas na pista, as da direita s&atilde;o destinadas ao deslocamento dos ve&iacute;culos mais lentos, e as da esquerda destinadas &agrave; ultrapassagem e ao deslocamento dos ve&iacute;culos de maior velocidade;</p>\n" +
                        "<p>&nbsp;V - o tr&acirc;nsito de ve&iacute;culos sobre passeios, cal&ccedil;adas e nos acostamentos s&oacute; poder&aacute; ocorrer para que se adentre ou se saia dos im&oacute;veis ou &aacute;reas especiais de estacionamento;</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Al&eacute;m dessas normas gerais, o CTB define regras para se reduzir a velocidade do ve&iacute;culo, frear, parar ou estacionar. Existem normas, tamb&eacute;m, para o uso das luzes do ve&iacute;culo e de buzina. Fique atento, pois o CTB tamb&eacute;m estabelece procedimentos para as ultrapassagens e para os cruzamentos, al&eacute;m de situa&ccedil;&otilde;es em que sejam necess&aacute;rias mudan&ccedil;as de dire&ccedil;&atilde;o ou outras manobras. Consulte o Cap&iacute;tulo III do CTB que traz o conjunto de normas gerais de circula&ccedil;&atilde;o e conduta.</p>",
                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Legislação de Trânsito");
        toolbarprincipal.setSubtitle("Normas de circulação e conduta");
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
