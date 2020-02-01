package com.jaxb.tutorial.examples;

import com.jaxb.tutorial.examples.domain.Passenger;
import com.jaxb.tutorial.examples.domain.Passengers;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

/*
    another way to set namespaces
 */
public class TestExamplePassengers {

    public static void main(String[] args) throws JAXBException, XMLStreamException {

        Set<Passenger> passengersList = new HashSet<>();
        Passenger passenger = new Passenger("Jean","Dupont");
        passengersList.add(passenger);

        Passengers passengers = new Passengers();
        passengers.setListIdentifier(999);
        passengers.setPassengers(passengersList);

        // create JAXB context and instantiate marshaller
        JAXBContext context = JAXBContext.newInstance(Passengers.class);

        XMLStreamWriter xmlStreamWriter = XMLOutputFactory.newInstance().createXMLStreamWriter(new PrintWriter(System.out));
        xmlStreamWriter.setPrefix("frn", "https://www.w3schools.com/furniture");
        Marshaller marshaller = context.createMarshaller();

        marshaller.marshal(passengers, xmlStreamWriter);
    }
}
