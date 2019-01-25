package com.travelhelper.model;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Cab extends Transport {
    public Cab(int id, String name, String contactNumber, String chargePolicy, String rate)
    {
        super(id, name, contactNumber, 'Cab', chargePolicy, rate);

    }



}