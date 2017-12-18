package ms.alumno.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Pago
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-16T19:24:41.547Z")

public class Pago   {
  @JsonProperty("Expediente")
  private Integer expediente = null;

  @JsonProperty("Numero")
  private Integer numero = null;

  @JsonProperty("Tipo")
  private String tipo = null;

  @JsonProperty("Importe")
  private BigDecimal importe = null;

  @JsonProperty("Pagado")
  private Boolean pagado = null;

  public Pago expediente(Integer expediente) {
    this.expediente = expediente;
    return this;
  }

   /**
   * Get expediente
   * @return expediente
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getExpediente() {
    return expediente;
  }

  public void setExpediente(Integer expediente) {
    this.expediente = expediente;
  }

  public Pago numero(Integer numero) {
    this.numero = numero;
    return this;
  }

   /**
   * Get numero
   * @return numero
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public Pago tipo(String tipo) {
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

  public Pago importe(BigDecimal importe) {
    this.importe = importe;
    return this;
  }

   /**
   * Get importe
   * @return importe
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getImporte() {
    return importe;
  }

  public void setImporte(BigDecimal importe) {
    this.importe = importe;
  }

  public Pago pagado(Boolean pagado) {
    this.pagado = pagado;
    return this;
  }

   /**
   * Get pagado
   * @return pagado
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean getPagado() {
    return pagado;
  }

  public void setPagado(Boolean pagado) {
    this.pagado = pagado;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pago pago = (Pago) o;
    return Objects.equals(this.expediente, pago.expediente) &&
        Objects.equals(this.numero, pago.numero) &&
        Objects.equals(this.tipo, pago.tipo) &&
        Objects.equals(this.importe, pago.importe) &&
        Objects.equals(this.pagado, pago.pagado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expediente, numero, tipo, importe, pagado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pago {\n");
    
    sb.append("    expediente: ").append(toIndentedString(expediente)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    importe: ").append(toIndentedString(importe)).append("\n");
    sb.append("    pagado: ").append(toIndentedString(pagado)).append("\n");
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

