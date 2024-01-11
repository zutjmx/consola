package org.zutjmx.consola.util;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

@Service
public class WrapperInteger {
    private final Faker faker = new Faker();

    public void generaObjetoInteger() {
        System.out.println("Genera objetos Integer");
        Integer objetoInteger = this.faker.number().numberBetween(Integer.MIN_VALUE, Integer.MAX_VALUE);
        int numeroIntegerUno = objetoInteger;
        int numeroIntegerDos = objetoInteger.intValue();
        System.out.println("numeroIntegerUno = " + numeroIntegerUno);
        System.out.println("numeroIntegerDos = " + numeroIntegerDos);
    }

    public void autoBoxingInteger() {
        int indice = this.faker.number().numberBetween(1,20);
        Integer[] enteros = generaArregloDeEnteros(indice);
        int suma = 0;
        for (Integer i: enteros) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("suma = " + suma);
    }

    public void wrapperOperadoresRelacionales() {
        //int valorNoCero = this.faker.number().randomDigitNotZero();
        Integer objInt1 = Integer.valueOf(1000);
        Integer objInt2 = objInt1;
        System.out.println("objInt1 = " + objInt1);
        System.out.println("objInt2 = " + objInt2);
        System.out.println("¿Son el mismo objeto? (objInt1 == objInt2) = " + (objInt1 == objInt2));
        objInt2 = 1000;
        System.out.println("objInt1 = " + objInt1);
        System.out.println("objInt2 = " + objInt2);
        System.out.println("¿Son el mismo objeto? (objInt1 == objInt2) = " + (objInt1 == objInt2));

        System.out.println("¿Tienen el mismo valor? (objInt1.equals(objInt2)) = " + (objInt1.equals(objInt2)));
    }

    private Integer[] generaArregloDeEnteros(int indice) {
        Integer[] arreglo = new Integer[indice];
        for (int i = 0; i < indice; i++) {
            arreglo[i] = this.faker.number().randomDigit();
        }
        return arreglo;
    }
}
