-- validador_NIF--------------------------------
-- Triggers y Funciones de la BD --
-- --------------------------------

-- ----------- DROPS --------------

DROP TRIGGER IF EXISTS valida_NIF_alumno;
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

-- Trigger validacion de NIF
CREATE TRIGGER valida_NIF_alumno BEFORE INSERT ON alumno
	FOR EACH ROW
	INSERT INTO alumno(Usuario_NIF, Cod_carrera, num_expediente)
	VALUES (validador_NIF(NEW.Usuario_NIF), NEW.Cod_carrera, NEW.num_expediente);

