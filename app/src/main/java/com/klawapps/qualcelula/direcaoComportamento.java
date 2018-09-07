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


public class direcaoComportamento extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direcao_comportamento);


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
        htmlTextView.setHtml("<h4>Comportamento seguro e comportamento de risco</h4>\n" +
                        "<p>Alguns fatores contribuem para reduzir a concentra&ccedil;&atilde;o do condutor:</p>\n" +
                        "<ul>\n" +
                        "<li>Usar o telefone celular ao dirigir, mesmo que seja em viva voz;</li>\n" +
                        "<li>Assistir a televis&atilde;o a bordo enquanto dirige;</li>\n" +
                        "<li>Ouvir aparelho de som em volume que n&atilde;o permita escutar os sons do seu pr&oacute;prio ve&iacute;culo ou dos outros ve&iacute;culos;</li>\n" +
                        "<li>Transportar animais soltos e desacompanhados no interior do ve&iacute;culo;</li>\n" +
                        "<li>Transportar na cabine objetos que possam se deslocar durante o</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Geralmente n&atilde;o conseguimos manter a aten&ccedil;&atilde;o durante o tempo todo enquanto dirigimos. Constantemente somos levados a pensar em outras coisas, sejam elas importantes ou n&atilde;o. Force a sua concentra&ccedil;&atilde;o no ato de dirigir, acostumando-se a observar sempre e alternadamente enquanto dirige:</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>as informa&ccedil;&otilde;es no painel e os sinais luminosos;</li>\n" +
                        "<li>os espelhos retrovisores;</li>\n" +
                        "<li>a movimenta&ccedil;&atilde;o de outros ve&iacute;culos em todas as dire&ccedil;&otilde;es;</li>\n" +
                        "<li>a movimenta&ccedil;&atilde;o dos pedestres, em especial pr&oacute;ximo aos cruzamentos;</li>\n" +
                        "<li>a posi&ccedil;&atilde;o de suas m&atilde;os no volante</li>\n" +
                        "</ul>\n" +
                        "<p>A seguran&ccedil;a no tr&acirc;nsito pode ser garantida com a utiliza&ccedil;&atilde;o do m&eacute;todo b&aacute;sico de preven&ccedil;&atilde;o de acidentes, que consiste em tr&ecirc;s a&ccedil;&otilde;es:</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>A)&nbsp; Preveja o perigo</h4>\n" +
                        "<p>A previs&atilde;o de poss&iacute;veis situa&ccedil;&otilde;es de risco, que indicam a possibilidade de que os acidentes aconte&ccedil;am, deve ser efetuada com anteced&ecirc;ncia.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>B)&nbsp; Descubra o que fazer</h4>\n" +
                        "<p>A mesma falha que provoca um acidente leve pode causar um acidente fatal. Isso quer dizer que os acidentes, mesmo os pequenos, merecem ser perscrutados, analisando- se o tipo de erro cometido para afastar a possibilidade de repeti&ccedil;&atilde;o. Muitas vezes o acidente ocorre porque o motorista n&atilde;o agiu a tempo nem sabia como se defender ou desconhecia o perigo.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>C)&nbsp; Aja a tempo</h4>\n" +
                        "<p>Al&eacute;m de estar consciente sobre as atitudes que devem ser tomadas, &eacute; preciso saber agir imediatamente, sem esperar para ver o que vai acontecer. Algumas vezes, os acidentes ocorrem porque o motorista aguarda a atitude dos outros e pressup&otilde;e que os demais conhe&ccedil;am e respeitem as regras de tr&acirc;nsito.</p>\n" +
                        "<p>Outro fator que eleva o risco na condu&ccedil;&atilde;o de ve&iacute;culos diz respeito ao estado f&iacute;sico e mental do condutor.</p>\n" +
                        "<p>Se voc&ecirc; estiver pouco concentrado na dire&ccedil;&atilde;o, seu tempo normal de rea&ccedil;&atilde;o vai aumentar, transformando os riscos de dire&ccedil;&atilde;o em perigos no tr&acirc;nsito. Alguns dos fatores que alteram seu estado f&iacute;sico e mental, reduzem a sua concentra&ccedil;&atilde;o e retardam os reflexos s&atilde;o:</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Consumo de bebidas alco&oacute;licas;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Uso de drogas;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Uso de medicamentos que modificam o comportamento;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Participa&ccedil;&atilde;o recente em discuss&otilde;es fortes com familiares, no trabalho ou por qualquer outro motivo;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Ficar muito tempo sem dormir, dormir pouco ou dormir mal;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Ingest&atilde;o de alimentos pesados, que acarretam sonol&ecirc;ncia.</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Alguns fatores humanos ou comportamentais tamb&eacute;m devem ser considerados importantes na ocorr&ecirc;ncia de acidentes, por exemplo:</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Advento de fadiga, resultante do excesso de trabalho ou das m&aacute;s condi&ccedil;&otilde;es ergon&ocirc;micas do ve&iacute;culo;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Aspectos ps&iacute;quicos do condutor, que influenciam sua maneira de ser e de se</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Como voc&ecirc; j&aacute; observou, dirigir defensivamente &eacute; uma quest&atilde;o de atitude. Essa atitude envolve, principalmente, ser capaz de prevenir acidentes, antecipando poss&iacute;veis situa&ccedil;&otilde;es de risco e preparando-se para contorn&aacute;-las. Para voc&ecirc; dirigir seguramente, reduzindo o risco de acidentes, &eacute; conveniente tamb&eacute;m atentar aos cinco elementos da condu&ccedil;&atilde;o defensiva listados a seguir:</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Conhecimento</h4>\n" +
                        "<p>Para de se tornar um bom condutor, voc&ecirc; deve possuir o conhecimento te&oacute;rico que orientar&aacute; sua conduta no tr&acirc;nsito. O ponto de partida para uma condu&ccedil;&atilde;o segura &eacute;: conhecer as leis de tr&acirc;nsito, os procedimentos para ultrapassagens seguras, o direito de prefer&ecirc;ncia nas vias e uma s&eacute;rie de outras informa&ccedil;&otilde;es essenciais a qualquer condutor.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Aten&ccedil;&atilde;o</h4>\n" +
                        "<p>&Eacute; preciso estar sempre alerta para o que se passa a sua volta, para as condi&ccedil;&otilde;es de tr&aacute;fego, para o limite de velocidade na via percorrida etc. Dirigir um ve&iacute;culo significa prestar aten&ccedil;&atilde;o constante no tr&acirc;nsito, pois alguns segundos de distra&ccedil;&atilde;o podem causar acidentes.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Previs&atilde;o</h4>\n" +
                        "<p>Prever &eacute; antecipar situa&ccedil;&otilde;es de perigo, sejam elas mediatas ou imediatas. A previs&atilde;o mediata &eacute; aquela que deve ser feita antes de se iniciar uma viagem. J&aacute; a imediata acontece quando o motorista est&aacute; dirigindo. Prever significa lembrar-se, por exemplo, de verificar as condi&ccedil;&otilde;es do ve&iacute;culo antes de uma viagem. Um motorista descuidado pode enfrentar s&eacute;rios problemas, pois n&atilde;o h&aacute; habilidade na dire&ccedil;&atilde;o que contorne uma falha mec&acirc;nica.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Decis&atilde;o</h4>\n" +
                        "<p>&Eacute; fundamental decidir e agir rapidamente em situa&ccedil;&otilde;es de risco. Nesses momentos, a decis&atilde;o &eacute; auxiliada pelo conhecimento que o condutor possui, pela aten&ccedil;&atilde;o que ele mant&eacute;m e pela previs&atilde;o do perigo. A capacidade de decis&atilde;o depende de outras habilidades do motorista. Para decidir, voc&ecirc; precisa ter elementos: conhecimento, aten&ccedil;&atilde;o e previs&atilde;o.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Habilidade</h4>\n" +
                        "<p>Possuir habilidade &eacute; saber qual a melhor maneira de parar, dar marcha a r&eacute;, fazer convers&otilde;es, enfim, conduzir o ve&iacute;culo. Esse requisito &eacute; fundamental, principalmente em manobras de emerg&ecirc;ncia. A habilidade ao volante &eacute; a capacidade de manusear corretamente os instrumentos de comando e executar com sucesso as manobras de tr&acirc;nsito. Procure conhecer bem o seu ve&iacute;culo e os locais por onde voc&ecirc; transita com mais frequ&ecirc;ncia.</p>\n" +
                        "<p>Determinadas circunst&acirc;ncias espec&iacute;ficas do tr&acirc;nsito constituem-se em situa&ccedil;&otilde;es de risco, pois a probabilidade de ocorrer um acidente &eacute; maior do que em condi&ccedil;&otilde;es normais de condu&ccedil;&atilde;o do ve&iacute;culo. Algumas dessas situa&ccedil;&otilde;es que o condutor precisa conhecer s&atilde;o detalhadas a seguir.</p>",
                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Direção defensiva");
        toolbarprincipal.setSubtitle("Comportamento seguro e comportamento de risco");
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
