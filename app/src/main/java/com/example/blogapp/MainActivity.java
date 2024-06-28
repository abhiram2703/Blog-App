package com.example.blogapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    AppCompatButton bt1,bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        SharedPreferences preferance=getSharedPreferences("login",MODE_PRIVATE);
        String username=preferance.getString("user",null);
        if (username!=null)
        {
            Intent in=new Intent(getApplicationContext(), Menu.class);
            startActivity(in);
        }
        ed1=(EditText) findViewById(R.id.unameet);
        ed2=(EditText) findViewById(R.id.passet);
        bt1=(AppCompatButton) findViewById(R.id.sinbtn);
        bt2=(AppCompatButton) findViewById(R.id.supbtn);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUname =ed1.getText().toString();
                String getPass =ed2.getText().toString();
                if(getUname.equals("user")&&getPass.equals("1234"))
                {
                    SharedPreferences preferance=getSharedPreferences("login",MODE_PRIVATE);
                    SharedPreferences.Editor editor= preferance.edit();
                    editor.putString("user","admin");
                    editor.apply();
                    Intent in=new Intent(getApplicationContext(), Menu.class);
                    startActivity(in);
                }
                else
                    Toast.makeText(getApplicationContext(),"Invalid Username or Password",Toast.LENGTH_LONG).show();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(getApplicationContext(), SignUp.class);
                startActivity(in2);
            }
        });

    }
}