#!/bin/bash


mvn clean install;java -jar target/nectirini-1.0-SNAPSHOT.jar server http-simple-client.yml
