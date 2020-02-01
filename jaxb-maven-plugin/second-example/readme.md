# Description

In this example, we will show you how to parse an xsd file and generate java classes.

## Overview

As the last example, in this one we will use jaxb maven plugin to generate java classes from an xsd. This time we will show you how to customize
this plugin. How to define the xsd directory for example, or to define the output directory and generated classes package ...

As in one of our entities contains Date as a type jaxb will need more details about how to map it to java or how print it the xml file. For this 
we defined the `education.xjb` file which will tell jaxb where to find the converter. The converter is a java class that we've created to map the xml
element to a java object and the java object to xml.

We've used jaxb2-basics to add the toString and equals methods in the generated classes.

## Run the application

You have just to package the project so you can trigger the jaxb plugin to generate classes :

```bash
$ mvn clean package
```

After packaging the project, run the main method in the `Application.java` file. You should have this result :

```log
<!----------Generating the XML Output-------------->
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<University>
    <name>Cambridge</name>
    <address>England</address>
    <Students>
        <Student id="1">
            <firstName>Alan</firstName>
            <lastName>Turing</lastName>
            <birthDate>1956-10-01</birthDate>
            <section>Computer Science</section>
        </Student>
        <Student id="2">
            <firstName>Thomas</firstName>
            <lastName>Edison</lastName>
            <birthDate>1916-03-03</birthDate>
            <section>Physics</section>
        </Student>
    </Students>
</University>
<!---------------Generating the Java objects from XML Input-------------->
com.jaxb.tutorial.examples.generated.classes.Student@7bfcd12c[firstName=Alan, lastName=Turing, birthDate=1956-10-01, section=Computer Science, id=1]
com.jaxb.tutorial.examples.generated.classes.Student@5b1d2887[firstName=Thomas, lastName=Edison, birthDate=1916-03-03, section=Physics, id=2]
```
