package org.zutjmx.consola.services;

import org.springframework.stereotype.Service;

@Service
public class ManejoDeCadena {
    public void subCadena() {
        String str = "Hello";
        str = str.substring(0, 2) + str.substring(3);
        System.out.println(str);
    }
}
