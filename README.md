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
- **Sonar Cloud ==> https://sonarcloud.io/summary/new_code?id=bmassioui_springbootapp-musql**
- **bmassioui/springbootapp-musql:main (docker hub registry) ===> https://hub.docker.com/layers/197519438/bmassioui/springbootapp-musql/main/images/sha256-256397356b487d288ec26fbdbc68fadc98ee0d0e0994657438c2faf1d925b28d?context=repo"
- **bmassioui/springbootapp-musql:main (github registry) ===> https://github.com/bmassioui/springbootapp-musql/pkgs/container/springbootapp-musql**
- **Release ==> https://github.com/bmassioui/springbootapp-musql/releases/tag/1.1.0**

## Action
- [Maven CI/CD (Auto triggered)](https://github.com/bmassioui/springbootapp-musql/actions/workflows/maven.yml)
- [API Image CI/CD (Manually)](https://github.com/bmassioui/springbootapp-musql/actions/workflows/docker-cicd.yml)
 
## Stop the System
Stopping all the running containers is also simple with a single command:
```bash
docker-compose down
```

If you need to stop and remove all containers, networks, and all images used by any service in <em>docker-compose.yml</em> file, use the command:
```bash
docker-compose down --rmi all
```
