package com.example.turistiando;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.Locale;

public class Restaurantes extends AppCompatActivity {

    ArrayList<Hotel> lista2= new ArrayList<>();
    RecyclerView listaLogica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        ActionBar barra=getSupportActionBar();

        //Cambiando el color del action bar
        ColorDrawable colorBarra= new ColorDrawable(Color.parseColor("#DC2D50"));
        barra.setBackgroundDrawable(colorBarra);

        listaLogica=findViewById(R.id.recycler2);
        listaLogica.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaRestaurante();
        Adaptador adaptador2 = new Adaptador(lista2);
        listaLogica.setAdapter(adaptador2);
    }
    public void crearListaRestaurante(){

        lista2.add(new Hotel(R.drawable.restaurante32,Integer.toString(R.string.NombreRes1),Integer.toString(R.string.desRestaurante1),Integer.toString(R.string.PrecioRes1)));
        lista2.add(new Hotel(R.drawable.restaurante2,Integer.toString(R.string.NombreRes2),Integer.toString(R.string.desRestaurante2),Integer.toString(R.string.PrecioRes2)));
        lista2.add(new Hotel(R.drawable.restaurante4,Integer.toString(R.string.NombreRes3),Integer.toString(R.string.desRestaurante3),Integer.toString(R.string.PrecioRes3)));
        lista2.add(new Hotel(R.drawable.restaurante45,Integer.toString(R.string.NombreRes4),Integer.toString(R.string.desRestaurante4),Integer.toString(R.string.PrecioRes4)));

    }
    public void cambiarIdioma(String idioma){

        //Configurando el lenguaje del celular
        Locale lenguaje= new Locale(idioma);
        Locale.setDefault(lenguaje);

        //configuración global en el celular

        Configuration configurationTelefono=getResources().getConfiguration();
        configurationTelefono.locale=lenguaje;

        //ejecutamos la configuración
        getBaseContext().getResources().updateConfiguration(configurationTelefono,getBaseContext().getResources().getDisplayMetrics());

    }
    //Cargar el menu xml creado previamente
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    //DAR funcionamiento al menu
    public boolean onOptionsItemSelected(MenuItem item) {

        //observamos que item del menu le damos click

        int itemSeleccionado=item.getItemId();
        switch (itemSeleccionado){

            case(R.id.opcion1):
                Intent IntentA = new Intent(getApplicationContext(),Acercade.class);
                startActivity(IntentA);
                break;
            case(R.id.opcion2):
                this.cambiarIdioma("en");
                Intent intent3 = new Intent(Restaurantes.this,Restaurantes.class);
                startActivity(intent3);
                break;
            case(R.id.opcion3):
                this.cambiarIdioma("es");
                Intent intent4= new Intent(Restaurantes.this,Restaurantes.class);
                startActivity(intent4);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}