#!/bin/bash

rm -rf build/*.class

javac -cp "lib/*" src/*.java -d build/