package com.example.alc40phase1;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {
    private WebView wv1;
    String url = "https://www.facebook.com";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_alc);

        wv1 = (WebView)findViewById(R.id.webview);
        wv1.setWebViewClient(new MyBrowser());

    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    //WebView browser = (WebView) findViewById(R.id.webview);
}
//    private WebView mWebview ;
//    String link = "";// global variable
//    Resources res;// global variable
//    @Override
//
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        setContentView(R.layout.activity_modernherbal_main);
//        mWebview  = (WebView) findViewById(R.id.help_webview);
//        WebSettings webSettings = mWebview.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        webSettings.setUseWideViewPort(true);
//        webSettings.setLoadWithOverviewMode(true);
//
//
//
//        final Activity activity = this;
//
//        mWebview.setWebViewClient(new WebViewClient() {
//            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
//                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
//            }
//
//
//        });
//
//        mWebview .loadUrl("http://www.example.com");
//
//    }
//
