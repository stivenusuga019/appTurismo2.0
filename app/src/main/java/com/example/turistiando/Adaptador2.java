package com.example.turistiando;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador2 extends RecyclerView.Adapter<Adaptador2.viewRestaurante> {


    public ArrayList<Restaurante> listaRestaurante;

    public Adaptador2(ArrayList<Restaurante> listaRestaurante) {this.listaRestaurante =listaRestaurante;
    }


    @NonNull
    @Override
    public Adaptador2.viewRestaurante onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,null,false);
        return new Adaptador2.viewRestaurante(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull viewRestaurante viewRestaurante, int i) {
        viewRestaurante.actualizarDatos2(listaRestaurante.get(i));
    }


    @Override
    public int getItemCount() {return listaRestaurante.size();}

    public class viewRestaurante extends RecyclerView.ViewHolder {
        ImageView fotoRestaurante;
        TextView nombreRestaurante;
        TextView descripcionRestaurante;
        TextView precioRestaurante;


        public viewRestaurante(@NonNull View itemView) {
            super(itemView);
            fotoRestaurante=itemView.findViewById(R.id.fotoHotel1);
            nombreRestaurante=itemView.findViewById(R.id.nombreHotel1);
            descripcionRestaurante=itemView.findViewById(R.id.descipcionHotel1);
            precioRestaurante=itemView.findViewById(R.id.precioHotel1);
        }

        public void actualizarDatos2(Restaurante restaurante) {

            fotoRestaurante.setImageResource(restaurante.getFotografias1());
            nombreRestaurante.setText(restaurante.getNombre1());
            descripcionRestaurante.setText(restaurante.getDescripcion1());
            precioRestaurante.setText(restaurante.getPrecio1());
        }
    }
}
