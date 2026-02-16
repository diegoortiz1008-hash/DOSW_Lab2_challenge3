package com.ejemplo.app;

public class Velero extends Vehiculo {

    public Velero(String categoria) {
        super("Velero", categoria);
        configurarSegunCategoria();
    }

    @Override
    protected void configurarSegunCategoria() {

        switch (categoria) {
            case Categoria.ECONOMICO:
                precio = 180_000_000;
                velocidadMax = 40;
                equipamiento = "Velas estándar";
                break;

            case Categoria.LUJO:
                precio = 600_000_000;
                velocidadMax = 70;
                equipamiento = "Cabina premium";
                break;

            case Categoria.USADO:
                precio = 120_000_000;
                velocidadMax = 32;
                equipamiento = "Kit básico";
                break;
        }
    }
}
