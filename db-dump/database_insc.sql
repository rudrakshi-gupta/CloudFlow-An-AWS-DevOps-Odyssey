CREATE DATABASE ebook_mems;
USE ebook_mems;

-- CREATE SEQUENCE seqid;
CREATE TABLE members(
    id int AUTO_INCREMENT,
    name varchar(50) not null,
    Email varchar(20) not null unique,
    password varchar(10) not null,
    phoneno varchar(20) not null unique,
    addrss varchar(100),
    Landmark varchar(100),
    city varchar(30),
    state varchar(30),
    zip varchar(10),
    PRIMARY KEY(id)
);

INSERT into members (name,Email,password,phoneno) values('joe','joe@hmail.com','gfiuegd','2837498329');