FROM tomcat:latest

ADD pom.xml /usr/local/tomcat/webapps/

EXPOSE 8081


# # Start with a base image
# FROM ubuntu:22.04

# # Install dependencies
# RUN apt-get update && apt-get install -y \
#  curl \
#  wget \
#  unzip \
#  openjdk-8-jdk

# # Install Git
# RUN apt-get update && apt-get install -y git

# # Install SonarQube
# RUN wget https://binaries.sonarsource.com/Distribution/sonarqube/sonarqube-7.9.5.zip
# RUN unzip sonarqube-7.9.5.zip

# # Install Tomcat
# RUN mkdir /usr/local/tomcat
# RUN wget https://downloads.apache.org/tomcat/tomcat-9/v9.0.72/bin/apache-tomcat-9.0.72.tar.gz
# RUN tar xvfz apache-tomcat-9.0.72.tar.gz -C /usr/local/tomcat --strip-components=1
# EXPOSE 8081


# # Set the command to run when the container starts
CMD ["/usr/local/tomcat/bin/catalina.sh","run"]