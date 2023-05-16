package com.softtek.interfaces.ej1.modelo;

public class Ave extends Animal implements ObjetoVolador {

    @Override
    public String despegar() {
        return "*flap* *flap*";
    }

    @Override
    public String aterrizar() {
        return "*flapn't* *flapn't*";
    }

    @Override
    public String volar() {
        return "*power the turbo jet engine (obviously)*";
    }

    @Override
    public String comer() {
        return "MMMM GRAYONS";
    }

    public String hacerNido() {
        return "PLACEHOLDER TEXT";
    }

    public String ponerHuevos() {
        return "*plop*";
    }
}
