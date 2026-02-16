package com.ejemplo.app;

public interface AbstractFactory {
    Vehiculo createVehiculo(String categoria, int opcionModelo);
}