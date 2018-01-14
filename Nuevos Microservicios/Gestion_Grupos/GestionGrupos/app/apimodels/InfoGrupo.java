package apimodels;

import java.util.Objects;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * InfoGrupo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-14T17:36:45.634Z")

public class InfoGrupo   {
  @JsonProperty("Id_grupo")
  private Integer idGrupo = null;

  @JsonProperty("Asignatura_grupo")
  private String asignaturaGrupo = null;

  public InfoGrupo idGrupo(Integer idGrupo) {
    this.idGrupo = idGrupo;
    return this;
  }

   /**
   * Get idGrupo
   * @return idGrupo
  **/
    @NotNull
  public Integer getIdGrupo() {
    return idGrupo;
  }

  public void setIdGrupo(Integer idGrupo) {
    this.idGrupo = idGrupo;
  }

  public InfoGrupo asignaturaGrupo(String asignaturaGrupo) {
    this.asignaturaGrupo = asignaturaGrupo;
    return this;
  }

   /**
   * Get asignaturaGrupo
   * @return asignaturaGrupo
  **/
    @NotNull
  public String getAsignaturaGrupo() {
    return asignaturaGrupo;
  }

  public void setAsignaturaGrupo(String asignaturaGrupo) {
    this.asignaturaGrupo = asignaturaGrupo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoGrupo infoGrupo = (InfoGrupo) o;
    return Objects.equals(this.idGrupo, infoGrupo.idGrupo) &&
        Objects.equals(this.asignaturaGrupo, infoGrupo.asignaturaGrupo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idGrupo, asignaturaGrupo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoGrupo {\n");
    
    sb.append("    idGrupo: ").append(toIndentedString(idGrupo)).append("\n");
    sb.append("    asignaturaGrupo: ").append(toIndentedString(asignaturaGrupo)).append("\n");
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

