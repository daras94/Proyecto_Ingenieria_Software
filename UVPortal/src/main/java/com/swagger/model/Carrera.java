package com.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Carrera
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-14T09:20:41.795Z")

public class Carrera   {
  @JsonProperty("Nombre")
  private String nombre = null;

  @JsonProperty("Facultad")
  private String facultad = null;

  @JsonProperty("Rama")
  private String rama = null;

  public Carrera nombre(String nombre) {
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

  public Carrera facultad(String facultad) {
    this.facultad = facultad;
    return this;
  }

   /**
   * Get facultad
   * @return facultad
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getFacultad() {
    return facultad;
  }

  public void setFacultad(String facultad) {
    this.facultad = facultad;
  }

  public Carrera rama(String rama) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Carrera carrera = (Carrera) o;
    return Objects.equals(this.nombre, carrera.nombre) &&
        Objects.equals(this.facultad, carrera.facultad) &&
        Objects.equals(this.rama, carrera.rama);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, facultad, rama);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Carrera {\n");
    
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    facultad: ").append(toIndentedString(facultad)).append("\n");
    sb.append("    rama: ").append(toIndentedString(rama)).append("\n");
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

