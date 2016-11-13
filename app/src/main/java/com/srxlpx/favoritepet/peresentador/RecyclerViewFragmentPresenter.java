package com.srxlpx.favoritepet.peresentador;

import android.content.Context;

import com.srxlpx.favoritepet.POJO.Mascota;
import com.srxlpx.favoritepet.adaptador.MascotaAdaptador;
import com.srxlpx.favoritepet.db.ConstructorMascotas;
import com.srxlpx.favoritepet.fragments.IRecyclerViewFragmentView;

import java.util.ArrayList;

/**
 * Created by Ed on 12/11/2016.
 */
public class RecyclerViewFragmentPresenter implements IRecyclerViewFragmentPresenter{

    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFragmentPresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context) {
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        obtenerMascotasBaseDatos();
    }

    @Override
    public void obtenerMascotasBaseDatos() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerDatos();
        mostrarMascotasRV();
    }

    @Override
    public void mostrarMascotasRV() {
        iRecyclerViewFragmentView.inicializarAdapatadorRV(iRecyclerViewFragmentView.crearAdaptador(mascotas));
        iRecyclerViewFragmentView.generarLinerarLayoutVertical();
    }
}
