package com.example.uts_mobile_programming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {
    private Button btnBack;
    private Button btnSegitiga;
    private Button btnPersegi;
    private Button btnKubus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        btnBack = findViewById(R.id.btnBack);
        btnSegitiga = findViewById(R.id.btnSegitiga);
        btnPersegi = findViewById(R.id.btnPersegi);
        btnKubus = findViewById(R.id.btnKubus);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(menu.this, MainActivity.class);
                startActivity(back);
            }
        });

        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent persegi= new Intent(menu.this, lkpersegi.class);
                startActivity(persegi);
            }
        });

        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent segitiga= new Intent(menu.this, lksegitiga.class);
                startActivity(segitiga);
            }
        });

        btnKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kubus= new Intent(menu.this, vkubus.class);
                startActivity(kubus);
            }
        });
    }

}
