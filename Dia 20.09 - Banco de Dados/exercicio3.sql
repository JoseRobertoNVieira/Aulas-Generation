create database db_escola;

use db_escola;

create table tb_alunos(
id bigint auto_increment,
nome varchar(50) not null,
sobrenome varchar(50) not null,
idade int not null,
serie int not null,
sala int not null,
materia varchar(50) not null,
nota decimal(3,2),
primary key(id)
);

insert into tb_alunos(nome,sobrenome,idade,serie,sala,materia,nota)
values ("João","Silva",13,5,3,"Matemática",4.6);
insert into tb_alunos(nome,sobrenome,idade,serie,sala,materia,nota)
values ("João","Sousa",13,5,2,"Matemática",7.4);
insert into tb_alunos(nome,sobrenome,idade,serie,sala,materia,nota)
values ("José","Vieira",12,5,3,"Matemática",9.8);
insert into tb_alunos(nome,sobrenome,idade,serie,sala,materia,nota)
values ("Maria","Silva",14,6,4,"Inglês",7.6);
insert into tb_alunos(nome,sobrenome,idade,serie,sala,materia,nota)
values ("Renato","Pereira",14,6,4,"Matemática",8.2);
insert into tb_alunos(nome,sobrenome,idade,serie,sala,materia,nota)
values ("Brenda","Santana",15,7,8,"Física",9.7);
insert into tb_alunos(nome,sobrenome,idade,serie,sala,materia,nota)
values ("Mario","Silva",15,7,9,"Matemática",3.6);
insert into tb_alunos(nome,sobrenome,idade,serie,sala,materia,nota)
values ("Ruan","SAdafgdsg",15,7,9,"Matemática",6.4);

select * from tb_alunos where nota > 7.0;
select * from tb_alunos where nota < 7.0;

update tb_alunos set nota = 9.5 where id = 3;