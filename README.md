# ANTLR4 Java Maven for Micro Compiler

## Dependencies
1. Java
2. Maven

## Execute the code
```bash
mvn compile exec:java

# for executing tests
mvn test

# to build an executable jar file
mvn clean compile assembly:single
java -jar target/micro_little-1.0-SNAPSHOT-jar-with-dependencies.jar src/main/resources/input.txt
```

## References

1) https://github.com/mauriceoc/antlr4-maven-example
2) https://github.com/gaopinghuang0/compiler-java-antlr4/blob/master/Micro.g4