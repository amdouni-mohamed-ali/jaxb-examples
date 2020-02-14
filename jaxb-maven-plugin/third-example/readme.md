# Description

In this example, we will show you how to parse multiple xsd files and generate java classes.

## Overview

In this example we will show you how to define multiple xsd files in the jaxb configuration and how to generate them in different packages.

## Run the application

You have just to package the project so you can trigger the jaxb plugin to generate classes :

```bash
$ mvn clean package
```

After packaging the project, check the target/generated-sources directory to get the generated classes.

![Capture](https://user-images.githubusercontent.com/16627692/73600575-7fae8500-4552-11ea-9cae-9d0248b5b423.JPG)
