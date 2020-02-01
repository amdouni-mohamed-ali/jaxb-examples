# Description

In this example, we will show you how to parse an xsd file and generate java classes.

## Overview

We will use the jaxb maven plugin in this example which offers the possibility to parse an xsd file and generate java classes based on its declaration.

The jaxb configuration is declared in the pom.xml file and the xsd file can be found in the resources directory.

## Run the application

You have just to package the project so you can trigger the jaxb plugin to generate classes :

```bash
$ mvn clean package
```

After packaging the project, check the target/generated-sources directory to get the generated classes.

![Capture](https://user-images.githubusercontent.com/16627692/73600324-d7e38800-454e-11ea-9f6f-0e2198a1416a.JPG)
