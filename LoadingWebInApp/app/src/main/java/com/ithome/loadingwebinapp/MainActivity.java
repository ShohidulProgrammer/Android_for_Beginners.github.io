package com.ithome.loadingwebinapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webViewId);

        //javascript enableing
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //set internal browsing
        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("http://www.lus.ac.bd/");

    }

    //go previous page
    public void onBackPressed()
    {
        if(webView.canGoBack())
        {
            webView.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
