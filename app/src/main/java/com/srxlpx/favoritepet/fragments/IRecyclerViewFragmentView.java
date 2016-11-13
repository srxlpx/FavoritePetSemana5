package com.srxlpx.favoritepet.fragments;

import com.srxlpx.favoritepet.POJO.Mascota;
import com.srxlpx.favoritepet.adaptador.MascotaAdaptador;

import java.util.ArrayList;

/**
 * Created by Ed on 12/11/2016.
 */
public interface IRecyclerViewFragmentView {

    public void generarLinerarLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);

    public void inicializarAdapatadorRV(MascotaAdaptador adaptador);


}
