package com.jaxb.tutorial.examples;

import com.jaxb.tutorial.examples.domain.Book;
import com.jaxb.tutorial.examples.domain.Bookstore;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

public class TestExample {

    public static void main(String[] args) throws JAXBException, IOException {

        ArrayList<Book> bookList = new ArrayList<Book>();
        Book book1 = new Book("The Game","Neil Strauss","Harpercollins");
        bookList.add(book1);

        // create bookstore, assigning book
        Bookstore bookstore = new Bookstore();
        bookstore.setName("Fraport Bookstore");
        bookstore.setLocation("Frankfurt Airport");
        bookstore.setBookList(bookList);

        // create JAXB context and instantiate marshaller
        JAXBContext context = JAXBContext.newInstance(Bookstore.class);
        Marshaller m = context.createMarshaller();

        //if you want to have a formatted xml string as output you can uncomment the below line
        //m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        //redirect the output to a string object
        StringWriter stringWriter = new StringWriter();
        m.marshal(bookstore, stringWriter);
        String output = stringWriter.toString();

        //print it
        System.out.println(output);
    }
}
