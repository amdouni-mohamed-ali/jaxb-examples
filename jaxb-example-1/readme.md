# Description

In this first example, we will create an xml file using java objects.

## Overview

We will create two java classes Book and Bookstore and add some jaxb annotations so they can be parsed by this last. After populating
java entities with data we will create the xml file in the current directory and show its content in the console.

## Run the application

This is a simple java application, you have to run the main method from `TestExample.java` file.

After running the app check the console to get the xml content. And to get the generated file run this command from the main directory :

```bash
$ cat ./bookstore-jaxb.xml
```

```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<bookstore>
    <name>Fraport Bookstore</name>
    <location>Frankfurt Airport</location>
    <bookList>
        <book>
            <author>Neil Strauss</author>
            <title>The Game</title>
            <publisher>Harpercollins</publisher>
        </book>
        <book>
            <author>Charlotte Roche</author>
            <title>Feuchtgebiete</title>
            <publisher>Dumont Buchverlag</publisher>
        </book>
    </bookList>
</bookstore>
```