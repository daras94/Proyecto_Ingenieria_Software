package models;

import java.util.Objects;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * Espacio
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-05T21:31:07.061Z")

public class Espacio   {
  @JsonProperty("Codigo")
  private Integer codigo = null;

  @JsonProperty("Nombre")
  private String nombre = null;

  @JsonProperty("Aforo")
  private Integer aforo = null;

  @JsonProperty("Precio")
  private BigDecimal precio = null;

  public Espacio codigo(Integer codigo) {
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

  public Espacio nombre(String nombre) {
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

  public Espacio aforo(Integer aforo) {
    this.aforo = aforo;
    return this;
  }

   /**
   * Get aforo
   * @return aforo
  **/
    @NotNull
  public Integer getAforo() {
    return aforo;
  }

  public void setAforo(Integer aforo) {
    this.aforo = aforo;
  }

  public Espacio precio(BigDecimal precio) {
    this.precio = precio;
    return this;
  }

   /**
   * Get precio
   * @return precio
  **/
    @NotNull
  public BigDecimal getPrecio() {
    return precio;
  }

  public void setPrecio(BigDecimal precio) {
    this.precio = precio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Espacio espacio = (Espacio) o;
    return Objects.equals(this.codigo, espacio.codigo) &&
        Objects.equals(this.nombre, espacio.nombre) &&
        Objects.equals(this.aforo, espacio.aforo) &&
        Objects.equals(this.precio, espacio.precio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, nombre, aforo, precio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Espacio {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    aforo: ").append(toIndentedString(aforo)).append("\n");
    sb.append("    precio: ").append(toIndentedString(precio)).append("\n");
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

