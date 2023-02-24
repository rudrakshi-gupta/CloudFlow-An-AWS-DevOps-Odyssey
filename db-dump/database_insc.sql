CREATE DATABASE ebook_mems;
USE ebook_mems;

CREATE TABLE members(
    Userid int not null,
    Uname varchar not null,
    Email varchar not null unique,
    Phoneno varchar not null unique,
    PasswordU varchar not null,
    addrss varchar,
    Landmark varchar,
    City varchar,
    StateU varchar,
    zip int not null,
    PRIMARY KEY(Userid)
);