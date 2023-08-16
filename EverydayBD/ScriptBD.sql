drop database EverydayDB;
create database EverydayDB;
use EverydayDB;

create table tbAutor(
	AutorID int primary key auto_increment,
    AutorName varchar(50) not null,
	Link varchar(128),
    Descricao varchar(512)
);

create table tbJornal(
	JornalID int primary key auto_increment,
    Autor int,
    JornalDesc varchar(512) not null,
    
    foreign key (Autor) references tbAutor(AutorID)
);