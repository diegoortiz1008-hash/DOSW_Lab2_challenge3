package com.ejemplo.app;

public class AcuaticoFactory implements AbstractFactory {

    @Override
    public Vehiculo createVehiculo(String categoria, int opcionModelo) {
        switch (opcionModelo) {
            case 1: return new Lancha(categoria);
            case 2: return new Velero(categoria);
            case 3: return new JetSkis(categoria);
            default: throw new IllegalArgumentException("Modelo Acuático inválido");
        }
    }
}
