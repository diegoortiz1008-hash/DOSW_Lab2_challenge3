package com.ejemplo.app;

public class Helicoptero extends Vehiculo {

    public Helicoptero(String categoria) {
        super("Helicoptero", categoria);
        configurarSegunCategoria();
    }

    @Override
    protected void configurarSegunCategoria() {

        switch (categoria) {
            case Categoria.ECONOMICO:
                precio = 800_000_000;
                velocidadMax = 200;
                equipamiento = "Radio + kit emergencia";
                break;

            case Categoria.LUJO:
                precio = 1_600_000_000;
                velocidadMax = 290;
                equipamiento = "Piloto automático";
                break;

            case Categoria.USADO:
                precio = 500_000_000;
                velocidadMax = 170;
                equipamiento = "Instrumentación básica";
                break;
        }
    }
}
