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


public class direcaoEquipamentosMotocicleta extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direcao_equipamentos_motocicleta);


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
        htmlTextView.setHtml("<h4>Equipamentos de seguran&ccedil;a do condutor motociclista</h4>\n" +
                        "<p>Os equipamentos de prote&ccedil;&atilde;o e vestimentas s&atilde;o indispens&aacute;veis para pilotar uma motocicleta e devem ser adequados para garantir o conforto e a seguran&ccedil;a do motociclista.</p>\n" +
                        "<p>D&ecirc; prefer&ecirc;ncia a cores claras e refletivas. Vermelho e amarelo s&atilde;o as cores que mais facilitam a percep&ccedil;&atilde;o de sua presen&ccedil;a. Evite comprar capacete da mesma cor que a moto, pois a diferen&ccedil;a de cores ajuda na visualiza&ccedil;&atilde;o do conjunto moto e motociclista.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Capacete</h4>\n" +
                        "<p>Conforme a resolu&ccedil;&atilde;o no 203 de setembro de 2006 - Contran, o uso do capacete, obrigat&oacute;rio por lei, &eacute; considerado pela maior parte dos motociclistas como o principal equipamento de prote&ccedil;&atilde;o. Na maioria dos acidentes fatais, o capacete estava ausente ou malcolocado.</p>\n" +
                        "<h5>LEMBRE-SE</h5>\n" +
                        "<p><em>O capacete &eacute; um produto perec&iacute;vel e com vida &uacute;til limitada. Os capacetes que atendem &agrave;s normas brasileiras possuem um selo de qualidade do Inmetro, que cont&eacute;m a data de sua fabrica&ccedil;&atilde;o.</em></p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>A observ&acirc;ncia do selo do Inmetro, que atesta a qualidade do capacete, &eacute; ponto primordial na escolha desse item de seguran&ccedil;a. Evite a compra de capacetes com o selo adulterado.</p>\n" +
                        "<p>De acordo com alguns fabricantes, enquanto o capacete n&atilde;o &eacute; vendido, ele n&atilde;o se deteriora. O desgaste do capacete depender&aacute; do n&uacute;mero de horas e dias de uso, al&eacute;m dos cuidados do usu&aacute;rio na sua conserva&ccedil;&atilde;o. Portanto, o capacete n&atilde;o tem data de validade fixa. O julgamento para identificar se ele est&aacute; ou n&atilde;o em condi&ccedil;&otilde;es de uso vai depender da avalia&ccedil;&atilde;o do agente de tr&acirc;nsito. Quando um capacete sofre impacto, deve ser substitu&iacute;do, pois n&atilde;o &eacute; poss&iacute;vel avaliar os danos em sua estrutura. Al&eacute;m disso, as al&ccedil;as devem estar bem fixadas. Um capacete malcolocado, certamente, vai voar longe em caso de acidente. O mais indicado &eacute; deixar uma folga de no m&aacute;ximo um dedo indicador entre a jugular (cinta que prende o capacete na cabe&ccedil;a) e o pesco&ccedil;o do motociclista.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>&Eacute; recomend&aacute;vel escolher um capacete de cor clara, bem ajustado e confort&aacute;vel &agrave; cabe&ccedil;a. Tamb&eacute;m &eacute; preciso manter a cinta jugular bem justa e presa para que o capacete n&atilde;o saia da cabe&ccedil;a, e a viseira deve estar fechada. Um tamanho adequado permite que o capacete n&atilde;o se mova com o vento e, sendo leve, n&atilde;o incomodar&aacute; mesmo em uso prolongado. Se voc&ecirc; escolher um capacete aberto, &eacute; obrigat&oacute;rio o uso dos &oacute;culos de prote&ccedil;&atilde;o.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Luvas</h4>\n" +
                        "<p>Ao escolher as luvas, devemos selecionar aquelas que menos interferem na sensibilidade dos dedos e das m&atilde;os. As luvas de &ldquo;meio-dedo&rdquo; s&atilde;o inadequadas, pois n&atilde;o protegem completamente as m&atilde;os. No per&iacute;odo de frio podem ser usadas luvas acolchoadas, desde que n&atilde;o prejudiquem a sensibilidade dos dedos; devem ter refor&ccedil;o palmar para maior prote&ccedil;&atilde;o e, se poss&iacute;vel, confeccionadas em couro.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Cal&ccedil;ados</h4>\n" +
                        "<p>As botas devem ser pelo menos de &ldquo;meio- cano&rdquo;, com protetores de canela e de &ldquo;peito de p&eacute;&rdquo;. O ideal &eacute; utilizar botas de cano alto para a prote&ccedil;&atilde;o dos tornozelos, diminuindo as les&otilde;es nessa parte do corpo em caso de acidente. Elas devem ser bem cal&ccedil;adas e o ideal &eacute; que n&atilde;o tenham cadar&ccedil;os; caso os tenham, necessitam ser bem amarrados. Se poss&iacute;vel, as botas devem tamb&eacute;m possuir um pequeno salto, de maneira que se ajustem &agrave;s pedaleiras.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Vestimentas</h4>\n" +
                        "<p>Para as jaquetas, prefira as de cores claras e vivas, fabricadas com tecido resistente ou couro e bem ajustadas ao corpo, sem impedir os movimentos dos bra&ccedil;os. As cal&ccedil;as devem ser de tecido resistente, bem ajustadas ao corpo e sem partes soltas que possam se prender na motocicleta. Em situa&ccedil;&otilde;es de chuva, utilize um conjunto apropriado, que deve ser de tamanho adequado para n&atilde;o causar desconforto e n&atilde;o limitar os movimentos. D&ecirc; prefer&ecirc;ncia &agrave;s cores mais claras ou chamativas. Existem capas de chuva de cor vermelha, que permitem visibilidade a partir de grandes dist&acirc;ncias. Evite as capas pretas e procure as que t&ecirc;m partes refletivas.</p>",
                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Direção defensiva");
        toolbarprincipal.setSubtitle("Equipamento de segurança do motociclista");
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
