package com.klawapps.qualcelula;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;


public class MainActivity extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private CardView cardLegislacao;
    private CardView cardPrimeirosSocorros;
    private CardView cardFuncionamentoVeiculo;
    private CardView cardMeioAmbiente;
    private CardView cardPlacas;
    private CardView cardDirecaoDefensiva;
    private Toolbar toolbarprincipal;
    static int adsCount;
    static int maxAdsCount = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbarprincipal = (Toolbar) findViewById(R.id.toolbarLayout);

       // MainActivity.adsCount++;
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



        final SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);


      if(!prefs.contains("firsttimerd")){

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(Html.fromHtml("<h1 style=\"text-align: center;\">Bem vindo ao Revisa Detran!</h1>\n" +
                    "<p>Aten&ccedil;&atilde;o!</p>\n" +
                    "<p>Todo o conte&uacute;do foi retirado do seguinte link:</p>\n" +
                    "<p><em><a href=\"http://www2.senado.leg.br/bdsf/item/id/243066\">http://www2.senado.leg.br/bdsf/item/id/243066</a></em></p>\n" +
                    "<p><em>Licenciado sob a Licen&ccedil;a Creative Commons</em></p>\n" +
                    "<p><strong>Boa revis&atilde;o!</strong></p>\n" +
                    "<p style=\"text-align: center;\">Feito com<strong>&nbsp;<span style=\"color: #ff0000;\">&hearts;&nbsp;</span></strong><span style=\"color: #ff0000;\"><span style=\"color: #000000;\">por <strong>KlawApps</strong></span></span></p>"));

            builder.setNegativeButton("OK!", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    // User cancelled the dialog
                }
            });


            AlertDialog alert = builder.create();
            alert.show();

           /* final AlertDialog.Builder builder = new AlertDialog.Builder(telaprincipal.this);
            builder.setMessage("Obrigado pelos 50.000 downloads! \n\n Novidades em breve!");

            AlertDialog alertDialog = builder.create();
            alertDialog.show();*/


            //Other dialog code


            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean("firsttimerd",true);
            editor.commit();
            //more code....

        }




        AdView AdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        AdView.loadAd(adRequest);

        cardLegislacao = (CardView) findViewById(R.id.legislacaoid);
        cardDirecaoDefensiva = (CardView) findViewById(R.id.direcaodefensivaid);
        cardFuncionamentoVeiculo = (CardView) findViewById(R.id.funcionamentodoveiculoid);
        cardMeioAmbiente = (CardView) findViewById(R.id.meioambienteid);
        cardPlacas = (CardView) findViewById(R.id.placasid);
        cardPrimeirosSocorros = (CardView) findViewById(R.id.primeirossocorrosid);


        cardLegislacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,mainLegislacao.class));
            }
        });

        cardDirecaoDefensiva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,mainDirecao.class));
            }
        });

        cardFuncionamentoVeiculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,mainFuncionamentoVeiculo.class));
            }
        });

        cardMeioAmbiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,mainMeioAmbiente.class));
            }
        });

        cardPlacas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,mainPlacas.class));
            }
        });

        cardPrimeirosSocorros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,mainSocorros.class));
            }
        });







        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Revisa Detran");

    }



public void mostraAd(){
    if (mInterstitialAd.isLoaded()) {

        mInterstitialAd.show();
    }
}

}
