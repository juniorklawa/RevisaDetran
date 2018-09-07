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


public class direcaoConducaoEmSituacoesDeRisco extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direcao_conducao_em_situacoes_de_risco);


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
        htmlTextView.setHtml("<h4>Condu&ccedil;&atilde;o em situa&ccedil;&otilde;es de risco Ultrapassagem</h4>\n" +
                        "<p>Antes de tudo, quando houver sinaliza&ccedil;&atilde;o proibindo a ultrapassagem, n&atilde;o ultrapasse. A sinaliza&ccedil;&atilde;o &eacute; a representa&ccedil;&atilde;o da lei. Ela foi pensada e implantada por uma equipe t&eacute;cnica que j&aacute; calculou que naquele trecho n&atilde;o &eacute; poss&iacute;vel realizar a ultrapassagem de forma segura.</p>\n" +
                        "<p>De acordo com o art. 29 do CTB:</p>\n" +
                        "<p>IX - a ultrapassagem de outro ve&iacute;culo em movimento dever&aacute; ser feita pela esquerda, obedecida a sinaliza&ccedil;&atilde;o regulamentar e as demais normas estabelecidas nesse c&oacute;digo, exceto quando o ve&iacute;culo a ser ultrapassado estiver sinalizando o prop&oacute;sito de entrar &agrave; esquerda;</p>\n" +
                        "<p>X - todo condutor dever&aacute;, antes de efetuar uma ultrapassagem, certificar-se de que:</p>\n" +
                        "<p>a) nenhum condutor que venha atr&aacute;s tenha come&ccedil;ado uma manobra para ultrapass&aacute;-lo;</p>\n" +
                        "<p>b) quem o precede na mesma faixa de tr&acirc;nsito n&atilde;o haja indicado o prop&oacute;sito de ultrapassar um terceiro;</p>\n" +
                        "<p>c) a faixa de tr&acirc;nsito que vai tomar esteja livre numa extens&atilde;o suficiente para que sua manobra n&atilde;o ponha em perigo ou obstrua o tr&acirc;nsito que venha em sentido contr&aacute;rio;</p>\n" +
                        "<p>XI - todo condutor ao efetuar a ultrapassagem dever&aacute;:</p>\n" +
                        "<p>a) indicar com anteced&ecirc;ncia a manobra pretendida, acionando a luz indicadora de dire&ccedil;&atilde;o do ve&iacute;culo ou por meio de gesto convencional de bra&ccedil;o;</p>\n" +
                        "<p>b) afastar-se do usu&aacute;rio ou usu&aacute;rios aos quais ultrapassa, de tal forma que deixe livre uma dist&acirc;ncia lateral de seguran&ccedil;a;</p>\n" +
                        "<p>c) retomar, ap&oacute;s a efetiva&ccedil;&atilde;o da manobra, a faixa de tr&acirc;nsito de origem, acionando a luz indicadora de dire&ccedil;&atilde;o do ve&iacute;culo ou fazendo gesto convencional de bra&ccedil;o, adotando os cuidados necess&aacute;rios para n&atilde;o p&ocirc;r em perigo ou obstruir o tr&acirc;nsito dos ve&iacute;culos que ultrapassou</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h5>ATEN&Ccedil;&Atilde;O</h5>\n" +
                        "<p><em>Nos aclives s&oacute; ultrapasse quando estiver dispon&iacute;vel a terceira faixa, destinada aos ve&iacute;culos lentos. Se n&atilde;o existir essa faixa, siga as orienta&ccedil;&otilde;es anteriores, mas considere que a pot&ecirc;ncia exigida do seu ve&iacute;culo vai ser maior que na pista plana. Nas subidas &eacute; mais dif&iacute;cil ultrapassar do que em locais planos.</em></p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Vale ressaltar que o acostamento, muitas vezes utilizado para ultrapassagens, n&atilde;o foi planejado para esse objetivo. Ao contr&aacute;rio do que muitos pensam, &eacute; uma manobra muito arriscada a ultrapassagem pelo acostamento. Assim, a legisla&ccedil;&atilde;o &eacute; clara ao estipular: ultrapasse somente pela esquerda.</p>\n" +
                        "<p>Nos declives, a velocidade dos ve&iacute;culos tende a ser maior. Para ultrapassar, tome cuidado adicional com a velocidade necess&aacute;ria para a ultrapassagem. Lembre-se de que mesmo para ultrapassar voc&ecirc; n&atilde;o pode exceder a velocidade m&aacute;xima permitida naquele trecho da via.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Problemas com a conserva&ccedil;&atilde;o do pavimento</h4>\n" +
                        "<p>A conserva&ccedil;&atilde;o do pavimento deve ser um trabalho constante, com o objetivo de mant&ecirc;-lo em perfeitas condi&ccedil;&otilde;es de circula&ccedil;&atilde;o, t&atilde;o pr&oacute;ximo quanto poss&iacute;vel da sua condi&ccedil;&atilde;o imediata &agrave; constru&ccedil;&atilde;o. No entanto, muitas vezes, as vias apresentam problemas em rela&ccedil;&atilde;o &agrave; conserva&ccedil;&atilde;o, e o condutor se v&ecirc; obrigado a dirigir em vias com buracos, rachaduras, asfalto irregular, &oacute;leo na pista etc.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h5>DICA</h5>\n" +
                        "<p><em>Aqui v&atilde;o algumas dicas para voc&ecirc; dirigir com seguran&ccedil;a nessas situa&ccedil;&otilde;es:</em></p>\n" +
                        "<ul>\n" +
                        "<li><em>Fique </em><em>atento &agrave; presen&ccedil;a de &oacute;leo ou &aacute;gua na pista. Se notar tal presen&ccedil;a, reduza a velocidade;</em></li>\n" +
                        "<li><em>Se a via apresentar buracos e rachaduras, reduza a velocidade. Se precisar desviar de algum obst&aacute;culo, sinalize adequadamente com o uso da seta;</em></li>\n" +
                        "<li><em>Ao conduzir sob chuva, fique atento &agrave;s po&ccedil;as-d&rsquo;&aacute;gua, pois elas podem esconder verdadeiras armadilhas para seu ve&iacute;culo (buracos).</em></li>\n" +
                        "</ul>\n" +
                        "<p><em>&nbsp;</em></p>\n" +
                        "<p>Nessas situa&ccedil;&otilde;es, voc&ecirc; pode derrapar e perder o controle do ve&iacute;culo, ocasionando um acidente. Sempre que estiver confrontado com essas situa&ccedil;&otilde;es, o melhor &eacute; reduzir a velocidade e dirigir com aten&ccedil;&atilde;o redobrada.</p>\n" +
                        "<p>Para evitar a derrapagem, voc&ecirc; deve ter cuidado especial com os pneus de seu ve&iacute;culo. Veja a seguir alguns cuidados que necessitam ser observados para preven&ccedil;&atilde;o da derrapagem e de outros problemas com seu ve&iacute;culo:</p>\n" +
                        "<ul>\n" +
                        "<li>Calibre os pneus de acordo com a indica&ccedil;&atilde;o do manual do fabricante;</li>\n" +
                        "<li>Fa&ccedil;a o rod&iacute;zio dos pneus;</li>\n" +
                        "<li>Evite a sobrecarga no ve&iacute;culo. Excesso de peso compromete a estrutura do pneu e aumenta o risco de danos e de altera&ccedil;&otilde;es estruturais importantes;</li>\n" +
                        "<li>Fa&ccedil;a a manuten&ccedil;&atilde;o preventiva de todo o ve&iacute;culo. Amortecedores, molas, freios, rolamentos, eixos e rodas atuam diretamente sobre os pneus;</li>\n" +
                        "<li>Utilize rodas e pneus de acordo com as medidas indicadas pelo fabricante do ve&iacute;culo. Altera&ccedil;&otilde;es nas medidas causam instabilidade ao ve&iacute;culo;</li>\n" +
                        "<li>Alinhe o sistema de dire&ccedil;&atilde;o e suspens&atilde;o e balanceie os pneus conforme indica&ccedil;&otilde;es do fabricante do ve&iacute;culo;</li>\n" +
                        "<li>Utilize os pneus mais indicados para cada tipo de solo;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Observe periodicamente o desgaste da rodagem (TWI). Esse indicador existe em todos os pneus e indica o momento adequado de efetuar sua troca;</p>\n" +
                        "<ul>\n" +
                        "<li>N&atilde;o permita o contato do pneu com derivados de petr&oacute;leo e/ou Esses produtos atacam a borracha, reduzindo sua vida &uacute;til.</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Cruzamentos e curvas</h4>\n" +
                        "<p>Os cruzamentos e as curvas constituem-se em pontos cr&iacute;ticos para a condu&ccedil;&atilde;o do seu ve&iacute;culo, pois aumentam os riscos de acidentes. O que fazer, nessas situa&ccedil;&otilde;es, na condu&ccedil;&atilde;o do ve&iacute;culo?</p>\n" +
                        "<p>Nas curvas observe essas dicas:</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Reduza a velocidade do ve&iacute;culo antes de entrar na curva, utilizando o sistema de freios e, se necess&aacute;rio, reduza a</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Fa&ccedil;a a curva com movimentos suaves na dire&ccedil;&atilde;o. Retome gradativamente a velocidade original, ap&oacute;s a conclus&atilde;o do trajeto curvil&iacute;neo. N&atilde;o se esque&ccedil;a: obede&ccedil;a sempre aos limites de velocidade</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Nos cruzamentos, a circula&ccedil;&atilde;o de ve&iacute;culos e pessoas altera-se a todo instante. Quanto mais movimentado for o cruzamento, mais conflito haver&aacute; entre ve&iacute;culos, pedestres e ciclistas, aumentando os riscos de colis&otilde;es e atropelamentos.</p>\n" +
                        "<p>De forma geral, siga estas regras:</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Diminua a velocidade ao aproximar-se de cruzamentos;</li>\n" +
                        "<li>Redobre a aten&ccedil;&atilde;o em rela&ccedil;&atilde;o a ve&iacute;culos e pedestres; e</li>\n" +
                        "<li>Esteja sempre preparado para parar ou desviar sua trajet&oacute;ria.</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h5>DICA</span></h5>\n" +
                        "<p><em>&Eacute; muito comum, tamb&eacute;m, a presen&ccedil;a de equipamentos como &ldquo;orelh&otilde;es&rdquo;, postes, lixeiras, ca&ccedil;ambas, bancas de jornal e at&eacute; mesmo cavaletes com propagandas por perto das esquinas, reduzindo ainda mais a percep&ccedil;&atilde;o dos movimentos de pessoas e ve&iacute;culos.</em></p>\n" +
                        "<p><em>&nbsp;</em></p>\n" +
                        "<p><em>&nbsp;</em></p>\n" +
                        "<p>Nos cruzamentos com sem&aacute;foros, observe e aguarde o sinal verde direcionado para voc&ecirc; antes de movimentar seu ve&iacute;culo, mesmo que outros ve&iacute;culos ao seu lado o fa&ccedil;am.</p>\n" +
                        "<p>Lembre-se de que &eacute; fundamental respeitar a faixa de pedestres existente em grande parte dos cruzamentos urbanos.</p>",
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
