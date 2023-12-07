package org.zutjmx.consola.models;

import lombok.*;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ApiColombiaInfoGeneral {
    public int id;
    public String name;
    public String description;
    public String stateCapital;
    public int surface;
    public int population;
    public ArrayList<String> languages;
    public String timeZone;
    public String currency;
    public String currencyCode;
    public String currencySymbol;
    public String isoCode;
    public String internetDomain;
    public String phonePrefix;
    public String radioPrefix;
    public String aircraftPrefix;
    public String subRegion;
    public String region;
    public ArrayList<String> borders;
    public ArrayList<String> flags;
}
