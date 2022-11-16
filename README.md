# EC3 Renzo Villanueva

### Usuario: alex  -  Password: 123456
```sql
create database ec3_idat;
use ec3_idat;

insert into cliente (nombre,celular) values ("alexander","999999999");
insert into cliente (nombre,celular) values ("cliente 1","999999999");
insert into cliente (nombre,celular) values ("cliente 2","999999999");
insert into cliente (nombre,celular) values ("cliente 3","999999999");
insert into usuariocliente (usuario, password, rol,id_cliente) values ('alex', '$2a$12$3TteEeZGXGAY3Rd2R/bLBesFDjZbpGvGaRN./ssxIn.HpspzGiFme', 'ROLE_ADMIN',1);
insert into usuariocliente (usuario, password, rol,id_cliente) values ('user1', '$2a$12$3TteEeZGXGAY3Rd2R/bLBesFDjZbpGvGaRN./ssxIn.HpspzGiFme', 'ROLE_USER',2);

insert into usuariocliente (usuario, password, rol,id_cliente) values ('user2', '$2a$12$3TteEeZGXGAY3Rd2R/bLBesFDjZbpGvGaRN./ssxIn.HpspzGiFme', 'ROLE_USER',3);
insert into usuariocliente (usuario, password, rol,id_cliente) values ('user3', '$2a$12$3TteEeZGXGAY3Rd2R/bLBesFDjZbpGvGaRN./ssxIn.HpspzGiFme', 'ROLE_USER',4);

```