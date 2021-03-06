package com.srxlpx.favoritepet.adaptador;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.srxlpx.favoritepet.POJO.Mascota;
import com.srxlpx.favoritepet.R;

import java.util.ArrayList;

/**
 * Created by Ed on 26/05/2016.
 */
public class MascotaAdaptador_perfil extends RecyclerView.Adapter<MascotaAdaptador_perfil.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;
    Activity activity;

    public MascotaAdaptador_perfil(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }

    //Inflar el layout y lo pasara al viewholder para que obtenga los views
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota_perfil, parent, false);
        return new MascotaViewHolder(v);
    }

    //Asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewholder, int position) {
        final Mascota mascota = mascotas.get(position);
        mascotaViewholder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewholder.tvRaiting.setText(String.valueOf(mascota.getRaiting()));
    }

    @Override
    //Cantidad de elementos qur contiene mi lista de contactps
    public int getItemCount() { //Cantidad de elementos que contiene mi lista de mascotas
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFoto;
        private TextView tvRaiting;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto_perfil);
            tvRaiting = (TextView) itemView.findViewById(R.id.tvRaiting_perfil);
        }
    }
}
