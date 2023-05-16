package com.softtek.interfaces.ej1.modelo;

public class Avion extends Vehiculo implements ObjetoVolador {

    @Override
    public String despegar() {
        return "*vroom vroom*";
    }

    @Override
    public String aterrizar() {
        return "*bonk*";
    }

    @Override
    public String volar() {
        return "ACCORDING TO ALL KNOWN LAWS OF AVIATION, THERES NO WAY A BEE SHOULD BE ABLE TO FLY. ITS WINGS ARE TO SMALL TO LIFT ITS FAT LITTLE BODY OF THE GROUND.";
    }
}
