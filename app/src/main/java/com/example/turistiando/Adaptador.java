package com.example.turistiando;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.viewHolder> {

    //Atributos de la clase adaptador
    public ArrayList<Hotel> listaHoteles;


    //Constructos
    public Adaptador(ArrayList<Hotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    @NonNull
    @Override
    public Adaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.viewHolder viewHolder, int i) {

        viewHolder.actualizarDatos(listaHoteles.get(i));

    }

    @Override
    public int getItemCount() {
        return listaHoteles.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView fotoHotel;
        TextView nombreHotel;
        TextView descripcionHotel;
        TextView precioHotel;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoHotel=itemView.findViewById(R.id.fotoHotel1);
            nombreHotel=itemView.findViewById(R.id.nombreHotel1);
            descripcionHotel=itemView.findViewById(R.id.descipcionHotel1);
            precioHotel=itemView.findViewById(R.id.precioHotel1);
        }

        public void actualizarDatos(Hotel hotel) {

            fotoHotel.setImageResource(hotel.getFotografias());
            nombreHotel.setText(hotel.getNombre());
            descripcionHotel.setText(hotel.getDescripcion());
            precioHotel.setText(hotel.getPrecio());
        }
    }
}
