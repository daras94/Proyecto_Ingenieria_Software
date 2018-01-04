package ms.reserva.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReservaGrupo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-16T19:10:53.003Z")

public class ReservaGrupo   {
  @JsonProperty("Hora")
  private Integer hora = null;

  @JsonProperty("Dia")
  private String dia = null;

  @JsonProperty("Duracion")
  private Integer duracion = null;

  @JsonProperty("Espacio")
  private Integer espacio = null;

  @JsonProperty("Grupo")
  private Integer grupo = null;

  public ReservaGrupo hora(Integer hora) {
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

  public ReservaGrupo dia(String dia) {
    this.dia = dia;
    return this;
  }

   /**
   * Get dia
   * @return dia
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDia() {
    return dia;
  }

  public void setDia(String dia) {
    this.dia = dia;
  }

  public ReservaGrupo duracion(Integer duracion) {
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

  public ReservaGrupo espacio(Integer espacio) {
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

  public ReservaGrupo grupo(Integer grupo) {
    this.grupo = grupo;
    return this;
  }

   /**
   * Get grupo
   * @return grupo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getGrupo() {
    return grupo;
  }

  public void setGrupo(Integer grupo) {
    this.grupo = grupo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservaGrupo reservaGrupo = (ReservaGrupo) o;
    return Objects.equals(this.hora, reservaGrupo.hora) &&
        Objects.equals(this.dia, reservaGrupo.dia) &&
        Objects.equals(this.duracion, reservaGrupo.duracion) &&
        Objects.equals(this.espacio, reservaGrupo.espacio) &&
        Objects.equals(this.grupo, reservaGrupo.grupo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hora, dia, duracion, espacio, grupo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservaGrupo {\n");
    
    sb.append("    hora: ").append(toIndentedString(hora)).append("\n");
    sb.append("    dia: ").append(toIndentedString(dia)).append("\n");
    sb.append("    duracion: ").append(toIndentedString(duracion)).append("\n");
    sb.append("    espacio: ").append(toIndentedString(espacio)).append("\n");
    sb.append("    grupo: ").append(toIndentedString(grupo)).append("\n");
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

