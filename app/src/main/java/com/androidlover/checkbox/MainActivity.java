package com.androidlover.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1=(CheckBox)findViewById(R.id.cb1);
        checkBox2=(CheckBox)findViewById(R.id.cb2);
        checkBox3=(CheckBox)findViewById(R.id.cb3);
        checkBox4=(CheckBox)findViewById(R.id.cb4);
        checkBox5=(CheckBox)findViewById(R.id.cb5);
        checkBox6=(CheckBox)findViewById(R.id.cb6);
        checkBox7=(CheckBox)findViewById(R.id.cb7);

        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Sunday",Toast.LENGTH_SHORT).show();
            }
        });

        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Monday",Toast.LENGTH_SHORT).show();
            }
        });

        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Tuesday",Toast.LENGTH_SHORT).show();
            }
        });

        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Wednesday",Toast.LENGTH_SHORT).show();
            }
        });

        checkBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Thursday",Toast.LENGTH_SHORT).show();
            }
        });

        checkBox6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Friday",Toast.LENGTH_SHORT).show();
            }
        });

        checkBox7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Saturday",Toast.LENGTH_SHORT).show();
            }
        });






    }
}