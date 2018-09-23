package com.jaxb.tutorial.examples.converter;

import org.joda.time.LocalDate;

public class DateConverter {

    /*
        JAXB looks into binding files when it might need help in XML to Java type conversion and vice versa.
        For example, we are using JodaTime LocalDate, but JAXB does not know how to convert JodaTime LocalDate into XML date.
        It’s up to us, to provide this information (through .xjb files).
        In practice, we as developer provide java classes which contains print[converts XML to java type] and parse methods
        [convert Java type to XML] (used by JAXB), and declare these classes in binding file(.xjb) under javaType.
     */

    public static LocalDate parse(String rawValue) {
        if (rawValue == null || rawValue.trim().equalsIgnoreCase("")) {
            return null;
        }
        try {
            return new LocalDate(rawValue);
        } catch (IllegalArgumentException ex) {
            throw new ConverterException("Unable to parse date: " + rawValue, ex);
        }
    }

    public static String print(LocalDate date) {
        if (date == null) {
            return null;
        }
        return date.toString();
    }
}
