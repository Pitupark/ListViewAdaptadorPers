package com.example.alex.listviewadaptadorper;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    ListView lv;
    Adaptador adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Cancion> canciones = new ArrayList<Cancion>();
        canciones.add(new Cancion("Avengers Theme Song", "Alan Silvestri", 1, R.drawable.avengerss, R.raw.avengers));
        canciones.add(new Cancion("Origen Theme Song", "Hanz Zimmer", 2, R.drawable.origen, R.raw.inception));
        canciones.add(new Cancion("Spider-Man Far From Home OST", " Michael Giacchino", 3, R.drawable.spider, R.raw.spider));
        canciones.add(new Cancion("Ready Player One OST", " Alan Silvestri ", 4, R.drawable.rpo, R.raw.readyplayer));


        adaptador = new Adaptador(this, canciones);
        lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(adaptador);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Cancion can = (Cancion) adapterView.getItemAtPosition(i);

                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);
                intent.putExtra("objeto", (Serializable)can);
                startActivity(intent);
            }
        });
    }
}



