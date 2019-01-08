package com.travelhelper.model;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement

public class guide implements service_provider {
    public guide(int id,String name, String contact_number, String type, String charge_policy, String rate)
    {
        super(id,name,contact_number,'guide',charge_policy,rate);

    }



}