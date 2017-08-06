#!/bin/bash
rm hello.jar
kotlinc hello.kt -include-runtime -d hello.jar
java -jar hello.jar
