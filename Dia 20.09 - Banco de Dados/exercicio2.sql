create database db_ecommerce;
use db_ecommerce;

create table tb_produtos(
id bigint auto_increment,
nome varchar(50) not null,
valor decimal(5,2) not null,
quantidade int not null,
tamanho varchar(50) not null,
cor varchar(50) not null,
primary key(id)
);

insert into tb_produtos(nome,valor,quantidade,tamanho,cor)
values("camiseta",29.99,4,"G","preta");
insert into tb_produtos(nome,valor,quantidade,tamanho,cor)
values("camiseta",29.99,2,"M","branca");
insert into tb_produtos(nome,valor,quantidade,tamanho,cor)
values("camiseta",39.99,4,"GG","vermelha");
insert into tb_produtos(nome,valor,quantidade,tamanho,cor)
values("calca",123.50,1,"45","jeans");
insert into tb_produtos(nome,valor,quantidade,tamanho,cor)
values("tenis",354.90,2,"39","preto");
insert into tb_produtos(nome,valor,quantidade,tamanho,cor)
values("camiseta",29.99,3,"P","preta");
insert into tb_produtos(nome,valor,quantidade,tamanho,cor)
values("tenis",524.25,2,"42","verde");
insert into tb_produtos(nome,valor,quantidade,tamanho,cor)
values("camiseta",29.99,5,"G","azul");

select * from tb_produtos where valor > 500.00;
select * from tb_produtos where valor < 500.00;

update tb_produtos set valor = 39.00 where id = 1;
