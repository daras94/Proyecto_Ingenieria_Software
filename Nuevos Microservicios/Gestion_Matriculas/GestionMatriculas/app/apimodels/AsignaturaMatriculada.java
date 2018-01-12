package apimodels;

import java.util.Objects;
import apimodels.Asignatura;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * AsignaturaMatriculada
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-12T16:35:42.671Z")

public class AsignaturaMatriculada   {
  @JsonProperty("Asignatura")
  private Asignatura asignatura = null;

  @JsonProperty("Nota")
  private Integer nota = null;

  public AsignaturaMatriculada asignatura(Asignatura asignatura) {
    this.asignatura = asignatura;
    return this;
  }

   /**
   * Get asignatura
   * @return asignatura
  **/
    @NotNull
  public Asignatura getAsignatura() {
    return asignatura;
  }

  public void setAsignatura(Asignatura asignatura) {
    this.asignatura = asignatura;
  }

  public AsignaturaMatriculada nota(Integer nota) {
    this.nota = nota;
    return this;
  }

   /**
   * Get nota
   * @return nota
  **/
    @NotNull
  public Integer getNota() {
    return nota;
  }

  public void setNota(Integer nota) {
    this.nota = nota;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsignaturaMatriculada asignaturaMatriculada = (AsignaturaMatriculada) o;
    return Objects.equals(this.asignatura, asignaturaMatriculada.asignatura) &&
        Objects.equals(this.nota, asignaturaMatriculada.nota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asignatura, nota);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsignaturaMatriculada {\n");
    
    sb.append("    asignatura: ").append(toIndentedString(asignatura)).append("\n");
    sb.append("    nota: ").append(toIndentedString(nota)).append("\n");
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

