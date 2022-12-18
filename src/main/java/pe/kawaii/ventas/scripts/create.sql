/* SQL para la creación de la base de datos del sistema */

create database ventas;
use ventas;

create table roles (
    id int not null,
    nombre varchar(255) not null,
    PRIMARY KEY (id)
);

create table usuarios (
    id int not null auto_increment,
    username varchar(255) not null,
    password varchar(255) not null,
    rol_id int not null,
    primary key (id),
    foreign key (rol_id) references roles(id)
);
