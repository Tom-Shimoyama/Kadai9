package com.example.crudapi.entity;

public class Nationality {

    private int nameId, countryId;

    private String name, country;


    public Nationality(int nameId, String name,
                       int countryId, String country) {
        this.nameId = nameId;
        this.name = name;
        this.countryId = countryId;
        this.country = country;
    }



    public int getNameId() {
        return nameId;
    }

    public int getCountryId() {
        return countryId;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}
