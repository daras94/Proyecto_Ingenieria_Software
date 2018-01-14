insert into Carrera (nombre, cod_carrera,facultad,num_cred_opt,num_cred_tran,num_cred_obl) values ('Ingenieria Informatica',1234,'Escuela Politecnica',18,12,42);
insert into Carrera (nombre, cod_carrera,facultad,num_cred_opt,num_cred_tran,num_cred_obl) values ('Ingenieria Electronica',5738,'Escuela Politecnica',18,12,42);
insert into Carrera (nombre, cod_carrera,facultad,num_cred_opt,num_cred_tran,num_cred_obl) values ('Ingenieria Robotica',2203,'Escuela Politecnica',18,6,36);
insert into Carrera (nombre, cod_carrera,facultad,num_cred_opt,num_cred_tran,num_cred_obl) values ('Medicina',1027,'Facultad de Medicina',18,6,42);
insert into Carrera (nombre, cod_carrera,facultad,num_cred_opt,num_cred_tran,num_cred_obl) values ('Magisterio',9012,'Facultad de Letras',12,6,30);

/*Asignaturas para Ingenieria Informatica*/
insert into Asignatura values ('Base de Datos',8374,1234,6,'OB');
insert into Asignatura values ('Ingenieria de Software',4039,1234,6,'OB');
insert into Asignatura values ('Algoritmia y Complejidad',1102,1234,6,'OB');
insert into Asignatura values ('Matematicas Avanzadas',2029,1234,6,'OB');
insert into Asignatura values ('Fisica',8390,1234,6,'OB');
insert into Asignatura values ('Sistemas Operativos',1109,1234,6,'OB');
insert into Asignatura values ('Arquitectura de Computadores',4934,1234,6,'OB');

insert into Asignatura values ('Programacion WEB',4000,1234,6,'OP');
insert into Asignatura values ('Bases de datos avanzadas',9911,1234,6,'OP');
insert into Asignatura values ('Seguridad WEB',4001,1234,6,'OP');
insert into Asignatura values ('Patrones de diseño',5559,1234,6,'OP');

insert into Asignatura values ('Laboratorio virtual consultas SQL',3999,1234,15,'TFG');
insert into Asignatura values ('Plataforma de lenguaje flexibles',3998,1234,15,'TFG');

/*Asignaturas para Ingenieria Electronica*/
insert into Asignatura values ('Calculo 1',3394,5738,6,'OB');
insert into Asignatura values ('Sistemas Informaticos',8112,5738,6,'OB');
insert into Asignatura values ('Teoria de Circuitos',7263,5738,6,'OB');
insert into Asignatura values ('Electronica Digital',0097,5738,6,'OB');
insert into Asignatura values ('Algebra Lineal',2001,5738,6,'OB');
insert into Asignatura values ('Programacion',9992,5738,6,'OB');
insert into Asignatura values ('Estadistica',2080,5738,6,'OB');

insert into Asignatura values ('Electronica potencial',6685,5738,6,'OP');
insert into Asignatura values ('Subsistemas electronicos',6001,5738,6,'OP');
insert into Asignatura values ('Tecnologia electronica',3004,5738,6,'OP');
insert into Asignatura values ('Control Industrial',0911,5738,6,'OP');

insert into Asignatura values ('Series de Fourier',7998,5738,15,'TFG');
insert into Asignatura values ('Videovigilancia',7991,5738,15,'TFG');

/*Asignaturas para Ingenieria Robotica*/
insert into Asignatura values ('Automatizacion',4403,2203,6,'OB');
insert into Asignatura values ('Sistemas Electronicos Digitales',8888,2203,6,'OB');
insert into Asignatura values ('Empresariales',2991,2203,6,'OB');
insert into Asignatura values ('Electronica de potencia',6697,2203,6,'OB');
insert into Asignatura values ('Sistemas Robotizados',4567,2203,6,'OB');
insert into Asignatura values ('Maquinas Eléctricas',1551,2203,6,'OB');

insert into Asignatura values ('Sistemas de produccion industrial',7771,2203,6,'OP');
insert into Asignatura values ('Mecanica de fluidos',7777,2203,6,'OP');
insert into Asignatura values ('Resistencia de materiales',7778,2203,6,'OP');
insert into Asignatura values ('Proyectos',7779,2203,6,'OP');

insert into Asignatura values ('Inteligencia artifical',5400,2203,15,'TFG');
insert into Asignatura values ('Robots en la guerra',5301,2203,15,'TFG');

