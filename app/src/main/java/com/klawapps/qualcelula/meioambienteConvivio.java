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


public class meioambienteConvivio extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private Toolbar toolbarprincipal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meioambiente_convivio);


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
        htmlTextView.setHtml("<h4>No&ccedil;&otilde;es de Conv&iacute;vio Social no Tr&acirc;nsito</h4>\n" +
                        "<p>O processo de intera&ccedil;&atilde;o &eacute; complexo e ocorre permanentemente entre as pessoas. Um olhar, um sorriso, um gesto, uma postura corporal s&atilde;o algumas formas de intera&ccedil;&atilde;o. Al&eacute;m disso, &eacute; importante entender seu papel na sociedade e quais s&atilde;o os seus direitos como cidad&atilde;o. Agora vamos compreender a import&acirc;ncia de interagir com outras pessoas e conhecer o papel de cada indiv&iacute;duo no conv&iacute;vio em grupo.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Relacionamento interpessoal Conceitos b&aacute;sicos</h4>\n" +
                        "<p>Para entender o conceito de Rela&ccedil;&otilde;es Humanas, &eacute; necess&aacute;rio definir o termo personalidade.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p><strong><em>Personalidade </em></strong><em>&eacute; o conjunto total de caracter&iacute;sticas que torna o indiv&iacute;duo </em><em>&uacute;nico e diferente dos outros, sendo pass&iacute;vel de mudan&ccedil;as.</em></p>\n" +
                        "<p>Os diferentes grupos sociais dos quais a pessoa faz parte podem ter influ&ecirc;ncia na sua personalidade, da mesma forma como a personalidade de cada pessoa tem influ&ecirc;ncia dentro dos grupos sociais. A base para boas rela&ccedil;&otilde;es interpessoais &eacute; compreender que cada pessoa tem uma personalidade pr&oacute;pria, que precisa ser respeitada e que traz consigo, em todas as situa&ccedil;&otilde;es, necessidades sociais, materiais e psicol&oacute;gicas que precisa satisfazer, influenciando o seu comportamento.</p>\n" +
                        "<p><strong><em>&nbsp;</em></strong></p>\n" +
                        "<p><em>Assim, podemos conceituar </em><strong><em>Rela&ccedil;&otilde;es Humanas </em></strong><em>como:</em></p>\n" +
                        "<p><em>Uma disposi&ccedil;&atilde;o interior, uma&nbsp; aceita&ccedil;&atilde;o&nbsp; do&nbsp; outro,&nbsp; que&nbsp; transparece no modo de falar, de olhar, na postura e, sobretudo, na forma de agir adequada. &Eacute; a t&eacute;cnica de conviv&ecirc;ncia.</em></p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h3>As diferen&ccedil;as individuais</h3>\n" +
                        "<p>As diferen&ccedil;as individuais s&atilde;o &ldquo;as v&aacute;rias formas em que os indiv&iacute;duos se distinguem uns dos outros, seja nos aspectos f&iacute;sicos, ps&iacute;quicos, intelectuais, emocionais ou sociais.&rdquo;&nbsp;&nbsp;&Eacute; poss&iacute;vel distinguir diferentes aspectos na conduta de qualquer indiv&iacute;duo. O seu comportamento total que &eacute; considerado como personalidade.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h3>Fatores que determinam a personalidade</h3>\n" +
                        "<p>A personalidade &eacute; o conjunto dos processos psicol&oacute;gicos do indiv&iacute;duo, que lhe permitem condutas pr&oacute;prias. A personalidade &eacute; constru&iacute;da a partir de aspectos inatos e adquiridos.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>a)&nbsp; Inatos</h4>\n" +
                        "<p><strong>&nbsp;</strong></p>\n" +
                        "<ul>\n" +
                        "<li><strong>Caracteres f&iacute;sicos</strong>: fatores como ra&ccedil;a, sexo, cor, altura</li>\n" +
                        "<li><strong>Temperamento</strong>: tend&ecirc;ncia que faz o indiv&iacute;duo reagir de maneira</li>\n" +
                        "<li><strong>Intelig&ecirc;ncia</strong>: capacidade dos indiv&iacute;duos para enfrentar certas situa&ccedil;&otilde;es ou executar certas</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>b)&nbsp; Adquiridos</h4>\n" +
                        "<p><strong>&nbsp;</strong></p>\n" +
                        "<ul>\n" +
                        "<li><strong>Car&aacute;ter</strong>: aspecto da personalidade respons&aacute;vel pela forma habitual e constante de agir, peculiar a cada indiv&iacute;duo; &eacute; um conjunto de tra&ccedil;os particulares de cada</li>\n" +
                        "<li><strong>Cultura:</strong> s&atilde;o os costumes, as tradi&ccedil;&otilde;es, padr&otilde;es de vida, os modos de produ&ccedil;&atilde;o, os valores e as institui&ccedil;&otilde;es de um grupo</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h4>Fatores que influem no processo perceptivo</h4>\n" +
                        "<p>A percep&ccedil;&atilde;o &eacute; o processo pelo qual adquirimos conhecimento sobre o mundo externo. Alguns fatores influenciam a percep&ccedil;&atilde;o:</p>\n" +
                        "<ul>\n" +
                        "<li><strong>Seletividade perceptiva</strong> (percebemos apenas parte dos est&iacute;mulos);</li>\n" +
                        "<li><strong>Caracter&iacute;sticas pessoais</strong> (usar a si pr&oacute;prio como refer&ecirc;ncia);</li>\n" +
                        "<li><strong>Experi&ecirc;ncias passadas</strong> (anteriores);</li>\n" +
                        "<li><strong>Condicionamento</strong> (premiar ou punir por uma resposta);</li>\n" +
                        "<li><strong>Fatores contempor&acirc;neos</strong> (fatores presentes e situacionais).</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Quando uma pessoa come&ccedil;a a participar de um grupo, ela traz caracter&iacute;sticas pr&oacute;prias que s&atilde;o diferentes do restante do conjunto. A maneira como essas diferen&ccedil;as s&atilde;o encaradas pelas outras pessoas que determina o tipo de relacionamento que ocorre nesse grupo.</p>\n" +
                        "<p>Se h&aacute; respeito pela opini&atilde;o do outro, se a ideia de cada um &eacute; ouvida e discutida, estabelece-se um tipo de relacionamento de grupo diferente daquele em que n&atilde;o h&aacute; respeito pela opini&atilde;o do outro, quando ideias e sentimentos n&atilde;o s&atilde;o ouvidos ou s&atilde;o ignorados e quando n&atilde;o h&aacute; troca de informa&ccedil;&otilde;es.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<h3>As habilidades interpessoais</h3>\n" +
                        "<p><strong><em>Habilidade</em> <em>interpessoal</em></strong> <em>&eacute; a capacidade que um indiv&iacute;duo tem de relacionar- se eficazmente com outras pessoas, de forma adequada &agrave;s necessidades do outro e &agrave;s exig&ecirc;ncias da situa&ccedil;&atilde;o.</em></p>\n" +
                        "<p><em>&nbsp;</em></p>\n" +
                        "<p>As pessoas possuem diversas caracter&iacute;sticas que podem ser consideradas habilidades pessoais e que facilitam as rela&ccedil;&otilde;es, por exemplo:</p>\n" +
                        "<ul>\n" +
                        "<li>Habilidade de comunicar ideias de forma clara e precisa em situa&ccedil;&otilde;es individuais e de grupo;</li>\n" +
                        "<li>Habilidade de ouvir e compreender o que os outros dizem</li>\n" +
                        "<li>Habilidade de aceitar cr&iacute;ticas sem fortes rea&ccedil;&otilde;es emocionais defensivas (tornando-se hostil ou &ldquo;fechando-se&rdquo;);</li>\n" +
                        "<li>Habilidade de dar <em>feedback</em> aos outros de modo &uacute;til e construtivo;</li>\n" +
                        "<li>Habilidade de percep&ccedil;&atilde;o e consci&ecirc;ncia de necessidades, sentimentos e rea&ccedil;&otilde;es dos outros;</li>\n" +
                        "<li>Habilidade de reconhecer e lidar com conflitos e hostilidade dos outros;</li>\n" +
                        "<li>Habilidade de modificar um ponto de vista em fun&ccedil;&atilde;o do <em>feedback</em> dos outros e dos objetivos a alcan&ccedil;ar;</li>\n" +
                        "<li>Tend&ecirc;ncia a procurar relacionamento mais pr&oacute;ximo com as pessoas, dar e receber afeto no seu grupo de</li>\n" +
                        "</ul>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Essas habilidades precisam ser usadas tamb&eacute;m no dia a dia do tr&acirc;nsito, tornando-o mais seguro, mais humano e menos violento.</p>\n" +
                        "<p>Todos n&oacute;s possu&iacute;mos algumas habilidades que s&atilde;o mais desenvolvidas e outras que s&atilde;o menos. Mudar essa situa&ccedil;&atilde;o &eacute; dif&iacute;cil, pois exige de cada um a compreens&atilde;o dolorosa de que algumas de suas atitudes n&atilde;o s&atilde;o adequadas.</p>\n" +
                        "<p>Compet&ecirc;ncia interpessoal n&atilde;o &eacute;, portanto, um dom ou talento inato da personalidade, e sim uma capacidade que se pode desenvolver por meio de treinamento pr&oacute;prio. No entanto, &eacute; preciso conhecer melhor as pessoas para ser poss&iacute;vel a utiliza&ccedil;&atilde;o plena de nossas habilidades.</p>",
                new HtmlResImageGetter(htmlTextView));
        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Convívio social");
        toolbarprincipal.setSubtitle("Noções de convívio social no trânsito");
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
