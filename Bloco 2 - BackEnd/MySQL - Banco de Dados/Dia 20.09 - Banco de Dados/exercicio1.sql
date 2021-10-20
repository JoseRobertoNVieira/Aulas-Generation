create database db_funcionarios;

use db_funcionarios;

create table tb_funcionarios(
id bigint auto_increment,
nome varchar(250) not null,
sobrenome varchar(250) not null,
setor varchar(250) not null,
idade int,
salario decimal(6,2) not null,
primary key(id)
);

insert into tb_funcionarios(nome,sobrenome,setor,
idade,salario) values ("Jose","Vieira","TI",20,3200);
insert into tb_funcionarios(nome,sobrenome,setor,
idade,salario) values ("Maria","Vieira","TI",43,3700);
insert into tb_funcionarios(nome,sobrenome,setor,
idade,salario) values ("Jose","Silva","TI",20,2900);
insert into tb_funcionarios(nome,sobrenome,setor,
idade,salario) values ("Joao","Sousa","ADM",23,1800);
insert into tb_funcionarios(nome,sobrenome,setor,
idade,salario) values ("Guilherme","Cruz","ADM",23,1900);

select * from tb_funcionarios where salario > 2000;
select * from tb_funcionarios where salario < 2000;

update tb_funcionarios set salario = 3500 where id = 1;

select * from tb_funcionarios;
