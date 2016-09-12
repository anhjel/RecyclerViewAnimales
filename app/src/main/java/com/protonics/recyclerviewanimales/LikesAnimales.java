package com.protonics.recyclerviewanimales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.protonics.recyclerviewanimales.adapter.AnimalesAdapter2;
import com.protonics.recyclerviewanimales.pojo.Animales;

import java.util.ArrayList;

public class LikesAnimales extends AppCompatActivity {

    ArrayList<Animales> animales;
    private RecyclerView listaAnimales;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_likes_animales);
// -------------------------------tool bar------------------------------------
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//-----------------------------------------------------------------------------
        listaAnimales= (RecyclerView) findViewById(R.id.rvAnimales2);//SE INSTAC CON EL RW DEL activity_likes_animales.xml
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaAnimales.setLayoutManager(llm);
        animales = new ArrayList<Animales>();

        inicializarListaAnimales();

        inicializarAdaptador();
    }
    public void inicializarAdaptador(){
        AnimalesAdapter2 adaptador = new AnimalesAdapter2(animales, this);
        listaAnimales.setAdapter(adaptador);
    }
    public void inicializarListaAnimales() {
        //Bundle parametros = getIntent().getSerializableExtra();
        //animales = (ArrayList<Animales>) getIntent().getSerializableExtra("adap");
        //animales = parametros("adap");
        animales = new ArrayList<Animales>();
        animales.add(new Animales(R.drawable.jaguar, "Jaguar", 1));
        animales.add(new Animales(R.drawable.tigre,"Tigre",2));
        animales.add(new Animales(R.drawable.leon, "Leon", 1));
        animales.add(new Animales(R.drawable.zebra,"Zebra",1));
        animales.add(new Animales(R.drawable.hipo,"Hipopotamo",1));
        animales.add(new Animales(R.drawable.jirafa,"Jirafa",4));
        animales.add(new Animales(R.drawable.osoo,"Oso",5));
        animales.add(new Animales(R.drawable.zorro,"Zorro",0));


    }


}
