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


public class socorrosConceitos extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socorros_conceitos);


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
        htmlTextView.setHtml("<p>Muitas vezes pessoas sofrem acidentes de tr&acirc;nsito diante de n&oacute;s e n&atilde;o sabemos o que fazer. Acidentes acontecem a qualquer momento e nem sempre em locais pr&oacute;ximos a um hospital ou pronto-socorro. Aconselha-se a qualquer pessoa, inclusive aos candidatos &agrave; primeira habilita&ccedil;&atilde;o, que, antes de tudo, sinalizem o local do acidente e acionem os servi&ccedil;os de emerg&ecirc;ncia. No entanto, h&aacute; momentos em que a v&iacute;tima pode correr mais riscos ainda se n&atilde;o for socorrida na hora por meio de t&eacute;cnicas simples. Sendo assim, o simples fato de conhecer no&ccedil;&otilde;es b&aacute;sicas de primeiros socorros pode salvar muitas vidas. Al&eacute;m disso, o conhecimento desse conte&uacute;do tamb&eacute;m &eacute; exigido pela legisla&ccedil;&atilde;o brasileira para os candidatos &agrave; primeira habilita&ccedil;&atilde;o.</p>\n" +
                        "<h2>Conceitos b&aacute;sicos</h2>\n" +
                        "<p>Vamos conhecer alguns conceitos b&aacute;sicos que nos ajudar&atilde;o a compreender melhor as a&ccedil;&otilde;es tomadas frente a um acidente de tr&acirc;nsito com v&iacute;tima.</p>\n" +
                        "<p><strong>Deixar de prestar socorro </strong>significa n&atilde;o dar nenhuma assist&ecirc;ncia &agrave; v&iacute;tima. A pessoa que chama por socorro especializado, por exemplo, j&aacute; est&aacute; prestando e providenciando socorro. Vale lembrar que devemos prestar socorro sempre que a v&iacute;tima n&atilde;o esteja em condi&ccedil;&otilde;es de cuidar de si pr&oacute;pria.</p>\n" +
                        "<p><strong>Primeiro-socorro </strong>&eacute; o tipo de atendimento, tempor&aacute;rio e imediato, que &eacute; prestado &agrave; v&iacute;tima de acidentes, antes da chegada do socorro m&eacute;dico. Esse tipo de socorro pode proteger a pessoa contra maiores danos, evitando o chamado 2o trauma, isto &eacute;, n&atilde;o propiciando outras les&otilde;es ou agravando as j&aacute; existentes. Seu objetivo &eacute; resguardar a v&iacute;tima, ou seja, a manuten&ccedil;&atilde;o do suporte b&aacute;sico da vida. &Eacute; importante chamar aten&ccedil;&atilde;o para o fato de que a presen&ccedil;a de um m&eacute;dico &eacute; sempre indispens&aacute;vel.</p>\n" +
                        "<p><strong>Socorrista </strong>&eacute; como chamamos o profissional em atendimento de emerg&ecirc;ncia. Devemos, sempre que poss&iacute;vel, preferir que o atendimento seja feito por um socorrista, pois eles contam com forma&ccedil;&atilde;o e equipamentos especiais, o que permite que prestem um atendimento especializado.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p><strong><em>IMPORTANTE: </em></strong><em>tenha sempre em mente que voc&ecirc; n&atilde;o &eacute; um profissional especializado </em><em>em primeiros socorros, mas que sua a&ccedil;&atilde;o ser&aacute; importante para salvar vidas, desde que observe alguns cuidados durante o socorro &agrave;s v&iacute;timas.</em></p>\n" +
                        "<p>Neste sentido, h&aacute; uma sequ&ecirc;ncia de a&ccedil;&otilde;es que devem ser tomadas independentemente do tipo de acidente com o qual voc&ecirc; se deparar. S&atilde;o elas:</p>\n" +
                        "<ul>\n" +
                        "<li>Mantenha a calma;</li>\n" +
                        "<li>Garanta a seguran&ccedil;a (boa sinaliza&ccedil;&atilde;o do acidente);</li>\n" +
                        "<li>Pe&ccedil;a socorro especializado;</li>\n" +
                        "<li>Controle a situa&ccedil;&atilde;o;</li>\n" +
                        "<li>Verifique a situa&ccedil;&atilde;o das v&iacute;timas;</li>\n" +
                        "<li>Realize algumas a&ccedil;&otilde;es com as v&iacute;timas.</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p><em>Vamos ent&atilde;o entender melhor de que maneira aplicamos essas a&ccedil;&otilde;es?</em></p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h2>Sinaliza&ccedil;&atilde;o do local do acidente</h2>\n" +
                        "<p>Os acidentes acontecem nas vias p&uacute;blicas urbanas e rurais em geral (ruas, avenidas, vielas, caminhos, estradas, rodovias etc.), impedindo ou dificultando a passagem normal dos outros ve&iacute;culos. Por isso, esteja certo de que situa&ccedil;&otilde;es de perigo v&atilde;o ocorrer (novos acidentes ou atropelamentos) se voc&ecirc; demorar muito ou n&atilde;o sinalizar o local de forma adequada.</p>\n" +
                        "<p>O primeiro procedimento que voc&ecirc; deve realizar ao se deparar com um acidente de tr&acirc;nsito &eacute; providenciar imediatamente a sinaliza&ccedil;&atilde;o do local.</p>\n" +
                        "<p>Para fazer isso com sucesso s&atilde;o necess&aacute;rios os seguintes cuidados:</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Reduza a velocidade e pare seu ve&iacute;culo no acostamento antes ou depois do acidente (em local seguro), a uma dist&acirc;ncia suficiente para n&atilde;o provocar um acidente secund&aacute;rio;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Em seguida, salte de seu ve&iacute;culo, deixando-o com as luzes ligadas o pisca-alerta;</li>\n" +
                        "</ul>\n" +
                        "<p><em>&nbsp;</em></p>\n" +
                        "<ul>\n" +
                        "<li>Inicie a sinaliza&ccedil;&atilde;o em um ponto seguro antes do acidente;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Use o tri&acirc;ngulo de seguran&ccedil;a para sinalizar o acidente, colocando-o a uma dist&acirc;ncia segura do local do Alternativamente, pode ser improvisada uma sinaliza&ccedil;&atilde;o com galhos de vegeta&ccedil;&atilde;o ao lado da via, sempre observando a dist&acirc;ncia do local do acidente.</li>\n" +
                        "</ul>\n" +
                        "<p>Veja a seguir como definir a dist&acirc;ncia para a sinaliza&ccedil;&atilde;o do acidente em v&aacute;rios tipos de vias e situa&ccedil;&otilde;es clim&aacute;ticas:</p>\n" +
                        "<p><img src=\"socorrossinalizacao\" width=\"300\" height=\"300\" /></p>" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Cada passo deve ter aproximadamente 1 m de comprimento.&nbsp;</p>\n" +
                        "<p>Al&eacute;m dos procedimentos descritos acima, &eacute; importante tomar outros cuidados. Para isso, proceda da seguinte maneira:</p>\n" +
                        "<ul>\n" +
                        "<li>Demarque o desvio do tr&aacute;fego at&eacute; o acidente</li>\n" +
                        "<li>Mantenha o tr&aacute;fego fluindo com as vias</li>\n" +
                        "<li>Solicite &agrave;s pessoas que fiquem ao longo do trecho sinalizado para melhorar a fluidez do tr&aacute;fego.</li>\n" +
                        "<li>Cuide para que os curiosos n&atilde;o parem na via destinada ao tr&aacute;fego.</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h2>Acionamento de recursos</h2>\n" +
                        "<p>Em grande parte do Brasil n&oacute;s podemos contar com servi&ccedil;os de atendimento &agrave;s emerg&ecirc;ncias. O resgate, ligado ao Corpo de Bombeiros, os Samus, os atendimentos das pr&oacute;prias rodovias ou outros tipos de socorro, recebe chamados por telefone, faz uma triagem pr&eacute;via e envia equipes treinadas, em ambul&acirc;ncias equipadas, para o atendimento. Ap&oacute;s uma primeira avalia&ccedil;&atilde;o, osferidos s&atilde;o atendidos emergencialmente para, em seguida, serem transferidos aos hospitais.</p>\n" +
                        "<p>Os atendimentos de emerg&ecirc;ncia s&atilde;o servi&ccedil;os gratuitos, com n&uacute;meros de telefone padronizados em todo o Brasil. Use um celular, os telefones dos acostamentos das rodovias, os telefones p&uacute;blicos ou pe&ccedil;a para algu&eacute;m que esteja passando para telefonar. Os telefones de emerg&ecirc;ncia mais comuns s&atilde;o:</p>\n" +
                        "<ul>\n" +
                        "<li><strong>190</strong> &ndash; Pol&iacute;cia Militar;</li>\n" +
                        "<li><strong>191</strong> &ndash; Pol&iacute;cia Rodovi&aacute;ria Federal (para acidentes em estradas e rodovias);</li>\n" +
                        "<li><strong>192</strong> &ndash; Samu (Servi&ccedil;o de Atendimento M&oacute;vel de Urg&ecirc;ncia);</li>\n" +
                        "<li><strong>193</strong> &ndash; Resgate do Corpo de Bombeiros;</li>\n" +
                        "<li><strong>198</strong> - Pol&iacute;cia Rodovi&aacute;ria</li>\n" +
                        "</ul>\n" +
                        "<p><em>O atendimento de emerg&ecirc;ncia n&atilde;o exclui a necessidade da presen&ccedil;a de um m&eacute;dico ou socorrista. Antes de tudo, chame por socorro especializado, informando as condi&ccedil;&otilde;es e o local preciso do acidente.</em></p>\n" +
                        "<p>&nbsp;</p>",

                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Primeiros Socorros");
        toolbarprincipal.setSubtitle("Conceitos");
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
