package com.example.alex.listviewadaptadorper;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    private Context miContexto;
    private ArrayList<Cancion>miArrayList;

    public Adaptador(Context miContexto, ArrayList<Cancion> miArrayList){
        this.miContexto=miContexto;
        this.miArrayList=miArrayList;
    }

    @Override
    public int getCount() {
        return miArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return miArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return miArrayList.get(position).getCodigo();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(miContexto);
        convertView = layoutInflater.inflate(R.layout.item, null);

        TextView nombre=(TextView)convertView.findViewById(R.id.tvNom);
        TextView autor=(TextView)convertView.findViewById(R.id.tvDes);
        ImageView foto=(ImageView)convertView.findViewById(R.id.imgFot);

        nombre.setText(miArrayList.get(position).getNombre());
        autor.setText(miArrayList.get(position).getAutor());
        foto.setImageResource(miArrayList.get(position).getFoto());

        return convertView;
    }
}
