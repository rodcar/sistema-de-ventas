/* SQL para el registro de datos en la base de datos */

/* Tabla de roles */
insert into roles values (0, "ADMINISTRADOR");
insert into roles values (1, "VENDEDOR");

/* Tabla de usuarios */
insert into usuarios values (null, "Ivan Rodriguez", "admin", md5("admin"), 0);
insert into usuarios values (null, "Ivan Rodriguez", "vendedor", md5("vendedor"), 1);

/* Datos de clientes */
insert into clientes values (null, "Ivan Rodriguez", "70251397", null, "nnrodcar@gmail.com", "950302674", "Jr. Atahualpa 100");
insert into clientes values (null, "Cliente B", "70251234", null, "clienteb@gmail.com", "950304321", "Av. Salaverry 100");

/* Tabla de productos */
insert into productos values (null, "Producto A", "El producto A es de la marca B", 20.5, 50);
insert into productos values (null, "Producto B", "El producto A es de la marca B", 5.7, 100);
insert into productos values (null, "Producto C", "El producto A es de la marca B", 12.2, 5);