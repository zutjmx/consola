package org.zutjmx.consola.util;

import com.github.javafaker.Faker;
import lombok.*;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Service
public class FlujoDeControl {
    private Faker faker = new Faker();

    public void SentenciaSi() {
        String nombre = this.faker.name().fullName();

        if(nombre.length() > 20) {
            System.out.println("Longitud de nombre = " + nombre + ", es mayor a 20 caracteres.");
        } else {
            System.out.println("Longitud de nombre = " + nombre + ", es menor a 20 caracteres.");
        }

    }
}
