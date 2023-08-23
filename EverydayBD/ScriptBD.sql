drop database EverydayDB;
create database EverydayDB;
use EverydayDB;

create table tbAutor(
	AutorID int primary key auto_increment,
    AutorName varchar(50) not null,
	Link varchar(128),
    Descricao varchar(512)
);

create table tbUser(
	UserID int primary key auto_increment,
    Username char(12) unique not null,
    Email char(50) unique not null,
    UserPwd char(50) not null
);

create table tbJornal(
	JornalID int primary key auto_increment,
    Autor int,
    JornalDesc varchar(512) not null,
    JornalSinopse varchar(256) not null,
    Manchete varchar(89) not null,
    Topico varchar(50),
    foreign key (Autor) references tbAutor(AutorID)
);

create table tbFavoritos(
	IdUser int not null,
    IdJornal int not null
);

alter table tbFavoritos add constraint fkUserFavs foreign key (IdUser) references tbUser(UserID);
alter table tbFavoritos add constraint fkJornalFavs foreign key (IdJornal) references tbJornal(JornalID);


Insert into tbUser(Username, Email, UserPwd) values ("Laurzito", "gugslaur@gmail.com", "AlexandreDelicia");
Insert into tbAutor(AutorName, Link, Descricao) values ("William Ereção", "www.zoofilia.com/auauau/miauumiauu/nieheehhheehe", "Jornalista profissional");
Insert into tbJornal(Autor, JornalDesc, JornalSinopse, Manchete, Topico) values (1, "Jornal Padrão feito para testes v2", "Sinopse que o Jaime com certeza nunca lerá", "Extra! Extra! Venham me ver fazendo merda", "Testes");
Insert into tbFavoritos values (1, 1);

select * from tbJornal;
select * from tbUser;
select * from tbAutor;
select * from tbFavoritos inner join tbUser on tbFavoritos.IdUser = tbUser.UserID inner join (select * from tbAutor inner join tbJornal on tb.IdJornal = tbJornal.JornalID;