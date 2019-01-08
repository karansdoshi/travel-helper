package com.travelhelper.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Place {
    private int id;
    private String name;
    private int distance;
    private String weather_type;

    public Place(int id, String name, int distance, String weather_type) {
        this.id = id;
        this.name = name;
        this.distance = distance;
        this.weather_type = weather_type;
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

    public String getWeather_type() {
        return weather_type;
    }

    public void setWeather_type(String weather_type) {
        this.weather_type = weather_type;
    }


    @Override
    public String toString() {
        return "Place{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
