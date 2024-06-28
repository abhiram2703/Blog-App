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

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText ed1,ed2,ed3,ed4;
        AppCompatButton bt1,bt2;

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        SharedPreferences preferance=getSharedPreferences("login",MODE_PRIVATE);
        String username=preferance.getString("user",null);
        if (username!=null)
        {
            Intent in=new Intent(getApplicationContext(), Menu.class);
            startActivity(in);
        }
        ed1=(EditText) findViewById(R.id.nameetsup);
        ed2=(EditText) findViewById(R.id.emailetsup);
        ed3=(EditText) findViewById(R.id.unameetsup);
        ed4=(EditText) findViewById(R.id.passetsup);
        bt1=(AppCompatButton) findViewById(R.id.supbtnsup);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUname =ed3.getText().toString();
                String getPass =ed4.getText().toString();
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

    }
}