package com.softtek.interfaces.ej2.modelo;

public class Coche implements IVehiculo{

    public int deposito;

    public Coche(int deposito) {
        this.deposito = deposito;
    }

    @Override
    public String moverse() {
        if(this.deposito > 0) return "MOVIENDOSE. VROOM VROOM";
        else return "NO ME PUEDO MOVER. NO VROOM VROOM. FALTA DEPOSITO";
    }
}
