package com.ejemplo.app;

public class Moto extends Vehiculo {

    public Moto(String categoria) {
        super("Moto", categoria);
        configurarSegunCategoria();
    }

    @Override
    protected void configurarSegunCategoria() {

        switch (categoria) {
            case Categoria.ECONOMICO:
                precio = 9_500_000;
                velocidadMax = 120;
                equipamiento = "Freno básico";
                break;

            case Categoria.LUJO:
                precio = 55_000_000;
                velocidadMax = 220;
                equipamiento = "ABS + modos manejo";
                break;

            case Categoria.USADO:
                precio = 6_500_000;
                velocidadMax = 105;
                equipamiento = "Kit básico";
                break;
        }
    }
}
