FROM java:8

COPY target/zodiac-web-service-1.0.jar /usr/src/zodiac-ws.jar

CMD ["java", "-jar", "/usr/src/zodiac-ws.jar"]