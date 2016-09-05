package com.protonics.recyclerviewanimales;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Angel on 04/09/2016.
 */
public class AnimalesAdapter extends RecyclerView.Adapter<AnimalesAdapter.AnimalesViewHolder>{

    ArrayList<Animales>  animales;
    Animales animalesEnvio;
    Activity activity;
//--------------------CONSTRUCTOR----------------------------------
    public AnimalesAdapter(ArrayList<Animales> animales, Activity activity){
        this.animales= animales;
        this.activity= activity;

    }

    //------------------------------------------inflar el Layouty lo pasara al ViewHolder para que el obtenga los views
    @Override
    public AnimalesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_animales,parent,false);
        return new AnimalesViewHolder(v);
    }

    //-------------------------------------asocia cada elemento de la lista a cada view
    @Override
    public void onBindViewHolder(final AnimalesViewHolder animalesViewHolder, final int position) {

        final Animales animal = animales.get(position);
        final int[] cont = {1};
        animalesViewHolder.imgFoto.setImageResource(animal.getFoto());
        animalesViewHolder.nombreAnimales.setText(animales.get(position).getNombre());
        animalesViewHolder.likes.setText(String.valueOf(animales.get(position).getLikes()));

        animalesViewHolder.imgBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity,"diste like a "+ animal.getNombre(),Toast.LENGTH_SHORT).show();
                animalesViewHolder.likes.setText(String.valueOf(cont[0]));
                cont[0] = cont[0]+1;
                animal.setLikes(cont[0]);
                animalesEnvio=animales.get(position);

            }

        });

    }
    //cantidad de elementos de la lista de animales
    @Override
    public int getItemCount() {
        return animales.size();
    }

//---------------------------------VIEWHOLDER-------------
    public static  class AnimalesViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgFoto;
        private ImageButton imgBoton;
        private TextView nombreAnimales;
        private TextView likes;

        public AnimalesViewHolder(View itemView) {
            super(itemView);
            imgFoto         = (ImageView) itemView.findViewById(R.id.imgFotoAnimal);
            nombreAnimales  = (TextView) itemView.findViewById(R.id.textoNombreAnimales);
            imgBoton        = (ImageButton) itemView.findViewById(R.id.btnHuesoLike);
            likes           = (TextView) itemView.findViewById(R.id.likes);
        }
    }
}
