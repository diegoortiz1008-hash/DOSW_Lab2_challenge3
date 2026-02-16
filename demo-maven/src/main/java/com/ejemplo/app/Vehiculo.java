package com.ejemplo.app;

public abstract class Vehiculo {

    protected String modelo;
    protected String categoria;
    protected double precio;
    protected double velocidadMax;
    protected String equipamiento;

    public Vehiculo(String modelo, String categoria) {
        this.modelo = modelo;
        this.categoria = categoria;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    protected abstract void configurarSegunCategoria();
}

