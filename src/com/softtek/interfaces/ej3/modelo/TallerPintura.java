package com.softtek.interfaces.ej3.modelo;

import org.springframework.stereotype.Component;

@Component
public class TallerPintura implements ITaller {
    @Override
    public void reparar(Coche c) {
        System.out.println("Pintando coche: " + c.getMatricula());
    }
}
