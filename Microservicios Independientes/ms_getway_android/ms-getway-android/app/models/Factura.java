package models;

import java.util.Objects;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * Factura
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class Factura   {
  @JsonProperty("Espacio")
  private String espacio = null;

  @JsonProperty("Fecha")
  private String fecha = null;

  @JsonProperty("Hora")
  private String hora = null;

  @JsonProperty("Coste")
  private BigDecimal coste = null;

  public Factura espacio(String espacio) {
    this.espacio = espacio;
    return this;
  }

   /**
   * Get espacio
   * @return espacio
  **/
    @NotNull
  public String getEspacio() {
    return espacio;
  }

  public void setEspacio(String espacio) {
    this.espacio = espacio;
  }

  public Factura fecha(String fecha) {
    this.fecha = fecha;
    return this;
  }

   /**
   * Get fecha
   * @return fecha
  **/
    @NotNull
  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public Factura hora(String hora) {
    this.hora = hora;
    return this;
  }

   /**
   * Get hora
   * @return hora
  **/
    @NotNull
  public String getHora() {
    return hora;
  }

  public void setHora(String hora) {
    this.hora = hora;
  }

  public Factura coste(BigDecimal coste) {
    this.coste = coste;
    return this;
  }

   /**
   * Get coste
   * @return coste
  **/
    @NotNull
  public BigDecimal getCoste() {
    return coste;
  }

  public void setCoste(BigDecimal coste) {
    this.coste = coste;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Factura factura = (Factura) o;
    return Objects.equals(this.espacio, factura.espacio) &&
        Objects.equals(this.fecha, factura.fecha) &&
        Objects.equals(this.hora, factura.hora) &&
        Objects.equals(this.coste, factura.coste);
  }

  @Override
  public int hashCode() {
    return Objects.hash(espacio, fecha, hora, coste);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Factura {\n");
    
    sb.append("    espacio: ").append(toIndentedString(espacio)).append("\n");
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    hora: ").append(toIndentedString(hora)).append("\n");
    sb.append("    coste: ").append(toIndentedString(coste)).append("\n");
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

