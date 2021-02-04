# microservices-spring-cloud-netflix

## This project is based on spring-cloud-netflix components for a microservices architecture.

### Visual architecture:



### Components:

- Config-Server (configuration server, first service to start, running at: http://localhost:8888)
    * Update searchLocations property (resources/application.yaml) to your local path
- Eureka (discovery service, running at: http://localhost:8080)
- Zuul (API gateway, running at http://localhost:8762)
- Microservices (Swagger documentation):
    * Enrollment Service running at http://localhost:8081/swagger-ui.html
    * Bookshop Service running at http://localhost:8082/swagger-ui.html
    * Customer Service running at http://localhost:8083/swagger-ui.html
- Sleuth
- Zipkin (distribuited tracing system, guidelines at /zipkin folder, running at: http://localhost:9411) 

### Endpoints:

(Enrollment API)

* Retrieve service http listening port (call through the Zuul gateway):

```
http://localhost:8762/enrollment-api/server/port [GET]
```

Response
```
[Enrollment-API] HTTP Server Port: 8081
 ```

### References

- https://spring.io/projects/spring-cloud-netflix
- https://spring.io/guides
- https://zipkin.io/




   

