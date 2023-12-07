package org.zutjmx.consola.util;

import com.github.javafaker.Faker;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Service
public class FlujoDeControl {
    private Faker faker = new Faker();

    public void sentenciaSi() {
        String nombre = this.faker.name().fullName();
        if(nombre.length() > 20) {
            System.out.println("Longitud de nombre = " + nombre + ", es mayor a 20 caracteres.");
        } else {
            System.out.println("Longitud de nombre = " + nombre + ", es menor a 20 caracteres.");
        }
    }

    public void sentenciaSiCasoContrario() {
        double promedio = this.faker.number().randomDouble(2,1,10);
        if (promedio >= 6.5) {
            System.out.println("Buen promedio, promedio = " + promedio);
        } else if (promedio >= 6.0) {
            System.out.println("Este promedio te exenta, promedio = " + promedio);
        } else if (promedio >= 5.5) {
            System.out.println("Regular, promedio = " + promedio);
        }  else if (promedio >= 5.0) {
            System.out.println("Pésimo, promedio = " + promedio);
        } else if (promedio >= 4.0) {
            System.out.println("Muy malo, promedio = " + promedio);
        } else {
            System.out.println("Reprobado, promedio = " + promedio);
        }
    }

    public void numDiasMes() {
        Calendar calendario = Calendar.getInstance();
        int numMes = this.faker.number().numberBetween(1,12);
        int numAnio = this.faker.number().numberBetween(1900,calendario.get(Calendar.YEAR));
        int numeroDias = 0;
        if (numMes == 1
            || numMes == 3
            || numMes == 5
            || numMes == 7
            || numMes == 8
            || numMes == 10
            || numMes == 12
        ) {
            numeroDias = 31;
        } else if (numMes == 4
                || numMes == 6
                || numMes == 9
                || numMes == 11) {
            numeroDias = 30;
        } else if (numMes == 2) {
            if (numAnio%400 == 0 || ((numAnio%4 == 0) && !(numAnio%100 == 0))) {
                numeroDias = 29;
            } else {
                numeroDias = 28;
            }
        }
        System.out.println("El mes " + numMes + " (" + mesEnLetra(numMes) + ")" + ", del año " + numAnio + ", tiene " + numeroDias + " días.");
    }

    public void numDiasMesSwitchCase() {
        Calendar calendario = Calendar.getInstance();
        int numMes = this.faker.number().numberBetween(1,12);
        int numAnio = this.faker.number().numberBetween(1900,calendario.get(Calendar.YEAR));
        int numeroDias = 0;
        switch (numMes) {
            case 1,3,5,7,8,10,12:
                numeroDias = 31;
                break;
            case 4,6,9,11:
                numeroDias = 30;
                break;
            case 2:
                if (numAnio%400 == 0 || ((numAnio%4 == 0) && !(numAnio%100 == 0))) {
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
                break;
            default:
                break;
        }

        System.out.println("El mes " + numMes + " (" + mesEnLetra(numMes) + ")" + ", del año " + numAnio + ", tiene " + numeroDias + " días.");
    }

    public void switchCase() {
        int numero = this.faker.number().randomDigit();
        switch (numero) {
            case 1:
                System.out.println("Se fue al 1, numero = " + numero);
                break;
            case 2:
                System.out.println("Se fue al 2, numero = " + numero);
                break;
            case 3:
                System.out.println("Se fue al 3, numero = " + numero);
                break;
            default:
                System.out.println("Se fue al default, numero = " + numero);
                break;
        }
    }

    public void cicloFor() {

    }
    
    public String mesEnLetra(int numMes) {
        String nombreMes = "";
        switch (numMes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                break;
        }
        return nombreMes;
    }
}
