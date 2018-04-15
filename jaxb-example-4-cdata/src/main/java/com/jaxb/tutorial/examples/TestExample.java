package com.jaxb.tutorial.examples;

import com.jaxb.tutorial.examples.domain.Book;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

//base source : http://theopentutorials.com/tutorials/java/jaxb/jaxb-marshalling-and-unmarshalling-cdata-block/
public class TestExample {

    public static void main(String[] args) throws JAXBException, IOException {

        Book book = new Book("<h1>The Games</h1>", "Neil Strauss", "Harpercollins");
        InputStream file = TestExample.class.getClassLoader().getResourceAsStream("oxm.xml");

        Map<String, StreamSource> oxm = new HashMap<String, StreamSource>(1);
        oxm.put("com.jaxb.tutorial.examples.domain", new StreamSource(file));

        Map<String, Map<String, StreamSource>> properties =
                new HashMap<String, Map<String, StreamSource>>();
        properties.put("eclipselink-oxm-xml", oxm);

        Class[] classes = { Book.class };
        JAXBContext context = JAXBContext.newInstance(classes , properties);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        m.marshal(book, System.out);
    }
}
