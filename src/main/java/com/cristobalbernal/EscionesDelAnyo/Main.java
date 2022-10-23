package com.cristobalbernal.EscionesDelAnyo;

import com.cristobalbernal.EscionesDelAnyo.Lib.Lib;

public class Main extends Thread{


    public static void main(String[] args) {
        String [] estacionDelAnyo = {"Verano","Primavera","Invierno","Otoño"};
        String opcion = "";
        boolean valido = false;
        for (String s : estacionDelAnyo) {
            Lib.espera(1000);
            System.out.println(s);
        }
        opcion = Lib.leerString("Escribe una opcion:",5,9);

        do {
            if ("Primavera".equalsIgnoreCase(opcion)){
                Lib.espera(1000);
                System.out.println("Marzo");
                Lib.espera(1000);
                System.out.println("Abril");
                Lib.espera(1000);
                System.out.println("Mayo");
                Lib.espera(1000);
                System.out.println("Junio");
                Lib.espera(1000);
                valido = true;
            }else if ("Verano".equalsIgnoreCase(opcion)){
                Lib.espera(1000);
                System.out.println("Junio");
                Lib.espera(1000);
                System.out.println("Julio");
                Lib.espera(1000);
                System.out.println("Agosto");
                Lib.espera(1000);
                System.out.println("Setiembre");
                Lib.espera(1000);
                valido = true;
            }else if ("Otoño".equalsIgnoreCase(opcion)){
                System.out.println("Setiembre");
                Lib.espera(1000);
                System.out.println("Octubre");
                Lib.espera(1000);
                System.out.println("Noviembre");
                Lib.espera(1000);
                System.out.println("Diciembre");
                Lib.espera(1000);
                valido = true;
            }else if ("Invierno".equalsIgnoreCase(opcion)){
                System.out.println("Diciembre");
                Lib.espera(1000);
                System.out.println("Enero");
                Lib.espera(1000);
                System.out.println("Febrero");
                Lib.espera(1000);
                System.out.println("Marzo");
                Lib.espera(1000);
                valido = true;
            }
        }while (!valido);



    }
}
