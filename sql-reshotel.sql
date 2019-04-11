DROP DATABASE IF EXISTS RESHOTEL;

create database RESHOTEL;
use RESHOTEL;
create table alojamiento(
    codigoAlojamiento int primary key AUTO_INCREMENT, 
    nombre varchar(50),
    precio double, 
    tipoAlojamiento varchar (2)
);

create table hotel(
    codigoHotel int primary key NOT NULL AUTO_INCREMENT,
    nombre varchar(50),
    numeroDormitorios int,
    numeroEstrellas int,
    ciudad varchar(50)
);

create table casa(
    codigoCasa int primary key NOT NULL AUTO_INCREMENT,
    nombre varchar(50),
    numeroHabitaciones int,
    numeroSala int,
    numeroComedor int,
    numeroBalcon int,
    numeroGaraje int,
    numeroBano int,
    numeroCocina int
    ciudad varchar(50)
);

create table apartamento(
 /* colocar todo aquí */
     codigoApartamento int primary key AUTO_INCREMENT,
     nombre varchar(50),
    numeroHabitaciones int,
    numeroSala int,
    numeroComedor int,
    numeroBalcon int,
    numeroGaraje int,
    numeroBano int,
    numeroCocina int
    ciudad varchar(50)
);



create table reserva(
    localizador varchar(50) primary key AUTO_INCREMENT,
    tipoCama int,
    codigoCliente references cliente(codigoCliente),
    fechaInicio datetime,
    fechaFin datetime,
    tarjetaVisa varchar (50),
    importeTotal double

create table habitaciones(
    idHabitacion int primary key, 
    metrosCuadrados double,
    Cama references cama(idCama)
);

create table serviosComplementarios(
    wifi boolean,
    piscina boolean,
    spa boolean,
    parking boolean,
    aireAcondiciona boolean,
    restaurante boolean,
    bar boolean,
    gimnasio boolean,
     Pension int references pension(idPension)
);

create table dormitorio(
    idDormitorio int,
    completento varchar (50)
);

create table cama(
    idCama int primary key,
    tipoCama varchar (50)
);

create table pension(
    idPension int primary key,
    tipoPension varchar (50)
);

create table cliente(
    codigoCliente int primary key NOT NULL AUTO_INCREMENT,
    nombre varchar (50),
    apellido varchar (50),
    direccionCliente varchar (50),
    telefono varchar (50),
    email varchar (50)
);



create table cupo(
    localizador references reserva(localizador),
    codigoAlojamiento references alojamiento(codigoAlojamiento),
    numeroPlazasGastadas int,
    fecha DATETIME primary key 
);

create table precio(
    localizador references reserva(localizador),
    codigoAlojamiento  references alojamiento(codigoAlojamiento),
    fechaInicio DATETIME,
    fechaFin DATETIME,
    precio double

);


    
insert into cama(
    idCama, tipoCama) 

values (1, "simple"), (2, "matrimonio"), (3, "infantil");


insert into Pension(
    idCama, tipoCama) 

values (1, "desayuno"), (2, "media pension"), (3, "pension completa");

DROP PROCEDURE buscarHotel; CREATE PROCEDURE buscarHotel(IN nombreCiudad VARCHAR(50)) NOT DETERMINISTIC READS SQL DATA SQL SECURITY DEFINER select * from hotel where ciudad = nombreCiudad