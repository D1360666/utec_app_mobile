package com.utec.myat.models;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.utec.myat.entities.Actividad;
import com.utec.myat.repositories.ActividadRepository;

import java.util.List;

public class ActividadViewModel extends AndroidViewModel {
    private ActividadRepository actividadRepository;
    private final LiveData<List<Actividad>> actividades;

    private ActividadViewModel(Application application){
        super(application);
        actividadRepository = new ActividadRepository(application);
        actividades = actividadRepository.getACtividades();
    }

    public LiveData<List<Actividad>> getActividades(){
        return actividades;
    }

    public void insert(Actividad actividad){
        actividadRepository.insert(actividad);
    }

}
