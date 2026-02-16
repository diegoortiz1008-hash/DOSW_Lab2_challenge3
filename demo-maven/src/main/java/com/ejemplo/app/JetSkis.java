package com.ejemplo.app;

public class JetSkis extends Vehiculo {

    public JetSkis(String categoria) {
        super("JetSkis", categoria);
        configurarSegunCategoria();
    }

    @Override
    protected void configurarSegunCategoria() {

        switch (categoria) {
            case Categoria.ECONOMICO:
                precio = 35_000_000;
                velocidadMax = 70;
                equipamiento = "Chaleco + kit básico";
                break;

            case Categoria.LUJO:
                precio = 65_000_000;
                velocidadMax = 95;
                equipamiento = "Sonido + GPS";
                break;

            case Categoria.USADO:
                precio = 22_000_000;
                velocidadMax = 60;
                equipamiento = "Kit básico";
                break;
        }
    }
}
