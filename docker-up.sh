#!/usr/bin/bash
(
  echo "----------Installing framework module----------"
  {
    cd framework || exit
    mvn clean
    mvn install
  } >/dev/null
)
(
  echo "----------Packaging scoring module----------"
  {
    cd scoring || exit
    mvn clean
    mvn package
    clear
  } >/dev/null
)
(
  echo "----------Docker compose building and up----------"
  {
    docker compose down -v
    docker compose up -d --build
  } >/dev/null
)
