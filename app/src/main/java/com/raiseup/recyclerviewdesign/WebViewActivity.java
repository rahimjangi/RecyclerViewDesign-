package com.raiseup.recyclerviewdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        Log.d("message","onCreate()");

        webView= findViewById(R.id.webView);
//        webView.setWebViewClient( new WebViewClient());
        webView.loadUrl("https://www.google.com/");
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else{
            super.onBackPressed();
        }
    }

    @Override
    protected void onStart() {
        Log.d("message","onStart()");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d("message","onStop()");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("message","onDestroy()");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d("message","onPause()");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d("message","onResume()");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.d("message","onRestart()");
        super.onRestart();
    }
}