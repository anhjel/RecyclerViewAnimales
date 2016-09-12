package com.protonics.recyclerviewanimales.toolbar;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

import com.protonics.recyclerviewanimales.R;

public class Contacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        // -------------------------------tool bar------------------------------------
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//-------------------------------------Capturando variables----------------------------------------

        final TextInputLayout etNombre = (TextInputLayout) findViewById(R.id.etNombre);
        //EditText tilNombre = (EditText) findViewById(R.id.tilNombre);
        String sNombre = etNombre.getEditText().getText().toString();
        final TextInputLayout etEmail = (TextInputLayout) findViewById(R.id.etEmail);
        String sEmail = etEmail.getEditText().getText().toString();
        final TextInputLayout etComentario = (TextInputLayout) findViewById(R.id.etComentario);
        String sComentario = etComentario.getEditText().getText().toString();






    }
}
