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


public class legislacaoSinalizacaoVertical extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legislacao_sinalizacao);

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
        htmlTextView.setHtml("<h2>Sinaliza&ccedil;&atilde;o de tr&acirc;nsito e sinaliza&ccedil;&atilde;o vi&aacute;ria</h2>\n" +
                        "<p>O Cap&iacute;tulo VII do CTB trata da sinaliza&ccedil;&atilde;o necess&aacute;ria para orientar os condutores e os pedestres na forma correta de circula&ccedil;&atilde;o, garantindo maior fluidez no tr&acirc;nsito e maior seguran&ccedil;a para ve&iacute;culos e pedestres. Esse cap&iacute;tulo &eacute; complementado pela resolu&ccedil;&atilde;o no 160, de 22 de abril de 2004, do Contran (Conselho Nacional de Tr&acirc;nsito), que aprova o Anexo II do C&oacute;digo de Tr&acirc;nsito Brasileiro.</p>\n" +
                        "<p>&nbsp;Os artigos 80 a 90 do Cap&iacute;tulo VII do CTB tratam da Sinaliza&ccedil;&atilde;o de Tr&acirc;nsito. Entre eles, ressaltam-se:</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p><strong>Art. 89. </strong>A sinaliza&ccedil;&atilde;o ter&aacute; a seguinte ordem de preval&ecirc;ncia:</p>\n" +
                        "<p>&nbsp;I - as ordens do agente de tr&acirc;nsito sobre as normas de circula&ccedil;&atilde;o e outros sinais; II - as indica&ccedil;&otilde;es do sem&aacute;foro sobre os demais sinais;</p>\n" +
                        "<p>III - as indica&ccedil;&otilde;es dos sinais sobre as demais normas de tr&acirc;nsito.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>&nbsp;<strong>Art. 90. </strong>N&atilde;o ser&atilde;o aplicadas as san&ccedil;&otilde;es previstas nesse c&oacute;digo por inobserv&acirc;ncia &agrave; sinaliza&ccedil;&atilde;o quando essa for insuficiente ou incorreta.</p>\n" +
                        "<p>&nbsp;&nbsp;&sect;1&ordm; O &oacute;rg&atilde;o ou a entidade de tr&acirc;nsito com circunscri&ccedil;&atilde;o sobre a via &eacute; respons&aacute;vel pela implanta&ccedil;&atilde;o da sinaliza&ccedil;&atilde;o, respondendo pela sua falta, insufici&ecirc;ncia ou incorreta coloca&ccedil;&atilde;o.</p>\n" +
                        "<p>&nbsp;&sect; 2&ordm; O Contran editar&aacute; normas complementares no que se refere &agrave; interpreta&ccedil;&atilde;o, coloca&ccedil;&atilde;o e uso da sinaliza&ccedil;&atilde;o.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p><em>A resolu&ccedil;&atilde;o </em>no <em>160/04 do Contran classifica a sinaliza&ccedil;&atilde;o vi&aacute;ria em:</em></p>\n" +
                        "<ul>\n" +
                        "<li><em>Sinaliza&ccedil;&atilde;o vertical</em></li>\n" +
                        "<li><em>Sinaliza&ccedil;&atilde;o horizontal</em></li>\n" +
                        "<li><em>Dispositivos auxiliares</em></li>\n" +
                        "<li><em>Sinaliza&ccedil;&atilde;o semaf&oacute;rica</em></li>\n" +
                        "<li><em>Sinaliza&ccedil;&atilde;o de obras</em></li>\n" +
                        "<li><em>Gestos</em></li>\n" +
                        "<li><em>Sinais sonoros</em></li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h2><strong>Sinaliza&ccedil;&atilde;o Vertical</strong></h2>\n" +
                        "<p>A resolu&ccedil;&atilde;o do Contran no 160/04 define a sinaliza&ccedil;&atilde;o vertical como um subsistema da sinaliza&ccedil;&atilde;o vi&aacute;ria cujo meio de comunica&ccedil;&atilde;o est&aacute; na posi&ccedil;&atilde;o vertical, normalmente em placa, fixado ao lado ou suspenso sobre a pista, transmitindo mensagens de car&aacute;ter permanente e, eventualmente, vari&aacute;veis, por meio de legendas e/ou s&iacute;mbolos pr&eacute;-reconhecidos e legalmente institu&iacute;dos.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Sinaliza&ccedil;&atilde;o de Regulamenta&ccedil;&atilde;o</h4>\n" +
                        "<p>Tem por finalidade informar aos usu&aacute;rios as condi&ccedil;&otilde;es, as proibi&ccedil;&otilde;es, as obriga&ccedil;&otilde;es ou as restri&ccedil;&otilde;es no uso das vias. Suas mensagens s&atilde;o imperativas e o desrespeito a elas constitui infra&ccedil;&atilde;o. Sua forma padr&atilde;o &eacute; a circular, e as cores s&atilde;o vermelha, preta e branca. Alguns dos sinais regulamentares mais importantes que o condutor deve conhecer s&atilde;o:</p>\n" +
                        "<p><img src=\"regulamentacaoa\" width=\"300\" height=\"300\" /></p>" +
                        "<p>Constituem <strong>exce&ccedil;&atilde;o</strong>, quanto &agrave; forma, os sinais &ldquo;R-1 &ndash; Parada Obrigat&oacute;ria&rdquo; e &ldquo;R-2 &ndash; D&ecirc; a Prefer&ecirc;ncia&rdquo;. <strong>S&atilde;o eles</strong>:</p>\n" +
                        "<p><img src=\"regulamentacaob\" width=\"300\" height=\"300\" /></p>" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Informa&ccedil;&otilde;es complementares</h4>\n" +
                        "<p>Sendo necess&aacute;rio acrescentar informa&ccedil;&otilde;es para complementar os sinais de regulamenta&ccedil;&atilde;o, tais como: per&iacute;odo de validade, caracter&iacute;sticas e uso do ve&iacute;culo, condi&ccedil;&otilde;es de estacionamento, al&eacute;m de outras, deve ser utilizada uma placa adicional ou incorporada &agrave; placa principal, formando um s&oacute; conjunto, na forma retangular, com as mesmas cores do sinal de regulamenta&ccedil;&atilde;o, conforme os exemplos a seguir:</p>\n" +
                        "<p><img src=\"regulamentacaoc\" width=\"300\" height=\"300\" /></p>" +
                        "<p>&nbsp;</p>\n" +
                        "<p><strong>Sinaliza&ccedil;&atilde;o de Advert&ecirc;ncia</strong></p>\n" +
                        "<p>Tem por finalidade alertar os usu&aacute;rios da via para condi&ccedil;&otilde;es potencialmente perigosas, indicando sua natureza. A forma padr&atilde;o dos sinais de advert&ecirc;ncia &eacute; quadrada, devendo uma das diagonais ficar na posi&ccedil;&atilde;o vertical, e as cores s&atilde;o amarela e preta.</p>\n" +
                        "<p>Esteja especialmente atento &agrave;s placas de advert&ecirc;ncia que indicam as travessias de pedestres e de escolares, bem como a sinaliza&ccedil;&atilde;o indicativa de &aacute;rea escolar.</p>\n" +
                        "<p><img src=\"regulamentacaod\" width=\"300\" height=\"300\" /></p>" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Sinaliza&ccedil;&atilde;o de Indica&ccedil;&atilde;o</h4>\n" +
                        "<p>Tem por finalidade identificar as vias e os locais de interesse, bem como orientar condutores de ve&iacute;culos quanto aos percursos, destinos, dist&acirc;ncias e servi&ccedil;os auxiliares, podendo tamb&eacute;m ter como fun&ccedil;&atilde;o a educa&ccedil;&atilde;o do usu&aacute;rio. Suas mensagens possuem car&aacute;ter informativo ou educativo.</p>\n" +
                        "<p>As placas de indica&ccedil;&atilde;o est&atilde;o divididas nos seguintes grupos:</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li><strong>Placas</strong> <strong>de Identifica&ccedil;&atilde;o: </strong>posicionam o condutor ao longo do seu deslocamento ou com rela&ccedil;&atilde;o a dist&acirc;ncias, ou ainda aos locais de</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li><strong>Placas</strong> <strong>de</strong> <strong>Orienta&ccedil;&atilde;o</strong> <strong>de</strong> <strong>Destino:</strong> indicam ao condutor a dire&ccedil;&atilde;o que o mesmo deve seguir para atingir determinados lugares, orientando seu percurso e/ou dist&acirc;ncias.</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p><strong>Vejamos alguns exemplos:</strong></p>\n" +
                        "<p><img src=\"regulamentacaoe\" width=\"300\" height=\"300\" /></p>" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Assim, objetivando a consolida&ccedil;&atilde;o do conhecimento adquirido em rela&ccedil;&atilde;o &agrave; sinaliza&ccedil;&atilde;o vertical, pode-se fazer as seguintes associa&ccedil;&otilde;es:</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>a sinaliza&ccedil;&atilde;o vertical pode ser associada as cores de funcionamento do sem&aacute;foro, relacionando a cor vermelha, de parada obrigat&oacute;ria, &agrave;s placas de regulamenta&ccedil;&atilde;o, uma vez que devem ser obedecidas, a fim de n&atilde;o gerar qualquer infra&ccedil;&atilde;o;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>a sinaliza&ccedil;&atilde;o vertical de advert&ecirc;ncia pode ser associada a cor amarela, caso em que a aten&ccedil;&atilde;o precisa ser redobrada;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>a sinaliza&ccedil;&atilde;o vertical de indica&ccedil;&atilde;o &eacute; associada a cor verde indicadanosem&aacute;foro,umavezquen&atilde;oexpressaobrigatoriedade de cumprimento, bem como n&atilde;o gera necessidade de aten&ccedil;&atilde;o. Apenas mostra ao condutor informa&ccedil;&otilde;es &uacute;teis no percurso que est&aacute; seguindo.</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>",
                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Legislação de Trânsito");
        toolbarprincipal.setSubtitle("Sinalização Vertical");
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
