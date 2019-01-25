package com.travelhelper.model;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Hotel extends ServiceProvider {
    public Hotel(int id, String name, String contactNumber, String chargePolicy, String rate)
    {
        super(id, name, contactNumber, 'Hotel', chargePolicy, rate);

    }



}