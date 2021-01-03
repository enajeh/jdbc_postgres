create database db_cours;

create table employee(
    emp_id SERIAL ,
    emp_name varchar(400),
    emp_address varchar(400),
    primary key (emp_id)
);