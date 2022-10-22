/*
package com.unisob.vclibs.activties;
import static com.unisob.vclibs.mads.AppManage.app_privacyPolicyLink;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.unisob.vclibs.R;
public class PravacyPolicyActivity extends AppCompatActivity {

    CheckBox c1, c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pravcy_policy);

        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        final SharedPreferences.Editor myEdit = sharedPreferences.edit();
        final CardView spinKitView = findViewById(R.id.spin_kit);

        c1 = findViewById(R.id.checkBoxss);
        c2 = findViewById(R.id.checkBox1);

        spinKitView.setVisibility(View.VISIBLE);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                spinKitView.setVisibility(View.GONE);
            }
        }, 1000);

        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        window.addFlags(WindowManager.LayoutParams.FLAGS_CHANGED);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setStatusBarColor(getResources().getColor(R.color.white));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.VISIBLE);//  set status text dark
        }

        WebView browser = (WebView) findViewById(R.id.webview);
        browser.setBackgroundColor(Color.TRANSPARENT);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView view, String url) {
                view.loadUrl(
                        "javascript:document.body.style.setProperty(\"color\", \"black\");"
                );
            }
        });
        browser.loadUrl(app_privacyPolicyLink);

        findViewById(R.id.deaccept_terms_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });

        findViewById(R.id.accept_terms_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (*/
/*!c1.isChecked() ||*//*
 !c2.isChecked()) {
                    Toast.makeText(PravacyPolicyActivity.this, "Please Agree Terms and policy", Toast.LENGTH_SHORT).show();
                } else {
                    myEdit.putBoolean("accept_terms_btn", true);
                    myEdit.apply();

                    Intent intent = null;
                    try {
                        intent = new Intent(PravacyPolicyActivity.this,
                                Class.forName("com.iosnotch.dynamicassistant.assistivetouchscreenrecorder.homebutton.MainActivity"));
                        startActivity(intent);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    finish();
                }
            }
        });
    }
}*/
