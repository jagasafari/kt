#!/bin/bash
rm basicKotlin.jar
kotlinc basicKotlin.kt -include-runtime -d basicKotlin.jar
java -jar basicKotlin.jar
