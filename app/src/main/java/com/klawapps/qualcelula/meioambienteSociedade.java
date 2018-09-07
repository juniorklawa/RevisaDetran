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


public class meioambienteSociedade extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meioambiente_sociedade);


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
        htmlTextView.setHtml("<h4>O indiv&iacute;duo, o grupo e a sociedade</h4>\n" +
                        "<p><em>Um verdadeiro cidad&atilde;o &eacute; um indiv&iacute;duo consciente de seu papel na sociedade. A cidadania pode ser definida como o conjunto de direitos e deveres que um indiv&iacute;duo tem perante o Estado, os quais constituem as normas de conduta do cidad&atilde;o. Ser cidad&atilde;o &eacute; participar ativamente da vida e do governo de seu povo. Vamos conhecer mais sobre esses direitos e deveres.</em></p>\n" +
                        "<p>As normas de conduta s&atilde;o definidas por leis e c&oacute;digos. No Brasil, a lei m&aacute;xima &eacute; a CF (Constitui&ccedil;&atilde;o Federal), que prev&ecirc; uma s&eacute;rie de direitos individuais, compostos tanto por direitos do homem quanto por direitos fundamentais. Essa distin&ccedil;&atilde;o se faz porque os chamados direitos do homem s&atilde;o aqueles inerentes &agrave; condi&ccedil;&atilde;o humana, cabendo ao Estado, por meio da constitui&ccedil;&atilde;o, n&atilde;o o dever de cri&aacute;-los, mas somente de reconhec&ecirc;-los como preexistentes.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>A constitui&ccedil;&atilde;o trata dos direitos sociais em um cap&iacute;tulo pr&oacute;prio, classificando esses direitos em trabalhistas, ou seja, o homem enquanto produtor,</p>\n" +
                        "<p>e os direitos do homem enquanto destinat&aacute;rio de um servi&ccedil;o, que dizem respeito, por exemplo, &agrave; previd&ecirc;ncia social que deve ser prestada ao indiv&iacute;duo.</p>\n" +
                        "<p>S&atilde;o direitos sociais definidos na constitui&ccedil;&atilde;o: educa&ccedil;&atilde;o, sa&uacute;de, moradia, lazer, seguran&ccedil;a, previd&ecirc;ncia social, prote&ccedil;&atilde;o &agrave; maternidade e &agrave; inf&acirc;ncia e a assist&ecirc;ncia aos desamparados. A constitui&ccedil;&atilde;o, portanto, trata do m&iacute;nimo necess&aacute;rio &agrave; realiza&ccedil;&atilde;o da dignidade humana.</p>\n" +
                        "<p>Por outro lado, o cidad&atilde;o tem seus deveres tamb&eacute;m previstos na constitui&ccedil;&atilde;o. Um deles &eacute; o de respeitar as leis vigentes no pa&iacute;s, inclusive &agrave;quelas emanadas do CTB. O respeito &agrave;s leis inclui o respeito &agrave;s outras pessoas, principalmente no tr&acirc;nsito, local onde h&aacute; uma grande quantidade de intera&ccedil;&otilde;es e relacionamentos entre as pessoas.</p>\n" +
                        "<p>&Eacute; por meio de intera&ccedil;&otilde;es e rela&ccedil;&otilde;es com pessoas que estabelecemos nossos valores, prop&oacute;sitos, atitudes e comportamentos. Da&iacute; o motivo de elas serem t&atilde;o importantes.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Comportamento solid&aacute;rio e o respeito m&uacute;tuo no tr&acirc;nsito</h4>\n" +
                        "<p>Acorresponsabilidade pela vida social significa valorizar comportamentosnecess&aacute;rios &agrave; seguran&ccedil;a no tr&acirc;nsito. O respeito &agrave;s pessoas e &agrave; conviv&ecirc;ncia solid&aacute;ria tornam a vida e o tr&acirc;nsito mais seguros. Assim, &eacute; necess&aacute;rio compreender que tanto o governo quanto a popula&ccedil;&atilde;o t&ecirc;m como contribuir para um tr&acirc;nsito melhor e mais seguro.</p>\n" +
                        "<p>Uma das principais caracter&iacute;sticas do motorista &eacute; a cortesia. Isso significa abrir m&atilde;o de seus direitos em favor da seguran&ccedil;a de todos. O motorista deve estar atento para que problemas alheios n&atilde;o influenciem sua forma de dirigir. Para tanto, o condutor deve entender que o comportamento inadequado de outro motorista n&atilde;o deve resultar em uma resposta de mesma natureza.</p>\n" +
                        "<p>Cabe destacar que todas as pessoas possuem direito &agrave; mobilidade, incluindo aquelas com necessidades especiais. Elas possuem amplos direitos civis, econ&ocirc;micos, pol&iacute;ticos e sociais consagrados na Carta Internacional de Direitos Humanos, em igualdade com todas as outras pessoas. A igual prote&ccedil;&atilde;o de todos e a n&atilde;o discrimina&ccedil;&atilde;o s&atilde;o os fundamentos nos quais se baseiam os instrumentos internacionais de direitos humanos.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Todas as regras de circula&ccedil;&atilde;o, presentes no CTB ou em qualquer outro documento de Legisla&ccedil;&atilde;o de Tr&acirc;nsito, tamb&eacute;m devem ser praticadas sob todos os aspectos, pois a n&atilde;o observ&acirc;ncia delas pelo condutor pode provocar um acidente.</p>\n" +
                        "<p>O condutor dever&aacute; ter sempre em mente que ele divide o espa&ccedil;o p&uacute;blico com outros indiv&iacute;duos que tamb&eacute;m necessitam utilizar as vias. Em rela&ccedil;&atilde;o &agrave; circula&ccedil;&atilde;o, o par&aacute;grafo 2&ordm; do art. 29 do CTB determina que: &ldquo;respeitadas as normas de circula&ccedil;&atilde;o e conduta estabelecidas neste artigo, em ordem decrescente, os ve&iacute;culos de maior porte ser&atilde;o sempre respons&aacute;veis pela seguran&ccedil;a dos menores, os motorizados pelos n&atilde;o motorizados e, juntos, pela incolumidade dos pedestres&rdquo;. Ou seja, os ve&iacute;culos tamb&eacute;m s&atilde;o respons&aacute;veis pela integridade e seguran&ccedil;a dos pedestres.</p>\n" +
                        "<p>Ciclistas e pedestres merecem aten&ccedil;&atilde;o especial. As bicicletas devem transitar pelas ciclovias ou ciclofaixas. Na inexist&ecirc;ncia dessas, devem trafegar do lado direito da via, junto ao meio-fio, no mesmo sentido de fluxo dos ve&iacute;culos, com prefer&ecirc;ncia sobre eles. J&aacute; os pedestres devem atravessar as vias nas faixas, passarelas ou &aacute;reas a eles destinadas, sempre mantendo prefer&ecirc;ncia sobre os ve&iacute;culos.</p>\n" +
                        "<p>Conhecer as normas e saber lidar com as pessoas no tr&acirc;nsito &eacute; fundamental. Desrespeitar as leis de tr&acirc;nsito, al&eacute;m de ser um fator de risco de acidentes, n&atilde;o condiz com um bom cidad&atilde;o. Respeite, portanto, os outros condutores e os pedestres. Voc&ecirc; tamb&eacute;m ser&aacute; respeitado por eles e viver&aacute; num tr&acirc;nsito mais harm&ocirc;nico em que cada um sabe at&eacute; onde v&atilde;o seus direitos e conhece perfeitamente seus deveres.</p>\n" +
                        "<p>Preservar o meio ambiente &eacute; uma necessidade de toda a sociedade, para a qual todos devem contribuir. Mudar comportamentos em prol de uma vida coletiva com qualidade e respeito exige consci&ecirc;ncia no conv&iacute;vio social e no tr&acirc;nsito. Os elevados volumes de tr&aacute;fego, principalmente nas cidades grandes, geram concentra&ccedil;&atilde;o de poluentes e ru&iacute;dos em n&iacute;veis que, dependendo da intensidade, frequ&ecirc;ncia e volume, prejudicam a sa&uacute;de das pessoas. Na rela&ccedil;&atilde;o &ldquo;tr&acirc;nsito x meio ambiente&rdquo;, a aten&ccedil;&atilde;o de todos os setores da sociedade deve estar voltada para a diminui&ccedil;&atilde;o da emiss&atilde;o de poluentes pelos ve&iacute;culos e para a preserva&ccedil;&atilde;o dos recursos naturais.</p>\n" +
                        "<p>&nbsp;</p>",
                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Convívio social");
        toolbarprincipal.setSubtitle("O indivíduo, o grupo e a sociedade");
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
