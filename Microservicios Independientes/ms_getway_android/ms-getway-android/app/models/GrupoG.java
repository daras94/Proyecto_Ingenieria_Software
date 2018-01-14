package apimodels;

import java.util.Objects;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * GrupoG
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T17:20:16.009Z")

public class GrupoG   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("asignatura")
  private String asignatura = null;

  @JsonProperty("tipo")
  private String tipo = null;

  public GrupoG id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
    @NotNull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GrupoG asignatura(String asignatura) {
    this.asignatura = asignatura;
    return this;
  }

   /**
   * Get asignatura
   * @return asignatura
  **/
    @NotNull
  public String getAsignatura() {
    return asignatura;
  }

  public void setAsignatura(String asignatura) {
    this.asignatura = asignatura;
  }

  public GrupoG tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

   /**
   * Get tipo
   * @return tipo
  **/
    @NotNull
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrupoG grupoG = (GrupoG) o;
    return Objects.equals(this.id, grupoG.id) &&
        Objects.equals(this.asignatura, grupoG.asignatura) &&
        Objects.equals(this.tipo, grupoG.tipo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, asignatura, tipo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrupoG {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    asignatura: ").append(toIndentedString(asignatura)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
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

