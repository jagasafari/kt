#!/bin/bash
file=$1
jar="$file.jar"
kt="$file.kt"
if [ -f $jar ] ; then 
    rm $jar 
fi
kotlinc $kt -include-runtime -d $jar
java -jar $jar
