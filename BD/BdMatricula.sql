CREATE DATABASE Matricula;

USE DATABASE Matricula;


CREATE TABLE tblAlumno (
AlumNombres VARCHAR(50) NOT NULL,
AlumApellidoPaterno VARCHAR(35) NOT NULL,
AlumApellidoMaterno VARCHAR(35),
AlumSexo VARCHAR(9) NOT NULL,
DNI VARCHAR(8) PRIMARY KEY,
AlumFechaNacimiento DATE NOT NULL,
AlumDireccion VARCHAR(180));

CREATE TABLE tblApoderado (
ApoNombres VARCHAR(50) NOT NULL,
ApoApellidoPaterno VARCHAR(35) NOT NULL,
ApoApellidoMaterno VARCHAR(35),
DNI VARCHAR(8) PRIMARY KEY,
ApoDireccion VARCHAR(180),
ApoTelefono VARCHAR(15));


CREATE TABLE tblMatricula (
CODIGO VARCHAR(8) PRIMARY KEY,
MatFecha DATE NOT NULL,
MatMensualidad VARCHAR(6) NOT NULL,
MatADescuento VARCHAR(6) NOT NULL,
MatCostomatricula VARCHAR(7));







