package com.example.intentfilter;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.lab11.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.webview1);
        webView.setWebViewClient(new WebViewClient());

        Intent intent = getIntent();
        Uri data = intent.getData();

        if (data != null) {
            try {
                webView.loadUrl(data.toString());
            } catch (Exception e) {
                e.printStackTrace();
                // Có thể hiển thị thông báo lỗi cho người dùng
            }
        }
    }
}