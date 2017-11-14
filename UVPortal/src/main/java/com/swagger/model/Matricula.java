package com.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Matricula
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-14T22:58:49.788Z")

public class Matricula   {
  @JsonProperty("ID_Alumno")
  private Integer idAlumno = null;

  @JsonProperty("Codigos_Asignatura")
  private List<Integer> codigosAsignatura = new ArrayList<Integer>();

  public Matricula idAlumno(Integer idAlumno) {
    this.idAlumno = idAlumno;
    return this;
  }

   /**
   * Get idAlumno
   * @return idAlumno
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getIdAlumno() {
    return idAlumno;
  }

  public void setIdAlumno(Integer idAlumno) {
    this.idAlumno = idAlumno;
  }

  public Matricula codigosAsignatura(List<Integer> codigosAsignatura) {
    this.codigosAsignatura = codigosAsignatura;
    return this;
  }

  public Matricula addCodigosAsignaturaItem(Integer codigosAsignaturaItem) {
    this.codigosAsignatura.add(codigosAsignaturaItem);
    return this;
  }

   /**
   * Get codigosAsignatura
   * @return codigosAsignatura
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<Integer> getCodigosAsignatura() {
    return codigosAsignatura;
  }

  public void setCodigosAsignatura(List<Integer> codigosAsignatura) {
    this.codigosAsignatura = codigosAsignatura;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Matricula matricula = (Matricula) o;
    return Objects.equals(this.idAlumno, matricula.idAlumno) &&
        Objects.equals(this.codigosAsignatura, matricula.codigosAsignatura);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAlumno, codigosAsignatura);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Matricula {\n");
    
    sb.append("    idAlumno: ").append(toIndentedString(idAlumno)).append("\n");
    sb.append("    codigosAsignatura: ").append(toIndentedString(codigosAsignatura)).append("\n");
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

