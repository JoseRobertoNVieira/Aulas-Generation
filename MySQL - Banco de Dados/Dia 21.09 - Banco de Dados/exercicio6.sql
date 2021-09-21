create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint auto_increment,
tipo_curso varchar(50) not null,
video_aula int not null,
gratuidade boolean,
primary key (id)
);

insert into tb_categoria(tipo_curso,video_aula,gratuidade)
values ("Ciências Humanas",false,true);
insert into tb_categoria(tipo_curso,video_aula,gratuidade)
values ("Ciências Exatas",true,false);
insert into tb_categoria(tipo_curso,video_aula,gratuidade)
values ("Arte",true,true);
insert into tb_categoria(tipo_curso,video_aula,gratuidade)
values ("Idiomas",true,true);
insert into tb_categoria(tipo_curso,video_aula,gratuidade)
values ("Ciências Biológicas",false,false);

select * from tb_categoria;

create table tb_curso(
id bigint auto_increment,
nome varchar(50)not null,
carga_horaria int not null,
ao_vivo boolean,
aula_presencial boolean,
valor decimal(6,2),
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categoria(id)
);

insert into tb_curso(nome,carga_horaria,ao_vivo,aula_presencial,valor,categoria_id)
values ("Odontologia",360,true,true,645.50,5);
insert into tb_curso(nome,carga_horaria,ao_vivo,aula_presencial,valor,categoria_id)
values ("Medicina",400,true,true,1345.50,5);
insert into tb_curso(nome,carga_horaria,ao_vivo,aula_presencial,valor,categoria_id)
values ("Publicidade",360,true,false,345.50,3);
insert into tb_curso(nome,carga_horaria,ao_vivo,aula_presencial,valor,categoria_id)
values ("Matemática",460,true,false,250.00,2);
insert into tb_curso(nome,carga_horaria,ao_vivo,aula_presencial,valor,categoria_id)
values ("Sociologia",260,false,false,null,1);
insert into tb_curso(nome,carga_horaria,ao_vivo,aula_presencial,valor,categoria_id)
values ("Filosofia",260,false,false,null,1);
insert into tb_curso(nome,carga_horaria,ao_vivo,aula_presencial,valor,categoria_id)
values ("Inglês",120,true,false,150,4);
insert into tb_curso(nome,carga_horaria,ao_vivo,aula_presencial,valor,categoria_id)
values ("Espanhol",120,true,false,150,4);

select * from tb_curso where valor > 50;
select * from tb_curso where valor between 3 and 60;
select * from tb_curso where nome like "%J";

select nome,carga_horaria,valor,tb_categoria.tipo_curso
from tb_curso inner join tb_categoria on tb_curso.categoria_id = tb_categoria.id;

select nome,carga_horaria,valor,tb_categoria.tipo_curso
from tb_curso inner join tb_categoria on tb_curso.categoria_id = tb_categoria.id
where tb_curso.id = 3;