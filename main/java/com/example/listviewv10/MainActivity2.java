package com.example.listviewv10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {
    ListView listView;
    String titulos [] = {"Eduardo", "Brayan", "Juan", "Guillermo", "Maria", "Alejandro", "Mateo", "Adriana", "Dr. Isabel", "Karina",};
    String descripciones [] = {"Hola, ya viste...", "Si yo te paso lo que...", "Al rato nos organizamos...", "Es lo que te decia no siempre...",
        "Siempre suceden ese tipo de...", "No se porque siempre suceden...", "JAJA si, eso estuvo divertido...", "Hacen falta muchas cosas...", "Ok, entonces te veo a las..", "Crees que puedas acompañarme.."};
    int avatar [] = {R.drawable.avatar, R.drawable.avatardehombre, R.drawable.avatardh, R.drawable.avatardhe,
        R.drawable.avatardp, R.drawable.avatardp_, R.drawable.avatarh, R.drawable.avatarp, R.drawable.doctor, R.drawable.mujer};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = findViewById(R.id.lista);
        listView.setAdapter(new Datos(this, titulos, descripciones, avatar));

    }
}