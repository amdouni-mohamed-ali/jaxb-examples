package com.jaxb.tutorial.examples.domain;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement(namespace = "http://www.w3.org/1999/XSL/Transform")
@XmlAccessorType(XmlAccessType.FIELD)
public class Bookstore {

    @XmlElement(namespace="http://www.w3.org/1999/XSL/Transform")
    private String name;

    @XmlElement(namespace="http://company/book/location")
    private String location;

    @XmlElementWrapper(name = "bookList",namespace="http://www.w3.org/1999/XSL/Transform")
    @XmlElements(@XmlElement(name="book", namespace="http://www.w3.org/1999/XSL/Transform"))
    private ArrayList<Book> bookList;

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
