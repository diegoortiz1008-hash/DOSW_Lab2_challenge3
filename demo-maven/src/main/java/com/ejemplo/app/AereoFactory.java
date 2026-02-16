package com.ejemplo.app;

public class AereoFactory implements AbstractFactory {

    @Override
    public Vehiculo createVehiculo(String categoria, int opcionModelo) {
        switch (opcionModelo) {
            case 1: return new Avion(categoria);
            case 2: return new Avioneta(categoria);
            case 3: return new Helicoptero(categoria);
            default: throw new IllegalArgumentException("Modelo Aéreo inválido");
        }
    }
}
