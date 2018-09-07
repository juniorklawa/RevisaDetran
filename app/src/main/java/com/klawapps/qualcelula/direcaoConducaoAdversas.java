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


public class direcaoConducaoAdversas extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direcao_conducao_adversas);


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
        htmlTextView.setHtml("<h4>Condu&ccedil;&atilde;o em condi&ccedil;&otilde;es adversas</h4>\n" +
                        "<p>Voc&ecirc; sabia que muitos acidentes s&atilde;o causados por situa&ccedil;&otilde;es adversas, ou seja, por aquelas situa&ccedil;&otilde;es contr&aacute;rias ao desejado ou esperado? Para evitar acidentes, o motorista precisa estar atento e preparado para reconhecer essas condi&ccedil;&otilde;es e, caso ocorram, empregar t&eacute;cnicas de dire&ccedil;&atilde;o segura. Vejamos a seguir alguns casos de condu&ccedil;&atilde;o em condi&ccedil;&otilde;es adversas.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Condi&ccedil;&otilde;es adversas de luminosidade</h4>\n" +
                        "<p>A luz deficiente ou em excesso afeta a nossa capacidade de ver ou de sermos vistos, seja ela natural ou artificial. Nessas condi&ccedil;&otilde;es, h&aacute; um risco muito grande de ocorrerem acidentes. Pode haver ofuscamento da vis&atilde;o causado pelo farol alto de um ve&iacute;culo que vem em sentido contr&aacute;rio ou pela luz solar incidindo diretamente nos olhos do condutor.</p>\n" +
                        "<p>Tome cuidado com o uso indevido dos far&oacute;is. A vista humana pode levar at&eacute; 7 segundos para se recuperar de um ofuscamento. Um ve&iacute;culo a uma velocidade de 80 km/h percorre uma dist&acirc;ncia superior ao tamanho de um campo de futebol antes que seu condutor recupere a vis&atilde;o plena. Lembre-se: o alcance do farol alto de seu ve&iacute;culo &eacute; de aproximadamente 120 metros.</p>\n" +
                        "<p><em>No per&iacute;odo noturno, ocorre uma redu&ccedil;&atilde;o de visibilidade e, em fun&ccedil;&atilde;o disso, o motorista deve conduzir com velocidade menor e aumentar a dist&acirc;ncia de seguran&ccedil;a. &Eacute; importante tomar cuidados especiais ao dirigir nos per&iacute;odos noturnos, pois a visibilidade humana nessas circunst&acirc;ncias fica reduzida para 1/6 em rela&ccedil;&atilde;o &agrave; capacidade visual diurna.</em></p>\n" +
                        "<p>Para prevenir a condi&ccedil;&atilde;o adversa de luminosidade, recomenda-se o uso de &oacute;culos escuros durante o dia, uma vez que ameniza a luz do sol incidente na vis&atilde;o humana, diminuindo a cegueira tempor&aacute;ria, bem como o ofuscamento das vistas causado pelo sol.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Condi&ccedil;&otilde;es adversas de tempo (clima)</h4>\n" +
                        "<p>As ocorr&ecirc;ncias de chuva, granizo, vento forte, neblina etc. afetam a percep&ccedil;&atilde;o e o controle do ve&iacute;culo. Grande parte dos acidentes acontece em dias chuvosos. Isso porque a pista fica escorregadia com a chuva. Ao dirigir com pista molhada ou em dias chuvosos, independentemente da quantidade da &aacute;gua superficial, diminua a velocidade, aumente a dist&acirc;ncia de seguimento dos outros ve&iacute;culos, n&atilde;o utilize o freio bruscamente e tampouco mude de dire&ccedil;&atilde;o repentinamente. Ressalta-se, ainda, que o ve&iacute;culo deve estar sempre com o freio motor engatado, jamais devendo estar em marcha neutra com o ve&iacute;culo em movimento, j&aacute; que facilita a derrapagem e torna a frenagem mais dif&iacute;cil.</p>\n" +
                        "<p>Com a pista molhada, pode ocorrer o que chamamos de aquaplanagem ou hidroplanagem, que consiste no descontrole do ve&iacute;culo em decorr&ecirc;ncia da diminui&ccedil;&atilde;o do atrito e da ader&ecirc;ncia dos pneus com o solo. A falta de contato dos pneus com a pista faz com que o ve&iacute;culo derrape e o condutor perca o controle do ve&iacute;culo, podendo causar acidentes. Para garantir uma ader&ecirc;ncia eficaz dos pneus, o carro sempre deve estar engatado na marcha correta, e os pneus devem possuir sulcos com profundidade m&iacute;nima de 1,6 mm, segundo a legisla&ccedil;&atilde;o. Os sulcos s&atilde;o respons&aacute;veis pelo escoamento da &aacute;gua para fora da banda de rodagem, permitindo o contato com o solo em tempo integral.</p>\n" +
                        "<p>Al&eacute;m das condi&ccedil;&otilde;es de chuvas, os condutores podem enfrentar situa&ccedil;&otilde;es de ventos fortes. Se os ventos forem transversais, o condutor dever&aacute; abrir os vidros e reduzir a velocidade. Se os ventos forem frontais, dever&aacute; reduzir a velocidade, segurando com firmeza o volante.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Condi&ccedil;&otilde;es adversas na via</h4>\n" +
                        "<p>O desenho geom&eacute;trico, a largura, o tipo e o estado da pavimenta&ccedil;&atilde;o da pista &eacute; que definem as velocidades m&aacute;ximas indicadas para cada via. As vias nem sempre est&atilde;o em bom estado de conserva&ccedil;&atilde;o ou sinalizadas adequadamente. Algumas possuem buracos, outras est&atilde;o mal pavimentadas, com as demarca&ccedil;&otilde;es vi&aacute;rias apagadas. Por isso, h&aacute; necessidade de o condutor sempre estar atento, evitando acidentes e praticando a dire&ccedil;&atilde;o defensiva.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Condi&ccedil;&otilde;es adversas de tr&aacute;fego</h4>\n" +
                        "<p>As condi&ccedil;&otilde;es de tr&aacute;fego envolvem os demais usu&aacute;rios da via. O condutor deve estar atento aos congestionamentos ao tr&acirc;nsito lento, resultantes do excesso de ve&iacute;culos. Deve tamb&eacute;m atentar-se ao tr&acirc;nsito r&aacute;pido, pois muitos motoristas ignoram a dist&acirc;ncia de seguran&ccedil;a e, ocorrendo alguma adversidade, n&atilde;o conseguem parar o ve&iacute;culo a tempo, provocando colis&otilde;es ou mesmo &ldquo;engavetamentos&rdquo;.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Condi&ccedil;&otilde;es adversas dos ve&iacute;culos</h4>\n" +
                        "<p>A manuten&ccedil;&atilde;o do bom estado de conserva&ccedil;&atilde;o do ve&iacute;culo &eacute; dever seu, portanto verifique e ajuste periodicamente: pneus e estepe, motor, para-brisas, limpadores, combust&iacute;vel e radiador, freios desregulados, suspens&atilde;o desalinhada, dire&ccedil;&atilde;o com folga, sinaleiras e far&oacute;is com defeitos, espelhos malregulados ou sujos, vazamentos de fluidos etc.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Condi&ccedil;&otilde;es adversas dos condutores</h4>\n" +
                        "<p>As condi&ccedil;&otilde;es f&iacute;sicas e mentais s&atilde;o muito importantes, pois s&atilde;o elas que alteram o modo de dirigir do condutor e sua &ldquo;performance&rdquo;. Existem fatores f&iacute;sicos como: fadiga, capacidade de aten&ccedil;&atilde;o, audi&ccedil;&atilde;o e vis&atilde;o. E fatores mentais e emocionais, como: a inexperi&ecirc;ncia, a familiaridade com a via, a excita&ccedil;&atilde;o ou a depress&atilde;o. Esses fatores levam o motorista a dirigir com pressa ou sem aten&ccedil;&atilde;o, com raiva, ira, calor, frustra&ccedil;&atilde;o, inseguran&ccedil;a etc.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h5>a)&nbsp; Fadiga e sono</h5>\n" +
                        "<p>Um motorista cansado n&atilde;o tem condi&ccedil;&otilde;es de dirigir com seguran&ccedil;a. O cansa&ccedil;o e o sono, muitas vezes, s&atilde;o mais fortes do que a capacidade de permanecer acordado, e o condutor adormece sem perceber.</p>\n" +
                        "<h5>b)&nbsp; &Aacute;lcool</h5>\n" +
                        "<p>Para dirigir com seguran&ccedil;a, o motorista precisa estar com boas condi&ccedil;&otilde;es f&iacute;sicas e mentais. O &aacute;lcool, ao contr&aacute;rio do que se imagina, &eacute; uma droga depressora do sistema nervoso. Quando ingere bebida alco&oacute;lica, o motorista pode ser facilmente envolvido em acidentes, pois o &aacute;lcool afeta o c&eacute;rebro, diminuindo o senso de cuidado, tornando mais lentos os reflexos, prejudicando a vis&atilde;o e a audi&ccedil;&atilde;o, enfim, comprometendo toda a capacidade para dirigir.</p>\n" +
                        "<h5>c)&nbsp; Drogas e medicamentos</h5>\n" +
                        "<p>A automedica&ccedil;&atilde;o &eacute; uma pr&aacute;tica prejudicial &agrave; sa&uacute;de, pois pode acarretar s&eacute;rias consequ&ecirc;ncias ao organismo e atrapalhar o ato de guiar. Muitas vezes, os motoristas recorrem por conta pr&oacute;pria &agrave; automedica&ccedil;&atilde;o. Mas, aten&ccedil;&atilde;o! N&atilde;o se deve tomar medicamentos sem prescri&ccedil;&atilde;o m&eacute;dica.</p>\n" +
                        "<h5>d)&nbsp;&nbsp; Aspectos ps&iacute;quicos</h5>\n" +
                        "<p>As pessoas diferem muito entre si quanto aos aspectos ps&iacute;quicos, interferindo bastante na maneira de ser e agir das pessoas. Algu&eacute;m que passou por uma emo&ccedil;&atilde;o muito forte como, por exemplo, o falecimento de um ente querido, poder&aacute; ter seu comportamento alterado no tr&acirc;nsito.</p>\n" +
                        "<p>H&aacute; pessoas que se irritam com mais facilidade no tr&acirc;nsito, outras s&atilde;o mais tranquilas. H&aacute;, ainda, aquelas que nem se deixam abalar por fatos desagrad&aacute;veis. Mas, independentemente do tipo ps&iacute;quico da pessoa, uma coisa &eacute; certa: ao dirigir irritado, nervoso ou sob emo&ccedil;&otilde;es fortes, o motorista pode causar acidentes. Evite isso.</p>\n" +
                        "<p>Preste bastante aten&ccedil;&atilde;o: dirigir sob o efeito de &aacute;lcool ou drogas tem consequ&ecirc;ncias para o motorista. Vamos conhec&ecirc;-las para evitar essas situa&ccedil;&otilde;es?</p>\n" +
                        "<p>&nbsp;</p>\n"  +
                        "<h4>Consequ&ecirc;ncias da ingest&atilde;o e consumo de bebida alco&oacute;lica e subst&acirc;ncia psicoativa</h4>\n" +
                        "<p>A combina&ccedil;&atilde;o &aacute;lcool-volante resulta em situa&ccedil;&otilde;es de risco. Grande parte dos acidentes com v&iacute;timas fatais envolve um motorista alcoolizado. Ingerir bebida alco&oacute;lica ou usar drogas, al&eacute;m de reduzir a concentra&ccedil;&atilde;o, afeta a coordena&ccedil;&atilde;o motora, muda</p>\n" +
                        "<p>o comportamento e diminui o desempenho, limitando a percep&ccedil;&atilde;o de situa&ccedil;&otilde;es de perigo e reduzindo a capacidade de a&ccedil;&atilde;o e rea&ccedil;&atilde;o do motorista.</p>\n"+
                        "<p>O &aacute;lcool presente na corrente sangu&iacute;nea provoca altera&ccedil;&otilde;es na percep&ccedil;&atilde;o e o retardamento dos reflexos. A dosagem excessiva conduz &agrave; perigosa diminui&ccedil;&atilde;o da percep&ccedil;&atilde;o e &agrave; total lentid&atilde;o dos reflexos, diminuindo a consci&ecirc;ncia de perigo. Todo condutor em estado de embriaguez, mesmo leve, compromete sua seguran&ccedil;a e a dos demais usu&aacute;rios da via.</p>\n"+
                        "<p>A lei n&ordm; 11.705 de 19 de junho de 2008, regulamentada pelo decreto n&ordm; 6.488 do mesmo dia, alterou alguns artigos do CTB. Essa lei define novas regras para os condutores flagrados conduzindo ve&iacute;culos sob influ&ecirc;ncia de &aacute;lcool. Antes, era permitida a ingest&atilde;o de at&eacute; 6 decigramas de &aacute;lcool por litro de sangue. Pela nova lei &eacute; proibido dirigir se o motorista tiver bebido qualquer quantidade de &aacute;lcool.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p><strong>Aten&ccedil;&atilde;o</strong></p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p><em>Ap&oacute;s </em><em>a publica&ccedil;&atilde;o da lei&nbsp; n&ordm; 11.705 de 2008, o condutor que apresentar concentra&ccedil;&atilde;o de &aacute;lcool por litro de sangue igual ou superior a 6 (seis) decigramas, ou sob a influ&ecirc;ncia de qualquer outra subst&acirc;ncia psicoativa que determine depend&ecirc;ncia, ser&aacute; penalizado com deten&ccedil;&atilde;o, de seis meses a tr&ecirc;s anos, multa e</em></p>\n" +
                        "<p><em>suspens&atilde;o </em><em>ou </em><em>proibi&ccedil;&atilde;o </em><em>de se </em><em>obter </em><em>a permiss&atilde;o ou a habilita&ccedil;&atilde;o para dirigir ve&iacute;culo automotor, conforme art. 306 do CTB.</em></p>\n" +
                        "<p><em>&nbsp;</em></p>\n" +
                        "<p>Veja abaixo algumas dicas de como evitar problemas por causa das bebidas:</p>\n" +
                        "<ul>\n" +
                        "<li>N&atilde;o beba antes de dirigir;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Se voc&ecirc; vai a uma festa e pretende consumir bebidas alco&oacute;licas, procure uma alternativa de transporte: pegue carona, um &ocirc;nibus ou um t&aacute;xi;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>N&atilde;o deixe os condutores consumirem bebida alco&oacute;lica;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Ao sair da festa n&atilde;o aceite carona de quem consumiu bebidas alco&oacute;licas;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Se voc&ecirc; ingeriu alguma bebida alco&oacute;lica, o &uacute;nico rem&eacute;dio &eacute; o N&atilde;o se engane! Caf&eacute; e banho gelado n&atilde;o conseguem eliminar os efeitos do &aacute;lcool;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Se voc&ecirc; gosta de beber, deixe sempre o carro em</li>\n" +
                        "</ul>\n" +
                        "<p>E lembre-se, ao dirigir ap&oacute;s a ingest&atilde;o de &aacute;lcool, voc&ecirc; n&atilde;o coloca em risco somente a sua vida, mas tamb&eacute;m a de outras pessoas que est&atilde;o integrando o tr&acirc;nsito.</p>\n" +
                        "<p>&nbsp;</p>",
                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Direção defensiva");
        toolbarprincipal.setSubtitle("Condução em condições adversas");
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
