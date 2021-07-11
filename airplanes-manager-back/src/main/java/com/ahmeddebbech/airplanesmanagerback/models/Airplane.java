package com.ahmeddebbech.airplanesmanagerback.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Airplane implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;
    private String model;
    private String company;
    private int places;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    @Override
    public String toString(){
        return "Airplane:{id = " + id + " model = " +
                model + " company = " + company + " places = " +places + " }";
    }
}
