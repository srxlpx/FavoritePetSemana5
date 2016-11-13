package com.srxlpx.favoritepet.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.srxlpx.favoritepet.POJO.Mascota;
import com.srxlpx.favoritepet.R;
import com.srxlpx.favoritepet.adaptador.MascotaAdaptador_perfil;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    private RecyclerView listaMascotas;
    ArrayList<Mascota> mascotas;

    public PerfilFragment() {
        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas_perfil);

        //LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        //llm.setOrientation(LinearLayoutManager.VERTICAL);
        //listaMascotas.setLayoutManager(llm);
        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);
        glm.setOrientation(GridLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(glm);

        inicializarListaMascotas();
        inicializarAdaptador();

        return v;

    }

    public MascotaAdaptador_perfil adaptador;
    public void inicializarAdaptador(){
        adaptador = new MascotaAdaptador_perfil(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);

    }

    public void inicializarListaMascotas (){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.bunny,"Bunny",2));
        mascotas.add(new Mascota(R.drawable.catty, "Katty",3));
        mascotas.add(new Mascota(R.drawable.doggy, "Doggy",5));
        mascotas.add(new Mascota(R.drawable.foxxy, "Foxxy",1));
        mascotas.add(new Mascota(R.drawable.goatty, "Goatty",0));
        mascotas.add(new Mascota(R.drawable.jiraffy,"Jiraffy",5));
        mascotas.add(new Mascota(R.drawable.lambby,"Lambby",7));
        mascotas.add(new Mascota(R.drawable.lionny,"Lionny",1));
        mascotas.add(new Mascota(R.drawable.catty, "Katty",3));
        mascotas.add(new Mascota(R.drawable.doggy, "Doggy",5));
        mascotas.add(new Mascota(R.drawable.bunny,"Bunny",2));
        mascotas.add(new Mascota(R.drawable.piggy,"Piggy",2));
        mascotas.add(new Mascota(R.drawable.jiraffy,"Jiraffy",5));
        mascotas.add(new Mascota(R.drawable.foxxy, "Foxxy",1));
        mascotas.add(new Mascota(R.drawable.lionny,"Lionny",1));
        mascotas.add(new Mascota(R.drawable.goatty, "Goatty",0));
        mascotas.add(new Mascota(R.drawable.lambby,"Lambby",7));
        mascotas.add(new Mascota(R.drawable.piggy,"Piggy",2));
    }
}