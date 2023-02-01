package com.example.turistiando;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.Locale;

public class Acercade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);
        ActionBar barra=getSupportActionBar();

        //Cambiando el color de la barra
        ColorDrawable colorBarra= new ColorDrawable(Color.parseColor("#D81B41"));
        barra.setBackgroundDrawable(colorBarra);
    }
    public void  salir(View view){
        Intent salir1 = new Intent(Acercade.this,MainActivity.class);
        startActivity(salir1);
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
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

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
                Intent intent1 = new Intent(Acercade.this,Acercade.class);
                startActivity(intent1);
                break;
            case(R.id.opcion3):
                this.cambiarIdioma("es");
                Intent intent2 = new Intent(Acercade.this,Acercade.class);
                startActivity(intent2);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}