package com.sura.arl.laboratorio2.mvn.numeros;

public class NumeroPrimo {

    public static final int NUMERO_DOS = 2;

    public static boolean esPrimo(double numero) {
        boolean respuesta = true;

        int raizCuadrada = (int) Math.sqrt(numero);
        for (int i = NUMERO_DOS; i <= raizCuadrada; i++) {
            if (numero % 2 == 0) {
                respuesta = false;
                break;
            }
        }

        return respuesta;
    }
}
