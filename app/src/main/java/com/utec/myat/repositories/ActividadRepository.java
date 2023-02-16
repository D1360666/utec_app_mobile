package com.utec.myat.repositories;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.utec.myat.dao.ActividadDao;
import com.utec.myat.database.AppDatabase;
import com.utec.myat.entities.Actividad;

import java.util.List;

public class ActividadRepository {
    private ActividadDao actividadDao;

    private LiveData<List<Actividad>> actividades;

    public ActividadRepository(Application application){
        AppDatabase db = AppDatabase.getInstance(application);
        actividadDao = db.actividadDao();
        actividades = actividadDao.findAll();
    }

    public LiveData<List<Actividad>> getACtividades(){
        return actividades;
    }

    public void insert(Actividad actividad){
        actividadDao.insert(actividad);
    }

}
