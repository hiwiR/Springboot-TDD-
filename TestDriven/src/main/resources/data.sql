drop table if exists car;
CREATE TABLE car (
    id int auto_increment  PRIMARY KEY ,
    name varchar(255) NOT NULL ,
    type varchar(255) NOT NULL
);

insert into car (id, name, type) values ('1','Elentra','Hyundai');