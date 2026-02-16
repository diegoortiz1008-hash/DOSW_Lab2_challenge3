package com.ejemplo.app;

public class Lancha extends Vehiculo {

    public Lancha(String categoria) {
        super("Lancha", categoria);
        configurarSegunCategoria();
    }

    @Override
    protected void configurarSegunCategoria() {

        switch (categoria) {
            case Categoria.ECONOMICO:
                precio = 120_000_000;
                velocidadMax = 60;
                equipamiento = "Chalecos + kit básico";
                break;

            case Categoria.LUJO:
                precio = 350_000_000;
                velocidadMax = 95;
                equipamiento = "GPS marino + sonido";
                break;

            case Categoria.USADO:
                precio = 80_000_000;
                velocidadMax = 50;
                equipamiento = "Kit básico";
                break;
        }
    }
}
