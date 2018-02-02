package com.soucriador.jobfinder.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.soucriador.jobfinder.BuildConfig;
import com.soucriador.jobfinder.R;

public class RequestInviteActivity extends AppCompatActivity {

    AdView mAdView;
    Button btSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_invite);

        setTitle(R.string.request_invite);
        createAd();
    }

    void createAd(){
        MobileAds.initialize(this, BuildConfig.ad_id);

        // encontra o espaco do anuncio no layout
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
