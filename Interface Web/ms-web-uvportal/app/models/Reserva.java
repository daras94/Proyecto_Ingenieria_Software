package models;

import java.util.Objects;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * Reserva
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class Reserva   {
  @JsonProperty("NIF")
  private String NIF = null;

  @JsonProperty("Espacio")
  private Integer espacio = null;

  @JsonProperty("Fecha")
  private String fecha = null;

  @JsonProperty("Hora")
  private Integer hora = null;

  public Reserva NIF(String NIF) {
    this.NIF = NIF;
    return this;
  }

   /**
   * Get NIF
   * @return NIF
  **/
    @NotNull
  public String getNIF() {
    return NIF;
  }

  public void setNIF(String NIF) {
    this.NIF = NIF;
  }

  public Reserva espacio(Integer espacio) {
    this.espacio = espacio;
    return this;
  }

   /**
   * Get espacio
   * @return espacio
  **/
    @NotNull
  public Integer getEspacio() {
    return espacio;
  }

  public void setEspacio(Integer espacio) {
    this.espacio = espacio;
  }

  public Reserva fecha(String fecha) {
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

  public Reserva hora(Integer hora) {
    this.hora = hora;
    return this;
  }

   /**
   * Get hora
   * @return hora
  **/
    @NotNull
  public Integer getHora() {
    return hora;
  }

  public void setHora(Integer hora) {
    this.hora = hora;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reserva reserva = (Reserva) o;
    return Objects.equals(this.NIF, reserva.NIF) &&
        Objects.equals(this.espacio, reserva.espacio) &&
        Objects.equals(this.fecha, reserva.fecha) &&
        Objects.equals(this.hora, reserva.hora);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NIF, espacio, fecha, hora);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reserva {\n");
    
    sb.append("    NIF: ").append(toIndentedString(NIF)).append("\n");
    sb.append("    espacio: ").append(toIndentedString(espacio)).append("\n");
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    hora: ").append(toIndentedString(hora)).append("\n");
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

