package com.jaxb.tutorial.examples;

import com.jaxb.tutorial.examples.generated.classes.Student;
import com.jaxb.tutorial.examples.generated.classes.University;
import org.joda.time.LocalDate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/*
 * check this for details : http://websystique.com/java/jaxb/jaxb-codegeneration-maven-example/
 * execute : mvn clean install on command line before testing this class
 */
public class Application {

    public static void main(String... a) throws JAXBException, FileNotFoundException {

        List<Student> students = generatedStudents();

        University university = new University();
        university.setName("Cambridge");
        university.setAddress("England");
        University.Students stds = new University.Students();
        stds.getStudent().addAll(students);
        university.setStudents(stds);

        // create JAXB context
        JAXBContext context = JAXBContext.newInstance(University.class);

        System.out.println("<!----------Generating the XML Output-------------->");

        // Marshalling [Generate XML from JAVA]
        // create Marshaller using JAXB context
        Marshaller m = context.createMarshaller();
        // To format the [to be]generated XML output
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // Marshall it and write output to System.out or to a file
        m.marshal(university, System.out);
        m.marshal(university, new File("testFile.xml"));

        System.out.println("<!---------------Generating the Java objects from XML Input-------------->");
        // UnMarshalling [Generate JAVA from XML]
        // Instantiate Unmarshaller via context
        Unmarshaller um = context.createUnmarshaller();
        // Unmarshall the provided XML into an object
        University unif = (University) um.unmarshal(new FileReader("testFile.xml"));
        List<Student> studentsList = unif.getStudents().getStudent();

        studentsList.forEach(System.out::println);
    }

    private static List<Student> generatedStudents() {

        List<Student> students = new ArrayList<Student>();

        Student s1 = new Student();
        s1.setFirstName("Alan");
        s1.setLastName("Turing");
        s1.setSection("Computer Science");
        s1.setBirthDate(new LocalDate(1956, 10, 1));
        s1.setId(1);
        students.add(s1);

        Student s2 = new Student();
        s2.setFirstName("Thomas");
        s2.setLastName("Edison");
        s2.setSection("Physics");
        s2.setBirthDate(new LocalDate(1916, 3, 3));
        s2.setId(2);
        students.add(s2);

        return students;
    }
}
