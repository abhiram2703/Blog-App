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

public class AddPost extends AppCompatActivity {
    EditText ed1,ed2;
    AppCompatButton bt1,bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_post);
        ed1=(EditText) findViewById(R.id.aptet);
        ed2=(EditText) findViewById(R.id.apdet);
        bt1=(AppCompatButton) findViewById(R.id.addbtn);
        bt2=(AppCompatButton) findViewById(R.id.addbtmbtn);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getTitle=ed1.getText().toString();
                String getDes=ed2.getText().toString();
                Toast.makeText(getApplicationContext(),"Blog with title "+getTitle+" added",Toast.LENGTH_LONG).show();
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