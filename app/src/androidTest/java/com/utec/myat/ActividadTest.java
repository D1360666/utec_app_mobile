package com.utec.myat;

import static org.junit.Assert.assertTrue;

import android.content.Context;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.utec.myat.dao.ActividadDao;
import com.utec.myat.database.AppDatabase;
import com.utec.myat.entities.Actividad;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ActividadTest {
    private ActividadDao actividadDao;
    private AppDatabase appDatabase;

    @Before
    public void createDb(){
        Context context = ApplicationProvider.getApplicationContext();
        appDatabase = Room.inMemoryDatabaseBuilder(context, AppDatabase.class).build();
        actividadDao = appDatabase.actividadDao();
    }

    @After
    public void closeDb(){
        appDatabase.close();
    }

    @Test
    public void findByClient() throws Exception{
        Actividad actividad = new Actividad();
        actividad.setId(1);
        actividad.setCliente("UPM");
        actividad.setDescActividad("Reparación por rotura");
        actividad.setTipoActividad("Reparación");
        actividad.setContratista("Almojana");
        actividad.setMarca("CAT");
        actividad.setModelo("D8");
        actividad.setNro(541);
        actividad.setTipoVehiculo("Tractor");
        actividad.setNro2(0);

        actividadDao.insert(actividad);

        Actividad encontrado = actividadDao.findByClient("UPM");
        assertTrue("No se encontró actividad", actividad.getId()==encontrado.getId());
    }
}
