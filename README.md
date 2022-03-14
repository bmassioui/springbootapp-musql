# About
Simple CRUD App using Spring Boot MVN and MySql

## Run the System
We can easily run the whole with only a single command:
```bash
docker-compose up
```

Docker will pull the MySQL and Spring Boot images (if our machine does not have it before).

The services can be run on the background with command:
```bash
docker-compose up -d
```
- **springbootappmusql-api:3306 ==> http://localhost:3306/**
- **springbootappmusql-api:All ==> http://localhost:8080/api/tutorials/all**
- **springbootappmusql-api:Add ==> http://localhost:8080/api/tutorials/Add?productName=Dell&price=24000**

## Stop the System
Stopping all the running containers is also simple with a single command:
```bash
docker-compose down
```

If you need to stop and remove all containers, networks, and all images used by any service in <em>docker-compose.yml</em> file, use the command:
```bash
docker-compose down --rmi all
```
