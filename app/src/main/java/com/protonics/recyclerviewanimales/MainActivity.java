package com.protonics.recyclerviewanimales;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.protonics.recyclerviewanimales.adapter.AnimalesAdapter;
import com.protonics.recyclerviewanimales.adapter.PageAdapter;
import com.protonics.recyclerviewanimales.fragment.PerfilFragment;
import com.protonics.recyclerviewanimales.fragment.RecyclerViewFragment;
import com.protonics.recyclerviewanimales.pojo.Animales;
import com.protonics.recyclerviewanimales.toolbar.AcercaDe;
import com.protonics.recyclerviewanimales.toolbar.Contacto;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //ArrayList<Animales> animales;
    //private RecyclerView listaAnimales;

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolBar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager)  findViewById(R.id.viewPager);
        setUpViewPager();
        if (toolbar != null){
            setSupportActionBar(toolbar);
        }

        //--------------------------TOOLBAR----------------------------------
        //Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        //setSupportActionBar(miActionBar);

        //----------------------INICIAR EL RECYCLERVIEW
       /* listaAnimales= (RecyclerView) findViewById(R.id.rvAnimales);//SE INSTACÍA CON EL RW DEL activity_main.xml
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaAnimales.setLayoutManager(llm);
        inicializarListaAnimales();
        inicializarAdaptador();*/
//------------------------------------------------------------------
    }
    //-----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------
    //-----------------------------------------------------------------------------

//--------------------------Menu de Opciones----------------------------------------
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.meno_op,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mAcercaDe:
                Intent intent = new Intent(this, AcercaDe.class);
                startActivity(intent);
                break;
            case R.id.mContacto:
                Intent intent1 = new Intent(this, Contacto.class);
                startActivity(intent1);
                break;
            case R.id.fiveStaricon:  //BOTON 5 ESTRELLAS------------------
                Intent cambio1 = new Intent(MainActivity.this, LikesAnimales.class);
                startActivity(cambio1);
        }
        return super.onOptionsItemSelected(item);
    }
//---------------------------Page Adapter-------------------------------------


    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new RecyclerViewFragment());
        fragments.add(new PerfilFragment());
        return fragments;

    }


    private  void  setUpViewPager(){

        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(),agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);
    }



/*
    //------------------------------Adaptador para la Recycler View------------------------
    public void inicializarAdaptador(){
        AnimalesAdapter adaptador = new AnimalesAdapter(animales, this);
        listaAnimales.setAdapter(adaptador);
    }
// -----------------------------------Datos de inicio-----------------------------------
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
    }*/



}
