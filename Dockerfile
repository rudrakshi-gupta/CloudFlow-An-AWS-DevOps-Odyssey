FROM mysql:latest
ENV MYSQL_ROOT_PASSWORD=root
COPY ./db-dump/database_insc.sql /docker-entrypoint-initdb.d/