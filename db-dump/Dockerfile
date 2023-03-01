FROM mysql:latest
ENV MYSQL_ROOT_PASSWORD=root
RUN mysql_upgrade -p
COPY ./db-dump/database_insc.sql /docker-entrypoint-initdb.d/