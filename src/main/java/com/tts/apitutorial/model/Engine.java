package com.tts.apitutorial.model;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Engine {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer horsepower;
    private Integer cylinder;
    private String fuelType;

    public Engine() {
    }

    public Engine(Long id, Integer horsepower, Integer cylinder, String fuelType) {
        this.id = id;
        this.horsepower = horsepower;
        this.cylinder = cylinder;
        this.fuelType = fuelType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Integer horsepower) {
        this.horsepower = horsepower;
    }

    public Integer getCylinder() {
        return cylinder;
    }

    public void setCylinder(Integer cylinder) {
        this.cylinder = cylinder;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }



}
