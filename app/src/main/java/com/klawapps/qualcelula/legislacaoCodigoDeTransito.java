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


public class legislacaoCodigoDeTransito extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legislacao_codigo_de_transito);

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
        htmlTextView.setHtml("<h4>O C&oacute;digo de Tr&acirc;nsito Brasileiro</h4>\n" +
                        "<p><strong>&nbsp;</strong>O Brasil possui um conjunto de leis que regem e disciplinam o tr&acirc;nsito nas vias terrestres. A principal delas &eacute; a lei n&ordm; 9.503, de 23 de setembro de 1997, que institui o CTB (C&oacute;digo de Tr&acirc;nsito Brasileiro). Al&eacute;m do CTB, existem a legisla&ccedil;&atilde;o complementar, as resolu&ccedil;&otilde;es do Contran (Conselho Nacional de Tr&acirc;nsito), as portarias do Departamento Nacional de Tr&acirc;nsito (DENATRAN) e outras regulamenta&ccedil;&otilde;es estaduais e municipais.</p>\n" +
                        "<p>O art. 5o define que o SNT (Sistema Nacional de Tr&acirc;nsito) &eacute; um conjunto de &oacute;rg&atilde;os e entidades da Uni&atilde;o que tem por finalidade promover as atividades de planejamento, administra&ccedil;&atilde;o, normatiza&ccedil;&atilde;o, pesquisa, registro e licenciamento de ve&iacute;culos, forma&ccedil;&atilde;o, habilita&ccedil;&atilde;o e reciclagem de condutores, educa&ccedil;&atilde;o, engenharia, opera&ccedil;&atilde;o do sistema vi&aacute;rio, policiamento, fiscaliza&ccedil;&atilde;o, julgamento de infra&ccedil;&otilde;es e de recursos e aplica&ccedil;&atilde;o de penalidades. De acordo com o art. 1o, os &oacute;rg&atilde;os e as entidades componentes do SNT respondem, no &acirc;mbito das respectivas compet&ecirc;ncias, objetivamente, por danos causados aos cidad&atilde;os em virtude de a&ccedil;&atilde;o, omiss&atilde;o ou erro na execu&ccedil;&atilde;o e na manuten&ccedil;&atilde;o de programas, projetos e servi&ccedil;os que garantam o exerc&iacute;cio do direito do tr&acirc;nsito seguro.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Forma&ccedil;&atilde;o do condutor</h4>\n" +
                        "<p><strong>&nbsp;</strong>Inicialmente, voc&ecirc; precisa saber que todo condutor deve, obrigatoriamente, possuir um documento de habilita&ccedil;&atilde;o para ter o direito de conduzir qualquer tipo de ve&iacute;culo motorizado.</p>\n" +
                        "<p>Em seu artigo no 140, o CTB define: &ldquo;a habilita&ccedil;&atilde;o para conduzir ve&iacute;culo automotor e el&eacute;trico ser&aacute; apurada por meio de exames que dever&atilde;o ser realizados junto ao &oacute;rg&atilde;o ou entidade executivos do Estado ou do Distrito Federal, do domic&iacute;lio ou resid&ecirc;ncia do candidato, ou na sede estadual ou distrital do pr&oacute;prio &oacute;rg&atilde;o, devendo o condutor preencher os seguintes requisitos:</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>&nbsp;I - ser penalmente imput&aacute;vel, ou seja, ter 18 anos completos; II - saber ler e escrever;</p>\n" +
                        "<ul>\n" +
                        "<li>- possuir Carteira de Identidade ou &rdquo;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;A resolu&ccedil;&atilde;o no 168, de 14 de dezembro de 2004, do Contran (Conselho Nacional de Tr&acirc;nsito) que regulamenta as leis do CTB, adicionou um quarto requisito ao candidato &agrave; habilita&ccedil;&atilde;o, qual seja:</p>\n" +
                        "<ul>\n" +
                        "<li>&ndash; <strong>CPF</strong> (Cadastro de Pessoa F&iacute;sica).</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;O art. 3o da resolu&ccedil;&atilde;o no 168 estabelece que para a obten&ccedil;&atilde;o da Carteira Nacional de Habilita&ccedil;&atilde;o, o candidato dever&aacute; se submeter &agrave; realiza&ccedil;&atilde;o de:</p>\n" +
                        "<ul>\n" +
                        "<li>&ndash; <strong>Avalia&ccedil;&atilde;o Psicol&oacute;gica</strong>;</li>\n" +
                        "<li>&ndash; <strong>Exames de Aptid&atilde;o F&iacute;sica e Mental</strong>;</li>\n" +
                        "<li>&ndash; <strong>Exame escrito</strong> sobre a integralidade do conte&uacute;do program&aacute;tico, desenvolvido em Curso de Forma&ccedil;&atilde;o para Condutor;</li>\n" +
                        "<li>&ndash;<strong> Exame de dire&ccedil;&atilde;o veicular</strong>, realizado na via p&uacute;blica, em ve&iacute;culo da categoria para a qual esteja se</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Assim, a forma&ccedil;&atilde;o de condutor de ve&iacute;culo automotor e el&eacute;trico compreende a realiza&ccedil;&atilde;o dos cursos Te&oacute;rico-t&eacute;cnico e de Pr&aacute;tica de Dire&ccedil;&atilde;o Veicular. Veja, no in&iacute;cio deste texto, no sum&aacute;rio, a integralidade dos conte&uacute;dos do curso te&oacute;rico exigidos para a forma&ccedil;&atilde;o de condutores de ve&iacute;culos automotores (1&ordf; habilita&ccedil;&atilde;o).</p>\n" +
                        "<p>Vale ainda dizer que o candidato &agrave; obten&ccedil;&atilde;o da CNH ser&aacute; submetido a Exame Te&oacute;rico- t&eacute;cnico, constitu&iacute;do de prova convencional ou eletr&ocirc;nica de no m&iacute;nimo 30 (trinta) quest&otilde;es, incluindo todo o conte&uacute;do program&aacute;tico, proporcional &agrave; carga hor&aacute;ria de cada disciplina, organizado de forma individual, &uacute;nica e sigilosa, devendo obter aproveitamento de, no m&iacute;nimo, 70% (setenta por cento) de acertos para aprova&ccedil;&atilde;o.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Categoria de habilita&ccedil;&atilde;o e rela&ccedil;&atilde;o com ve&iacute;culos conduzidos</h4>\n" +
                        "<p>Todo condutor deve possuir o documento de habilita&ccedil;&atilde;o denominado CNH (Carteira Nacional de Habilita&ccedil;&atilde;o). O art. 143 estabelece que os candidatos &agrave; CNH podem se habilitar nas categorias de &ldquo;A&rdquo; a &ldquo;E&rdquo;. O quadro a seguir relaciona a categoria de habilita&ccedil;&atilde;o com o tipo de ve&iacute;culo conduzido.</p>\n" +
                        "<p style=\"padding-left: 30px;\"><strong>A:</strong> condutor de ve&iacute;culo motorizado de duas ou tr&ecirc;s rodas, com ou sem carro lateral (motos);</p>\n" +
                        "<p style=\"padding-left: 30px;\"><strong>B:</strong> condutor de ve&iacute;culo motorizado n&atilde;o abrangido pela categoria A, com peso bruto total inferior a 3.500 quilos e lota&ccedil;&atilde;o m&aacute;xima de oito lugares, al&eacute;m do motorista (autom&oacute;veis);</p>\n" +
                        "<p style=\"padding-left: 30px;\"><strong>C:</strong> condutor de ve&iacute;culo motorizado usado para transporte de carga, com peso bruto superior a 3.500 quilos (como caminh&otilde;es);</p>\n" +
                        "<p style=\"padding-left: 30px;\"><strong>D:</strong> condutor de ve&iacute;culo motorizado usado no transporte de passageiros, com lota&ccedil;&atilde;o superior a oito lugares al&eacute;m do motorista (&ocirc;nibus e vans, por exemplo);</p>\n" +
                        "<p style=\"padding-left: 30px;\"><strong>E:</strong> condutor de combina&ccedil;&atilde;o de ve&iacute;culos em que a unidade conduzida se enquadre nas categorias B, C ou D e cuja unidade acoplada ou rebocada tenha peso bruto de 6 mil quilos ou mais; ou cuja lota&ccedil;&atilde;o seja superior a oito lugares; ou, ainda, que seja enquadrado na categoria trailer.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Caso o candidato seja aprovado nos diversos exames e avalia&ccedil;&otilde;es relacionados anteriormente, receber&aacute; a Permiss&atilde;o para Dirigir na categoria em que prestou os exames.</p>\n" +
                        "<p>&Eacute; importante saber que ao candidato considerado apto nas categorias &ldquo;A&rdquo;, &ldquo;B&rdquo; ou &ldquo;A&rdquo; e &ldquo;B&rdquo;, ser&aacute; conferida a Permiss&atilde;o para Dirigir com validade de um ano e, ao t&eacute;rmino dessa, o condutor poder&aacute; solicitar a CNH definitiva. Essa lhe ser&aacute; concedida desde que tenha cumprido o disposto no &sect; 3o do art. 148 do CTB (&ldquo;A Carteira Nacional de Habilita&ccedil;&atilde;o ser&aacute; conferida ao condutor no t&eacute;rmino de um ano, desde que o mesmo n&atilde;o tenha cometido nenhuma infra&ccedil;&atilde;o de natureza grave ou grav&iacute;ssima, ou seja reincidente em infra&ccedil;&atilde;o m&eacute;dia&ldquo;). Logo adiante, n&oacute;s veremos o que s&atilde;o infra&ccedil;&otilde;es de tr&acirc;nsito.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Documenta&ccedil;&atilde;o exigida para condutor e ve&iacute;culo</h4>\n" +
                        "<p><strong>&nbsp;</strong>Os condutores de ve&iacute;culos automotores devem, obrigatoriamente, portar a CNH (Carteira Nacional de Habilita&ccedil;&atilde;o) ou a Permiss&atilde;o para Dirigir, em original, na ocasi&atilde;o que conduzirem um ve&iacute;culo automotor. No caso da 1a habilita&ccedil;&atilde;o, o documento obrigat&oacute;rio ser&aacute; a Permiss&atilde;o para Dirigir, durante um ano.</p>\n" +
                        "<p><em>Obs:&nbsp;Em rela&ccedil;&atilde;o &agrave; documenta&ccedil;&atilde;o do ve&iacute;culo, &eacute; obrigat&oacute;rio portar o CRLV (Certificado de Registro e Licenciamento de Ve&iacute;culo), pois ele comprova que o ve&iacute;culo est&aacute; licenciado para trafegar. Esse documento deve estar no original.</em></p>",
                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Legislação de Trânsito");
        toolbarprincipal.setSubtitle("O Código de trânsito brasileiro ");
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
