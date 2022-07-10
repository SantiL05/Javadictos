/*Carlos Arias.*/
/*Santiago Latronche.*/

/*Se va a realizar 4 consultas para verificar que las tablas si estan enlazadas correctamente 
y asi no tener errores al programar en Java.*/

/*Se ha ejecutado cada consulta y se verifico que cada tabla están enlazadas satisfactoriamente*/

/*Se ingresa a la base de datos cinemar*/
USE cinemar;

/*Se realiza la consulta para extraer todos los datos de la tabla tipo_usuario y usuario*/
SELECT * FROM tipo_usuario INNER JOIN usuario on tipo_usuario.Nom_tipo = usuario.Nom_tipo;

/*Se realiza la consulta para extraer todos los datos de la tabla reservas y usuario*/
SELECT * FROM reservas INNER JOIN usuario on reservas.Id_reservas = usuario.Id_reserva;


/*Se realiza la consulta para extraer todos los datos de la tabla tipo_usuario, usuario y reservas*/
SELECT * FROM tipo_usuario 	INNER JOIN usuario on tipo_usuario.Nom_tipo = usuario.Nom_tipo 
				INNER JOIN reservas on reservas.Id_reservas = usuario.Id_reserva;

/*Se realiza la consulta para extraer todos los datos de la tabla tipo_usuario, usuario, reservas y peliculas*/
SELECT * FROM tipo_usuario 	INNER JOIN usuario on tipo_usuario.Nom_tipo = usuario.Nom_tipo 
				INNER JOIN reservas on reservas.Id_reservas = usuario.Id_reserva
				INNER JOIN pelicula on pelicula.Id_pelicula = reservas.Id_pelicula;

