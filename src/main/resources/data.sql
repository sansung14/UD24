
DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250) NOT NULL,
	trabajo enum ('Frontend','Backend','Developer') NOT NULL,
	salario float
);

insert into empleado (nombre,trabajo, salario)values('Jose','Frontend',2000);
insert into empleado (nombre,trabajo, salario)values('Juan','Developer',3000);
insert into empleado (nombre,trabajo, salario)values('Pedro','Backend',1500);
insert into empleado (nombre,trabajo, salario)values('Jordi','Backend',1500);
insert into empleado (nombre,trabajo, salario)values('Jonatan','Backend',1500);