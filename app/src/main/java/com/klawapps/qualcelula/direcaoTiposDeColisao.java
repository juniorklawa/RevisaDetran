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


public class direcaoTiposDeColisao extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direcao_tipos_de_colisao);


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
        htmlTextView.setHtml("<h4>Tipos de Colis&otilde;es</h4>\n" +
                        "<p><strong>&nbsp;</strong></p>\n" +
                        "<p>Al&eacute;mda observa&ccedil;&atilde;o das dist&acirc;ncias de seguran&ccedil;a no tr&acirc;nsito, que no seu descumprimento s&atilde;o os tipos de colis&otilde;es que ocorrem com maior frequ&ecirc;ncia, v&aacute;rios outros acidentes podem ser evitados se o condutor conhecer as situa&ccedil;&otilde;es que os geram.</p>\n" +
                        "<p>Assim, uma colis&atilde;o pode ser entendida como um acidente envolvendo dois ve&iacute;culos em movimento. Acontece em v&aacute;rias situa&ccedil;&otilde;es: com o ve&iacute;culo da frente, com o de tr&aacute;s, em cruzamentos, entre outros.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Colis&otilde;es com o ve&iacute;culo da frente</h4>\n" +
                        "<p>Usualmente, a colis&atilde;o com outro ve&iacute;culo que est&aacute; &agrave; frente acontece por desaten&ccedil;&atilde;o do condutor ou porque ele n&atilde;o obedeceu &agrave; dist&acirc;ncia de seguimento, podendo ocorrer tamb&eacute;m ambos os motivos simultaneamente. Para evitar esse tipo de colis&atilde;o, o condutor deve manter o m&aacute;ximo de aten&ccedil;&atilde;o enquanto est&aacute; dirigindo. Observe o comportamento do ve&iacute;culo que vai &agrave; sua frente e preserve uma dist&acirc;ncia segura.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Colis&otilde;es com o ve&iacute;culo de tr&aacute;s</h4>\n" +
                        "<p>Muitas vezes n&atilde;o estamos vendo o ve&iacute;culo que se aproxima por tr&aacute;s e somos pegos de surpresa. A colis&atilde;o com o ve&iacute;culo de tr&aacute;s pode ser evitada avisando corretamente, por meio dos dispositivos de sinaliza&ccedil;&atilde;o dispon&iacute;veis no carro, aquilo que pretendemos fazer, diminuindo a marcha gradualmente e posicionando-nos corretamente na pista, ao fazermos convers&otilde;es e ultrapassagens. Para que os acidentes n&atilde;o ocorram, &eacute; necess&aacute;rio que voc&ecirc; dirija seguindo corretamente as normas, sem parecer indeciso. Isso facilita os movimentos dos ve&iacute;culos que est&atilde;o atr&aacute;s de voc&ecirc;. Caso algum ve&iacute;culo queira ultrapass&aacute;-lo, facilite sua manobra e permita a ultrapassagem.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Colis&otilde;es frontais</h4>\n" +
                        "<p>A colis&atilde;o frontal entre dois ve&iacute;culos &eacute;, por sua vez, uma das mais graves, pois muitas vezes leva &agrave; morte. Essa colis&atilde;o pode ser fatal, pois no momento em que se d&aacute; a colis&atilde;o, ela &eacute; representada pela soma da velocidade dos dois ve&iacute;culos que colidiram. Assim, supondo que dois ve&iacute;culos se choquem frontalmente a uma velocidade de 60 km/h, o impacto da colis&atilde;o ocorrer&aacute; num total de 120 km/h.</p>\n" +
                        "<p>Pode-se assemelhar o exemplo citado a uma colis&atilde;o de um carro a 120 km/h com um muro de concreto. Neste caso, um motorista com peso m&eacute;dio de 70 kg ser&aacute; projetado &agrave; frente com um impacto equivalente a 8 toneladas.</p>\n" +
                        "<p>Essas colis&otilde;es s&atilde;o frequentes nos casos de ultrapassagem, quando o ve&iacute;culo que a realiza est&aacute; na pista de dire&ccedil;&atilde;o contr&aacute;ria. Para evitar esses acidentes, s&oacute; ultrapasse outro ve&iacute;culo quando a sinaliza&ccedil;&atilde;o permitir, se houver visibilidade suficiente e se a faixa de sentido contr&aacute;rio estiver livre.</p>\n" +
                        "<p>Fique atento nas curvas, onde existe menor visibilidade, e aos pedestres, ciclistas e animais que poder&atilde;o entrar repentinamente na pista.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Colis&otilde;es nos cruzamentos entre vias</h4>\n" +
                        "<p>Nos cruzamentos, o movimento de ve&iacute;culos e de pessoas altera-se a todo instante. Quanto mais movimentado o cruzamento, mais conflito haver&aacute; entre ve&iacute;culos, pedestres e ciclistas, aumentando os riscos de colis&otilde;es e atropelamentos. Al&eacute;m de pessoas e ve&iacute;culos, &eacute; muito comum a presen&ccedil;a de equipamentos como &ldquo;orelh&otilde;es&rdquo;, postes, lixeiras, bancas de jornal e at&eacute; mesmo cavaletes com propagandas perto das esquinas, reduzindo ainda mais a visibilidade e a percep&ccedil;&atilde;o dos condutores.</p>\n" +
                        "<h5>DICAS</h5>\n" +
                        "<p><em>Ao</em> <em>se aproximar de um cruzamento voc&ecirc; deve redobrar a aten&ccedil;&atilde;o e reduzir a velocidade. Nos sem&aacute;foros, observe apenas o foco de luz que controla o tr&aacute;fego da via em que voc&ecirc; est&aacute;. Aguarde o sinal verde direcionado para voc&ecirc; antes de movimentar o ve&iacute;culo, mesmo que outros, ao seu lado, se movimentem-se.</em></p>\n" +
                        "<p><em>&nbsp;</em></p>\n" +
                        "<h5>Troque a sua prefer&ecirc;ncia pela sua seguran&ccedil;a!</h5>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p><strong>Colis&otilde;es nos estreitamentos de pista</strong></p>\n" +
                        "<p>Qualquer estreitamento de pista aumenta os riscos de ocorrerem acidentes. Pontes estreitas ou sem acostamento, obras, desmoronamento de barreiras e presen&ccedil;a de objetos ou obstru&ccedil;&otilde;es na pista s&atilde;o exemplos de estreitamentos. Assim que voc&ecirc; enxergar a sinaliza&ccedil;&atilde;o de um estreitamento ou perceber um estreitamento adiante, redobre sua aten&ccedil;&atilde;o, reduza a velocidade e a marcha.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h5>DICAS</h5>\n" +
                        "<p><em>Quando o estreitamento permitir a passagem de apenas um ve&iacute;culo por vez, aguarde o momento adequado, alternando a passagem com os outros ve&iacute;culos que est&atilde;o no sentido oposto.</em></p>\n" +
                        "<p><em>&nbsp;</em></p>\n" +
                        "<p><em>&nbsp;</em></p>\n" +
                        "<p>H&aacute; outros acidentes que podem ocorrer com pedestres e outros integrantes do tr&acirc;nsito. Para evitar esses acidentes, os condutores devem estar especialmente atentos para os casos de colis&otilde;es na marcha a r&eacute;, atropelamentos, choques com objetos fixos, bicicletas, motocicletas, atropelamentos de animais etc. Fique atento para tudo o que ocorre na via e ao seu redor.</p>\n" +
                        "<p>Veja algumas atitudes que ajudam na preven&ccedil;&atilde;o de acidentes e valem para todos os condutores:</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ol>\n" +
                        "<li>Para reduzir a velocidade &eacute; necess&aacute;rio Sinalize adequadamente e a tempo. Indique sempre essa manobra.</li>\n" +
                        "</ol>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ol start=\"2\">\n" +
                        "<li>Diante de um cruzamento, modere a velocidade e demonstre prud&ecirc;ncia. Tenha sempre total controle sobre o ve&iacute;culo.</li>\n" +
                        "</ol>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ol start=\"3\">\n" +
                        "<li>Jamais desafie outro Se voc&ecirc; notar que algu&eacute;m deseja ultrapassar, reduza a velocidade e permita a ultrapassagem.</li>\n" +
                        "</ol>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ol start=\"4\">\n" +
                        "<li>Evite freadas Elas podem causar acidentes ou machucar as pessoas no interior do ve&iacute;culo.</li>\n" +
                        "</ol>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Evite buzinar, principalmente sevoc&ecirc; estiver pr&oacute;ximo a hospitais ou escolas. A buzina deve ser utilizada apenas para alertar condutores ou pedestres em caso de risco.</p>",
                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Direção defensiva");
        toolbarprincipal.setSubtitle("Tipos de colisões");
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
