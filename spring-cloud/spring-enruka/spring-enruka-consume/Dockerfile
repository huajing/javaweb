## 添加国内镜像源 https://cr.console.aliyun.com/

## jdk
FROM adoptopenjdk/openjdk8

VOLUME /tmp
ADD target/spring-enruka-consume.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]