/*Asignaturas para Medicina*/
insert into Asignatura values ('Anatomia Humana',6009,1027,6,'OB');
insert into Asignatura values ('Bioquimica',6050,1027,6,'OB');
insert into Asignatura values ('Psicologia',6110,1027,6,'OB');
insert into Asignatura values ('Historia Humana',6304,1027,6,'OB');
insert into Asignatura values ('Etica Medica',6999,1027,6,'OB');
insert into Asignatura values ('Epidemologia',6204,1027,6,'OB');
insert into Asignatura values ('Bioestadistica',6114,1027,6,'OB');

insert into Asignatura values ('Inmunologia',2201,1027,6,'OP');
insert into Asignatura values ('Radiologia General',4405,1027,6,'OP');
insert into Asignatura values ('Farmacologia',7701,1027,6,'OP');
insert into Asignatura values ('Patologia General',9100,1027,6,'OP');

insert into Asignatura values ('Microbiologia',9444,1027,15,'TFG');
insert into Asignatura values ('Aterotrombosis',9333,1027,15,'TFG');

/*Asignaturas para magisterio*/
insert into Asignatura values ('Didactica',5504,9012,6,'OB');
insert into Asignatura values ('Sociologia',5512,9012,6,'OB');
insert into Asignatura values ('El juego musical',5444,9012,6,'OB');
insert into Asignatura values ('Artes plasticas',5222,9012,6,'OB');
insert into Asignatura values ('Promocion de la salud',5331,9012,6,'OB');

insert into Asignatura values ('Practicum',3200,9012,6,'OP');
insert into Asignatura values ('Lengua Extranjera',3201,9012,6,'OP');
insert into Asignatura values ('Innovacion educativa',3202,9012,6,'OP');

insert into Asignatura values ('Trastornos de animo',2111,9012,15,'TFG');
insert into Asignatura values ('Bullying',2999,9012,15,'TFG');



/*Asignaturas Transversales*/

insert into Asignatura values ('Tecnologia para discapacitados',7001,NULL,6,'T');
insert into Asignatura values ('Robotica para todos',7008,NULL,6,'T');
insert into Asignatura values ('Tecnologia de videojuegos',7002,NULL,6,'T');
insert into Asignatura values ('Tecnologia musical',7003,NULL,6,'T');
insert into Asignatura values ('Religion',7004,NULL,6,'T');
insert into Asignatura values ('Historia de España ',7007,NULL,6,'T');
insert into Asignatura values ('Programacion Android',7012,NULL,6,'T');
insert into Asignatura values ('Mundo Empresarial',7013,NULL,6,'T');
insert into Asignatura values ('Historia de gitanos',7014,NULL,6,'T');

/*Alumnos*/

insert into Usuario values('57493812E','ALUMNO','Rodrigo','Garcia','Leon','1997-7-04','rodrigo_garcia@hotmail.es','rodrigo1',564829184);
insert into Alumno values ('57493812E',1234,847394193);

insert into Usuario values('92819238T','ALUMNO','Patricia','Conde','Ruiz','1996-2-14','patricia_conde@hotmail.es','patricia1',119293740);
insert into Alumno values ('92819238T',1234,720948110);

insert into Usuario values('66104923W','ALUMNO','Alonso','Perez','Navarro','1997-9-22','alonso_perez@hotmail.es','alonso1',550392885);
insert into Alumno values ('66104923W',5738,950193228);

insert into Usuario values('44031002Q','ALUMNO','Eduardo','Martinez','Martinez','1995-7-04','eduardo_martinez@hotmail.es','eduardo1',901283475);
insert into Alumno values ('44031002Q',1234,820394111);


insert into Carrera (nombre, cod_carrera,facultad,num_cred_opt,num_cred_tran,num_cred_obl) values ('Ingenieria Informatica',1234,'Escuela Politecnica',18,12,42);
insert into Carrera (nombre, cod_carrera,facultad,num_cred_opt,num_cred_tran,num_cred_obl) values ('Ingenieria Electronica',5738,'Escuela Politecnica',18,12,42);
insert into Carrera (nombre, cod_carrera,facultad,num_cred_opt,num_cred_tran,num_cred_obl) values ('Ingenieria Robotica',2203,'Escuela Politecnica',18,6,36);
insert into Carrera (nombre, cod_carrera,facultad,num_cred_opt,num_cred_tran,num_cred_obl) values ('Medicina',1027,'Facultad de Medicina',18,6,42);
insert into Carrera (nombre, cod_carrera,facultad,num_cred_opt,num_cred_tran,num_cred_obl) values ('Magisterio',9012,'Facultad de Letras',12,6,30);

