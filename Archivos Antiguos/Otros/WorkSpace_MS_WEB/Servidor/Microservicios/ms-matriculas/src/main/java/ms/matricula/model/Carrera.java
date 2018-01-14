package ms.matricula.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Carrera
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-16T19:17:33.453Z")

public class Carrera   {
  @JsonProperty("Codigo")
  private Integer codigo = null;

  @JsonProperty("Nombre")
  private String nombre = null;

  @JsonProperty("Facultad")
  private String facultad = null;

  @JsonProperty("Numero_Creditos")
  private Integer numeroCreditos = null;

  @JsonProperty("Numero_Creditos_Optativos")
  private Integer numeroCreditosOptativos = null;

  @JsonProperty("Numero_Creditos_Obligatorios")
  private Integer numeroCreditosObligatorios = null;

  @JsonProperty("Numero_Creditos_Transversales")
  private Integer numeroCreditosTransversales = null;

  public Carrera codigo(Integer codigo) {
    this.codigo = codigo;
    return this;
  }

   /**
   * Get codigo
   * @return codigo
  **/
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getFacultad() {
    return facultad;
  }

  public void setFacultad(String facultad) {
    this.facultad = facultad;
  }

  public Carrera numeroCreditos(Integer numeroCreditos) {
    this.numeroCreditos = numeroCreditos;
    return this;
  }

   /**
   * Get numeroCreditos
   * @return numeroCreditos
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getNumeroCreditos() {
    return numeroCreditos;
  }

  public void setNumeroCreditos(Integer numeroCreditos) {
    this.numeroCreditos = numeroCreditos;
  }

  public Carrera numeroCreditosOptativos(Integer numeroCreditosOptativos) {
    this.numeroCreditosOptativos = numeroCreditosOptativos;
    return this;
  }

   /**
   * Get numeroCreditosOptativos
   * @return numeroCreditosOptativos
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getNumeroCreditosOptativos() {
    return numeroCreditosOptativos;
  }

  public void setNumeroCreditosOptativos(Integer numeroCreditosOptativos) {
    this.numeroCreditosOptativos = numeroCreditosOptativos;
  }

  public Carrera numeroCreditosObligatorios(Integer numeroCreditosObligatorios) {
    this.numeroCreditosObligatorios = numeroCreditosObligatorios;
    return this;
  }

   /**
   * Get numeroCreditosObligatorios
   * @return numeroCreditosObligatorios
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getNumeroCreditosObligatorios() {
    return numeroCreditosObligatorios;
  }

  public void setNumeroCreditosObligatorios(Integer numeroCreditosObligatorios) {
    this.numeroCreditosObligatorios = numeroCreditosObligatorios;
  }

  public Carrera numeroCreditosTransversales(Integer numeroCreditosTransversales) {
    this.numeroCreditosTransversales = numeroCreditosTransversales;
    return this;
  }

   /**
   * Get numeroCreditosTransversales
   * @return numeroCreditosTransversales
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getNumeroCreditosTransversales() {
    return numeroCreditosTransversales;
  }

  public void setNumeroCreditosTransversales(Integer numeroCreditosTransversales) {
    this.numeroCreditosTransversales = numeroCreditosTransversales;
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
        Objects.equals(this.numeroCreditos, carrera.numeroCreditos) &&
        Objects.equals(this.numeroCreditosOptativos, carrera.numeroCreditosOptativos) &&
        Objects.equals(this.numeroCreditosObligatorios, carrera.numeroCreditosObligatorios) &&
        Objects.equals(this.numeroCreditosTransversales, carrera.numeroCreditosTransversales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, nombre, facultad, numeroCreditos, numeroCreditosOptativos, numeroCreditosObligatorios, numeroCreditosTransversales);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Carrera {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    facultad: ").append(toIndentedString(facultad)).append("\n");
    sb.append("    numeroCreditos: ").append(toIndentedString(numeroCreditos)).append("\n");
    sb.append("    numeroCreditosOptativos: ").append(toIndentedString(numeroCreditosOptativos)).append("\n");
    sb.append("    numeroCreditosObligatorios: ").append(toIndentedString(numeroCreditosObligatorios)).append("\n");
    sb.append("    numeroCreditosTransversales: ").append(toIndentedString(numeroCreditosTransversales)).append("\n");
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

