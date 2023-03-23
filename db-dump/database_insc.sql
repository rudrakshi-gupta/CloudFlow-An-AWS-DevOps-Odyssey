CREATE DATABASE ebook_mems;
USE ebook_mems;

CREATE TABLE members(
    Userid int not null UNIQUE,
    Uname varchar(50) not null,
    Email varchar(20) not null unique,
    Phoneno varchar(20) not null unique,
    PasswordU varchar(10) not null,
    addrss varchar(100),
    Landmark varchar(100),
    City varchar(30),
    StateU varchar(30),
    zip varchar(10) not null,
    PRIMARY KEY(Userid)
);