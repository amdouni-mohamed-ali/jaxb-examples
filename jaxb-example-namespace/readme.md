# Description

In this example, we will add a namespace to our xml documents.

## Overview

In the source code, you will find an examples to how to customize the namespaces of you xml documents. You have to declare
namespaces in the `MyNamespaceMapper.java` and then use them in the entities classes as part of the @XmlElement annotation
for example this annotation `@XmlElement(namespace="http://www.w3.org/1999/XSL/Transform") private String name;` on the name field will make
sure that the generated name will be tagged with this namespace.

## Run the application

This is a simple java application, you have to run the main method from `TestExample.java` or `TestExamplePassengers.java` files.

This is the result of running the main method of the first  :

```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<ogm:bookstore xmlns:ogm="http://www.w3.org/1999/XSL/Transform" xmlns:loc="http://company/book/location" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
    <ogm:name>Fraport Bookstore</ogm:name>
    <loc:location>Frankfurt Airport</loc:location>
    <ogm:bookList>
        <ogm:book>
            <ogm:name>The Game</ogm:name>
            <ogm:author>Neil Strauss</ogm:author>
            <ogm:publisher>Harpercollins</ogm:publisher>
        </ogm:book>
    </ogm:bookList>
</ogm:bookstore>
```