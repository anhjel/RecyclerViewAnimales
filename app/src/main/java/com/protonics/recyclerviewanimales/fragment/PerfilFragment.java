package com.protonics.recyclerviewanimales.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.protonics.recyclerviewanimales.MainActivity;
import com.protonics.recyclerviewanimales.R;
import com.protonics.recyclerviewanimales.pojo.Animales;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {
    private ArrayList<Animales> animales;
    private RecyclerView listaAnimales;


    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_perfil, container, false);

        listaAnimales= (RecyclerView) v.findViewById(R.id.rvAnimales2);
        GridLayoutManager glm = new GridLayoutManager(getContext(), 2);
        listaAnimales.setLayoutManager(glm);

        /*LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(GridLayoutManager.VERTICAL);
        listaAnimales.setLayoutManager(llm);
*/



        // Inflate the layout for this fragment
        return v;
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
    }

}
