package apimodels;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * Grupo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-04T16:21:46.745Z")

public class Grupo   {
  @JsonProperty("Codigo")
  private Integer codigo = null;

  @JsonProperty("Actas")
  private Boolean actas = null;

  @JsonProperty("Miembros")
  private Integer miembros = null;

  @JsonProperty("Tipo")
  private String tipo = null;

  @JsonProperty("Asignatura")
  private Integer asignatura = null;

  @JsonProperty("Profesores")
  private List<String> profesores = new ArrayList<String>();

  @JsonProperty("Anno")
  private Integer anno = null;

  public Grupo codigo(Integer codigo) {
    this.codigo = codigo;
    return this;
  }

   /**
   * Get codigo
   * @return codigo
  **/
    @NotNull
  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
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

  public Grupo profesores(List<String> profesores) {
    this.profesores = profesores;
    return this;
  }

  public Grupo addProfesoresItem(String profesoresItem) {
    this.profesores.add(profesoresItem);
    return this;
  }

   /**
   * Get profesores
   * @return profesores
  **/
    @NotNull
  public List<String> getProfesores() {
    return profesores;
  }

  public void setProfesores(List<String> profesores) {
    this.profesores = profesores;
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
    return Objects.equals(this.codigo, grupo.codigo) &&
        Objects.equals(this.actas, grupo.actas) &&
        Objects.equals(this.miembros, grupo.miembros) &&
        Objects.equals(this.tipo, grupo.tipo) &&
        Objects.equals(this.asignatura, grupo.asignatura) &&
        Objects.equals(this.profesores, grupo.profesores) &&
        Objects.equals(this.anno, grupo.anno);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, actas, miembros, tipo, asignatura, profesores, anno);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Grupo {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    actas: ").append(toIndentedString(actas)).append("\n");
    sb.append("    miembros: ").append(toIndentedString(miembros)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    asignatura: ").append(toIndentedString(asignatura)).append("\n");
    sb.append("    profesores: ").append(toIndentedString(profesores)).append("\n");
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

