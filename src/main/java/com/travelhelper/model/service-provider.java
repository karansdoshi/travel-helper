package com.travelhelper.model;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class service_provider{

    private String name;
    private String contact_number;
    private String type;
    private String charge_policy;
    private String rate;
    private int id;

    public service_provider(int id,String name, String contact_number, String type, String charge_policy, String rate) {
        this.name = name;
        this.contact_number = contact_number;
        this.type = type;
        this.charge_policy = charge_policy;
        this.rate = rate;
        this.if=id;
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

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCharge_policy() {
        return charge_policy;
    }

    public void setCharge_policy(String charge_policy) {
        this.charge_policy = charge_policy;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}