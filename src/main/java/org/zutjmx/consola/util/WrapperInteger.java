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
}
