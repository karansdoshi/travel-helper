package com.travelhelper.model;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class buses implements service_provider {
    public buses(int id,String name, String contact_number, String charge_policy, String rate)
    {
        super(id,name,contact_number,'buses',charge_policy,rate);

    }



}