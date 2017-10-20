FROM java:8
ADD target/clojure-now-0.1.0-SNAPSHOT-standalone.jar /srv/clojure-now.jar
EXPOSE 80
CMD ["java", "-jar", "clojure-now.jar"]
