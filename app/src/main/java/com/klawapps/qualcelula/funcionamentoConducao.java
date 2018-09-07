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


public class funcionamentoConducao extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funcionamento_conducao);


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
        htmlTextView.setHtml("<p>Voc&ecirc; sabe o que &eacute; condu&ccedil;&atilde;o econ&ocirc;mica?</p>\n" +
                        "<h4>DEFINI&Ccedil;&Atilde;O</h4>\n" +
                        "<p><em>Conduzir um ve&iacute;culo &ldquo;economicamente&rdquo; significa operar o ve&iacute;culo de forma correta, ou seja, acionando os mecanismos de controle (acelerador, freios, dire&ccedil;&atilde;o, c&acirc;mbio) em perfeita sintonia com as situa&ccedil;&otilde;es que acontecem ao longo da viagem (subidas, descidas, retas e curvas).</em></p>\n" +
                        "<p>Para fazer isso de forma correta, veja as dicas a seguir:</p>\n" +
                        "<ul>\n" +
                        "<li>Guie com previs&atilde;o (n&atilde;o frear nem acelerar desnecessariamente).</li>\n" +
                        "<li>Opere na faixa ideal de rota&ccedil;&atilde;o.</li>\n" +
                        "<li>N&atilde;o acelere durante a troca de</li>\n" +
                        "<li>Utilize corretamente os</li>\n" +
                        "<li>Trafegue somente com o ve&iacute;culo</li>\n" +
                        "<li>Mantenha os pneus</li>\n" +
                        "<li>Acompanhe o desempenho do ve&iacute;culo.</li>\n" +
                        "</ul>\n" +
                        "<h4>Verifica&ccedil;&atilde;o di&aacute;ria dos itens b&aacute;sicos</h4>\n" +
                        "<p>Conforme j&aacute; vimos no <em>check-list </em>de seguran&ccedil;a, &eacute; necess&aacute;rio realizar a verifica&ccedil;&atilde;o di&aacute;ria de alguns itens do ve&iacute;culo. S&atilde;o procedimentos bastante simples, mas de suma import&acirc;ncia para o bom funcionamento de seu ve&iacute;culo.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>N&iacute;vel do &oacute;leo do motor</h4>\n" +
                        "<p>A fun&ccedil;&atilde;o do &oacute;leo no motor n&atilde;o &eacute; apenas reduzir o atrito e o desgaste das pe&ccedil;as m&oacute;veis do motor. A lubrifica&ccedil;&atilde;o &eacute; importante para evitar que os gases quentes escapem por causa da alta press&atilde;o durante o funcionamento do motor, al&eacute;m de ser respons&aacute;vel por dissipar o calor das zonas quentes do motor para o ar por meio do c&aacute;rter. Ela tamb&eacute;m reduz a corros&atilde;o dos metais expostos e absorve alguns dos res&iacute;duos nocivos gerados durante a combust&atilde;o.</p>\n" +
                        "<p>Portanto, essa &eacute; uma verifica&ccedil;&atilde;o que deve ser feita diariamente, ela &eacute; muito f&aacute;cil e simples de ser realizada: abra o cap&ocirc; de seu ve&iacute;culo e procure no interior do motor a vareta que indica o n&iacute;vel do &oacute;leo. Esse n&iacute;vel deve estar sempre entre as marcas &ldquo;M&iacute;n.&rdquo; e &ldquo;M&aacute;x.&rdquo; da vareta de medi&ccedil;&atilde;o. Caso esteja fora desses n&iacute;veis, procure um posto de combust&iacute;vel ou um local especializado para a troca do &oacute;leo. Lembre que o fabricante do autom&oacute;vel especifica no manual do ve&iacute;culo os intervalos de tempo para a troca do &oacute;leo. Leve isso em considera&ccedil;&atilde;o sempre.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>N&iacute;vel do l&iacute;quido de arrefecimento ou resfriamento</h4>\n" +
                        "<p>Da mesma maneira que a troca do n&iacute;vel do &oacute;leo, o n&iacute;vel do l&iacute;quido de resfriamento do motor deve ser controlado constantemente. A maior parte dos motores &eacute; refrigerada com &aacute;gua, que &eacute; um elemento eficiente para resfriar os diversos componentes do motor.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>O n&iacute;vel do l&iacute;quido tamb&eacute;m deve estar entre as marcas &ldquo;M&iacute;n.&rdquo; e &ldquo;M&aacute;x.&rdquo; no radiador do ve&iacute;culo, localizado no interior do cap&ocirc; do ve&iacute;culo. Os postos de combust&iacute;vel comercializam l&iacute;quidos espec&iacute;ficos de resfriamento do motor do ve&iacute;culo. Sempre que o n&iacute;vel da &aacute;gua estiver fora do recomendado, complete-o voc&ecirc; mesmo ou procure um posto de combust&iacute;vel.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Calibragem de pneus</h4>\n" +
                        "<p>A press&atilde;o dos pneus deve seguir as recomenda&ccedil;&otilde;es do manual do propriet&aacute;rio e deve ser medida, com os pneus frios, pelo menos uma vez por semana. Ap&oacute;s conduzir o ve&iacute;culo por algum tempo, os pneus se aquecem e, em consequ&ecirc;ncia do calor, a press&atilde;o de infla&ccedil;&atilde;o se eleva.</p>\n" +
                        "<p>N&atilde;o utilize pneus recauchutados. A utiliza&ccedil;&atilde;o de aros ou componentes quebrados, trincados, desgastados ou enferrujados pode resultar em falha do conjunto e criar uma condi&ccedil;&atilde;o de risco. A utiliza&ccedil;&atilde;o de aros de roda recuperados n&atilde;o &eacute; recomendada em hip&oacute;tese alguma.</p>\n" +
                        "<p>Aros danificados devem ser imediatamente substitu&iacute;dos, pois qualquer tentativa de recupera&ccedil;&atilde;o pode alterar totalmente suas caracter&iacute;sticas originais, afetando de modo consider&aacute;vel a seguran&ccedil;a do ve&iacute;culo e a de seus ocupantes.</p>\n" +
                        "<p>Outras inspe&ccedil;&otilde;es peri&oacute;dicas devem ser realizadas no seu ve&iacute;culo. Todas as verifica&ccedil;&otilde;es est&atilde;o discriminadas no Manual do Propriet&aacute;rio do Ve&iacute;culo. &Eacute; de suma import&acirc;ncia que voc&ecirc; leia o manual e siga as recomenda&ccedil;&otilde;es nele contidas. Seu ve&iacute;culo ter&aacute; maior durabilidade, e voc&ecirc; mais seguran&ccedil;a para conduzir.</p>",
                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Funcionamento do veículo");
        toolbarprincipal.setSubtitle("Condução econômica");
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
