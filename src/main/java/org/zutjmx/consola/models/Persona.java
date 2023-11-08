package org.zutjmx.consola.models;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Persona {
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String email;
    private String userName;
    private Date fechaNacimiento;
}
