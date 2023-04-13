CREATE DATABASE ebook_mems;
USE ebook_mems;

CREATE TABLE members(
    -- id int not null UNIQUE,
    name varchar(50) not null,
    Email varchar(20) not null unique,
    password varchar(10) not null,
    phoneno varchar(20) not null unique,
    addrss varchar(100),
    Landmark varchar(100),
    city varchar(30),
    state varchar(30),
    zip varchar(10),
    PRIMARY KEY(phoneno)
);