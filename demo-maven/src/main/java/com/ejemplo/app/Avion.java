package com.ejemplo.app;

public class Avion extends Vehiculo {

    public Avion(String categoria) {
        super("Avion", categoria);
        configurarSegunCategoria();
    }

    @Override
    protected void configurarSegunCategoria() {

        switch (categoria) {
            case Categoria.ECONOMICO:
                precio = 15_000_000_000L;
                velocidadMax = 650;
                equipamiento = "Cabina estándar";
                break;

            case Categoria.LUJO:
                precio = 45_000_000_000L;
                velocidadMax = 850;
                equipamiento = "Cabina premium";
                break;

            case Categoria.USADO:
                precio = 9_000_000_000L;
                velocidadMax = 580;
                equipamiento = "Instrumentación básica";
                break;
        }
    }
}
