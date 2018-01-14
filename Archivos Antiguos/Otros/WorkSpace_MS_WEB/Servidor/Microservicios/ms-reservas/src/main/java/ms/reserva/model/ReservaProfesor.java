package ms.reserva.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReservaProfesor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-16T19:10:53.003Z")

public class ReservaProfesor   {
  @JsonProperty("Hora")
  private Integer hora = null;

  @JsonProperty("Fecha")
  private String fecha = null;

  @JsonProperty("Duracion")
  private Integer duracion = null;

  @JsonProperty("Espacio")
  private Integer espacio = null;

  @JsonProperty("NIF")
  private String NIF = null;

  public ReservaProfesor hora(Integer hora) {
    this.hora = hora;
    return this;
  }

   /**
   * Get hora
   * @return hora
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getHora() {
    return hora;
  }

  public void setHora(Integer hora) {
    this.hora = hora;
  }

  public ReservaProfesor fecha(String fecha) {
    this.fecha = fecha;
    return this;
  }

   /**
   * Get fecha
   * @return fecha
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public ReservaProfesor duracion(Integer duracion) {
    this.duracion = duracion;
    return this;
  }

   /**
   * Get duracion
   * @return duracion
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getDuracion() {
    return duracion;
  }

  public void setDuracion(Integer duracion) {
    this.duracion = duracion;
  }

  public ReservaProfesor espacio(Integer espacio) {
    this.espacio = espacio;
    return this;
  }

   /**
   * Get espacio
   * @return espacio
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getEspacio() {
    return espacio;
  }

  public void setEspacio(Integer espacio) {
    this.espacio = espacio;
  }

  public ReservaProfesor NIF(String NIF) {
    this.NIF = NIF;
    return this;
  }

   /**
   * Get NIF
   * @return NIF
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getNIF() {
    return NIF;
  }

  public void setNIF(String NIF) {
    this.NIF = NIF;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservaProfesor reservaProfesor = (ReservaProfesor) o;
    return Objects.equals(this.hora, reservaProfesor.hora) &&
        Objects.equals(this.fecha, reservaProfesor.fecha) &&
        Objects.equals(this.duracion, reservaProfesor.duracion) &&
        Objects.equals(this.espacio, reservaProfesor.espacio) &&
        Objects.equals(this.NIF, reservaProfesor.NIF);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hora, fecha, duracion, espacio, NIF);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservaProfesor {\n");
    
    sb.append("    hora: ").append(toIndentedString(hora)).append("\n");
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    duracion: ").append(toIndentedString(duracion)).append("\n");
    sb.append("    espacio: ").append(toIndentedString(espacio)).append("\n");
    sb.append("    NIF: ").append(toIndentedString(NIF)).append("\n");
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

