package org.zutjmx.consola.util;

import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

@Service
public class WrapperBoolean {
    
    private final Faker faker = new Faker();

    public void metodoPrincipal() {
        System.out.println("WrapperBoolean.metodoPrincipal()");
        Integer numeroUno, numeroDos;
        numeroUno = faker.number().numberBetween(1, 3);
        numeroDos = faker.number().numberBetween(4, 6);
        boolean primitivoBoolean = numeroDos > numeroDos;
        Boolean objetoBooleanUno = Boolean.valueOf(primitivoBoolean);
        Boolean objetoBooleanDos = Boolean.valueOf("false");
        Boolean objetoBooleanTres = true;

        System.out.println("numeroUno: " + numeroUno);
        System.out.println("numeroDos: " + numeroDos);
        
        System.out.println("primitivoBoolean: " + primitivoBoolean);
        System.out.println("objetoBooleanUno: " + objetoBooleanUno);
        System.out.println("objetoBooleanDos: " + objetoBooleanDos);
        System.out.println("objetoBooleanTres: " + objetoBooleanTres);

        System.out.println("Comparando los objetos objetoBooleanUno y objetoBooleanDos: " + (objetoBooleanUno == objetoBooleanDos));
        System.out.println("Comparando los objetos objetoBooleanUno y objetoBooleanDos (usando equals): " + (objetoBooleanUno.equals(objetoBooleanDos)));
        System.out.println("Comparando los objetos objetoBooleanDos y objetoBooleanTres: " + (objetoBooleanUno == objetoBooleanTres));
        System.out.println("Comparando los objetos objetoBooleanUno y objetoBooleanTres: " + (objetoBooleanUno == objetoBooleanTres));

        boolean primitivoBooleanDos = objetoBooleanUno.booleanValue();
        System.out.println("primitivoBooleanDos: " + primitivoBooleanDos);
    }
}
