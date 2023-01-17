# spring-cloud-config-example
Dynamically using application.properties using spring cloud config server.


# Summary :

Created simple Limits-Service microservice that gets minimum and maximum limit from application.properties file. 
Also created a Spring Cloud Config Server using springboot and added a limits-service.properties under git-local-repo.
On running both the applications, go through below urls : 

Limits-Service:
- http://localhost:8080/limits

Spring Cloud Config Server:
- http://localhost:8888/limits-service/default
- http://localhost:8888/limits-service/dev
- http://localhost:8888/limits-service/qa

Git Repo local:
- limits-service.properties
- limits-service-dev.properties
- limits-service-qa.properties
