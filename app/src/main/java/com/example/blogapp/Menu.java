package com.example.blogapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu extends AppCompatActivity {
    AppCompatButton bt1,bt2,bt3,bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        bt1=(AppCompatButton) findViewById(R.id.addmubtn);
        bt2=(AppCompatButton) findViewById(R.id.sermubtn);
        bt3=(AppCompatButton) findViewById(R.id.delmubtn);
        bt4=(AppCompatButton) findViewById(R.id.loutmubtn);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(getApplicationContext(), AddPost.class);
                startActivity(in1);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(getApplicationContext(), SearchPost.class);
                startActivity(in2);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3=new Intent(getApplicationContext(), DeletePost.class);
                startActivity(in3);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferance=getSharedPreferences("login",MODE_PRIVATE);
                SharedPreferences.Editor editor= preferance.edit();
                editor.clear();
                editor.apply();
                Intent in4=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(in4);

            }
        });


    }
}