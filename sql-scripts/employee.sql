/*Drop user first if they exist*/
drop user if exists 'employee'@'localhost';

/*now create user with proper privileges*/
create user 'employee'@'localhost' identified by 'employee';

grant all privileges on *.* to 'employee'@'localhost';

SELECT * FROM employeemanagement.employee;

desc employee;

drop database employeemanagement;

create database employeemanagement;

use employeemanagement;

create table employee(
id int not null auto_increment,
title varchar(10),
name varchar(50),
email varchar(50),
age int,
gender varchar(10),
designation varchar(50),
phonenumber varchar(25),
primary key(id));

drop table employee;
