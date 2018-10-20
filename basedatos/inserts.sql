
--insercion de agencias
insert into agencia(idagencia,nombreagencia,paisagencia,ciudadagencia,direccionagencia,correoagencia,loginagencia,passagencia)
	values(1,'TravelTours','Bolivia','Cochabamba','ayacucho','traveltours@gmail.com','traveltours','traveltours');

--insercion de turistas
insert into turista(idturista,idagencia,nombreturista,apellidoturista,fechanacturista,correoturista,loginturista,passturista)
	values(1,1,'Alex','Rodriguez','1990-05-15','alexrodriguez@gmail.com','alexrodriguez','alexrodriguez');
insert into turista(idturista,idagencia,nombreturista,apellidoturista,fechanacturista,correoturista,loginturista,passturista)
	values(2,1,'Maria','Cala','1990-05-15','mariacala@gmail.com','mariacala','mariacala');
insert into turista(idturista,idagencia,nombreturista,apellidoturista,fechanacturista,correoturista,loginturista,passturista)
	values(3,1,'Roberto','Martinez','1990-05-15','robertomartinez@gmail.com','robertomartinez','robertomartinez');
insert into turista(idturista,idagencia,nombreturista,apellidoturista,fechanacturista,correoturista,loginturista,passturista)
	values(4,1,'juan','Januro','1990-05-15','juanjanuro@gmail.com','juanjanuro','juanjanuro');
insert into turista(idturista,idagencia,nombreturista,apellidoturista,fechanacturista,correoturista,loginturista,passturista)
	values(5,1,'Max','Escobar','1990-05-15','maxescobar@gmail.com','maxescobar','maxescobar');

--insercion de categoria
insert into "CATEGORY"(name,description) values('Gastronomico','Categoria dedicado al aspecto gastronomico');
--creacion de paquete
insert into "PACKAGE"("categoryId",name,description,keywords,inversion)
	values(2,'Feria de la comida','feria de fin de semana','fin semana,feria,familia',100)

--insercion de metodopago
insert into metodopago(descripcion) efectivo('values');

--insercion de reserva_integrantes
insert into reserva_integrantes(idturista,idreserva) values (1,1);
insert into reserva_integrantes(idturista,idreserva) values (2,1);
insert into reserva_integrantes(idturista,idreserva) values (4,1);
