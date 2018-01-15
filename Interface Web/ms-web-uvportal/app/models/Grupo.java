package models;

import java.util.Objects;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * Grupo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class Grupo   {
  @JsonProperty("ID")
  private Integer ID = null;

  @JsonProperty("Actas")
  private Boolean actas = null;

  @JsonProperty("Tipo")
  private String tipo = null;

  @JsonProperty("Miembros")
  private Integer miembros = null;

  @JsonProperty("Asignatura")
  private Integer asignatura = null;

  @JsonProperty("Anno")
  private Integer anno = null;

  public Grupo ID(Integer ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
    @NotNull
  public Integer getID() {
    return ID;
  }

  public void setID(Integer ID) {
    this.ID = ID;
  }

  public Grupo actas(Boolean actas) {
    this.actas = actas;
    return this;
  }

   /**
   * Get actas
   * @return actas
  **/
    @NotNull
  public Boolean getActas() {
    return actas;
  }

  public void setActas(Boolean actas) {
    this.actas = actas;
  }

  public Grupo tipo(String tipo) {
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

  public Grupo miembros(Integer miembros) {
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

  public Grupo asignatura(Integer asignatura) {
    this.asignatura = asignatura;
    return this;
  }

   /**
   * Get asignatura
   * @return asignatura
  **/
    @NotNull
  public Integer getAsignatura() {
    return asignatura;
  }

  public void setAsignatura(Integer asignatura) {
    this.asignatura = asignatura;
  }

  public Grupo anno(Integer anno) {
    this.anno = anno;
    return this;
  }

   /**
   * Get anno
   * @return anno
  **/
    @NotNull
  public Integer getAnno() {
    return anno;
  }

  public void setAnno(Integer anno) {
    this.anno = anno;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Grupo grupo = (Grupo) o;
    return Objects.equals(this.ID, grupo.ID) &&
        Objects.equals(this.actas, grupo.actas) &&
        Objects.equals(this.tipo, grupo.tipo) &&
        Objects.equals(this.miembros, grupo.miembros) &&
        Objects.equals(this.asignatura, grupo.asignatura) &&
        Objects.equals(this.anno, grupo.anno);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, actas, tipo, miembros, asignatura, anno);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Grupo {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    actas: ").append(toIndentedString(actas)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    miembros: ").append(toIndentedString(miembros)).append("\n");
    sb.append("    asignatura: ").append(toIndentedString(asignatura)).append("\n");
    sb.append("    anno: ").append(toIndentedString(anno)).append("\n");
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

