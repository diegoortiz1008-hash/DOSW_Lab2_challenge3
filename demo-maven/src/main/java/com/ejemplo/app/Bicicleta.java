package com.ejemplo.app;

public class Bicicleta extends Vehiculo {

    public Bicicleta(String categoria) {
        super("Bicicleta", categoria);
        configurarSegunCategoria();
    }

    @Override
    protected void configurarSegunCategoria() {

        switch (categoria) {
            case Categoria.ECONOMICO:
                precio = 1_200_000;
                velocidadMax = 35;
                equipamiento = "Casco básico";
                break;

            case Categoria.LUJO:
                precio = 6_500_000;
                velocidadMax = 55;
                equipamiento = "Suspensión + frenos disco";
                break;

            case Categoria.USADO:
                precio = 700_000;
                velocidadMax = 28;
                equipamiento = "Kit básico";
                break;
        }
    }
}
