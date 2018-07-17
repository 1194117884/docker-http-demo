FROM java:8
MAINTAINER yongk_liu@163.com
ADD app/app.jar /opt/app/app.jar
WORKDIR /opt/app
CMD ["java","-jar","app.jar"]