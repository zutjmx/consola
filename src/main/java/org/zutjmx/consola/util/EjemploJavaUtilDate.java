package org.zutjmx.consola.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

@Service
public class EjemploJavaUtilDate {
    private final Faker faker = new Faker();

    public void metodoPrincipal() {
        Date fechaHoy = new Date();
        Date fechaFake = faker.date().future(15, TimeUnit.DAYS);
        System.out.println("EjemploJavaUtilDate.metodoPrincipal(): fechaHoy = " + fechaHoy);
        System.out.println("EjemploJavaUtilDate.metodoPrincipal(): fechaFake = " + fechaFake);

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy");
        String fechaHoyCadena = df.format(fechaHoy);
        String fechaFakeCadena = df.format(fechaFake);

        System.out.println("EjemploJavaUtilDate.metodoPrincipal(): fechaHoyCadena = " + fechaHoyCadena);
        System.out.println("EjemploJavaUtilDate.metodoPrincipal(): fechaFakeCadena = " + fechaFakeCadena);
    }
}
