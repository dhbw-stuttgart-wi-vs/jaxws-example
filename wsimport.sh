#!/bin/bash

rm -rf src/main/java/dhbw/vs/jaxws/generated

wsimport -verbose -s src/main/java/ -p dhbw.vs.jaxws.generated -wsdllocation "http://localhost:8888/testservice/?wsdl" -generateJWS -Xnocompile hello.wsdl
