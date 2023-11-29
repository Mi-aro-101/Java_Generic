create sequence personne_seq start with 3 increment by 1;

create table Personne(
    id serial primary key not null,
    nom varchar(50) not null
);

insert into Personne (nom) values('Koto');
insert into Personne (nom) values('Steve');

create table categorie(
    id_categorie serial primary key not null,
    nom_categorie varchar(50) not null
);

create table produit(
    id_produit serial primary key not null,
    nom_produit varchar(50) not null,
    id_categorie integer references categorie(id_categorie) not null
);

insert into categorie (nom_categorie) values('vorona');
insert into categorie (nom_categorie) values('tsy manidina');

insert into produit (nom_produit, id_categorie) values('akoho', 1);
insert into produit (nom_produit, id_categorie) values('gisa', 1);
insert into produit (nom_produit, id_categorie) values('gana', 1);
