# Zipkin

## Quickstart

* Docker

The Docker Zipkin project is able to build docker images, provide scripts and a docker-compose.yml for launching pre-built images. The quickest start is to run the latest image directly:

```
docker run -d -p 9411:9411 openzipkin/zipkin
```

* Java

If you have Java 8 or higher installed, the quickest way to get started is to fetch the latest release as a self-contained executable jar:
```
curl -sSL https://zipkin.io/quickstart.sh | bash -s
java -jar zipkin.jar
```

* Running from Source

Zipkin can be run from source if you are developing new features. To achieve this, you’ll need to get Zipkin’s source and build it.

```
# get the latest source
git clone https://github.com/openzipkin/zipkin
cd zipkin
# Build the server and also make its dependencies
./mvnw -DskipTests --also-make -pl zipkin-server clean install
# Run the server
java -jar ./zipkin-server/target/zipkin-server-*exec.jar
```

Zipkin up and running at: http://localhost:9411

Source: https://zipkin.io/pages/quickstart.html