package com.upc.tierraconnect.model;

public class Tecnico {

    private int id;
    private String nombre;
    private String zona;
    private String especialidad;

    public Tecnico(int id, String nombre, String zona, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.zona = zona;
        this.especialidad = especialidad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getZona() {
        return zona;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}