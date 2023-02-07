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

public class Hoteles extends AppCompatActivity {

    //ATEIBUTOS DE LA CLASE
    ArrayList<Hotel>lista = new ArrayList<>();
    RecyclerView listaLogica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);
        ActionBar barra=getSupportActionBar();

        //Cambiando el color del action bar
        ColorDrawable colorBarra= new ColorDrawable(Color.parseColor("#DC2D50"));
        barra.setBackgroundDrawable(colorBarra);

        listaLogica=findViewById(R.id.recycler);
        listaLogica.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaHoteles();
        Adaptador adaptador = new Adaptador(lista);
        listaLogica.setAdapter(adaptador);

    }
    public void crearListaHoteles(){

        lista.add(new Hotel(R.drawable.hotel1,Integer.toString(R.string.NombreHotel1),Integer.toString(R.string.descripcionhotel1),Integer.toString(R.string.PrecioHotel1)));
        lista.add(new Hotel(R.drawable.hotel2,Integer.toString(R.string.NombreHotel2),Integer.toString(R.string.descripcionhotel2),Integer.toString(R.string.PrecioHotel2)));
        lista.add(new Hotel(R.drawable.hotel3,Integer.toString(R.string.NombreHotel3),Integer.toString(R.string.descripcionhotel3),Integer.toString(R.string.PrecioHotel3)));
        lista.add(new Hotel(R.drawable.hotel4,Integer.toString(R.string.NombreHotel4),Integer.toString(R.string.descripcionhotel4),Integer.toString(R.string.PrecioHotel4)));

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
                Intent intent3 = new Intent(Hoteles.this,Hoteles.class);
                startActivity(intent3);
                break;
            case(R.id.opcion3):
                this.cambiarIdioma("es");
                Intent intent4= new Intent(Hoteles.this,Hoteles.class);
                startActivity(intent4);
                break;
        }
        return super.onOptionsItemSelected(item);
    }



}