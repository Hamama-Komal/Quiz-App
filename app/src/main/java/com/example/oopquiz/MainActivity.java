package com.example.oopquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Toast;

import com.example.oopquiz.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.encapsulation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Key","Encapsulation");
                startActivity(intent);
            }
        });

         binding.abstraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Key","Abstraction");
                startActivity(intent);
            }
        });

         binding.polymorphism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Key","Polymorphism");
                startActivity(intent);
            }
        });

         binding.inheritance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Key","Inheritance");
                startActivity(intent);
            }
        });

         binding.search.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 binding.search.getText();
                 Toast.makeText(MainActivity.this, "Result not found", Toast.LENGTH_SHORT).show();
             }
         });



    }
}