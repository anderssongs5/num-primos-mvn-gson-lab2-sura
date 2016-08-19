package com.sura.arl.laboratorio2.mvn;

import java.util.ArrayList;
import java.util.List;

import com.sura.arl.laboratorio2.mvn.numeros.NumeroEntero;
import com.sura.arl.laboratorio2.mvn.numeros.primos.NumeroPrimo;
import com.sura.arl.laboratorio2.mvn.serializacion.Serializador;

public class Aplicacion {

    public static void main(String[] args) {
        int desde = 1;
        int hasta = 1000;

        List<NumeroEntero> numerosPrimos = new ArrayList<NumeroEntero>();

        for (int i = desde; i <= hasta; i++) {
            if (NumeroPrimo.esPrimo(i)) {
                numerosPrimos.add(new NumeroEntero(i));
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        if (numerosPrimos.isEmpty()) {
            System.out.println("No existen números primos en el rango especificado [" + desde + ", " + hasta + "].");
        } else {
            stringBuilder.append("La cantidad de números primos en el rango especificado [").append(desde).append(", ")
                    .append(hasta).append("] son: ").append(numerosPrimos.size()).append(". Dichos números son:\n");

            stringBuilder.append(Serializador.objetoAJson(numerosPrimos));

            System.out.println(stringBuilder.toString());
        }
    }
}
