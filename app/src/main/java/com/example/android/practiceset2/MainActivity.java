package com.example.android.practiceset2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        Button button= (Button) findViewById(R.id.btnlogin);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Login clicked", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, sign_in.class);
                startActivity(intent);
            }
        });

        Button register= (Button) findViewById(R.id.btnregister);
        register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Register clicked", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,  SignUp.class);
                startActivity(intent);
            }
        });
    }


}
