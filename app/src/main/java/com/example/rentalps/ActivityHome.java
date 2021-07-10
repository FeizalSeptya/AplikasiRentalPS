package com.example.rentalps;

import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityHome extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000; //Waktu proses loading untuk masuk ke halaman kedua
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Menampilkan tampilan mainactivity setelah loading dari activityhome
                Intent intent = new Intent(ActivityHome.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}