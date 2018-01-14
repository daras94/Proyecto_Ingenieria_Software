package apimodels;

import java.util.Objects;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * Espacio
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-14T12:38:44.152Z")

public class Espacio   {
  @JsonProperty("codigo")
  private Integer codigo = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("aforo_max")
  private Integer aforoMax = null;

  @JsonProperty("precio_alquiler")
  private Integer precioAlquiler = null;

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

  public Espacio aforoMax(Integer aforoMax) {
    this.aforoMax = aforoMax;
    return this;
  }

   /**
   * Get aforoMax
   * @return aforoMax
  **/
    @NotNull
  public Integer getAforoMax() {
    return aforoMax;
  }

  public void setAforoMax(Integer aforoMax) {
    this.aforoMax = aforoMax;
  }

  public Espacio precioAlquiler(Integer precioAlquiler) {
    this.precioAlquiler = precioAlquiler;
    return this;
  }

   /**
   * Get precioAlquiler
   * @return precioAlquiler
  **/
    @NotNull
  public Integer getPrecioAlquiler() {
    return precioAlquiler;
  }

  public void setPrecioAlquiler(Integer precioAlquiler) {
    this.precioAlquiler = precioAlquiler;
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
        Objects.equals(this.aforoMax, espacio.aforoMax) &&
        Objects.equals(this.precioAlquiler, espacio.precioAlquiler);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, nombre, aforoMax, precioAlquiler);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Espacio {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    aforoMax: ").append(toIndentedString(aforoMax)).append("\n");
    sb.append("    precioAlquiler: ").append(toIndentedString(precioAlquiler)).append("\n");
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

