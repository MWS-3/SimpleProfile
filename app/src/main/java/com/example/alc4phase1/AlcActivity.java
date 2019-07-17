package com.example.alc4phase1;

import android.annotation.SuppressLint;
import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;



public class AlcActivity extends AppCompatActivity {
    private WebView andelasite;

    @SuppressLint("SetJavaScriptEnabled")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alc);

        // Back Arrow on Action Bar.
        if (getActionBar() != null) getActionBar().setDisplayHomeAsUpEnabled(true);

        andelasite = findViewById(R.id.myWebView);
        WebSettings webSettings = andelasite.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Customize the WebView's Behaviour.
        andelasite.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
                    handler.proceed();
            }
        });

        //  Load Web Page.

        andelasite.loadUrl("https://andela.com/alc/");


    }
    @Override
    public void onBackPressed() {
        // In case we navigated deeper into the web page.
        if (andelasite.canGoBack()) {
            andelasite.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
