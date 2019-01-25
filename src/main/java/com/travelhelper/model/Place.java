package com.travelhelper.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Place {
    private int id;
    private String name;
    private int distance;
    private String weatherType;

    public Place(int id, String name, int distance, String weatherType) {
        this.id = id;
        this.name = name;
        this.distance = distance;
        this.weatherType = weatherType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(String weatherType) {
        this.weatherType = weatherType;
    }


    @Override
    public String toString() {
        return "Place{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
