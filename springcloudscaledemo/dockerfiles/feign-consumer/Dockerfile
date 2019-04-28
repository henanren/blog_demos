FROM openjdk:8
 
VOLUME ["/usr/local/tmp","/usr/local/dumpPath"]
ADD *.jar /usr/local/app.jar
ENV JAVA_OPTS=" -server -Xms128m -Xmx256m -XX:+UseG1GC -XX:MaxGCPauseMillis=20 -XX:+DisableExplicitGC -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/usr/local/dumpPath -XX:+ExitOnOutOfMemoryError "

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/usr/local/app.jar"]
