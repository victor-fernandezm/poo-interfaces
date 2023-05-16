package com.softtek.interfaces.ej1.modelo;

public class Hidroavion extends Avion implements Nautico {

    @Override
    public String atracar() {
        return "MANOS ARRIBA. ESTO ES UN ATRACO.";
    }

    @Override
    public String navegar() {
        return "*vroom vroom pero acuatico*";
    }
}
