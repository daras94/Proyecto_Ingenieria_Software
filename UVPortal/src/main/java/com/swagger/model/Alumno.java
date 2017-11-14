package com.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Alumno
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-14T09:20:41.795Z")

public class Alumno   {
  @JsonProperty("NIF")
  private String NIF = null;

  @JsonProperty("Nombre")
  private String nombre = null;

  @JsonProperty("Apellidos")
  private String apellidos = null;

  @JsonProperty("FechaNacimiento")
  private Integer fechaNacimiento = null;

  @JsonProperty("Email")
  private String email = null;

  @JsonProperty("Carrera")
  private String carrera = null;

  public Alumno NIF(String NIF) {
    this.NIF = NIF;
    return this;
  }

   /**
   * Get NIF
   * @return NIF
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getNIF() {
    return NIF;
  }

  public void setNIF(String NIF) {
    this.NIF = NIF;
  }

  public Alumno nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

   /**
   * Get nombre
   * @return nombre
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Alumno apellidos(String apellidos) {
    this.apellidos = apellidos;
    return this;
  }

   /**
   * Get apellidos
   * @return apellidos
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public Alumno fechaNacimiento(Integer fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }

   /**
   * Get fechaNacimiento
   * @return fechaNacimiento
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(Integer fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public Alumno email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Alumno carrera(String carrera) {
    this.carrera = carrera;
    return this;
  }

   /**
   * Get carrera
   * @return carrera
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCarrera() {
    return carrera;
  }

  public void setCarrera(String carrera) {
    this.carrera = carrera;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Alumno alumno = (Alumno) o;
    return Objects.equals(this.NIF, alumno.NIF) &&
        Objects.equals(this.nombre, alumno.nombre) &&
        Objects.equals(this.apellidos, alumno.apellidos) &&
        Objects.equals(this.fechaNacimiento, alumno.fechaNacimiento) &&
        Objects.equals(this.email, alumno.email) &&
        Objects.equals(this.carrera, alumno.carrera);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NIF, nombre, apellidos, fechaNacimiento, email, carrera);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Alumno {\n");
    
    sb.append("    NIF: ").append(toIndentedString(NIF)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    apellidos: ").append(toIndentedString(apellidos)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    carrera: ").append(toIndentedString(carrera)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

