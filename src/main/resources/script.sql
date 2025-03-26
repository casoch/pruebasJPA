CREATE DATABASE IF NOT EXISTS maven_bbdd;

create table empleado(
	dni varchar(10) primary key,
    nombre varchar(50),
    sueldo dec(10,2)
);