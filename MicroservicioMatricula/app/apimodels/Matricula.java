package apimodels;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * Matricula
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-12-18T17:56:13.194Z")

public class Matricula   {
  @JsonProperty("ID_Alumno")
  private Integer idAlumno = null;

  @JsonProperty("Curso")
  private Integer curso = null;

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
    @NotNull
  public Integer getIdAlumno() {
    return idAlumno;
  }

  public void setIdAlumno(Integer idAlumno) {
    this.idAlumno = idAlumno;
  }

  public Matricula curso(Integer curso) {
    this.curso = curso;
    return this;
  }

   /**
   * Get curso
   * @return curso
  **/
    @NotNull
  public Integer getCurso() {
    return curso;
  }

  public void setCurso(Integer curso) {
    this.curso = curso;
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
        Objects.equals(this.curso, matricula.curso) &&
        Objects.equals(this.codigosAsignatura, matricula.codigosAsignatura);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAlumno, curso, codigosAsignatura);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Matricula {\n");
    
    sb.append("    idAlumno: ").append(toIndentedString(idAlumno)).append("\n");
    sb.append("    curso: ").append(toIndentedString(curso)).append("\n");
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

