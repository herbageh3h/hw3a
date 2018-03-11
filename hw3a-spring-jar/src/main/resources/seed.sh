#! /bin/bash

scp db.sql ali002:/data/app
ssh ali002 <<"ENDSSH"
  cd /data/app
  mysql -uhw3a -pShooter#123 <<"ENDMYSQL"
  use hw3a
  source /data/app/db.sql;
  exit
ENDMYSQL
ENDSSH
