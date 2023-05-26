package com.example.curriculumproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class C345618 extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c345618);
        webView = (WebView)  findViewById(R.id.webViewCE);

        webView.loadUrl("https://role13.github.io");
    }
}