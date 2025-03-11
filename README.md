# Eureka Server
-----
A production ready Eureka server running atop GraalVM and configured to use non-blocking IO with Apache Tomcat. This repository contains the base code, the actual docker image can be found [here](https://hub.docker.com/r/rainbowzephyr/eureka-server).

## Environment Variables
- `EUREKA_PORT`: defaults to 8761
- `EUREKA_REGISTER_CLIENT`: defaults to false
- `EUREKA_FETCH_REGISTERY`: defaults to false
- `EUREKA_LOG_LEVEL`: defaults to OFF
- `EUREKA_DISCOVERY_LOG_LEVEL`: defaults to OFF
