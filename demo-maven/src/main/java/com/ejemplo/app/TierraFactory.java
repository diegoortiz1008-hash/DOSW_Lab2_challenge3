package com.ejemplo.app;

public class TierraFactory implements AbstractFactory {

    @Override
    public Vehiculo createVehiculo(String categoria, int opcionModelo) {
        switch (opcionModelo) {
            case 1: return new Auto(categoria);
            case 2: return new Bicicleta(categoria);
            case 3: return new Moto(categoria);
            default: throw new IllegalArgumentException("Modelo de Tierra inválido");
        }
    }
}
