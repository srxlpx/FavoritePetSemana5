package com.srxlpx.favoritepet.db;

import android.content.ContentValues;
import android.content.Context;

import com.srxlpx.favoritepet.POJO.Mascota;
import com.srxlpx.favoritepet.R;

import java.util.ArrayList;

/**
 * Created by Ed on 12/11/2016.
 */
public class ConstructorMascotas {

    private static final int RAITING = 1;
    private Context context;
    public ConstructorMascotas(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> obtenerDatos(){
        /*ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.jiraffy,"Jiraffy",0));
        mascotas.add(new Mascota(R.drawable.lambby,"Lambby",0));
        mascotas.add(new Mascota(R.drawable.lionny,"Lionny",0));
        mascotas.add(new Mascota(R.drawable.piggy,"Piggy",0));

        return mascotas;*/

        BaseDatos db = new BaseDatos(context);
        insertarCincoMascota(db);
        return db.obtenerTodosLasMascotas();
    }

    public void insertarCincoMascota(BaseDatos db){
        ContentValues contentValues = new ContentValues();

        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.bunny);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Bunny");
        db.insertarMascota(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.catty);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Katty");
        db.insertarMascota(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.doggy);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Doggy");
        db.insertarMascota(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.foxxy);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Foxxy");
        db.insertarMascota(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.goatty);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Goatty");
        db.insertarMascota(contentValues);
    }

    public void darRaitingMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_RAITING_MASCOTA_ID_MASCOTA, mascota.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_RAITING_MASCOTA_RAITING, RAITING);
        db.insertarRaitingMascota(contentValues);
    }
    public int obtenerRaitingMascota (Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        return db.obtenerRaitingMascota(mascota);
    }
}
