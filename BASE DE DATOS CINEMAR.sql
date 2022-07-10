/*Carlos Arias.*/
/*Santiago Latronche.*/

/*Se crea la base de datos cinemar.*/

CREATE DATABASE cinemar;

/*Ingresa a la base datos.*/
USE cinemar;


/*Se procede a crear las tabla pelicula.*/
CREATE TABLE pelicula (
  `Id_pelicula` int(8) NOT NULL,
  `Nom_pelicula` varchar(25) NOT NULL,
  `Categoria_pelicula` varchar(15) NOT NULL,
  `Duracion_pelicula` time NOT NULL,
  `Sipnosis` varchar(100) NOT NULL,
  `Id_reservas` smallint(4) NOT NULL,
  `Precio_2D` double NOT NULL,
  `Precio_3D` double NOT NULL
);


/*Se procede a crear las tabla reservas.*/
CREATE TABLE `reservas` (
  `Id_reservas` smallint(4) NOT NULL,
  `Fecha_recerva` date NOT NULL,
  `Total` double NOT NULL,
  `TieneDes_reservas` tinyint(1) NOT NULL DEFAULT 0,
  `Id_pelicula` int(8) NOT NULL,
  `Id_usuario` int(8) NOT NULL,
  `Porcentaje_descuento` int(2) NOT NULL,
  `Dia_desc` varchar(10) NOT NULL
);

/*Se procede a crear las tabla salas.*/
CREATE TABLE `salas` (
  `Id_sala` smallint(4) NOT NULL,
  `Capacidad_sala` int(11) NOT NULL,
  `Id_pelicula` int(8) NOT NULL
);

/*Se procede a crear las tabla tipo_usuario.*/
CREATE TABLE `tipo_usuario` (
  `Nom_tipo` smallint(4) NOT NULL,
  `Id_Usuario` smallint(6) NOT NULL,
  `Rol` varchar(20) NOT NULL
);

/*Se procede a crear las tabla usuario.*/
CREATE TABLE `usuario` (
  `Id_usuario` int(8) NOT NULL,
  `Nombre` varchar(12) NOT NULL,
  `Apellido` varchar(12) NOT NULL,
  `DNI_usuario` int(8) NOT NULL,
  `Fecha_nacimiento` date NOT NULL,
  `Num_cel` varchar(5) NOT NULL,
  `Correo_usuario` varchar(22) NOT NULL,
  `Password` varchar(10) NOT NULL,
  `Nom_tipo` smallint(4) NOT NULL,
  `Id_reserva` smallint(4) NOT NULL
);

/*Se procede asignar la clave primaria*/
ALTER TABLE `pelicula`
  ADD PRIMARY KEY (`Id_pelicula`),
  ADD KEY `Id_reservas` (`Id_reservas`);


ALTER TABLE `reservas`
  ADD PRIMARY KEY (`Id_reservas`),
  ADD KEY `Id_pelicula` (`Id_pelicula`),
  ADD KEY `Id_usuario` (`Id_usuario`);


ALTER TABLE `salas`
  ADD PRIMARY KEY (`Id_sala`),
  ADD KEY `Id_pelicula` (`Id_pelicula`);


ALTER TABLE `tipo_usuario`
  ADD PRIMARY KEY (`Nom_tipo`),
  ADD KEY `Id_Usuario` (`Id_Usuario`);


ALTER TABLE `usuario`
  ADD PRIMARY KEY (`Id_usuario`),
  ADD KEY `Id_reserva` (`Id_reserva`),
  ADD KEY `Nom_tipo` (`Nom_tipo`);


ALTER TABLE `pelicula`
  MODIFY `Id_pelicula` int(8) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `Id_usuario` int(8) NOT NULL AUTO_INCREMENT;
ALTER TABLE `pelicula`
  ADD CONSTRAINT `pelicula_ibfk_2` FOREIGN KEY (`Id_reservas`) REFERENCES `reservas` (`Id_reservas`) ON DELETE CASCADE ON UPDATE CASCADE;


ALTER TABLE `reservas`
  ADD CONSTRAINT `reservas_ibfk_2` FOREIGN KEY (`Id_usuario`) REFERENCES `usuario` (`Id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE `salas`
  ADD CONSTRAINT `salas_ibfk_1` FOREIGN KEY (`Id_pelicula`) REFERENCES `pelicula` (`Id_pelicula`) ON DELETE CASCADE ON UPDATE CASCADE;


ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_2` FOREIGN KEY (`Nom_tipo`) REFERENCES `tipo_usuario` (`Nom_tipo`) ON DELETE CASCADE ON UPDATE CASCADE;



