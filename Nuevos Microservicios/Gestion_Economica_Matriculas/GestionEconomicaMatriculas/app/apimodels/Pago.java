package apimodels;

import java.util.Objects;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * Pago
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-04T17:39:30.340Z")

public class Pago   {
  @JsonProperty("Num_pago")
  private Integer numPago = null;

  @JsonProperty("Importe")
  private BigDecimal importe = null;

  @JsonProperty("Pagado")
  private Boolean pagado = null;

  public Pago numPago(Integer numPago) {
    this.numPago = numPago;
    return this;
  }

   /**
   * Get numPago
   * @return numPago
  **/
    @NotNull
  public Integer getNumPago() {
    return numPago;
  }

  public void setNumPago(Integer numPago) {
    this.numPago = numPago;
  }

  public Pago importe(BigDecimal importe) {
    this.importe = importe;
    return this;
  }

   /**
   * Get importe
   * @return importe
  **/
    @NotNull
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
    return Objects.equals(this.numPago, pago.numPago) &&
        Objects.equals(this.importe, pago.importe) &&
        Objects.equals(this.pagado, pago.pagado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numPago, importe, pagado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pago {\n");
    
    sb.append("    numPago: ").append(toIndentedString(numPago)).append("\n");
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

