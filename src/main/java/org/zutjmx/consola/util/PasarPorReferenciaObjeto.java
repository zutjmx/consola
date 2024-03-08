package org.zutjmx.consola.util;

import java.util.Locale;

import org.springframework.stereotype.Service;
import org.zutjmx.consola.models.Persona;

import com.github.javafaker.Faker;

@Service
public class PasarPorReferenciaObjeto {
    
    private static final Faker faker = new Faker(Locale.getDefault());

    public void metodoPrincipal() {
        Persona persona = generaPersona();
        System.out.println("PasarPorReferenciaObjeto.metodoPrincipal(): Persona: " + persona.toString());
        System.out.println("PasarPorReferenciaObjeto.metodoPrincipal(): Antes de llamar a prueba()");
        prueba(persona);
        System.out.println("PasarPorReferenciaObjeto.metodoPrincipal(): Después de llamar a prueba()");
        System.out.println("PasarPorReferenciaObjeto.metodoPrincipal(): Persona: " + persona.toString());
    }

    public static void prueba(Persona persona) {
        System.out.println("PasarPorReferenciaObjeto.prueba(): Inicio");

        persona.setNombre(faker.name().firstName());
        persona.setAPaterno(faker.name().lastName());
        persona.setAMaterno(faker.name().lastName());
        persona.setEmail(faker.internet().emailAddress());
        persona.setUserName(faker.funnyName().name());
        persona.setFechaNacimiento(faker.date().birthday(20, 90));
        
        System.out.println("PasarPorReferenciaObjeto.prueba(): Se modifican atributos de Persona");
        System.out.println("PasarPorReferenciaObjeto.prueba(): Fin");
    }

    private Persona generaPersona() {
        Persona persona = new Persona();
        persona.setNombre(faker.name().firstName());
        persona.setAPaterno(faker.name().lastName());
        persona.setAMaterno(faker.name().lastName());
        persona.setEmail(faker.internet().emailAddress());
        persona.setUserName(faker.funnyName().name());
        persona.setFechaNacimiento(faker.date().birthday(20, 90));
        return persona;
    }
}
