package com.klawapps.qualcelula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;


public class mainLegislacao extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private CardView card1;
    private CardView card2;
    private CardView card3;
    private CardView card4;
    private CardView card5;
    private CardView card6;
    private CardView card7;
    private CardView card8;
    private Toolbar toolbarprincipal;
    static int adsCount;
    //static int maxAdsCount = 20000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_legislacao);

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


        AdView AdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        AdView.loadAd(adRequest);


        card1 = (CardView) findViewById(R.id.card1);
        card2 = (CardView) findViewById(R.id.card2);
        card3 = (CardView) findViewById(R.id.card3);
        card4 = (CardView) findViewById(R.id.card4);
        card5 = (CardView) findViewById(R.id.card5);
        card6 = (CardView) findViewById(R.id.card6);
        card7 = (CardView) findViewById(R.id.card7);
        card8 = (CardView) findViewById(R.id.card8);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mainLegislacao.this,legislacaoCodigoDeTransito.class));
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mainLegislacao.this,legislacaoSinalizacaoVertical.class));
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mainLegislacao.this,legislacaoSinalizacaoHorizontal.class));
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mainLegislacao.this,legislacaoGestos.class));
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mainLegislacao.this,legislacaoCrimes.class));
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mainLegislacao.this,legislacaoDiretoseDeveres.class));
            }
        });

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mainLegislacao.this,legislacaoNormasCirculacao.class));
            }
        });

        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mainLegislacao.this,legislacaoPenalidades.class));
            }
        });








        setSupportActionBar(toolbarprincipal);
        getSupportActionBar().setTitle("Legislação de trânsito");

    }



    public void mostraAd(){
        if (mInterstitialAd.isLoaded()) {

            mInterstitialAd.show();
        }
    }

}
