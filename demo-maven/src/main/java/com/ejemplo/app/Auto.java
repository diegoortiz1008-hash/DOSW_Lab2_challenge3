package com.ejemplo.app;

public class Auto extends Vehiculo {

    public Auto(String categoria) {
        super("Auto", categoria);
        configurarSegunCategoria();
    }

    @Override
    protected void configurarSegunCategoria() {

        switch (categoria) {

            case Categoria.ECONOMICO:
                precio = 25_000_000;
                velocidadMax = 120;
                equipamiento = "Aire básico";
                break;

            case Categoria.LUJO:
                precio = 50_000_000;
                velocidadMax = 180;
                equipamiento = "Aire acondicionado + GPS";
                break;

            case Categoria.USADO:
                precio = 15_000_000;
                velocidadMax = 105;
                equipamiento = "Kit básico";
                break;
        }
    }
}
