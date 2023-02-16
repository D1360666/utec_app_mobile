package com.utec.myat.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.utec.myat.entities.Actividad;

import java.util.List;

@Dao
public interface ActividadDao {

    @Query("SELECT * FROM Actividad")
    LiveData<List<Actividad>> findAll();

    @Insert
    void insert(Actividad actividad);

    @Update
    void update(Actividad actividad);

    @Delete
    void delete(Actividad actividad);

    @Query("SELECT * FROM Actividad WHERE id = :id")
    Actividad findById(int id);

    @Query("SELECT * FROM Actividad WHERE cliente like :cliente")
    Actividad findByClient(String cliente);
}