/*Asignaturas para Ingenieria Informatica*/
insert into Asignatura values ('Base de Datos',8374,1234,6,'OB');
insert into Asignatura values ('Ingenieria de Software',4039,1234,6,'OB');
insert into Asignatura values ('Algoritmia y Complejidad',1102,1234,6,'OB');
insert into Asignatura values ('Matematicas Avanzadas',2029,1234,6,'OB');
insert into Asignatura values ('Fisica',8390,1234,6,'OB');
insert into Asignatura values ('Sistemas Operativos',1109,1234,6,'OB');
insert into Asignatura values ('Arquitectura de Computadores',4934,1234,6,'OB');

insert into Asignatura values ('Programacion WEB',4000,1234,6,'OP');
insert into Asignatura values ('Bases de datos avanzadas',9911,1234,6,'OP');
insert into Asignatura values ('Seguridad WEB',4001,1234,6,'OP');
insert into Asignatura values ('Patrones de diseño',5559,1234,6,'OP');

insert into Asignatura values ('Laboratorio virtual consultas SQL',3999,1234,15,'TFG');
insert into Asignatura values ('Plataforma de lenguaje flexibles',3998,1234,15,'TFG');

/*Asignaturas para Ingenieria Electronica*/
insert into Asignatura values ('Calculo 1',3394,5738,6,'OB');
insert into Asignatura values ('Sistemas Informaticos',8112,5738,6,'OB');
insert into Asignatura values ('Teoria de Circuitos',7263,5738,6,'OB');
insert into Asignatura values ('Electronica Digital',0097,5738,6,'OB');
insert into Asignatura values ('Algebra Lineal',2001,5738,6,'OB');
insert into Asignatura values ('Programacion',9992,5738,6,'OB');
insert into Asignatura values ('Estadistica',2080,5738,6,'OB');

insert into Asignatura values ('Electronica potencial',6685,5738,6,'OP');
insert into Asignatura values ('Subsistemas electronicos',6001,5738,6,'OP');
insert into Asignatura values ('Tecnologia electronica',3004,5738,6,'OP');
insert into Asignatura values ('Control Industrial',0911,5738,6,'OP');

insert into Asignatura values ('Series de Fourier',7998,5738,15,'TFG');
insert into Asignatura values ('Videovigilancia',7991,5738,15,'TFG');

/*Asignaturas para Ingenieria Robotica*/
insert into Asignatura values ('Automatizacion',4403,2203,6,'OB');
insert into Asignatura values ('Sistemas Electronicos Digitales',8888,2203,6,'OB');
insert into Asignatura values ('Empresariales',2991,2203,6,'OB');
insert into Asignatura values ('Electronica de potencia',6697,2203,6,'OB');
insert into Asignatura values ('Sistemas Robotizados',4567,2203,6,'OB');
insert into Asignatura values ('Maquinas Eléctricas',1551,2203,6,'OB');

insert into Asignatura values ('Sistemas de produccion industrial',7771,2203,6,'OP');
insert into Asignatura values ('Mecanica de fluidos',7777,2203,6,'OP');
insert into Asignatura values ('Resistencia de materiales',7778,2203,6,'OP');
insert into Asignatura values ('Proyectos',7779,2203,6,'OP');

insert into Asignatura values ('Inteligencia artifical',5400,2203,15,'TFG');
insert into Asignatura values ('Robots en la guerra',5301,2203,15,'TFG');

/*Asignaturas para Medicina*/
insert into Asignatura values ('Anatomia Humana',6009,1027,6,'OB');
insert into Asignatura values ('Bioquimica',6050,1027,6,'OB');
insert into Asignatura values ('Psicologia',6110,1027,6,'OB');
insert into Asignatura values ('Historia Humana',6304,1027,6,'OB');
insert into Asignatura values ('Etica Medica',6999,1027,6,'OB');
insert into Asignatura values ('Epidemologia',6204,1027,6,'OB');
insert into Asignatura values ('Bioestadistica',6114,1027,6,'OB');

insert into Asignatura values ('Inmunologia',2201,1027,6,'OP');
insert into Asignatura values ('Radiologia General',4405,1027,6,'OP');
insert into Asignatura values ('Farmacologia',7701,1027,6,'OP');
insert into Asignatura values ('Patologia General',9100,1027,6,'OP');

insert into Asignatura values ('Microbiologia',9444,1027,15,'TFG');
insert into Asignatura values ('Aterotrombosis',9333,1027,15,'TFG');

