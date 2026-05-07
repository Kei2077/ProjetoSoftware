drop database loja;
create database loja;
use loja;


CREATE TABLE roupa (
	id bigint auto_increment primary key,
    nome_produto VARCHAR(255),
    marca VARCHAR(20),
    tamanho VARCHAR(2),
    preco DOUBLE,
    quantidade int
);

select * from roupa;