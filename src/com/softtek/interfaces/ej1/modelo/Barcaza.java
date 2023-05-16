package com.softtek.interfaces.ej1.modelo;

public class Barcaza extends Vehiculo implements Nautico {

    @Override
    public String atracar() {
        return "OH MIRA UN MOTOR *c lo lleva*";
    }

    @Override
    public String navegar() {
        return "*c mueve*";
    }
}
