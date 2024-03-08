package org.zutjmx.consola.util;

import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

@Service
public class PasarPorValor {

    private static final Faker faker = new Faker();

    public void metodoPrincipal() {
        Integer i = faker.number().numberBetween(1, 10);
        System.out.println("PasarPorValor.metodoPrincipal(): valor de i = " + i);

        prueba(i);
        System.out.println("PasarPorValor.metodoPrincipal(): valor de i después de invocar método prueba() = " + i);
    }

    public static void prueba(Integer i) {
        System.out.println("PasarPorValor.prueba(): valor de i = " + i);
        i = faker.number().randomDigitNotZero();
        System.out.println("PasarPorValor.prueba(): se cambia valor de i = " + i);
    }

}
