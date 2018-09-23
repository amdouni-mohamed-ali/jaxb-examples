package com.jaxb.tutorial.examples;

public class Application {

    /*
        We use the jaxb2-maven-plugin maven plugin to transform our XSD schema into Java Classes.
        These Java Classes will be generated in the target/generated-resources/jaxb folder by default.
        You could override the output directory by adding a child element outputDirectory to the configuration element.
        If you use this custom output directory your files will be cleared/replaced on every build.
        If you add extra classes to these directories you must also add the clearOutputDir with a value of false.

        We can provide a global bindings file. These binding declarations override the default binding rules.
        Like in this example we override the dateTime type to the java.util.Calendar type.

        execute the mvn clean package command to generate classes
     */
}
