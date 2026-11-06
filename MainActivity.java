package com.example.airtelpostpaid;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
public class MainActivity extends Activity {
 @Override public void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  WebView web = new WebView(this);
  WebSettings settings = web.getSettings();
  settings.setJavaScriptEnabled(true);
  settings.setDomStorageEnabled(true);
  web.setWebViewClient(new WebViewClient());
  setContentView(web);
  web.loadUrl("file:///android_asset/index.html");
 }
 @Override public void onBackPressed() { setContentView(android.R.id.content); super.onBackPressed(); }
}