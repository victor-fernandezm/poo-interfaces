package com.softtek.interfaces.ej1.presentacion;

import com.softtek.interfaces.ej1.modelo.*;

public class TestVolador {
    public static void main(String[] args) {
        ObjetoVolador[] voladors = new ObjetoVolador[] {
                new Avion(),
                new Ave(),
                new Superman(),
                new Hidroavion(),
                new Helicoptero()
        };

        Nautico[] nauticos = new Nautico[] {
                new Barcaza(),
                new Hidroavion()
        };

        for(ObjetoVolador o : voladors) {
            System.out.println(o.getClass().getSimpleName());

            if(o instanceof Animal a){
                System.out.println(a.comer());
            }
            if(o instanceof Superman s){
                System.out.println(s.saltarEdificio());
                System.out.println(s.pararBala());
            }

            System.out.println(o.despegar());
            System.out.println(o.volar());
            System.out.println(o.aterrizar());
            System.out.println();
        }

        for(Nautico n: nauticos) {
            System.out.println(n.getClass().getSimpleName());

            System.out.println(n.atracar());
            System.out.println(n.navegar());
            System.out.println();
        }
    }
}
