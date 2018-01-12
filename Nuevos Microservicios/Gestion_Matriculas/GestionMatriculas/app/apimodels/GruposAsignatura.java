package apimodels;

import java.util.Objects;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * GruposAsignatura
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-12T18:22:06.797Z")

public class GruposAsignatura   {
  @JsonProperty("IdGrupo")
  private Integer idGrupo = null;

  @JsonProperty("Miembros")
  private Integer miembros = null;

  @JsonProperty("Tipo")
  private String tipo = null;

  public GruposAsignatura idGrupo(Integer idGrupo) {
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

  public GruposAsignatura miembros(Integer miembros) {
    this.miembros = miembros;
    return this;
  }

   /**
   * Get miembros
   * @return miembros
  **/
    @NotNull
  public Integer getMiembros() {
    return miembros;
  }

  public void setMiembros(Integer miembros) {
    this.miembros = miembros;
  }

  public GruposAsignatura tipo(String tipo) {
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
    GruposAsignatura gruposAsignatura = (GruposAsignatura) o;
    return Objects.equals(this.idGrupo, gruposAsignatura.idGrupo) &&
        Objects.equals(this.miembros, gruposAsignatura.miembros) &&
        Objects.equals(this.tipo, gruposAsignatura.tipo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idGrupo, miembros, tipo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GruposAsignatura {\n");
    
    sb.append("    idGrupo: ").append(toIndentedString(idGrupo)).append("\n");
    sb.append("    miembros: ").append(toIndentedString(miembros)).append("\n");
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

