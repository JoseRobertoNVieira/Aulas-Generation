create database db_farmacia_do_bem;
use db_farmacia_do_bem;

create table tb_categoria(
id bigint auto_increment,
tipo_medicamento varchar (50) not null,
qtd_estoque int not null,
receita boolean,
primary key (id)
);

insert into tb_categoria(tipo_medicamento,qtd_estoque,receita)
values ("Cosmético",153,false);
insert into tb_categoria(tipo_medicamento,qtd_estoque,receita)
values ("Comprimidos",435,false);
insert into tb_categoria(tipo_medicamento,qtd_estoque,receita)
values ("Higiene",545,false);
insert into tb_categoria(tipo_medicamento,qtd_estoque,receita)
values ("Preservativos",532,false);
insert into tb_categoria(tipo_medicamento,qtd_estoque,receita)
values ("Remédios Controlados",53,true);

create table tb_produtos(
id bigint auto_increment,
nome_produto varchar(50) not null,
quantidade int not null,
marca varchar(50)not null,
preco decimal(5,2),
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria(id)
);

insert into tb_produtos(nome_produto,quantidade,marca,preco,categoria_id)
values ("Dipirona",1,"Genérico",2.20,2);
insert into tb_produtos(nome_produto,quantidade,marca,preco,categoria_id)
values ("Preservativo",2,"Jontex",13.50,4);
insert into tb_produtos(nome_produto,quantidade,marca,preco,categoria_id)
values ("Preservativo",3,"Olla",15.50,4);
insert into tb_produtos(nome_produto,quantidade,marca,preco,categoria_id)
values ("Paracetamol",1,"Genérico",1.68,2);
insert into tb_produtos(nome_produto,quantidade,marca,preco,categoria_id)
values ("Rivotril",1,"Mérck",50.32,5);
insert into tb_produtos(nome_produto,quantidade,marca,preco,categoria_id)
values ("Tinta capilar",1,"Johnsons",22.45,1);
insert into tb_produtos(nome_produto,quantidade,marca,preco,categoria_id)
values ("Creme Dental",1,"Colgate",13.50,3);

select * from tb_produtos where preco > 50.00;
select * from tb_produtos where preco between 3.00 and 60.00;
select * from tb_produtos where nome_produto like "%B";

select tb_produtos.nome_produto,tb_produtos.quantidade,tb_produtos.preco,tb_categoria.tipo_medicamento
from tb_categoria inner join tb_produtos on tb_categoria.id = tb_produtos.id;

select * from tb_categoria where id = 3;
