package models;

import java.util.Objects;
import models.Asignatura;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * GrupoAsignatura
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-05T21:31:07.061Z")

public class GrupoAsignatura   {
  @JsonProperty("Asignatura")
  private Asignatura asignatura = null;

  @JsonProperty("IdGrupo")
  private Integer idGrupo = null;

  @JsonProperty("Miembros")
  private Integer miembros = null;

  @JsonProperty("Tipo")
  private String tipo = null;

  public GrupoAsignatura asignatura(Asignatura asignatura) {
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

  public GrupoAsignatura idGrupo(Integer idGrupo) {
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

  public GrupoAsignatura miembros(Integer miembros) {
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

  public GrupoAsignatura tipo(String tipo) {
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
    GrupoAsignatura grupoAsignatura = (GrupoAsignatura) o;
    return Objects.equals(this.asignatura, grupoAsignatura.asignatura) &&
        Objects.equals(this.idGrupo, grupoAsignatura.idGrupo) &&
        Objects.equals(this.miembros, grupoAsignatura.miembros) &&
        Objects.equals(this.tipo, grupoAsignatura.tipo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asignatura, idGrupo, miembros, tipo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrupoAsignatura {\n");
    
    sb.append("    asignatura: ").append(toIndentedString(asignatura)).append("\n");
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

