# Description

In this example, we will show you how to marshall a CDATA block using jaxb.

## Overview

We will create a simple Book POJO class in the domain package. The name of the book will be this xml document :

```xml
<?xml version="1.0"?>
<catalog>
   <book id="bk101">
      <author>Gambardella, Matthew</author>
      <title>XML Developer's Guide</title>
      <genre>Computer</genre>
      <price>44.95</price>
      <publish_date>2000-10-01</publish_date>
      <description>An in-depth look at creating applications 
      with XML.</description>
   </book>
</catalog>
```

We gonna make the name of the book a CDATA block using the `@XmlCDATA` annotation. Check the `Book.java` file.

## Run the application

This is a simple java application, you have to run the main method from `TestExample.java` file.

This is the result of running the main method of the first  :

```xml
<?xml version="1.0" encoding="UTF-8"?>
<book>
   <name><![CDATA[<?xml version="1.0"?>
<catalog>
   <book id="bk101">
      <author>Gambardella, Matthew</author>
      <title>XML Developer's Guide</title>
      <genre>Computer</genre>
      <price>44.95</price>
      <publish_date>2000-10-01</publish_date>
      <description>An in-depth look at creating applications 
      with XML.</description>
   </book></catalog>
]]></name>
   <author>Neil Strauss</author>
   <publisher>Harpercollins</publisher>
</book>
```

As we can see the xml block has been avoided with the CDATA block.