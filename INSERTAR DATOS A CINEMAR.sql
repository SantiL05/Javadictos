/* Se cargan algunos registros para realizar consultas y verificar que todo este ok*/

USE cinemar;

INSERT INTO  tipo_usuario VALUES 	("1","1", "Adminsitrador"), 
					("2","2","Empleados"), 
					("3","3","Cliente");


INSERT INTO  usuario VALUES 	("","Carlos", "Arias","37511561", "1993/04/19", "3873218571","carlos.m.arias999393@gmail.com","123456", "3", "1"), 
				("", "Luis","Robles","38881881", "1994/02/18","3873221100","Luis.Robles@gmail.com","123456","3","2"), 
				("", "Lorena","Robles","38991220","1994/03/18","3873890133","Lorena.Robles@gmail.com","123456","3","3"),
				("", "Rocio","Saenz","36360666","1992/01/02","3832567891","Rocio.R@gmail.com","654321","3","3"),
				("", "Lois","Flores","40501122","1996/05/12","3873221166","Lois.Flo@gmail.com","654321","1","0"),
				("", "Robert","Torena","41501122","1997/03/10","3873227891","Roberto.t@gmail.com","654321","1","0"),
				("", "Julio","Torres","35101122","1990/03/05","3873117191","Julio.torres@gmail.com","654321","1","0"),
				("", "Renzo","Tolosa","30101122","1983/05/18","3873818192","Renzo.tolosa@gmail.com","654321","3","4"),
				("", "Renzo","Tolosa","30101122","1983/05/18","3873818192","Renzo.tolosa@gmail.com","654321","3","3"),
				("", "Renzo","Tolosa","30101122","1983/05/18","3873818192","Renzo.tolosa@gmail.com","654321","3","2"),
				("", "Renzo","Tolosa","30101122","1983/05/18","3873818192","Renzo.tolosa@gmail.com","654321","3","3"),
				("", "Renzo","Tolosa","30101122","1983/05/18","3873818192","Renzo.tolosa@gmail.com","654321","3","5"),
				("", "Renzo","Tolosa","30101122","1983/05/18","3873818192","Renzo.tolosa@gmail.com","654321","3","5");


INSERT INTO  reservas VALUES 	("1", "2022/08/11", "1200", "0", "1", "1", "20","Lunes"),
				("2", "2022/07/12", "1200", "0", "1", "2", "15","Martes"),
				("3", "2022/07/13", "850", "0", "2", "3","20","Miercoles"),
				("4", "2022/08/04", "850", "0", "3", "4","15","Jueves"),
				("5", "2022/06/17", "1100", "0", "3", "5", "10","Viernes"),
				("6", "2022/06/24", "1100", "0", "3", "6", "10","Sabado");

INSERT INTO  pelicula VALUES	("","Hulk 3D", "Accion","1:30:00", "Tio Rabioso", "1","800","1200"), 
				("","Hulk 3D", "Accion","1:30:00", "Tio Rabioso", "1","800","1200"), 
				("","Hombre Araña 3D", "Accion","1:45:00", "Un estudiante es picado por una araña mutante", "2","800","1200"), 
				("","Hombre Araña 2D", "Accion","1:45:00", "Un estudiante es picado por una araña mutante", "3","800","1200"), 
				("","Iron Man 3D", "Accion","2:10:00", "Un Hombre genio trata de mostrar su supremacia", "4","800","1200"),
				("","La bruja 3D", "Drama/terror","2:15:00", "Un familia es expulsada del pueblo por supuestos rumores de estar embrujados", "5","800","1200"),
				("","La bruja 2D", "Drama/terror","2:15:00", "Un familia es expulsada del pueblo por supuestos rumores de estar embrujados", "5","800","1200");


INSERT INTO  salas VALUES	("1","600","1"), 
				("2","600","1"), 
				("3","600","3"), 
				("4","600","4"), 
				("5","600","5"), 
				("6","600","6"),
				("7","600","7");





