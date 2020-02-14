# Jaxb Examples

JAXB stands for Java Architecture for XML Binding. It provides mechanism to marshal (write) java objects into XML and unmarshal (read) XML into object. 
Simply, you can say it is used to convert java object into xml and vice-versa.

This repository contains simple examples of you can use this api to manipulate XML documents using java.

This is the list of examples :

```
jaxb examples
│
└─── jaxb-example-1
└─── jaxb-example-2-toString
└─── jaxb-example-4-cdata
└─── jaxb-example-namespace
└─── jaxb-maven-plugin
|    └─── first-example
|    └─── second-example
|    └─── third-example
```

### Prerequisites

To create your development environment, you will need to :

- install java 8
- install maven
- install git to clone the project
- you favorite IDE (i'm using intellij)

### Installing

To clone the project, run this command :

```
    $ git clone https://github.com/amdouni-mohamed-ali/jaxb-examples.git
    $ cd jaxb-examples
```

And run this to package the project :

```
    $ mvn clean package
```

```log
[INFO] 
[INFO] jaxb-examples ...................................... SUCCESS [  0.158 s]
[INFO] jaxb-example-1 ..................................... SUCCESS [  2.013 s]
[INFO] jaxb-example-namespace ............................. SUCCESS [  0.392 s]
[INFO] jaxb-example-2-toString ............................ SUCCESS [  0.193 s]
[INFO] jaxb-example-4-cdata ............................... SUCCESS [  0.294 s]
[INFO] jaxb-maven-plugin .................................. SUCCESS [  0.003 s]
[INFO] first-example ...................................... SUCCESS [  2.590 s]
[INFO] second-example ..................................... SUCCESS [  2.123 s]
[INFO] third-example ...................................... SUCCESS [  0.306 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  8.425 s
[INFO] Finished at: 2020-02-15T00:28:04+01:00
[INFO] ------------------------------------------------------------------------

```

## Built With

* [Java](https://openjdk.java.net/) - java version "1.8.0_101"
* [Maven](https://maven.apache.org/) - Dependency Management (version 3.6.0)
* [Intellij](https://www.jetbrains.com/) - IDE (version 2018.3.3)

## Authors

* **Mohamed Ali AMDOUNI**