#!/bin/bash

echo ""
echo "Configurando projeto backend Spring Boot..."
echo ""

cd bycoders-api
./mvnw clean install
cd ../

echo "Ok"

echo ""
echo ""
echo "Configurando projeto frontend ReactJS..."
echo ""

cd bycoders-web
npm install
cd ../

echo "Ok"

echo ""
echo ""
echo "Executando Docker Compose..."
echo ""

docker-compose up --build
echo ""
echo "Finalizado!"

