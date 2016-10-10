package com.protonics.recyclerviewanimales;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.protonics.recyclerviewanimales.adapter.PageAdapter;
import com.protonics.recyclerviewanimales.fragment.PerfilFragment;
import com.protonics.recyclerviewanimales.fragment.RecyclerViewFragment;
import com.protonics.recyclerviewanimales.toolbar.AcercaDe;
import com.protonics.recyclerviewanimales.toolbar.Contacto;
import com.protonics.recyclerviewanimales.toolbar.LikesAnimales;

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
//----------------------------toolbar, viewpager
        toolbar = (Toolbar) findViewById(R.id.toolBar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager)  findViewById(R.id.viewPager);
        setUpViewPager();
        if (toolbar != null){
            setSupportActionBar(toolbar);
        }



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

}
