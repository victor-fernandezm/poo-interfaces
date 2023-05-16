package com.softtek.interfaces.ej1.modelo;

public class Superman extends Kriptoniano implements ObjetoVolador {
    @Override
    public String despegar() {
        return "pfff! Screw gravity!";
    }

    @Override
    public String aterrizar() {
        return "EVERYBODY DO THE FLOP! *falls*";
    }

    @Override
    public String volar() {
        return "ITS THE MAGICAL PONY, FLYING THROUGH THE SKIES!";
    }

    @Override
    public String comer() {
        return "HERE COMES THE AIRPLANE! *crash*";
    }

    public String saltarEdificio() {
        return "NOOO! YOU HAVE SO MUCH TO LIVE FOR!";
    }

    public String pararBala() {
        return "HEY LOOK AT MY NEW CAMERA! *gunshot* OH, WAIT. THIS IS NOT A CAMERA.";
    }
}
