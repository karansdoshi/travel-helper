package com.travelhelper.model;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Bus extends Transport {
    public Bus(int id, String name, String contactNumber, String chargePolicy, String rate)
    {
        super(id, name, contactNumber, 'Bus', chargePolicy, rate);

    }



}