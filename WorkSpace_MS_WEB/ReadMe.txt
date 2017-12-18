El proyecto se encuentra en ./Servidor y para poder inicializar todos los servicios en conjunto y que sean asesibles las funciones entre si desde el servidor web
hay que seguir el siguiente orden de ejecucion:

	1º - El proyecto ./Servidor/Microservicios/ms-eureka-server 	--> http://localhost:9000	(Se tarata del microservicio encargado de registrar los demas microservicios).
	2º - El proyecto ./Servidor/UVPorta		  		--> http://localhost:9100	(Se tarta del microservicio que implementa la seguridad y la interfaces web).

		+-> El resto de microservicios siguientes se pueden arancar en el orden deseado (Su orden de aranque no influye):
			|
			|-> El proyecto ./Servidor/Microservicios/ms-usuarios 		--> http://localhost:9500	(microservicio API Rest Usuario).
			|-> El proyecto ./Servidor/Microservicios/ms-matriculas 	--> http://localhost:9300	(microservicio API Rest Matriculas).
			|-> El proyecto ./Servidor/Microservicios/ms-profesores		--> http://localhost:9200	(microservicio API Rest Profesores).
			|-> El proyecto ./Servidor/Microservicios/ms-reservas		--> http://localhost:9400	(microservicio API Rest Reservas).
			|-> El proyecto ./Servidor/Microservicios/ms-alumnos		--> http://localhost:9600	(microservicio API Rest Alumnos).

	- NOTA: Ya no se hace uso de servidor apache tomcat dedicado sino que cada microservicio usa un servidor tomcat envebido el cual da menos comflitos, tambien
		se adjunta un plugin para netbeans el cual he usado por si os facilita vuestras tareas el cual se encuentra en la carpeta ./Plugin_Spring
