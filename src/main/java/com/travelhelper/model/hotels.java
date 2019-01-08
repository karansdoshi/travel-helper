package com.travelhelper.model;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class hotels implements service_provider {
    public hotels(int id,String name, String contact_number, String charge_policy, String rate)
    {
        super(id,name,contact_number,'hotels',charge_policy,rate);

    }



}