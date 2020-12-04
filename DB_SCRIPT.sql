create database hospital;

use hospital;

create table patient (id int primary key auto_increment, name varchar(50),gender varchar(50),age int,address varchar(50),mobile varchar(50),date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,remarks varchar(250));

desc patient;

select * from patient;

alter table patient add role varchar(50) DEFAULT 'patient';

create table doctor (id int primary key auto_increment, name varchar(50),dept varchar(50),experience int, fee varchar(50));

desc doctor;

alter table doctor modify fee int;

select * from doctor;

update doctor set flag = 3 where id = 4;

insert into doctor (name,dept,experience,fee,flag)values("Ajay","Pathalogy",2,300,1);

create table appointment (id int primary key auto_increment, pname varchar(50),dname varchar(50),fee int,appdate date, apptime time,createdate TIMESTAMP DEFAULT CURRENT_TIMESTAMP);

update patient set username = "dinesh" where id = 1;

alter table patient change usename username varchar(50);
select * from patient;

delete from patient where id =17;

desc appointment;

insert into appointment (pname,dname,fee,appdate,apptime) values ("Raju","Saravanan",500,'2020-11-25','11:30:00');

select * from appointment;

alter table patient modify role varchar(50) default 'ROLE_PATIENT';

desc patient;

update patient set role = "ROLE_DOCTOR" where id = 25;

select * from patient;

delete from patient;
SET SQL_SAFE_UPDATES = 0;