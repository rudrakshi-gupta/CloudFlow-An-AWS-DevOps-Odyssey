FROM mysql:latest
ENV MYSQL_ROOT_PASSWORD=root
EXPOSE 3306
RUN mysql_upgrade -p
COPY database_insc.sql /docker-entrypoint-initdb.d/