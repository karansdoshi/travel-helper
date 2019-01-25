package com.travelhelper.model;
import com.travelhelper.repositories.Type;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Event implements Type{

    private String name;
    private String location;
    private int duration;
    private String startDate;
    private int charges;
    private int id;
    public Type.Events type; 

    public Event(int id, String name, String location, Type.Events type, int duration, String startDate, int charges) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.duration = duration;
        this.startDate = startDate;
        this.charges = charges;
        this.id=id;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Type.Events getType() {
        return type;
    }

    public void setType(Type.Events type) {
        this.type = type;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }
}