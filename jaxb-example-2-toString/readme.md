# Description

In this example, we will convert the xml stream to a string.

## Overview

In the `TestExample.java` class, you will find an example of you can create a marshaller using jaxb and to get its content as a string.
This feature can be useful to store the xml in a database or to send it via jms or other technologies.

## Run the application

This is a simple java application, you have to run the main method from `TestExample.java` file.

After running the app check the console to get the content of the string that stores the xml. You should have this result :

```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?><bookstore><name>Fraport Bookstore</name><location>Frankfurt Airport</location><bookList><book><author>Neil Strauss</author><name>The Game</name><publisher>Harpercollins</publisher></book></bookList></bookstore>
```