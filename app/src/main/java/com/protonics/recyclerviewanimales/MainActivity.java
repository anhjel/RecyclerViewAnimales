package com.protonics.recyclerviewanimales;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Animales> animales;
    private RecyclerView listaAnimales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        //----------------------INICIAR EL RECYCLERVIEW
        listaAnimales= (RecyclerView) findViewById(R.id.rvAnimales);//SE INSTACÍA CON EL RW DEL activity_main.xml
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaAnimales.setLayoutManager(llm);
        inicializarListaAnimales();
        inicializarAdaptador();
        //----------------------BOTON 5 ESTRELLAS------------------
        ImageButton btnFive = (ImageButton) findViewById(R.id.fiveStarBtn);
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cambio = new Intent(MainActivity.this, LikesAnimales.class);
                startActivity(cambio);

            }
        });
    }

    public void inicializarAdaptador(){
        AnimalesAdapter adaptador = new AnimalesAdapter(animales, this);
        listaAnimales.setAdapter(adaptador);

    }

    public void inicializarListaAnimales(){
        animales = new ArrayList<Animales>();
        animales.add(new Animales(R.drawable.jaguar,"Jaguar",0));
        animales.add(new Animales(R.drawable.leon,"Leon",1));
        animales.add(new Animales(R.drawable.zebra,"Zebra",2));
        animales.add(new Animales(R.drawable.hipo,"Hipopotamo",3));
        animales.add(new Animales(R.drawable.jirafa,"Jirafa",4));
        animales.add(new Animales(R.drawable.osoo,"Oso",5));
        animales.add(new Animales(R.drawable.tigre,"Tigre",0));
        animales.add(new Animales(R.drawable.zorro,"Zorro",0));




    }



}
