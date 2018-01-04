-- --------------------------------
-- Triggers y Funciones de la BD --
-- --------------------------------

-- ----------- DROPS --------------

DROP TRIGGER IF EXISTS valida_NIF_usuario;
DROP TRIGGER IF EXISTS aforo_permitido;
DROP TRIGGER IF EXISTS check_horas;
DROP FUNCTION IF EXISTS validador_NIF;


-- --------- FUNCIONES ------------
DELIMITER //

-- Funcion para validar NIFs

CREATE FUNCTION validador_NIF(NIF VARCHAR(9)) RETURNS VARCHAR(9)

	BEGIN
		DECLARE letras VARCHAR(23);
		DECLARE resto INTEGER;
		DECLARE numero INTEGER;
		DECLARE salida VARCHAR(9);
		SET letras = 'TRWAGMYFPDXBNJZSQVHLCKE';

		IF LENGTH(NIF) = 9 THEN
			
			-- Hacemos la transformación en caso de NIE
			IF SUBSTR(NIF, 1, 1) = 'X' THEN
				SET numero = CAST(SUBSTR(NIF, 2, 7) AS SIGNED);
			ELSEIF SUBSTR(NIF, 1, 1) = 'Y' THEN
				SET numero = 10000000 + CAST(SUBSTR(NIF, 2, 7) AS SIGNED);
			ELSEIF SUBSTR(NIF, 1, 1) = 'Z' THEN
				SET numero = 20000000 + CAST(SUBSTR(NIF, 2, 7) AS SIGNED);
			ELSE SET numero = CAST(SUBSTR(NIF, 1, 8) AS SIGNED);
			END IF;
			
			-- Ahora comprobamos la última letra
			SET resto = MOD(numero, 23);
			IF (SUBSTR(letras, resto+1, 1) != SUBSTR(NIF, 9, 1)) THEN
				SET salida = NULL;
			ELSE SET salida = NIF;
			END IF;
			
		ELSE SET salida = NULL;
		END IF;
		
		RETURN salida;
	END//



DELIMITER ;

-- --------- TRIGGERS -------------

-- Triggers validacion de NIF

	DELIMITER //
	
CREATE TRIGGER valida_NIF_usuario BEFORE INSERT ON usuario
	FOR EACH ROW
	SET NEW.NIF = (validador_NIF(NEW.NIF);
	
	DELIMITER ;

-- Triggers Reservas de los Grupos
-- Comprobacion aforo permitido para el grupo en un espacio

	DELIMITER //
	
CREATE TRIGGER aforo_permitido BEFORE INSERT ON reservagrupo
	FOR EACH ROW
	
	BEGIN
		
		IF (SELECT COUNT(*) AS total FROM asignatura_matriculada AS am WHERE am.Grupo_id_grupo = NEW.grupo) <=
        (SELECT aforo_max FROM espacio WHERE codigo = NEW.ID_Espacio) THEN -- No estoy seguro de esta comparación -- comprobar
			SET NEW.ID_Espacio = NULL;
			SET NEW.grupo = NULL;
		END IF;
	
	END;//
	
	DELIMITER ;

-- Comprobacion horas

	DELIMITER //
	
CREATE TRIGGER check_horas BEFORE INSERT ON reservagrupo
	FOR EACH ROW
	
	BEGIN
	
		IF ((SELECT COUNT(*) FROM reservagrupo WHERE ID_Espacio = NEW.ID_Espacio AND dia_semana = NEW.dia_semana AND
		((hora_entrada < NEW.hora_entrada AND NEW.hora_entrada < hora_salida) OR (hora_entrada < NEW.hora_salida AND NEW.hora_salida < hora_salida))) > 0) THEN
        
			SET NEW.hora_entrada = NULL;
            SET NEW.hora_salida = NULL;
            SET NEW.dia_semana = NULL;
            SET NEW.ID_Espacio = NULL;
            SET NEW.grupo = NULL;
		
		END IF;
	
	END;//
	
	DELIMITER ;