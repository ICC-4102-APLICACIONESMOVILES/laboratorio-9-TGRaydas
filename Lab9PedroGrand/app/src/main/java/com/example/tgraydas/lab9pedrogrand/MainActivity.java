package com.example.tgraydas.lab9pedrogrand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webView);
        WebViewClient webViewClient = new WebViewClient();
        webView.setWebViewClient(webViewClient);
        webView.getSettings().setJavaScriptEnabled(true);
        //webView.loadUrl("http://demo.tutorialzine.com/2012/04/mobile-touch-gallery/");
        webView.loadUrl("https://google.com");

        WebAppInterface webAppInterface = new WebAppInterface(this);
        webView.addJavascriptInterface(webAppInterface, "Android");
        webAppInterface.onConsoleMessage("Hello World!");
    }

    @Override
    public void onBackPressed() {
        Log.d("Lab8PedroGrand", "Back Pressed");
        if (webView.canGoBack()){
            webView.goBack();
        }
    }
}
