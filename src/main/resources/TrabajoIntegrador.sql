drop database if exists TrabajoIntegrador;
create database TrabajoIntegrador;

use TrabajoIntegrador;

-- seria crear las de fase ,ronda Y pronostico
-- asi poder rellenarlas y mostrarlas por pantalla
-- cuando yo le pase los datos por eclipse


create table PRONOSTICOS(
cd_pronosticos int not null auto_increment,
ronda int,
nombre char(30) not null,
pronostico char(20) not null,
puntaje int,
primary key(cd_pronosticos)
);


