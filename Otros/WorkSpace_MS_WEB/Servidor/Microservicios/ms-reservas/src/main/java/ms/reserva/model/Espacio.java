package ms.reserva.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Espacio
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-16T19:10:53.003Z")

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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

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

