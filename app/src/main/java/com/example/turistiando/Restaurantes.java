package com.example.turistiando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Restaurantes extends AppCompatActivity {

    ArrayList<Hotel> lista2= new ArrayList<>();
    RecyclerView listaLogica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        listaLogica=findViewById(R.id.recycler2);
        listaLogica.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaRestaurante();
        Adaptador adaptador2 = new Adaptador(lista2);
        listaLogica.setAdapter(adaptador2);
    }
    public void crearListaRestaurante(){

        lista2.add(new Hotel(R.drawable.restaurante32,Integer.toString(R.string.Nombre),"Muchas diversion con tu familia y mascotas","$150.000"));
        lista2.add(new Hotel(R.drawable.restaurante2,"Restaurante 2","Muchas diversion con tu Pareja","$100.000"));
        lista2.add(new Hotel(R.drawable.restaurante4,"Restaurante 3","Hotel para pasar con tu familia , mascotas y amigos con turismo y conocimientos nuevos","$120.000"));
        lista2.add(new Hotel(R.drawable.restaurante45,"Restaurante 4","Un Hotel con vista al mar para que pases bueno y disfrutes de nuevas experiencias y conoscas nuevas amistades o encontrar el Amor","$200.000"));

    }

}