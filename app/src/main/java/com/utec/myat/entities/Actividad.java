package com.utec.myat.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Actividad implements Serializable {
    @PrimaryKey
    private int id;
    //private Date fecha;
    private String tipoActividad;
    private String tipoVehiculo;
    private String marca;
    private String modelo;
    private int nro;
    private int nro2;
    private String contratista;
    private String cliente;
    private String descActividad;

    public Actividad(){

    }

    public Actividad(int id, String tipoActividad, String tipoVehiculo, String marca, String modelo, int nro, int nro2, String contratista, String cliente, String descActividad) {
        this.id = id;
        //this.fecha = fecha;
        this.tipoActividad = tipoActividad;
        this.tipoVehiculo = tipoVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.nro = nro;
        this.nro2 = nro2;
        this.contratista = contratista;
        this.cliente = cliente;
        this.descActividad = descActividad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   /* public Date getFecha() {
        return fecha;
    }

 public void setFecha(Date fecha) {
        this.fecha = fecha;
    }*/

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public int getNro2() {
        return nro2;
    }

    public void setNro2(int nro2) {
        this.nro2 = nro2;
    }

    public String getContratista() {
        return contratista;
    }

    public void setContratista(String contratista) {
        this.contratista = contratista;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDescActividad() {
        return descActividad;
    }

    public void setDescActividad(String descActividad) {
        this.descActividad = descActividad;
    }
}
