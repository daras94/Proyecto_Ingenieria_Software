-- MySQL Script generated by MySQL Workbench
-- Fri Jan 12 18:49:13 2018
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema UVisa2017
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema UVisa2017
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `UVisa2017` DEFAULT CHARACTER SET utf8 ;
USE `UVisa2017` ;

-- -----------------------------------------------------
-- Table `UVisa2017`.`Carrera`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UVisa2017`.`Carrera` (
  `nombre` VARCHAR(45) NOT NULL,
  `cod_carrera` INT(11) NOT NULL,
  `facultad` VARCHAR(45) NOT NULL,
  `num_cred_opt` INT(11) NOT NULL,
  `num_cred_tran` INT(11) NOT NULL,
  `num_cred_obl` INT(11) NOT NULL,
  PRIMARY KEY (`cod_carrera`),
  UNIQUE INDEX `codigo_carrera_UNIQUE` (`cod_carrera` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `UVisa2017`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UVisa2017`.`Usuario` (
  `NIF` VARCHAR(9) NOT NULL,
  `tipo_user` ENUM('ADMIN', 'ALUMNO', 'PROFESOR') NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido1` VARCHAR(45) NOT NULL,
  `apellido2` VARCHAR(45) NOT NULL,
  `fecha_nacimiento` DATE NOT NULL,
  `email` VARCHAR(200) NOT NULL,
  `password` VARCHAR(64) NOT NULL,
  `CC` VARCHAR(24) NOT NULL,
  PRIMARY KEY (`NIF`),
  UNIQUE INDEX `correo_UNIQUE` (`email` ASC),
  UNIQUE INDEX `NIF_UNIQUE` (`NIF` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `UVisa2017`.`Alumno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UVisa2017`.`Alumno` (
  `Usuario_NIF` VARCHAR(9) NOT NULL,
  `Cod_carrera` INT(11) NOT NULL,
  `num_expediente` INT(11) NOT NULL,
  PRIMARY KEY (`Usuario_NIF`, `Cod_carrera`, `num_expediente`),
  UNIQUE INDEX `num_expediente_UNIQUE` (`num_expediente` ASC),
  INDEX `fk_Alumno_Carrera1_idx` (`Cod_carrera` ASC),
  INDEX `fk_Alumno_Usuario1_idx` (`Usuario_NIF` ASC),
  CONSTRAINT `fk_Alumno_Carrera1`
    FOREIGN KEY (`Cod_carrera`)
    REFERENCES `UVisa2017`.`Carrera` (`cod_carrera`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Alumno_Usuario1`
    FOREIGN KEY (`Usuario_NIF`)
    REFERENCES `UVisa2017`.`Usuario` (`NIF`)
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `UVisa2017`.`Asignatura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UVisa2017`.`Asignatura` (
  `nombre` VARCHAR(45) NOT NULL,
  `Cod_asignatura` INT(11) NOT NULL,
  `Cod_carrera` INT(11) NULL DEFAULT NULL,
  `creditos` INT(11) NOT NULL,
  `tipo` ENUM('T', 'OP', 'OB', 'TFG') NOT NULL,
  PRIMARY KEY (`Cod_asignatura`),
  UNIQUE INDEX `codigo_asignatura_UNIQUE` (`Cod_asignatura` ASC),
  UNIQUE INDEX `nombre_UNIQUE` (`nombre` ASC),
  INDEX `fk_Asignatura_Carrera1_idx` (`Cod_carrera` ASC),
  CONSTRAINT `fk_Asignatura_Carrera1`
    FOREIGN KEY (`Cod_carrera`)
    REFERENCES `UVisa2017`.`Carrera` (`cod_carrera`)
    ON DELETE SET NULL
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `UVisa2017`.`Grupo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UVisa2017`.`Grupo` (
  `id_grupo` INT(11) NOT NULL,
  `actas` TINYINT(1) NULL DEFAULT '0',
  `tipo` ENUM('T', 'L') NULL DEFAULT NULL,
  `miembros` INT(11) NULL DEFAULT '0',
  `Cod_asignatura` INT(11) NOT NULL,
  `anno` YEAR(4) NOT NULL,
  PRIMARY KEY (`id_grupo`),
  INDEX `fk_Grupo_Asignatura1_idx` (`Cod_asignatura` ASC),
  CONSTRAINT `fk_Grupo_Asignatura1`
    FOREIGN KEY (`Cod_asignatura`)
    REFERENCES `UVisa2017`.`Asignatura` (`Cod_asignatura`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `UVisa2017`.`Matricula`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UVisa2017`.`Matricula` (
  `num_expediente` INT(11) NOT NULL,
  `Curso` YEAR(4) NOT NULL,
  `reserva` TINYINT(1) NOT NULL,
  PRIMARY KEY (`num_expediente`, `Curso`),
  CONSTRAINT `fk_Matricula_Alumno1`
    FOREIGN KEY (`num_expediente`)
    REFERENCES `UVisa2017`.`Alumno` (`num_expediente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `UVisa2017`.`Asignatura_Matriculada`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UVisa2017`.`Asignatura_Matriculada` (
  `Cod_asignatura` INT(11) NOT NULL,
  `num_expediente` INT(11) NOT NULL,
  `Curso` YEAR(4) NOT NULL,
  `id_grupo_teoria` INT(11) NOT NULL,
  `nota_teoria` DECIMAL(10,0) NULL DEFAULT NULL,
  `id_grupo_lab` INT(11) NOT NULL,
  `nota_lab` VARCHAR(45) NULL,
  PRIMARY KEY (`Cod_asignatura`, `num_expediente`, `Curso`),
  INDEX `fk_Matricula_has_Asignatura_Asignatura1_idx` (`Cod_asignatura` ASC),
  INDEX `fk_Matricula_has_Asignatura_Matricula1_idx` (`num_expediente` ASC, `Curso` ASC),
  INDEX `fk_Asignatura_Matriculada_Grupo1_idx` (`id_grupo_teoria` ASC),
  INDEX `fk_Asignatura_Matriculada_Grupo2_idx` (`id_grupo_lab` ASC),
  CONSTRAINT `fk_Asignatura_Matriculada_Grupo1`
    FOREIGN KEY (`id_grupo_teoria`)
    REFERENCES `UVisa2017`.`Grupo` (`id_grupo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Matricula_has_Asignatura_Asignatura1`
    FOREIGN KEY (`Cod_asignatura`)
    REFERENCES `UVisa2017`.`Asignatura` (`Cod_asignatura`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Matricula_has_Asignatura_Matricula1`
    FOREIGN KEY (`num_expediente` , `Curso`)
    REFERENCES `UVisa2017`.`Matricula` (`num_expediente` , `Curso`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Asignatura_Matriculada_Grupo2`
    FOREIGN KEY (`id_grupo_lab`)
    REFERENCES `UVisa2017`.`Grupo` (`id_grupo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `UVisa2017`.`Categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UVisa2017`.`Categoria` (
  `nombre` VARCHAR(45) NOT NULL,
  `horas_semanales` INT(11) NOT NULL,
  PRIMARY KEY (`nombre`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `UVisa2017`.`Departamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UVisa2017`.`Departamento` (
  `codigo` INT(11) NOT NULL,
  `nombre` MEDIUMTEXT NOT NULL,
  `carga` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `UVisa2017`.`Espacio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UVisa2017`.`Espacio` (
  `codigo` INT(11) NOT NULL,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  `aforo_max` INT(11) NULL DEFAULT NULL,
  `precio_alquiler` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `UVisa2017`.`Profesor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UVisa2017`.`Profesor` (
  `NIF` VARCHAR(9) NOT NULL,
  `categoria` VARCHAR(45) NOT NULL,
  `antiguedad` INT(11) NULL DEFAULT NULL,
  `num_tramos_investigacion` INT(11) NULL DEFAULT NULL,
  `num_tramos_docentes` INT(11) NULL DEFAULT NULL,
  `departamento` INT(11) NOT NULL,
  PRIMARY KEY (`NIF`),
  UNIQUE INDEX `NIF_UNIQUE` (`NIF` ASC),
  INDEX `fk_Profesor_Departamento1_idx` (`departamento` ASC),
  INDEX `fk_Profesor_Categoria1_idx` (`categoria` ASC),
  INDEX `fk_Profesor_Usuario1_idx` (`NIF` ASC),
  CONSTRAINT `fk_Profesor_Categoria1`
    FOREIGN KEY (`categoria`)
    REFERENCES `UVisa2017`.`Categoria` (`nombre`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Profesor_Departamento1`
    FOREIGN KEY (`departamento`)
    REFERENCES `UVisa2017`.`Departamento` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Profesor_Usuario1`
    FOREIGN KEY (`NIF`)
    REFERENCES `UVisa2017`.`Usuario` (`NIF`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `UVisa2017`.`Nomina`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UVisa2017`.`Nomina` (
  `Profesor_NIF` VARCHAR(9) NOT NULL,
  `numero` INT(11) NOT NULL,
  `fecha` DATE NOT NULL,
  `Salario` DOUBLE NOT NULL,
  PRIMARY KEY (`Profesor_NIF`, `numero`),
  UNIQUE INDEX `Profesor_NIF_UNIQUE` (`Profesor_NIF` ASC),
  INDEX `fk_Nomina_Profesor1_idx` (`Profesor_NIF` ASC),
  CONSTRAINT `fk_Nomina_Profesor1`
    FOREIGN KEY (`Profesor_NIF`)
    REFERENCES `UVisa2017`.`Profesor` (`NIF`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `UVisa2017`.`Pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UVisa2017`.`Pago` (
  `numero_pago` INT(11) NOT NULL,
  `Tipo_pago` ENUM('FRACIONARIO', 'UNITARIO') NOT NULL,
  `importe` DOUBLE NOT NULL,
  `pagado` TINYINT(1) NOT NULL,
  `num_expediente` INT(11) NOT NULL,
  `Curso` YEAR(4) NOT NULL,
  PRIMARY KEY (`numero_pago`, `num_expediente`, `Curso`),
  UNIQUE INDEX `numero_pago_UNIQUE` (`numero_pago` ASC),
  INDEX `fk_Pago_Matricula1_idx` (`num_expediente` ASC, `Curso` ASC),
  CONSTRAINT `fk_Pago_Matricula1`
    FOREIGN KEY (`num_expediente` , `Curso`)
    REFERENCES `UVisa2017`.`Matricula` (`num_expediente` , `Curso`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `UVisa2017`.`Profesor_Grupo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UVisa2017`.`Profesor_Grupo` (
  `grupo_id` INT(11) NOT NULL,
  `Profesor_NIF` VARCHAR(9) NOT NULL,
  PRIMARY KEY (`grupo_id`, `Profesor_NIF`),
  INDEX `fk_Profesor_has_Grupo_Grupo1_idx` (`grupo_id` ASC),
  INDEX `fk_Profesor_Grupo_Profesor1_idx` (`Profesor_NIF` ASC),
  CONSTRAINT `fk_Profesor_Grupo_Profesor1`
    FOREIGN KEY (`Profesor_NIF`)
    REFERENCES `UVisa2017`.`Profesor` (`NIF`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Profesor_has_Grupo_Grupo1`
    FOREIGN KEY (`grupo_id`)
    REFERENCES `UVisa2017`.`Grupo` (`id_grupo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `UVisa2017`.`ReservaGrupo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UVisa2017`.`ReservaGrupo` (
  `hora` INT(11) NOT NULL,
  `dia_semana` INT(11) NOT NULL,
  `ID_Espacio` INT(11) NOT NULL,
  `grupo` INT(11) NOT NULL,
  PRIMARY KEY (`hora`, `dia_semana`, `ID_Espacio`),
  INDEX `fk_ReservaGrupo_Espacio1_idx` (`ID_Espacio` ASC),
  INDEX `fk_ReservaGrupo_Grupo1_idx` (`grupo` ASC),
  CONSTRAINT `fk_ReservaGrupo_Espacio1`
    FOREIGN KEY (`ID_Espacio`)
    REFERENCES `UVisa2017`.`Espacio` (`codigo`)
    ON UPDATE CASCADE,
  CONSTRAINT `fk_ReservaGrupo_Grupo1`
    FOREIGN KEY (`grupo`)
    REFERENCES `UVisa2017`.`Grupo` (`id_grupo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `UVisa2017`.`ReservaProfesor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UVisa2017`.`ReservaProfesor` (
  `Profesor_NIF` VARCHAR(9) NOT NULL,
  `ID_Espacio` INT(11) NOT NULL,
  `fecha` DATE NOT NULL,
  `hora` INT(11) NOT NULL,
  PRIMARY KEY (`ID_Espacio`, `fecha`, `hora`),
  INDEX `fk_ReservaProfesores_Espacio1_idx` (`ID_Espacio` ASC),
  INDEX `fk_ReservaProfesor_Profesor1_idx` (`Profesor_NIF` ASC),
  CONSTRAINT `fk_ReservaProfesor_Profesor1`
    FOREIGN KEY (`Profesor_NIF`)
    REFERENCES `UVisa2017`.`Profesor` (`NIF`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ReservaProfesores_Espacio1`
    FOREIGN KEY (`ID_Espacio`)
    REFERENCES `UVisa2017`.`Espacio` (`codigo`)
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

GRANT USAGE ON *.* TO Admin;

DROP USER Admin;
SET SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE USER 'Admin' IDENTIFIED BY 'isa2017';


GRANT SELECT ON TABLE `UVisa2017`.* TO 'Admin';

GRANT SELECT, INSERT, TRIGGER ON TABLE `UVisa2017`.* TO 'Admin';
GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE `UVisa2017`.* TO 'Admin';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;