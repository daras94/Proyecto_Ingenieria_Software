package ms.matricula.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Asignatura
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-16T19:17:33.453Z")

public class Asignatura   {
  @JsonProperty("Codigo")
  private Integer codigo = null;

  @JsonProperty("Nombre")
  private String nombre = null;

  @JsonProperty("Carrera")
  private Integer carrera = null;

  @JsonProperty("Tipo")
  private String tipo = null;

  @JsonProperty("Creditos")
  private Integer creditos = null;

  public Asignatura codigo(Integer codigo) {
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

  public Asignatura nombre(String nombre) {
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

  public Asignatura carrera(Integer carrera) {
    this.carrera = carrera;
    return this;
  }

   /**
   * Get carrera
   * @return carrera
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getCarrera() {
    return carrera;
  }

  public void setCarrera(Integer carrera) {
    this.carrera = carrera;
  }

  public Asignatura tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

   /**
   * Get tipo
   * @return tipo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public Asignatura creditos(Integer creditos) {
    this.creditos = creditos;
    return this;
  }

   /**
   * Get creditos
   * @return creditos
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getCreditos() {
    return creditos;
  }

  public void setCreditos(Integer creditos) {
    this.creditos = creditos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Asignatura asignatura = (Asignatura) o;
    return Objects.equals(this.codigo, asignatura.codigo) &&
        Objects.equals(this.nombre, asignatura.nombre) &&
        Objects.equals(this.carrera, asignatura.carrera) &&
        Objects.equals(this.tipo, asignatura.tipo) &&
        Objects.equals(this.creditos, asignatura.creditos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, nombre, carrera, tipo, creditos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Asignatura {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    carrera: ").append(toIndentedString(carrera)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    creditos: ").append(toIndentedString(creditos)).append("\n");
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

