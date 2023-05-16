package com.softtek.interfaces.ej3.modelo;

public class TallerMecanica implements ITaller {
    @Override
    public void reparar(Coche c) {
        System.out.println("Reparando coche: " + c.getMatricula());
    }
}
