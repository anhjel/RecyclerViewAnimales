package com.protonics.recyclerviewanimales.adapter;
import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.protonics.recyclerviewanimales.pojo.Animales;
import com.protonics.recyclerviewanimales.R;

import java.util.ArrayList;
/**
 * Created by Angel on 04/09/2016.
 */
public class AnimalesAdapter2 extends RecyclerView.Adapter<AnimalesAdapter2.AnimalesViewHolder>{
    ArrayList<Animales>  animales;

    Activity activity;

    public AnimalesAdapter2(ArrayList<Animales> animales, Activity activity){
        this.animales= animales;
        this.activity= activity;

    }
    @Override
    public AnimalesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_animales,parent,false);
        return new AnimalesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final AnimalesViewHolder animalesViewHolder,final int position) {
        final Animales animal = animales.get(position);
        animalesViewHolder.imgFoto.setImageResource(animal.getFoto());
        animalesViewHolder.nombreAnimales.setText(animales.get(position).getNombre());
        animalesViewHolder.likes.setText(String.valueOf(animales.get(position).getLikes()));
    }

    @Override
    public int getItemCount() {return 5/*animales.size()*/;
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
