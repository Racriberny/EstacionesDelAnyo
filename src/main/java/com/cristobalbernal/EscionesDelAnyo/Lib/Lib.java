package com.cristobalbernal.EscionesDelAnyo.Lib;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lib {
    private static final Scanner lector = new Scanner(System.in);

    public static String leerLinea(){
        return lector.nextLine();
    }


    public static String leerString(String message, int minLength, int maxLength){
        boolean valido = false;
        String data;
        do {
            System.out.println(message);
            data = lector.nextLine();
            if (data.length() >=minLength && data.length() <=maxLength){
                valido = true;
            }else {
                System.out.printf("Longitud minma %d, maxima %d\n", minLength,maxLength);
                Lib.pausa();
            }

        }while (!valido);
        return data;
    }

    private static void pausa() {
        System.out.println("Pulsa INTRO para continuar!!");
        lector.nextLine();
    }

    public static void espera(int x){
        try {
            Thread.sleep(x);
        }catch (InterruptedException ie){
        }
    }

    public static int leerInt() {
        do {
            try {
                return Integer.parseInt(leerLinea());
            } catch (NumberFormatException nfe) {
                System.out.println("Escribe un numero ");
            }
        } while (true);
    }


}
