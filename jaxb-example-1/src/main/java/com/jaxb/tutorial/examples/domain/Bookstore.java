package com.jaxb.tutorial.examples.domain;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
/*
    so important to use this annotation otherwise we gonna have an exception
    @ XmlAccessType.FIELD: indicates that all non-static fields of the class are taken into account;
    @ XmlAccessType.PROPERTY: indicates that all pairs of getters / setters are taken into account;
    @ XmlAccessType.PUBLIC: indicates that all getter / setter pairs and non-static public fields will be taken into account;
    @ XmlAccessType.NONE: Indicates that no field or property is taken into account.
 */
public class Bookstore {

    private String name;
    private String location;

    @XmlElementWrapper(name = "bookList")
    /*
        XmLElementWrapper generates a wrapper element around XML representation
     */
    @XmlElement(name = "book")
    /*
        the name of the Book object into the xml file (by default the name is bookList)
     */
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
