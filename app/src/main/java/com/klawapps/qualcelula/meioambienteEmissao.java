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


public class meioambienteEmissao extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meioambiente_emissao);


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
        htmlTextView.setHtml("<p>Em biologia, sobretudo na ecologia, meio ambiente &eacute; o conjunto de todos os fatores que afetam diretamente o metabolismo ou o comportamento dos seres vivos. Esses fatores incluem a luz, o ar, a &aacute;gua, o solo e os pr&oacute;prios seres vivos nas suas rela&ccedil;&otilde;es ecol&oacute;gicas. O ambiente &eacute; o conjunto dos elementos f&iacute;sicos, qu&iacute;micos e biol&oacute;gicos necess&aacute;rios &agrave; sobreviv&ecirc;ncia das esp&eacute;cies. Mesmo sendo parte da natureza, o homem tem agido sobre ela de uma forma irrespons&aacute;vel. Nesta unidade vamos discutir com voc&ecirc; a import&acirc;ncia de estar sempre atento ao ambiente, aprendendo a preserv&aacute;-lo melhor.</p>\n" +
                        "<h4>O ve&iacute;culo como agente poluidor do meio ambiente</h4>\n" +
                        "<p>Entende-se por polui&ccedil;&atilde;o a deteriora&ccedil;&atilde;o das condi&ccedil;&otilde;es ambientais que pode atingir o ar, a &aacute;gua e o solo. Esse &eacute; considerado um tema de preocupa&ccedil;&atilde;o n&atilde;o somente do Brasil, mas tamb&eacute;m de toda a comunidade internacional.</p>\n" +
                        "<p>Por&eacute;m, n&atilde;o s&atilde;o unicamente os pneus usados que poluem o meio ambiente. A emiss&atilde;o de gases e part&iacute;culas, a polui&ccedil;&atilde;o sonora, a polui&ccedil;&atilde;o das &aacute;guas e a destrui&ccedil;&atilde;o da camada de oz&ocirc;nio tamb&eacute;m s&atilde;o consequ&ecirc;ncias mal&eacute;ficas do uso de ve&iacute;culos.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Emiss&atilde;o de gases e part&iacute;culas</h4>\n" +
                        "<p>O motor dos ve&iacute;culos transforma o combust&iacute;vel em gases que s&atilde;o lan&ccedil;ados no ar. Aproximadamente 99% desses gases podem ser considerados inofensivos. No entanto, existe 1% dos gases que s&atilde;o altamente perigosos ao homem e ao meio ambiente. Dada a enorme frota de ve&iacute;culos automotores existentes no pa&iacute;s, essa pequena parcela representa uma enorme quantidade de gases poluentes no ar.</p>\n" +
                        "<p>No <strong>art. 231</strong>, o CTB estabelece que transitar com o ve&iacute;culo produzindo fuma&ccedil;a, gases ou part&iacute;culas em n&iacute;veis superiores aos fixados pelo Contran (Conselho Nacional de Tr&acirc;nsito) constitui-se em infra&ccedil;&atilde;o grave e prev&ecirc; penalidade de multa e medida administrativa de reten&ccedil;&atilde;o do ve&iacute;culo para regulariza&ccedil;&atilde;o.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Emiss&atilde;o sonora</h4>\n" +
                        "<p>&Eacute; preciso estar consciente ainda de que o ve&iacute;culo n&atilde;o polui apenas o ar! Ele tamb&eacute;m provoca polui&ccedil;&atilde;o sonora. Uma pessoa que fique exposta aos ru&iacute;dos excessivos dos ve&iacute;culos est&aacute; sujeita ao estresse precoce, ao desgaste f&iacute;sico e a outros aborrecimentos, como: desequil&iacute;brio emocional, dor de cabe&ccedil;a, zumbido no ouvido, defici&ecirc;ncia auditiva, agita&ccedil;&atilde;o, irrita&ccedil;&atilde;o, dist&uacute;rbios g&aacute;stricos, palpita&ccedil;&atilde;o, ins&ocirc;nia etc.</p>\n" +
                        "<p>Para tentar reduzir a polui&ccedil;&atilde;o sonora, o CTB estabelece como infra&ccedil;&otilde;es o uso prolongado e sucessivo da buzina (infra&ccedil;&atilde;o leve com penalidade de multa); o uso no ve&iacute;culo de equipamentos com som ou volume de frequ&ecirc;ncia que n&atilde;o sejam autorizados pelo Contran (infra&ccedil;&atilde;o grave com penalidades de multa e reten&ccedil;&atilde;o do ve&iacute;culo para regulariza&ccedil;&atilde;o); e o uso indevido de aparelho de alarme que produza sons e ru&iacute;dos que perturbem o sossego p&uacute;blico (infra&ccedil;&atilde;o m&eacute;dia com penalidades de multa e apreens&atilde;o do ve&iacute;culo), entre outras.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Polui&ccedil;&atilde;o das &aacute;guas</h4>\n" +
                        "<p>As emiss&otilde;es poluentes veiculares tamb&eacute;m atingem a &aacute;gua por meio de efluentes dos processos de lavagem de ve&iacute;culos, trocas de &oacute;leo e lubrificantes.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Efeito estufa e a destrui&ccedil;&atilde;o da camada de oz&ocirc;nio</h4>\n" +
                        "<p>A camada de oz&ocirc;nio &eacute; uma camada gasosa que envolve o planeta Terra, protegendo-o dos raios ultravioletas. Esses raios s&atilde;o nocivos &agrave; sa&uacute;de, podendo causar c&acirc;ncer de pele e queimaduras graves quando em contato com a pele humana. A polui&ccedil;&atilde;o e a libera&ccedil;&atilde;o de gases como o CFC (clorofluorcarbono) provocam a destrui&ccedil;&atilde;o dessa camada.</p>\n" +
                        "<p>Cada ve&iacute;culo contribui com uma parcela na polui&ccedil;&atilde;o existente em nosso planeta. A polui&ccedil;&atilde;o causada pelos ve&iacute;culos contribui para o agravamento do efeito estufa. Devido aos gases se acumularem na atmosfera, a irradia&ccedil;&atilde;o de calor da superf&iacute;cie fica retida na atmosfera, e o calor n&atilde;o &eacute; lan&ccedil;ado para o espa&ccedil;o. Essa reten&ccedil;&atilde;o provoca o efeito estufa artificial.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Regulamenta&ccedil;&atilde;o do Conama sobre a polui&ccedil;&atilde;o ambiental causada por ve&iacute;culos</h4>\n" +
                        "<p>O Conama (Conselho Nacional do Meio Ambiente) &eacute; o &oacute;rg&atilde;o que estabelece as normas gerais para prote&ccedil;&atilde;o do meio ambiente. Entre as suas resolu&ccedil;&otilde;es, as que fazem refer&ecirc;ncia &agrave; legisla&ccedil;&atilde;o de tr&acirc;nsito detalham e tratam das normas para fabrica&ccedil;&atilde;o, comercializa&ccedil;&atilde;o e distribui&ccedil;&atilde;o de novos combust&iacute;veis; estabelecem limites para emiss&atilde;o de gases e ru&iacute;dos; preveem normas para manuten&ccedil;&atilde;o e regulagem de ve&iacute;culos e normas para projeto, fabrica&ccedil;&atilde;o e montagem de ve&iacute;culos.</p>\n" +
                        "<p>O Proconve (Programa de Controle da Polui&ccedil;&atilde;o do Ar por Ve&iacute;culos Automotores) foi institu&iacute;do pelo Conama com o intuito de reduzir a polui&ccedil;&atilde;o ambiental. Esse programa envolve a conscientiza&ccedil;&atilde;o a respeito da polui&ccedil;&atilde;o causada pelos ve&iacute;culos, o incentivo ao desenvolvimento da tecnologia no setor automobil&iacute;stico para redu&ccedil;&atilde;o de poluentes emitidos, o aprimoramento da qualidade dos combust&iacute;veis l&iacute;quidos utilizados e a fiscaliza&ccedil;&atilde;o e a cria&ccedil;&atilde;o de programas de inspe&ccedil;&atilde;o e manuten&ccedil;&atilde;o para ve&iacute;culos em uso.</p>\n" +
                        "<p>A resolu&ccedil;&atilde;o do Conama n&ordm; 297/02 n&ordm; 297/02 estabelece os limites m&aacute;ximos de emiss&atilde;o de poluentes para os ciclomotores, motociclos e ve&iacute;culos similares novos. J&aacute; a resolu&ccedil;&atilde;o do Conama n&ordm; 272/00 define os limites m&aacute;ximos de ru&iacute;dos provocados por ve&iacute;culos automotores. Outras resolu&ccedil;&otilde;es desse mesmo &oacute;rg&atilde;o tratam dos v&aacute;rios limites aceit&aacute;veis de polui&ccedil;&atilde;o por emiss&atilde;o de poluentes e de ru&iacute;dos e tamb&eacute;m dos programas de inspe&ccedil;&atilde;o e manuten&ccedil;&atilde;o para ve&iacute;culos automotores em uso.</p>\n" +
                        "<p>Em 1998, com a promulga&ccedil;&atilde;o do CTB (C&oacute;digo de Tr&acirc;nsito Brasileiro), o controle da emiss&atilde;o de gases poluentes passou a ser visto como condi&ccedil;&atilde;o <strong>obrigat&oacute;ria</strong> para o licenciamento dos ve&iacute;culos.</p>",
                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Meio ambiente");
        toolbarprincipal.setSubtitle("Emissão de gases e partículas");
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