/*Asignaturas para magisterio*/
insert into Asignatura values ('Didactica',5504,9012,6,'OB');
insert into Asignatura values ('Sociologia',5512,9012,6,'OB');
insert into Asignatura values ('El juego musical',5444,9012,6,'OB');
insert into Asignatura values ('Artes plasticas',5222,9012,6,'OB');
insert into Asignatura values ('Promocion de la salud',5331,9012,6,'OB');

insert into Asignatura values ('Practicum',3200,9012,6,'OP');
insert into Asignatura values ('Lengua Extranjera',3201,9012,6,'OP');
insert into Asignatura values ('Innovacion educativa',3202,9012,6,'OP');

insert into Asignatura values ('Trastornos de animo',2111,9012,15,'TFG');
insert into Asignatura values ('Bullying',2999,9012,15,'TFG');



/*Asignaturas Transversales*/

insert into Asignatura values ('Tecnologia para discapacitados',7001,NULL,6,'T');
insert into Asignatura values ('Robotica para todos',7008,NULL,6,'T');
insert into Asignatura values ('Tecnologia de videojuegos',7002,NULL,6,'T');
insert into Asignatura values ('Tecnologia musical',7003,NULL,6,'T');
insert into Asignatura values ('Religion',7004,NULL,6,'T');
insert into Asignatura values ('Historia de España ',7007,NULL,6,'T');
insert into Asignatura values ('Programacion Android',7012,NULL,6,'T');
insert into Asignatura values ('Mundo Empresarial',7013,NULL,6,'T');
insert into Asignatura values ('Historia de gitanos',7014,NULL,6,'T');

/*Alumnos*/

insert into Usuario values('57493812E','ALUMNO','Rodrigo','Garcia','Leon','1997-7-04','rodrigo_garcia@hotmail.es','rodrigo1',564829184);
insert into Alumno values ('57493812E',1234,847394193);

insert into Usuario values('92819238T','ALUMNO','Patricia','Conde','Ruiz','1996-2-14','patricia_conde@hotmail.es','patricia1',119293740);
insert into Alumno values ('92819238T',1234,720948110);

insert into Usuario values('66104923W','ALUMNO','Alonso','Perez','Navarro','1997-9-22','alonso_perez@hotmail.es','alonso1',550392885);
insert into Alumno values ('66104923W',5738,950193228);

insert into Usuario values('44031002Q','ALUMNO','Eduardo','Martinez','Martinez','1995-7-04','eduardo_martinez@hotmail.es','eduardo1',901283475);
insert into Alumno values ('44031002Q',1234,820394111);

/*Categorias*/


insert into Categoria values('Rector',45);


insert into Categoria values('Catedratico',40);



/*Departamentos*/


insert into Departamento values(3,'Ciencias de la computacion',5);


insert into Departamento values(5,'Automatica',6);



/*Profesores*/


insert into Usuario values('94625315A','PROFESOR','Diego','Garcia','Cuadrado','1960-7-15','diego_garcia@hotmail.es','diego1',564855555);

insert into Profesor values('94625315A','Rector',8,5,3,3);

insert into Usuario values('13225678B','PROFESOR','Julia','Vazquez','Gonzalez','1980-3-25','julia_vazquez@hotmail.es','julia1',645285134);

insert into Profesor values('13225678B','Catedratico',3,2,1,3);

insert into Usuario values('14581574B','PROFESOR','Juan','Rio','Sanchez','1972-8-20','juan_rio@hotmail.es','juan1',152684932);

insert into Profesor values('14581574B','Catedratico',6,3,3,5);



/*Espacios*/


insert into Espacio values(1,'aula1',45,12.50);


insert into Espacio values(2,'aula2',45,12.50);


insert into Espacio values(3,'aula3',60,15.00);


insert into Espacio values(4,'laboratorio1',25,10.50);


insert into Espacio values(5,'laboratorio2',25,10.50);


insert into Espacio values(6,'laboratorio3',20,12.50);


insert into Espacio values(7,'laboratorio pesado1',30,20.00);



/*Reservas*/


insert into ReservaGrupo values(15, 5, 3, 1111);


insert into ReservaGrupo values(10, 2, 7, 1131);


insert into ReservaProfesor values('13225678B' , 5,  '2018-01-27', 17);


insert into ReservaProfesor values('14581574B', 1,  '2018-02-03', 19); 


insert into ReservaProfesor values('14581574B', 7,  '2018-02-05', 13); 

/*Profesor-Grupo*/
INSERT INTO Profesor_Grupo VALUES (1113,'13225678B');
INSERT INTO Profesor_Grupo VALUES (1112,'13225678B');
INSERT INTO Profesor_Grupo VALUES (1163,'13225678B');

