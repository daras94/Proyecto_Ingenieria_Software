package com.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Asignatura
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-14T09:20:41.795Z")

public class Asignatura   {
  @JsonProperty("Nombre")
  private String nombre = null;

  @JsonProperty("Carrera")
  private String carrera = null;

  @JsonProperty("Coordinador")
  private String coordinador = null;

  @JsonProperty("Tipo")
  private String tipo = null;

  @JsonProperty("Curso")
  private String curso = null;

  @JsonProperty("Rama")
  private String rama = null;

  @JsonProperty("Creditos")
  private Integer creditos = null;

  public Asignatura nombre(String nombre) {
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

  public Asignatura carrera(String carrera) {
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

  public Asignatura coordinador(String coordinador) {
    this.coordinador = coordinador;
    return this;
  }

   /**
   * Get coordinador
   * @return coordinador
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCoordinador() {
    return coordinador;
  }

  public void setCoordinador(String coordinador) {
    this.coordinador = coordinador;
  }

  public Asignatura tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

   /**
   * Get tipo
   * @return tipo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public Asignatura curso(String curso) {
    this.curso = curso;
    return this;
  }

   /**
   * Get curso
   * @return curso
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public Asignatura rama(String rama) {
    this.rama = rama;
    return this;
  }

   /**
   * Get rama
   * @return rama
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getRama() {
    return rama;
  }

  public void setRama(String rama) {
    this.rama = rama;
  }

  public Asignatura creditos(Integer creditos) {
    this.creditos = creditos;
    return this;
  }

   /**
   * Get creditos
   * @return creditos
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getCreditos() {
    return creditos;
  }

  public void setCreditos(Integer creditos) {
    this.creditos = creditos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Asignatura asignatura = (Asignatura) o;
    return Objects.equals(this.nombre, asignatura.nombre) &&
        Objects.equals(this.carrera, asignatura.carrera) &&
        Objects.equals(this.coordinador, asignatura.coordinador) &&
        Objects.equals(this.tipo, asignatura.tipo) &&
        Objects.equals(this.curso, asignatura.curso) &&
        Objects.equals(this.rama, asignatura.rama) &&
        Objects.equals(this.creditos, asignatura.creditos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, carrera, coordinador, tipo, curso, rama, creditos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Asignatura {\n");
    
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    carrera: ").append(toIndentedString(carrera)).append("\n");
    sb.append("    coordinador: ").append(toIndentedString(coordinador)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    curso: ").append(toIndentedString(curso)).append("\n");
    sb.append("    rama: ").append(toIndentedString(rama)).append("\n");
    sb.append("    creditos: ").append(toIndentedString(creditos)).append("\n");
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

