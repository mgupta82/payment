cd mysql

docker build -t payment/persistencedb .

cd ..

cd persistance-api

call mvn clean install dockerfile:build -DskipTests

cd router-service

call mvn clean install dockerfile:build -DskipTests

cd ..