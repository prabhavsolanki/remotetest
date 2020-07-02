#!/bin/bash
curl -u admin:admin  'http://localhost:4502/crx/de/search.jsp?_dc=1593452267724&query=testuser^&start=1&limit=10&_charset_=utf-8' | jq -r '.results[].path | select(match("home/users+";"i"))' | sed 's/\/profile//' | sed 's/\/rep:policy//' | sed 's/\/allow//'| uniq > var 

curl -u admin:admin -Fprofile/age=23 http://localhost:4502`sed 's/"//g' var`.rw.html

curl -u admin:admin -Fprofile/Date=`date '+%Y-%m-%d'` http://localhost:4502`sed 's/"//g' var`.rw.html

curl -u admin:admin  'http://localhost:4502/crx/de/search.jsp?_dc=1593452267724&query=testuser^&start=1&limit=10&_charset_=utf-8' | jq -r '.results[].path | select(match("home/users+";"i"))' | sed 's/\/profile//' | sed 's/\/rep:policy//' | sed 's/\/allow//'| uniq > varr

curl -u admin:admin -FdeleteAuthorizable= http://localhost:4502`sed 's/"//g' varr`


