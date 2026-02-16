package com.ejemplo.app;

public class Avioneta extends Vehiculo {

    public Avioneta(String categoria) {
        super("Avioneta", categoria);
        configurarSegunCategoria();
    }

    @Override
    protected void configurarSegunCategoria() {

        switch (categoria) {
            case Categoria.ECONOMICO:
                precio = 150_000_000;
                velocidadMax = 250;
                equipamiento = "Instrumentos basicos de vuelo";
                break;

            case Categoria.LUJO:
                precio = 450_000_000;
                velocidadMax = 380;
                equipamiento = "Navegación avanzada";
                break;

            case Categoria.USADO:
                precio = 120_000_000;
                velocidadMax = 240;
                equipamiento = "Instrumentación básica";
                break;
        }
    }
}
