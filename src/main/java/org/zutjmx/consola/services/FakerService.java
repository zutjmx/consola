package org.zutjmx.consola.services;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;
import org.zutjmx.consola.models.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class FakerService {
    private final Faker faker = new Faker(new Locale("es-MX"));

    public String nombreChistoso() {
        return this.faker.funnyName().name();
    }

    public Persona generaPersona() {
        Persona persona = new Persona();
        persona.setNombre(faker.name().firstName());
        persona.setAPaterno(faker.name().lastName());
        persona.setAMaterno(faker.name().lastName());
        persona.setEmail(faker.internet().emailAddress());
        persona.setUserName(faker.internet().userAgentAny());
        persona.setFechaNacimiento(faker.date().birthday(20,90));
        return persona;
    }

    public List<Integer> generaArregloDeEnteros(int cuantos) {
        List<Integer> arreglo = new ArrayList<>();
        for (int i = 0; i < cuantos; i++) {
            Integer numero = faker.number().randomDigit();
            arreglo.add(numero);
        }
        return arreglo;
    }
}
