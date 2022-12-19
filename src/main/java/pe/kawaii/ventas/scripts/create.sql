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
    nombre varchar(255) not null,
    username varchar(255) not null,
    password varchar(255) not null,
    rol_id int not null,
    primary key (id),
    foreign key (rol_id) references roles(id)
);

create table clientes (
    id int not null auto_increment,
    nombre_completo varchar(255) not null,
    dni varchar(255) not null,
    ruc varchar(255),
    correo varchar(255) not null,
    celular varchar(255) not null,
    direccion varchar(255) not null,
    primary key (id)
);

create table productos (
    id int not null auto_increment,
    nombre varchar(255) not null,
    descripcion varchar(255),
    precio decimal(10,2) not null,
    stock int not null,
    primary key (id)
);

create table ventas (
    id int not null auto_increment,
    usuario_id int not null,
    cliente_id int not null,    
    fecha_registro datetime not null,
    total decimal(10,2) not null,
    anulada boolean not null,
    primary key (id)
);

create table detalles (
id int not null auto_increment,
venta_id int not null,
producto_id int not null,
cantidad int not null,
precio_unitario decimal(10,2) not null,
subtotal decimal(10,2) not null,
primary key (id),
foreign key (venta_id) references ventas(id)
);