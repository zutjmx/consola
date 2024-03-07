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
        System.out.println("texto: " + texto);
        
        @SuppressWarnings("rawtypes")
        Class strClass = texto.getClass();

        System.out.println("strClass: " + strClass);
        System.out.println("strClass.getName(): " + strClass.getName());
        System.out.println("strClass.getSimpleName(): " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName(): " + strClass.getPackageName());
        
        System.out.println("Se imprime lista de métodos de strClass usando getMethods(): ");
        for (Method method : strClass.getMethods()) {
            System.out.println("método: " + method.getName());
        }
    }
}
