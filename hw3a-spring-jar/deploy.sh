#! /bin/bash

scp target/hw3a-spring-jar.jar ali002:/data/app
ssh ali002 << "ENDSSH"
  cd /data/app
  nohup java -jar hw3a-spring-jar.jar &
ENDSSH
