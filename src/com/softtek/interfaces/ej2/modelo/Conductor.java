package com.softtek.interfaces.ej2.modelo;

public class Conductor {
    private IVehiculo vehiculo;

    public Conductor(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String conducir() {
        return vehiculo.moverse();
    }
}
