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


public class funcionamentoEquipamentos extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funcionamento_equipamentos);


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
        htmlTextView.setHtml("<p>Para dirigir com seguran&ccedil;a, o condutor deve respeitar as leis e cuidar do seu ve&iacute;culo de forma adequada. Essas medidas s&atilde;o indispens&aacute;veis para a seguran&ccedil;a no tr&acirc;nsito. Algumas no&ccedil;&otilde;es de funcionamento dos ve&iacute;culos ser&atilde;o listadas para que o condutor possa se familiarizar com a dire&ccedil;&atilde;o segura.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h2>Equipamentos de uso obrigat&oacute;rio do ve&iacute;culo</h2>\n" +
                        "<p>Para ve&iacute;culos automotores e &ocirc;nibus el&eacute;tricos de quatro ou mais rodas, os equipamentos obrigat&oacute;rios s&atilde;o os seguintes (resolu&ccedil;&atilde;o no 14/98 do Contran):</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ol>\n" +
                        "<li>para-choques, dianteiro e traseiro;</li>\n" +
                        "<li>protetores das rodas traseiras dos caminh&otilde;es;</li>\n" +
                        "<li>espelhos retrovisores, interno e externo;</li>\n" +
                        "<li>limpador de para-brisa;</li>\n" +
                        "<li>lavador de para-brisa;</li>\n" +
                        "<li>pala interna de prote&ccedil;&atilde;o contra o sol (para-sol) para o condutor;</li>\n" +
                        "<li>far&oacute;is principais dianteiros de cor branca ou amarela;</li>\n" +
                        "<li>luzes de posi&ccedil;&atilde;o dianteiras (faroletes) de cor branca ou amarela;</li>\n" +
                        "<li>lanternas de posi&ccedil;&atilde;o traseiras de cor vermelha;</li>\n" +
                        "<li>lanternas de freio de cor vermelha;</li>\n" +
                        "<li>lanternas indicadoras de dire&ccedil;&atilde;o: dianteiras de cor &acirc;mbar e traseiras de cor &acirc;mbar ou vermelha;</li>\n" +
                        "<li>lanterna de marcha a r&eacute; de cor branca;</li>\n" +
                        "<li>retrorrefletores (catadi&oacute;ptrico) traseiros de cor vermelha;</li>\n" +
                        "<li>lanterna de ilumina&ccedil;&atilde;o da placa traseira de cor branca;</li>\n" +
                        "<li>veloc&iacute;metro,</li>\n" +
                        "<li>buzina;</li>\n" +
                        "<li>freios de estacionamento e de servi&ccedil;o com comandos independentes;</li>\n" +
                        "<li>pneus que ofere&ccedil;am condi&ccedil;&otilde;es m&iacute;nimas de seguran&ccedil;a;</li>\n" +
                        "<li>dispositivo de sinaliza&ccedil;&atilde;o luminosaourefletoradeemerg&ecirc;ncia, independente do sistema de ilumina&ccedil;&atilde;o do ve&iacute;culo;</li>\n" +
                        "<li>extintor de inc&ecirc;ndio (menos para motocicletas);</li>\n" +
                        "<li>registrador instant&acirc;neo e inalter&aacute;vel de velocidade e tempo, nos ve&iacute;culos de transporte e condu&ccedil;&atilde;o de escolares, nos de transporte de passageiros com mais de dez lugares e nos de carga com capacidade m&aacute;xima de tra&ccedil;&atilde;o superior a 19t;</li>\n" +
                        "</ol>\n" +
                        "<ol start=\"22\">\n" +
                        "<li>cinto de seguran&ccedil;a para todos os ocupantes do ve&iacute;culo;</li>\n" +
                        "<li>dispositivo destinado ao controle de ru&iacute;do do motor, naqueles dotados de motor a combust&atilde;o;</li>\n" +
                        "<li>roda sobressalente, compreendendo o aro e o pneu, com ou sem c&acirc;mara de ar, conforme o caso;</li>\n" +
                        "<li>macaco, compat&iacute;vel com o peso e a carga do ve&iacute;culo;</li>\n" +
                        "<li>chave de roda;</li>\n" +
                        "<li>chave de fenda ou outra ferramenta apropriada para a remo&ccedil;&atilde;o de calotas;</li>\n" +
                        "<li>lanternas delimitadoras e lanternas laterais nos ve&iacute;culos de carga, quando suas dimens&otilde;es assim o exigirem;</li>\n" +
                        "<li>cinto de seguran&ccedil;a para a &aacute;rvore de transmiss&atilde;o em ve&iacute;culos de transporte coletivo e de carga;</li>\n" +
                        "<li>encosto de cabe&ccedil;a em todos os assentos dos autom&oacute;veis, menos nos assentos centrais;</li>\n" +
                        "<li>dispositivo de seguran&ccedil;a para prover melhores condi&ccedil;&otilde;es de visibilidade diurna e noturna em ve&iacute;culos de transporte de carga</li>\n" +
                        "</ol>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Para osve&iacute;culos ciclomotores, os equipamentos obrigat&oacute;rios s&atilde;o tamb&eacute;m relacionados na resolu&ccedil;&atilde;o no 14/98 do Contran e est&atilde;o descritos a seguir:</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>espelhos retrovisores de ambos os lados;</li>\n" +
                        "<li>farol dianteiro de cor branca ou amarela;</li>\n" +
                        "<li>lanterna, de cor vermelha, na parte traseira;</li>\n" +
                        "<li>veloc&iacute;metro;</li>\n" +
                        "<li>buzina;</li>\n" +
                        "<li>pneus que ofere&ccedil;am condi&ccedil;&otilde;es m&iacute;nimas de seguran&ccedil;a;</li>\n" +
                        "<li>dispositivo destinado ao controle de ru&iacute;do do motor</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Para as motonetas, as motocicletas e os triciclos, os equipamentos s&atilde;o:</p>\n" +
                        "<ul>\n" +
                        "<li>espelhos retrovisores de ambos os lados;</li>\n" +
                        "<li>farol dianteiro de cor branca ou amarela;</li>\n" +
                        "<li>lanterna, de cor vermelha, na parte traseira;</li>\n" +
                        "<li>lanterna de freio de cor vermelha</li>\n" +
                        "<li>ilumina&ccedil;&atilde;o da placa traseira;</li>\n" +
                        "<li>indicadores luminosos de mudan&ccedil;a de dire&ccedil;&atilde;o, dianteiro e traseiro;</li>\n" +
                        "<li>veloc&iacute;metro;</li>\n" +
                        "<li>buzina;</li>\n" +
                        "<li>pneus que ofere&ccedil;am condi&ccedil;&otilde;es m&iacute;nimas de seguran&ccedil;a;</li>\n" +
                        "<li>dispositivo destinado ao controle de ru&iacute;do do motor</li>\n" +
                        "</ul>\n" +
                        "<p>Al&eacute;m dos equipamentos obrigat&oacute;rios dos ve&iacute;culos para conduzir motocicletas, motonetas e ciclomotores, os condutores dever&atilde;o ainda observar o que diz o artigo n&ordm; 54 do CTB:</p>\n" +
                        "<p><strong>art. 54. </strong>Os condutores de motocicletas, motonetas e ciclomotores somente poder&atilde;o circular nas vias:</p>\n" +
                        "<p>I - utilizando capacete de seguran&ccedil;a, com viseira ou &oacute;culos protetores; II - segurando o guid&atilde;o com as duas m&atilde;os;</p>\n" +
                        "<p>III - usando vestu&aacute;rio de prote&ccedil;&atilde;o, de acordo com as especifica&ccedil;&otilde;es do Contran.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h2>No&ccedil;&otilde;es de manuseio e do uso do extintor de inc&ecirc;ndio</h2>\n" +
                        "<p>O &uacute;nico equipamento de seguran&ccedil;a adequado para combater um princ&iacute;pio de inc&ecirc;ndio veicular &eacute; o extintor de inc&ecirc;ndio ou extintor automotivo.</p>\n" +
                        "<p>Verifique sempre a validade, que &eacute; o prazo m&aacute;ximo, recomendado pelo fabricante, durante o qual o extintor pode ser utilizado. Al&eacute;m disso, fique atento aos seguintes itens: Lembramos a voc&ecirc; que o uso do extintor de inc&ecirc;ndio automotivo pode salvar sua vida e a de outras pessoas, se utilizado de maneira correta e desde que o equipamento esteja dentro do prazo de validade. Conferir o equipamento &eacute; a maneira mais f&aacute;cil de evitar problemas.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p><strong><em>IMPORTANTE: </em></strong><em>as instru&ccedil;&otilde;es de opera&ccedil;&atilde;o </em><em>de cada extintor est&atilde;o escritas no pr&oacute;prio equipamento. </em><em>Fique atento para para oper&aacute;-lo corretamente.</em></p>\n" +
                        "<p><em>&nbsp;</em></p>\n" +
                        "<h2>A manuten&ccedil;&atilde;o do ve&iacute;culo</h2>\n" +
                        "<p>O condutor &eacute; respons&aacute;vel pela manuten&ccedil;&atilde;o do ve&iacute;culo. H&aacute; tamb&eacute;m penalidades na legisla&ccedil;&atilde;o</p>\n" +
                        "<p>brasileira para os condutores que n&atilde;o realizam a manuten&ccedil;&atilde;o em seus ve&iacute;culos. Al&eacute;m das manuten&ccedil;&otilde;es recomendadas pelo fabricante do ve&iacute;culo, constantes do manual de manuten&ccedil;&atilde;o, o condutor dever&aacute; tomar alguns cuidados adicionais para que o ve&iacute;culo esteja sempre em condi&ccedil;&otilde;es de uso.</p>\n" +
                        "<p>O ideal &eacute; que o condutor realize verifica&ccedil;&otilde;es peri&oacute;dicas simples no seu ve&iacute;culo e preste aten&ccedil;&atilde;o a qualquer anormalidade verificada durante a condu&ccedil;&atilde;o. Caso o problema n&atilde;o possa ser resolvido por voc&ecirc; mesmo, procure um profissional para solucion&aacute;-lo.</p>\n" +
                        "<p>N&atilde;o circule em seu ve&iacute;culo com qualquer problema mec&acirc;nico ou el&eacute;trico, por menor que seja, pois isso pode ocasionar um acidente.</p>\n" +
                        "<p>Itens que podem ser verificados periodicamente e, sobretudo, antes de viajar:</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p><strong><em>Check-list </em></strong><strong>de seguran&ccedil;a</strong></p>\n" +
                        "<ul>\n" +
                        "<li>Troque o &oacute;leo do motor no per&iacute;odo recomendado e exija a coloca&ccedil;&atilde;o de um novo anel de veda&ccedil;&atilde;o no buj&atilde;o do c&aacute;rter.</li>\n" +
                        "<li>Corrija os Eles podem comprometer outras pe&ccedil;as.</li>\n" +
                        "<li>Se seu ve&iacute;culo estiver circulando frequentemente em condi&ccedil;&otilde;es severas de tr&acirc;nsito (engarrafamentos, por exemplo), antecipe um pouco as trocas</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Observe ru&iacute;dos Quanto antes corrigir folgas do motor, melhor.</li>\n" +
                        "<li>Use somente filtros de boa</li>\n" +
                        "<li>Aten&ccedil;&atilde;o para o prazo de troca da correia O mesmo vale para a correia do alternador. Ajuste-as se estiverem frouxas.</li>\n" +
                        "<li>Falhas e engasgos do motor, falta de for&ccedil;a? Aten&ccedil;&atilde;o para o sistema de alimenta&ccedil;&atilde;o (carbura&ccedil;&atilde;o, igni&ccedil;&atilde;o).</li>\n" +
                        "<li>Teste os freios de seu ve&iacute;culo.</li>\n" +
                        "<li>Verifique o n&iacute;vel de combust&iacute;vel do ve&iacute;culo.</li>\n" +
                        "<li>Teste os far&oacute;is e os piscas de</li>\n" +
                        "<li>Teste a luz do freio e a luz de marcha a r&eacute;.</li>\n" +
                        "<li>Dificuldade na partida? <em>Check-up </em>no alternador, bateria, motor de arranque ou regulagem do</li>\n" +
                        "<li>Ao desligar o ve&iacute;culo, confira se o r&aacute;dio est&aacute; desligado e as luzes apagadas. Cuide da bateria!</li>\n" +
                        "<li>Se tiver desemba&ccedil;ador traseiro, cuidado na hora da Objetos pontiagudos e abrasivos podem danificar os filetes de aquecimento.</li>\n" +
                        "<li>Verifique os limpadores de para-brisa com frequ&ecirc;ncia, observando o estado das palhetas</li>\n" +
                        "</ul>",
                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Funcionamento do veículo");
        toolbarprincipal.setSubtitle("Equipamentos obrigatórios");
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
