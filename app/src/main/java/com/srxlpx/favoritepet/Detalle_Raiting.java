package com.srxlpx.favoritepet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.srxlpx.favoritepet.POJO.Mascota;
import com.srxlpx.favoritepet.adaptador.MascotaAdaptador;

import java.util.ArrayList;

public class Detalle_Raiting extends AppCompatActivity {

    private RecyclerView listaMascotas;
    ArrayList<Mascota> mascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle__raiting);

        Toolbar miActionBar2 = (Toolbar) findViewById(R.id.miActionBar2);
        setSupportActionBar(miActionBar2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm2 = new LinearLayoutManager(this);
        llm2.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm2);
        inicializarListaMascotas();
        inicializarAdaptador();
    }

    public MascotaAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas (){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.catty, "Katty",3));
        mascotas.add(new Mascota(R.drawable.doggy, "Doggy",2));
        mascotas.add(new Mascota(R.drawable.foxxy, "Foxxy",1));
        mascotas.add(new Mascota(R.drawable.goatty, "Goatty",5));
        mascotas.add(new Mascota(R.drawable.jiraffy,"Jiraffy",4));
    }
}
