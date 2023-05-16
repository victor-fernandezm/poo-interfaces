package com.softtek.interfaces.ej3.modelo;

import org.springframework.stereotype.Component;

@Component
public class SeguroCoche implements ITaller {
    private ITaller taller;
    private String aseguradora;

    public ITaller getTaller() {
        return taller;
    }

    public void setTaller(ITaller taller) {
        this.taller = taller;
    }

    @Override
    public void reparar(Coche c) {
        System.out.println("Reparando coche " + c.getMatricula() + "...");
        taller.reparar(c);
    }
}
