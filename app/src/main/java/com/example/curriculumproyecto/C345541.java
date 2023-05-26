package com.example.curriculumproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class C345541 extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c345541);

        webView = (WebView)  findViewById(R.id.webViewCA);

        webView.loadUrl("https://emberbuhaj.github.io");
    }
}