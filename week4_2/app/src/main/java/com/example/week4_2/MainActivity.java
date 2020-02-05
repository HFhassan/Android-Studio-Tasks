package com.example.week4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.NumberPicker;
import android.view.View;

import static android.webkit.WebView.*;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    NumberPicker possibilities;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        possibilities = (NumberPicker) findViewById(R.id.numpick);
        webView = (WebView) findViewById(R.id.webView_1);
        String[] posssibiliteis_strings = {
                "Android",
                "CheckList",
                "Coursera",
                "Karachi"
        };

        possibilities.setDisplayedValues(posssibiliteis_strings);
        possibilities.setMinValue(0);
        possibilities.setMaxValue(3);
        possibilities.setMaxValue(posssibiliteis_strings.length - 1);
    }
    public void navigate(View v)
        {
            int choices = possibilities.getValue();
            if(choices == 0) {
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("file:///android_asset/android.html");
            }
            else if (choices==1) {
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("file:///android_asset/check.html");
            }
            else if (choices == 2) {
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("http://www.coursera.com");
            }else if (choices == 3)
            {
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("http://www.facebook.com");
            }


        }
    }

