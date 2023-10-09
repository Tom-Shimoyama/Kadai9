package com.example.crudapi.entity;

public class Name {

    private int name_id, country_id;

    private String name, country;


    public Name(int name_id, String name,
                int country_id, String country) {
        this.name_id = name_id;
        this.name = name;
        this.country_id = country_id;
        this.country = country;
    }



    public int getName_id() {
        return name_id;
    }

    public int getCountry_id() {
        return country_id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}
