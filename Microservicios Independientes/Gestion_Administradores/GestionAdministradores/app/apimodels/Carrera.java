package apimodels;

import java.util.Objects;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * Carrera
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-14T12:38:44.152Z")

public class Carrera   {
  @JsonProperty("Codigo")
  private Integer codigo = null;

  @JsonProperty("Nombre")
  private String nombre = null;

  @JsonProperty("Facultad")
  private String facultad = null;

  @JsonProperty("CreditosOptativos")
  private Integer creditosOptativos = null;

  @JsonProperty("CreditosTransversales")
  private Integer creditosTransversales = null;

  @JsonProperty("CreditosObligatorios")
  private Integer creditosObligatorios = null;

  public Carrera codigo(Integer codigo) {
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

  public Carrera nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

   /**
   * Get nombre
   * @return nombre
  **/
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
    @NotNull
  public String getFacultad() {
    return facultad;
  }

  public void setFacultad(String facultad) {
    this.facultad = facultad;
  }

  public Carrera creditosOptativos(Integer creditosOptativos) {
    this.creditosOptativos = creditosOptativos;
    return this;
  }

   /**
   * Get creditosOptativos
   * @return creditosOptativos
  **/
    @NotNull
  public Integer getCreditosOptativos() {
    return creditosOptativos;
  }

  public void setCreditosOptativos(Integer creditosOptativos) {
    this.creditosOptativos = creditosOptativos;
  }

  public Carrera creditosTransversales(Integer creditosTransversales) {
    this.creditosTransversales = creditosTransversales;
    return this;
  }

   /**
   * Get creditosTransversales
   * @return creditosTransversales
  **/
    @NotNull
  public Integer getCreditosTransversales() {
    return creditosTransversales;
  }

  public void setCreditosTransversales(Integer creditosTransversales) {
    this.creditosTransversales = creditosTransversales;
  }

  public Carrera creditosObligatorios(Integer creditosObligatorios) {
    this.creditosObligatorios = creditosObligatorios;
    return this;
  }

   /**
   * Get creditosObligatorios
   * @return creditosObligatorios
  **/
    @NotNull
  public Integer getCreditosObligatorios() {
    return creditosObligatorios;
  }

  public void setCreditosObligatorios(Integer creditosObligatorios) {
    this.creditosObligatorios = creditosObligatorios;
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
    return Objects.equals(this.codigo, carrera.codigo) &&
        Objects.equals(this.nombre, carrera.nombre) &&
        Objects.equals(this.facultad, carrera.facultad) &&
        Objects.equals(this.creditosOptativos, carrera.creditosOptativos) &&
        Objects.equals(this.creditosTransversales, carrera.creditosTransversales) &&
        Objects.equals(this.creditosObligatorios, carrera.creditosObligatorios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, nombre, facultad, creditosOptativos, creditosTransversales, creditosObligatorios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Carrera {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    facultad: ").append(toIndentedString(facultad)).append("\n");
    sb.append("    creditosOptativos: ").append(toIndentedString(creditosOptativos)).append("\n");
    sb.append("    creditosTransversales: ").append(toIndentedString(creditosTransversales)).append("\n");
    sb.append("    creditosObligatorios: ").append(toIndentedString(creditosObligatorios)).append("\n");
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

