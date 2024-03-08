package org.zutjmx.consola.util;

import java.lang.reflect.Method;

import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

@Service
public class EjemploGetClass {
    
    private final Faker faker = new Faker();

    public void metodoGetClass() {
        System.out.println("EjemploGetClass.metodoGetClass()");
        String texto = faker.lordOfTheRings().character();
        
        @SuppressWarnings("rawtypes")
        Class strClass = texto.getClass();

        System.out.println("GetClass para String");
        System.out.println("texto: " + texto);
        System.out.println("strClass: " + strClass);
        System.out.println("strClass.getName(): " + strClass.getName());
        System.out.println("strClass.getSimpleName(): " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName(): " + strClass.getPackageName());
        
        System.out.println("Se imprime lista de métodos de strClass usando getMethods(): ");
        for (Method method : strClass.getMethods()) {
            System.out.println("método: " + method.getName());
        }

        Integer numeroEntero = faker.number().numberBetween(100, 200);

        @SuppressWarnings("rawtypes")
        Class intClass = numeroEntero.getClass();
        
        @SuppressWarnings("rawtypes")
        Class objetoClass = intClass.getSuperclass().getSuperclass();

        System.out.println("GetClass para Integer");
        System.out.println("numeroEntero: " + numeroEntero.toString());
        System.out.println("intClass: " + intClass);
        System.out.println("intClass.getName(): " + intClass.getName());
        System.out.println("intClass.getSimpleName(): " + intClass.getSimpleName());
        System.out.println("intClass.getPackageName(): " + intClass.getPackageName());
        System.out.println("intClass.getSuperclass().getName(): " + intClass.getSuperclass().getName());
        System.out.println("objetoClass.getName(): " + objetoClass.getName());

        for (Method method : objetoClass.getMethods()) {
            System.out.println("method.getName(): " + method.getName());
        }

    }
}
