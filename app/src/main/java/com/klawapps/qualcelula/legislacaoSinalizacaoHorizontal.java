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


public class legislacaoSinalizacaoHorizontal extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legislacao_sinalizacao_horizontal);

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
        htmlTextView.setHtml("<h2>Sinaliza&ccedil;&atilde;o Horizontal</h2>\n" +
                        "<p>De acordo com a resolu&ccedil;&atilde;o do Contran no 160/04, a sinaliza&ccedil;&atilde;o horizontal &eacute; um subsistema da sinaliza&ccedil;&atilde;o vi&aacute;ria que se utiliza de linhas, marca&ccedil;&otilde;es, s&iacute;mbolos e legendas, pintados ou apostos sobre o pavimento das vias. Em casos espec&iacute;ficos, tem poder de regulamenta&ccedil;&atilde;o, o que significa que, em caso de desobedi&ecirc;ncia, uma penalidade pode ser gerada.</p>\n" +
                        "<p><strong>Tem como fun&ccedil;&atilde;o:</strong></p>\n" +
                        "<ol>\n" +
                        "<li>Organizar o fluxo de ve&iacute;culos e pedestres;</li>\n" +
                        "<li>Controlar e orientar os deslocamentos em situa&ccedil;&otilde;es com problemas de geometria, topografia ou frente a obst&aacute;culos;</li>\n" +
                        "<li>Complementar os sinais verticais de regulamenta&ccedil;&atilde;o, advert&ecirc;ncia ou indica&ccedil;&atilde;o.</li>\n" +
                        "</ol>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p><strong>A sinaliza&ccedil;&atilde;o horizontal &eacute; classificada em:</strong></p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li><strong>Marcas Longitudinais - </strong>separam e ordenam as correntes de tr&aacute;fego, definindo a parte da pista destinada normalmente &agrave; circula&ccedil;&atilde;o de ve&iacute;culos, a sua divis&atilde;o em faixas, a separa&ccedil;&atilde;o de fluxos opostos, faixas de uso exclusivo de um tipo de ve&iacute;culo, revers&iacute;veis, al&eacute;m de estabelecer as regras de ultrapassagem e transposi&ccedil;&atilde;o.</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li><strong>Marcas Transversais - </strong>ordenam os deslocamentos frontais dos ve&iacute;culos e os harmonizam com os deslocamentos de outros ve&iacute;culos e dos pedestres, assim como informam os condutores sobre a necessidade de reduzir a velocidade e indicam travessia de pedestres e posi&ccedil;&otilde;es de</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li><strong>Marcas de Canaliza&ccedil;&atilde;o - </strong>orientam os fluxos de tr&aacute;fego em uma via, direcionando a circula&ccedil;&atilde;o de ve&iacute;culos. Regulamentam as &aacute;reas de pavimento n&atilde;o utiliz&aacute;veis.</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li><strong>Marcas</strong> <strong>de delimita&ccedil;&atilde;o econtrole de estacionamento e/ou parada - </strong>delimitam e propiciam melhor controle das &aacute;reas onde &eacute; proibido ou regulamentado o estacionamento e a parada de ve&iacute;culos, quando associadas &agrave; sinaliza&ccedil;&atilde;o vertical de regulamenta&ccedil;&atilde;o. Em casos espec&iacute;ficos, t&ecirc;m poder de regulamenta&ccedil;&atilde;o.</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li><strong>Inscri&ccedil;&otilde;es no pavimento - </strong>melhoram a percep&ccedil;&atilde;o do condutor quanto &agrave;s condi&ccedil;&otilde;es de opera&ccedil;&atilde;o da via, permitindo-lhe tomar decis&otilde;es adequadas, em tempo apropriado, para as situa&ccedil;&otilde;es que se lhe apresentarem.</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Dispositivos Auxiliares</h4>\n" +
                        "<p>Dispositivos Auxiliares s&atilde;o elementos aplicados ao pavimento da via, junto a essa ou nos obst&aacute;culos pr&oacute;ximos, de forma a tornar mais eficiente e segura a opera&ccedil;&atilde;o da via. S&atilde;o constitu&iacute;dos de materiais, formas e cores diversos, dotados ou n&atilde;o de refletividade, com as fun&ccedil;&otilde;es de:</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Incrementar a percep&ccedil;&atilde;o da sinaliza&ccedil;&atilde;o, do alinhamento da via ou de obst&aacute;culos &agrave; circula&ccedil;&atilde;o;</li>\n" +
                        "<li>Reduzir a velocidade praticada;</li>\n" +
                        "<li>Oferecer prote&ccedil;&atilde;o aos usu&aacute;rios;</li>\n" +
                        "<li>Alertar os condutores quanto a situa&ccedil;&otilde;es de perigo potencial ou que requeiram maior aten&ccedil;&atilde;o.</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Os dispositivos auxiliares s&atilde;o agrupados, de acordo com suas fun&ccedil;&otilde;es, em:</p>\n" +
                        "<ul>\n" +
                        "<li>Dispositivos Delimitadores;</li>\n" +
                        "<li>Dispositivos de Canaliza&ccedil;&atilde;o;</li>\n" +
                        "<li>Dispositivos de Sinaliza&ccedil;&atilde;o de Alerta;</li>\n" +
                        "<li>Altera&ccedil;&otilde;es nas Caracter&iacute;sticas do Pavimento;</li>\n" +
                        "<li>Dispositivos de Prote&ccedil;&atilde;o Cont&iacute;nua;</li>\n" +
                        "<li>Dispositivos Luminosos;</li>\n" +
                        "<li>Dispositivos de Prote&ccedil;&atilde;o a &Aacute;reas de Pedestres e/ou Ciclistas;</li>\n" +
                        "<li>Dispositivos de Uso Tempor&aacute;rio.</li>\n" +
                        "</ul>\n" +
                        "<p><strong> Vejamos alguns exemplos:</strong></p>\n" +
                        "<p><img src=\"regulamentacaohorizontal\" width=\"300\" height=\"300\" /></p>" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Sinaliza&ccedil;&atilde;o Semaf&oacute;rica</h4>\n" +
                        "<p>A sinaliza&ccedil;&atilde;o semaf&oacute;rica &eacute; um subsistema da sinaliza&ccedil;&atilde;o vi&aacute;ria que se comp&otilde;e de indica&ccedil;&otilde;es luminosas acionadas alternada ou intermitentemente por meio de sistema el&eacute;trico/eletr&ocirc;nico, cuja fun&ccedil;&atilde;o &eacute; controlar os deslocamentos e organizar o tr&acirc;nsito.</p>\n" +
                        "<p><strong>Existem dois grupos:</strong></p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li><strong>Sinaliza&ccedil;&atilde;o</strong> <strong>Semaf&oacute;rica</strong> <strong>de Regulamenta&ccedil;&atilde;o - </strong>tem a fun&ccedil;&atilde;o de efetuar o controle do tr&acirc;nsito num cruzamento ou se&ccedil;&atilde;o de via, por meio de indica&ccedil;&otilde;es luminosas, alternando o direito de passagem dos v&aacute;rios fluxos de ve&iacute;culos e/ou pedestres;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li><strong>Sinaliza&ccedil;&atilde;o Semaf&oacute;rica de Advert&ecirc;ncia - </strong>tem a fun&ccedil;&atilde;o de advertir a exist&ecirc;ncia de obst&aacute;culos ou situa&ccedil;&otilde;es perigosas, devendo o condutor reduzir a velocidade e adotar as medidas de precau&ccedil;&atilde;o compat&iacute;veis com a seguran&ccedil;a para seguir.</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Sinaliza&ccedil;&atilde;o de Obras</h4>\n" +
                        "<p>A sinaliza&ccedil;&atilde;o de obras tem como caracter&iacute;stica a utiliza&ccedil;&atilde;o dos sinais e elementos de sinaliza&ccedil;&otilde;es vertical, horizontal, semaf&oacute;rica e de dispositivos de sinaliza&ccedil;&atilde;o auxiliares combinados, de forma que:</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Os usu&aacute;rios da via sejam advertidos sobre a interven&ccedil;&atilde;o realizada e possam identificar seu car&aacute;ter tempor&aacute;rio;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Sejam preservadas as condi&ccedil;&otilde;es de seguran&ccedil;a e fluidez do tr&acirc;nsito e de acessibilidade;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Os usu&aacute;rios sejam orientados sobre caminhos alternativos;</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<ul>\n" +
                        "<li>Sejam isoladas as &aacute;reas de trabalho, de forma a evitar a deposi&ccedil;&atilde;o e/ou lan&ccedil;amento de materiais sobre a via</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Na sinaliza&ccedil;&atilde;o de obras, os elementos que comp&otilde;em a sinaliza&ccedil;&atilde;o vertical de regulamenta&ccedil;&atilde;o, a sinaliza&ccedil;&atilde;o horizontal e a sinaliza&ccedil;&atilde;o semaf&oacute;rica t&ecirc;m suas caracter&iacute;sticas preservadas. A sinaliza&ccedil;&atilde;o vertical de advert&ecirc;ncia e as placas de orienta&ccedil;&atilde;o de destino adquirem caracter&iacute;sticas pr&oacute;prias de cor, sendo adotadas as combina&ccedil;&otilde;es das cores laranja e preta. Entretanto, mant&ecirc;m as caracter&iacute;sticas de forma, dimens&otilde;es, s&iacute;mbolos e padr&otilde;es alfanum&eacute;ricos.</p>\n" +
                        "<p>&nbsp;</p>",
                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Legislação de Trânsito");
        toolbarprincipal.setSubtitle("Sinalização Horizontal");
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
