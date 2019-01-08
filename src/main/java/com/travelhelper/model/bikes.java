package com.travelhelper.model;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class bikes implements service_provider {
    public bikes(int id,String name, String contact_number, String charge_policy, String rate)
    {
        super(id,name,contact_number,'bikes',charge_policy,rate);

    }



}