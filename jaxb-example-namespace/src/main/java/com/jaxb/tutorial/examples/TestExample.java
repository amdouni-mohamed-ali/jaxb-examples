package com.jaxb.tutorial.examples;

import com.jaxb.tutorial.examples.config.MyNamespaceMapper;
import com.jaxb.tutorial.examples.domain.Book;
import com.jaxb.tutorial.examples.domain.Bookstore;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        //set prefix property
        m.setProperty("com.sun.xml.internal.bind.namespacePrefixMapper", new MyNamespaceMapper());

        // Write to System.out
        m.marshal(bookstore, System.out);
    }
}
