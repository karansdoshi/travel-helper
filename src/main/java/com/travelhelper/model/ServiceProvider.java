package com.travelhelper.model;

import com.travelhelper.repositories.Type;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ServiceProvider implements Type{
    
    private String name;
    private String contactNumber;
    private String chargePolicy;
    private String rate;
    private int id;
    public Type.Services type;

    public ServiceProvider(int id, String name, String contactNumber, Type.Services type, String chargePolicy, String rate) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.type = type;
        this.chargePolicy = chargePolicy;
        this.rate = rate;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Type.Services getType() {
        return type;
    }

    public void setType(Type.Services type) {
        this.type = type;
    }

    public String getChargePolicy() {
        return chargePolicy;
    }

    public void setChargePolicy(String chargePolicy) {
        this.chargePolicy = chargePolicy;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}