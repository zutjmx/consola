package org.zutjmx.consola.services;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

@Service
public class FakerService {
    private final Faker faker = new Faker();

    public String nombreChistoso() {
        return this.faker.funnyName().name();
    }
}
