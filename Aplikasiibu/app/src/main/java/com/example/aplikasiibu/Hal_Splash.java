package com.example.aplikasiibu;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class Hal_Splash extends AppCompatActivity {
    public static SharedPreferences getData;
    SharedPreferences.Editor setData;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_hal_splash);
        this.setData = getSharedPreferences("data", 0).edit();
        getData = getSharedPreferences("data", 0);
        getWindow().getDecorView().setSystemUiVisibility(4);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        new Handler().postDelayed(new Runnable() {
            public void run() {
                if (Hal_Splash.getData.contains("session_nama")) {
                    Hal_Splash.this.startActivity(new Intent(Hal_Splash.this.getApplicationContext(), Halaman_utama_app.class));
                    Hal_Splash.this.finish();
                }
                if (!Hal_Splash.getData.contains("session_nama")) {
                    Hal_Splash.this.startActivity(new Intent(Hal_Splash.this.getApplicationContext(), HalamanLogin.class));
                    Hal_Splash.this.finish();
                }
            }
        }, 4000);
    }
}
