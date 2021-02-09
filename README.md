# microservices-spring-cloud-netflix

## This project is based on spring-cloud-netflix components for a microservices architecture.

![architecture](https://github.com/damar-git/microservices_/blob/main/asset/architecture.png "architecture")

## Components:

- __Config-Server__ (configuration server, first service to start, running at: http://localhost:8888)
    * [ ! ] Update __searchLocations__ property (resources/application.yaml) to your local path
- __Eureka__ (discovery service, running at: http://localhost:8080)
- __Zuul__ (API gateway, running at http://localhost:8762)
    * __Ribbon__ (load balancer, round robin strategy)
- __Microservices__ (Swagger documentation)
    * __Enrollment Service__ running at http://localhost:8081/swagger-ui.html
    * __Bookshop Service__ running at http://localhost:8082/swagger-ui.html
    * __Customer Service__ running at http://localhost:8083/swagger-ui.html
- __Sleuth__ (enhanced logging)
- __Zipkin__ (distribuited tracing system, guidelines in /zipkin folder, running at: http://localhost:9411) 

## Endpoints:

(Enrollment API)

* Retrieve service http listening port (call through the Zuul gateway):

```
http://localhost:8762/enrollment-service/enrollment-api/server/port [GET]
```

Response
```
{
    "service": "Enrollment Service",
    "httpPort": 8081
}
 ```
 
To test the Ribbon load balancing strategy (round robin as default) start a new microservice istance on a different port (let's say 8086) and call the same endpoint multiple times.
 
As result the http port will change for each new call.
 ```
{
    "service": "Enrollment Service",
    "httpPort": 8086
}
 ```

## References

- https://spring.io/projects/spring-cloud-netflix
- https://spring.io/guides
- https://zipkin.io/




   

