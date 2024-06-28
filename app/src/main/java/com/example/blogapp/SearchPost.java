package com.example.blogapp;

import android.content.Intent;
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

public class SearchPost extends AppCompatActivity {
    EditText ed1;
    AppCompatButton bt1,bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search_post);
        ed1=(EditText) findViewById(R.id.sptet);
        bt1=(AppCompatButton) findViewById(R.id.serbtn);
        bt2=(AppCompatButton) findViewById(R.id.serbtmbtn);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getTitle=ed1.getText().toString();
                Toast.makeText(getApplicationContext(),"Blog with title "+getTitle+" found",Toast.LENGTH_LONG).show();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(), Menu.class);
                startActivity(in);
            }
        });

    }
}