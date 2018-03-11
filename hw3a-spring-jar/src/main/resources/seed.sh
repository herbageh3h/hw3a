#! /bin/bash

scp schema.sql ali001:/data/app
ssh ali001 <<"ENDSSH"
  cd /data/app
  mysql -uhw3a -pShooter#123 <<"ENDMYSQL"
  use hw3a
  source /data/app/schema.sql;
  exit
ENDMYSQL
ENDSSH
