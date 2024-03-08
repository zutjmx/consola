package org.zutjmx.consola.util;

import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

@Service
public class PasarPorReferencia {

    private static final Faker faker = new Faker();

    public void metodoPrincipal() {
        int[] edades = generaArregloDeEnteros();
        System.out.println("PasarPorReferencia.metodoPrincipal(): longitud del arreglo edades: " + edades.length);
        System.out.println("PasarPorReferencia.metodoPrincipal(): valores en arreglo edades:");
        for (int i : edades) {
            System.out.println("Edad: " + i);
        }
        
        System.out.println("PasarPorReferencia.metodoPrincipal(): antes de llamar método prueba()");
        prueba(edades);
        System.out.println("PasarPorReferencia.metodoPrincipal(): después de llamar método prueba()");
        
        System.out.println("PasarPorReferencia.metodoPrincipal(): longitud del arreglo edades: " + edades.length);
        System.out.println("PasarPorReferencia.metodoPrincipal(): valores en arreglo edades:");
        for (int i : edades) {
            System.out.println("Edad: " + i);
        }
    }

    public static void prueba(int[] edadesArreglo) {        
        System.out.println("PasarPorReferencia.prueba(): inicio");
        for (int i = 0; i < edadesArreglo.length; i++) {
            edadesArreglo[i] = edadesArreglo[i]+20; 
        }
        System.out.println("PasarPorReferencia.prueba(): fin");
    }

    private int[] generaArregloDeEnteros() {
        int dimension = faker.number().numberBetween(10, 20);
        int[] arreglo = new int[dimension];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = faker.number().randomDigitNotZero();
        }
        return arreglo;
    }
}
