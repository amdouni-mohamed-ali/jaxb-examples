package com.jaxb.tutorial.examples.domain;

import javax.xml.bind.annotation.*;
import java.util.Set;

@XmlRootElement(namespace = "https://www.w3schools.com/furniture")
@XmlAccessorType(XmlAccessType.FIELD)
public class Passengers {

    private Integer listIdentifier;
    @XmlElementWrapper(name = "passengersList",namespace="https://www.w3schools.com/furniture")
    @XmlElements(@XmlElement(name="passenger", namespace="https://www.w3schools.com/furniture"))
    private Set<Passenger> passengers;

    public Integer getListIdentifier() {
        return listIdentifier;
    }

    public void setListIdentifier(Integer listIdentifier) {
        this.listIdentifier = listIdentifier;
    }

    public Set<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(Set<Passenger> passengers) {
        this.passengers = passengers;
    }
}