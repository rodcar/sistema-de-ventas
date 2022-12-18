/* SQL para el registro de datos en la base de datos */

/* Tabla de roles */
insert into roles values (0, "ADMINISTRADOR");
insert into roles values (1, "VENDEDOR");

/* Tabla de usuarios */
insert into usuarios values (null, "admin", md5("admin"), 0);
insert into usuarios values (null, "vendedor", md5("vendedor"), 1);