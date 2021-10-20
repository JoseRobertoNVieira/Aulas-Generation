create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

create table tb_categoria(
id bigint auto_increment,
nome_categoria varchar(50)not null,
qtd_estoque int not null,
entrega boolean,
primary key (id)
);

insert into tb_categoria(nome_categoria,qtd_estoque,entrega)
values ("Porcelanato",50,true);
insert into tb_categoria(nome_categoria,qtd_estoque,entrega)
values ("Ferramentas",43,false);
insert into tb_categoria(nome_categoria,qtd_estoque,entrega)
values ("Utensilios",4356,false);
insert into tb_categoria(nome_categoria,qtd_estoque,entrega)
values ("Janelas/Portas",4,true);
insert into tb_categoria(nome_categoria,qtd_estoque,entrega)
values ("Outros",53,true);

create table tb_produtos(
id bigint auto_increment,
nome varchar(50)not null,
qtd int not null,
cor varchar(50),
valor decimal(5,2),
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categoria(id)
);

insert into tb_produtos(nome,qtd,cor,valor,categoria_id)
values ("Piso",1,"Preto",4.5,1);
insert into tb_produtos(nome,qtd,cor,valor,categoria_id)
values ("Azulejo",1,"Branco",2.5,1);
insert into tb_produtos(nome,qtd,cor,valor,categoria_id)
values ("Pregos",1,null,0.10,5);
insert into tb_produtos(nome,qtd,cor,valor,categoria_id)
values ("Martelo",1,null,15.50,2);
insert into tb_produtos(nome,qtd,cor,valor,categoria_id)
values ("Furadeira",1,"Amarela",160,2);
insert into tb_produtos(nome,qtd,cor,valor,categoria_id)
values ("Porta",1,"Aluminio",150,3);
insert into tb_produtos(nome,qtd,cor,valor,categoria_id)
values ("Janela",1,"Aluminio",100,3);
insert into tb_produtos(nome,qtd,cor,valor,categoria_id)
values ("Areia",53,null,5.50,5);

select * from tb_produtos where valor > 50;
select * from tb_produtos where valor between 3 and 60;
select * from tb_produtos where nome like "%c";

select nome,qtd,valor,tb_categoria.nome_categoria
from tb_produtos inner join tb_categoria on tb_produtos.id = tb_categoria.id;

select nome,qtd,valor,tb_categoria.nome_categoria
from tb_produtos inner join tb_categoria on tb_produtos.id = tb_categoria.id
where tb_categoria.id = 2;
