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

insert into clientes values (null, "Diego Zapata", "48692278", null, "zapatero@gmail.com", "937602574", "Jr. Altillo 196");
insert into clientes values (null, "Juana Romero", "55678321", null, "juanita33@gmail.com", "998304351", "Av. Benavides 225");
insert into clientes values (null, "Flor Rondon", "8023330", null, "flor@gmail.com", "998304351", "Av. Cardenal Quintero");
insert into clientes values (null, "Daniel Cespedes", "49632211", null, "danielito@gmail.com", "916985633", "Jr. Pedro Venturo 125");
insert into clientes values (null, "Daniela Andaluza", "98678421", null, "dani55@gmail.com", "998314588", "Malecon 245");
insert into clientes values (null, "Andres Perez", "85698246", null, "andre_11@gmail.com", "995889912", "Los alamos 114");

insert into productos values (null, "Legos", "El producto Lego es de la marca LEGO", 50, 100);
insert into productos values (null, "Monopoly", "El producto Monopoly es de la marca HASBRO", 120, 50);
insert into productos values (null, "Auto Eléctrico Maserati ", "El producto Auto Eléctrico Maserati  es de la marca MASERATI GLI", 600, 5);
insert into productos values (null, "Mi primera cocina", "El producto Mi primera cocina es de la marca KIDS-N-PLAY", 71.90, 60);
insert into productos values (null, "Tobogan para niños", "El producto Tobogan para niños es de la marca LITTLE-TIKES", 709, 30);
insert into productos values (null, "Carro a control remoto", "El producto Carro a control remoto es de la marca MAISTO", 90, 120);
insert into productos values (null, "Pistola de agua", "El producto Pistola de agua es de la marca SUPER-SOAKER", 129, 80);
insert into productos values (null, "Adivina quien", "El producto Adivina quien es de la marca HASBRO", 55.93, 200);
insert into productos values (null, "Guitarra de spiderman", "El producto Guitarra de spiderman es de la marca SPIDERMAN", 41.93, 150);
insert into productos values (null, "Set de bloques", "El producto Set de bloques es de la marca BUILD-ME-UP-MAXI", 51.60, 180);