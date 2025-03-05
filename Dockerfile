FROM findepi/graalvm:java21
ADD build/libs/eureka-server-*.jar /eureka-server.jar
LABEL com.github.eureka=v1.0.0
CMD ["java","-jar", "eureka-server.jar"]