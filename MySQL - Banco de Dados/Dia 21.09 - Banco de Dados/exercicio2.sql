create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
tamanhoPizza varchar(50)not null,
nFatias int not null,
nSabores int not null,
primary key (id)
);

insert into tb_categoria(tamanhoPizza,nFatias,nSabores)
values ("Grande",8,2);
insert into tb_categoria(tamanhoPizza,nFatias,nSabores)
values ("Grande",8,1);
insert into tb_categoria(tamanhoPizza,nFatias,nSabores)
values ("Broto",4,1);
insert into tb_categoria(tamanhoPizza,nFatias,nSabores)
values ("Broto",4,2);
insert into tb_categoria(tamanhoPizza,nFatias,nSabores)
values ("Familia",12,1);
insert into tb_categoria(tamanhoPizza,nFatias,nSabores)
values ("Familia",12,2);

create table tb_pizza(
id bigint auto_increment,
sabor varchar(50)not null,
bordaRecheada boolean,
valor decimal(4,2) not null,
pizzaDoce boolean,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_pizza(sabor,bordaRecheada,valor,pizzaDoce,categoria_id)
values ("Calabresa",true,32.34,false,2);
insert into tb_pizza(sabor,bordaRecheada,valor,pizzaDoce,categoria_id)
values ("Calabresa",true,42.45,false,4);
insert into tb_pizza(sabor,bordaRecheada,valor,pizzaDoce,categoria_id)
values ("Mussarela",false,64.34,false,2);
insert into tb_pizza(sabor,bordaRecheada,valor,pizzaDoce,categoria_id)
values ("Palmito",true,53.35,false,3);
insert into tb_pizza(sabor,bordaRecheada,valor,pizzaDoce,categoria_id)
values ("Brigadeiro",false,86.45,true,5);
insert into tb_pizza(sabor,bordaRecheada,valor,pizzaDoce,categoria_id)
values ("Frango",true,67.45,false,6);
insert into tb_pizza(sabor,bordaRecheada,valor,pizzaDoce,categoria_id)
values ("4 Queijos",true,45.86,false,3);
insert into tb_pizza(sabor,bordaRecheada,valor,pizzaDoce,categoria_id)
values ("Banana com chocolate",false,24.90,true,2);

select * from tb_pizza where valor > 45;
select * from tb_pizza where valor between 29 and 60;
select * from tb_pizza where sabor like "%C%";

select tb_pizza.sabor,tb_categoria.tamanhoPizza,tb_pizza.valor
from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.id;

select * from tb_pizza where pizzaDoce = true;
