package com.example.android.practiceset2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen);
        getSupportActionBar().hide();

        Thread thread = new Thread() {
            public void run() {
                try {
                 sleep(2000);
                }
                catch (Exception e) {
e.printStackTrace();
                }
                finally {
                    Intent intent= new Intent(splashscreen.this, MainActivity.class);
                    startActivity(intent);
                }

            }
        };  thread.start();
    }
}