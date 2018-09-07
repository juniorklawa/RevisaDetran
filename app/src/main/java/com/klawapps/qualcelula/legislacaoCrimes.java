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


public class legislacaoCrimes extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legislacao_crimes);

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
        htmlTextView.setHtml("<h4>Penalidades e crimes de tr&acirc;nsito<strong>&nbsp;</strong></h4>\n" +
                        "<p>Para que haja crime, &eacute; preciso que exista previamente uma lei anterior &agrave; conduta il&iacute;cita que determine sua ilegalidade. Assim, ao cometer a determinada conduta previamente especificada, h&aacute; a ocorr&ecirc;ncia do crime.</p>\n" +
                        "<p>Da&iacute; surge a obriga&ccedil;&atilde;o de cada cidad&atilde;o conhecer a diversidade legislativa, a fim de n&atilde;o cometer qualquer conduta que seja considerada um crime. Entretanto, alguns se valem da desculpa de n&atilde;o conhecerem todas as leis, o que n&atilde;o serve de justificativa para o abrandamento do crime, conforme o artigo n&ordm; 3 da lei de Introdu&ccedil;&atilde;o ao C&oacute;digo Civil.</p>\n" +
                        "<p>Isso n&atilde;o &eacute; diferente para os motoristas, os quais t&ecirc;m o dever de conhecer as leis que disciplinam o tr&acirc;nsito. Apesar disso, muitos ainda estacionam em locais proibidos, ultrapassam a velocidade permitida, cruzam sem&aacute;foros vermelhos etc., ou seja, s&atilde;o condutores que cometem infra&ccedil;&otilde;es e precisam ser punidos.</p>\n" +
                        "<p>Agora vamos conhecer quais s&atilde;o as principais infra&ccedil;&otilde;es e suas penalidades para os crimes de tr&acirc;nsito.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h3>Infra&ccedil;&otilde;es de tr&acirc;nsito</h3>\n" +
                        "<p>De acordo com o art. 161 do CTB, constitui infra&ccedil;&atilde;o de tr&acirc;nsito a inobserv&acirc;ncia de qualquer preceito presente no CTB, da legisla&ccedil;&atilde;o complementar ou das resolu&ccedil;&otilde;es do Contran, estando o infrator sujeito &agrave;s penalidades e medidas administrativas indicadas em cada artigo, al&eacute;m das puni&ccedil;&otilde;es previstas no Cap&iacute;tulo XIX do c&oacute;digo.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>No Cap&iacute;tulo XV do C&oacute;digo de Tr&acirc;nsito Brasileiro s&atilde;o apresentadas as infra&ccedil;&otilde;es que os condutores n&atilde;o podem cometer. Consulte os artigos <strong>162</strong> a <strong>255</strong> desse cap&iacute;tulo.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Penalidades</h4>\n" +
                        "<p>O <strong>art. 256</strong> do CTB define as seguintes penalidades para os infratores:</p>\n" +
                        "<p>I - advert&ecirc;ncia por escrito;</p>\n" +
                        "<p>II- multa;</p>\n" +
                        "<p>III - suspens&atilde;o do direito de dirigir;</p>\n" +
                        "<p>IV - apreens&atilde;o do ve&iacute;culo;</p>\n" +
                        "<p>V - cassa&ccedil;&atilde;o da CNH (Carteira Nacional de Habilita&ccedil;&atilde;o);</p>\n" +
                        "<p>VI - cassa&ccedil;&atilde;o da Permiss&atilde;o para Dirigir;</p>\n" +
                        "<p>VII - frequ&ecirc;ncia obrigat&oacute;ria em curso de reciclagem.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>O CTB tamb&eacute;m traz uma classifica&ccedil;&atilde;o das infra&ccedil;&otilde;es cometidas no tr&acirc;nsito pelos condutores e pedestres. As infra&ccedil;&otilde;es punidas com multa se classificam em quatro categorias, de acordo com sua gravidade e pontua&ccedil;&atilde;o na CNH do condutor:</p>\n" +
                        "<p><img src=\"legislacaofaltas\" width=\"300\" height=\"300\" /></p>" +
                        "<p>&nbsp;</p>\n" +
                        "<p><strong><em>IMPORTANTE: </em></strong><em>ao atingir a contagem de 20 pontos no per&iacute;odo de 12 meses em seu prontu&aacute;rio, conforme os artigos 259 e 261 do CTB, o condutor infrator ter&aacute; a suspens&atilde;o do direito de dirigir. &Eacute; importante ressaltar que, em algumas situa&ccedil;&otilde;es, mesmo com infra&ccedil;&otilde;es que o condutor cometa apenas uma &uacute;nica vez, ele poder&aacute; ter suspenso seu direito de dirigir, que ser&aacute; aplicado por decis&atilde;o fundamentada da autoridade de tr&acirc;nsito competente, n&atilde;o importando a contabilidade dos pontos. Dependendo das circunst&acirc;ncias da infra&ccedil;&atilde;o, nesses casos, o condutor poder&aacute; ser suspenso por um tempo determinado e at&eacute; regularizar sua situa&ccedil;&atilde;o.</em></p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p><em>Os valores para as multas foram estabelecidos pela resolu&ccedil;&atilde;o no 136/02 do Contran e s&atilde;o os seguintes:</em></p>\n" +
                        "<p><img src=\"legislacaomultas\" width=\"300\" height=\"300\" /></p>" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Quando se tratar de infra&ccedil;&atilde;o agravada, ou seja, que ofere&ccedil;a maiores riscos &agrave; seguran&ccedil;a, o valor da multa sofre eleva&ccedil;&atilde;o a partir de um fator multiplicador (elas poder&atilde;o ser multiplicadas por 3 ou 5), estabelecido no art. 162 do CTB. Exemplo: para um cidad&atilde;o que dirige um ve&iacute;culo sem possuir CNH ou sem Permiss&atilde;o para Dirigir, o CTB prev&ecirc; uma penalidade agravada de multa (nesse caso ela &eacute; de tr&ecirc;s vezes o valor previsto) e apreens&atilde;o do ve&iacute;culo.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h2>Crimes de Tr&acirc;nsito</h2>\n" +
                        "<p>Os crimes de tr&acirc;nsito se aplicam &agrave;s situa&ccedil;&otilde;es que ocasionem les&atilde;o corporal culposa, de embriaguez ao volante ou utiliza&ccedil;&atilde;o de qualquer outra subst&acirc;ncia psicoativa que determine depend&ecirc;ncia e de participa&ccedil;&atilde;o em competi&ccedil;&otilde;es n&atilde;o autorizadas, ou seja, rachas. A suspens&atilde;o ou a proibi&ccedil;&atilde;o de se obter a permiss&atilde;o ou a habilita&ccedil;&atilde;o para dirigir ve&iacute;culo automotor pode ser imposta como penalidade principal, isolada ou cumulativamente com outras penalidades.</p>\n" +
                        "<h5>ATEN&Ccedil;&Atilde;O!</h5>\n" +
                        "<p><em>Aos crimes cometidos na dire&ccedil;&atilde;o de ve&iacute;culos automotores, previstos no C&oacute;digo de Tr&acirc;nsito, aplicam-se as normas gerais do C&oacute;digo Penal, se o Cap&iacute;tulo XIX do CTB n&atilde;o dispuser de modo diverso, bem como a lei n&ordm; 9.099, de 26 de setembro de 1995, no que couber.</em></p>\n" +
                        "<p>Algumas circunst&acirc;ncias sempre agravam as penalidades relativas aos crimes de tr&acirc;nsito. S&atilde;o exemplos de poss&iacute;vel agravamento, quando o condutor do ve&iacute;culo tiver cometido uma infra&ccedil;&atilde;o:</p>\n" +
                        "<ul>\n" +
                        "<li>Com dano potencial para duas ou mais pessoas ou com grande risco de grave dano patrimonial a terceiros;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Utilizando o ve&iacute;culo sem placas, com placas falsas ou adulteradas;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Sem possuir Permiss&atilde;o para Dirigir ou Carteira de Habilita&ccedil;&atilde;o;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Com Permiss&atilde;o para Dirigir ou Carteira de Habilita&ccedil;&atilde;o de categoria diferente da do ve&iacute;culo;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Quando a sua profiss&atilde;o ou atividade exigir cuidados especiais com o transporte de passageiros ou de carga;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Utilizando ve&iacute;culo em que tenham sido adulterados equipamentos ou caracter&iacute;sticas que afetem a sua seguran&ccedil;a ou o seu funcionamento de acordo com os limites de velocidade prescritos nas especifica&ccedil;&otilde;es do fabricante;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Trafegando sobre faixa de tr&acirc;nsito tempor&aacute;ria ou permanentemente destinada a pedestres</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>",
                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Legislação de Trânsito");
        toolbarprincipal.setSubtitle("Crimes e penalidades");
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
