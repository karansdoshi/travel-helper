package com.travelhelper.model;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Bike extends Transport {
    public Bike(int id, String name, String contactNumber, String chargePolicy, String rate)
    {
        super(id, name, contactNumber, 'Bike', chargePolicy, rate);

    }



}