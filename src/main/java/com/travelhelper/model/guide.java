package com.travelhelper.model;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement

public class Guide extends ServiceProvider {
    public Guide(int id, String name, String contactNumber, String type, String charge_policy, String rate)
    {
        super(id, name, contactNumber, 'Guide', charge_policy, rate);

    }



}