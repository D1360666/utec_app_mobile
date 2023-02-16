package com.utec.myat.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.utec.myat.dao.ActividadDao;
import com.utec.myat.entities.Actividad;

@Database(entities={Actividad.class}, version=1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ActividadDao actividadDao();

    private static volatile AppDatabase instance;

    public static AppDatabase getInstance(Context context){
        if(instance==null){
            instance = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "actividades").build();
        }
        return instance;
    }
}
