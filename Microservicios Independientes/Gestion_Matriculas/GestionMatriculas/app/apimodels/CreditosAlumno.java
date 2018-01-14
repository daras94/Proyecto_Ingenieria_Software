package apimodels;

import java.util.Objects;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * CreditosAlumno
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-12T18:22:06.797Z")

public class CreditosAlumno   {
  @JsonProperty("CreditosObligatorios")
  private Integer creditosObligatorios = null;

  @JsonProperty("CreditosOptativos")
  private Integer creditosOptativos = null;

  @JsonProperty("CreditosTransversales")
  private Integer creditosTransversales = null;
  
  @JsonProperty("CreditosOptativosExtra")
  private Integer creditosOptativosExtra = null;

  public CreditosAlumno creditosObligatorios(Integer creditosObligatorios) {
    this.creditosObligatorios = creditosObligatorios;
    return this;
  }

   /**
   * Get creditosObligatorios
   * @return creditosObligatorios
  **/
    @NotNull
  public Integer getCreditosObligatorios() {
    return creditosObligatorios;
  }

  public void setCreditosObligatorios(Integer creditosObligatorios) {
    this.creditosObligatorios = creditosObligatorios;
  }

  public CreditosAlumno creditosOptativos(Integer creditosOptativos) {
    this.creditosOptativos = creditosOptativos;
    return this;
  }

   /**
   * Get creditosOptativos
   * @return creditosOptativos
  **/
    @NotNull
  public Integer getCreditosOptativos() {
    return creditosOptativos;
  }

  public void setCreditosOptativos(Integer creditosOptativos) {
    this.creditosOptativos = creditosOptativos;
  }

  public CreditosAlumno creditosTransversales(Integer creditosTransversales) {
    this.creditosTransversales = creditosTransversales;
    return this;
  }

   /**
   * Get creditosTransversales
   * @return creditosTransversales
  **/
    @NotNull
  public Integer getCreditosTransversales() {
    return creditosTransversales;
  }

  public void setCreditosTransversales(Integer creditosTransversales) {
    this.creditosTransversales = creditosTransversales;
  }
  
  public CreditosAlumno creditosOptativosExtra(Integer creditosOptativosExtra) {
    this.creditosOptativosExtra = creditosOptativosExtra;
    return this;
  }

   /**
   * Get creditosOptativosExtra
   * @return creditosOptativosExtra
  **/
    @NotNull
  public Integer getCreditosOptativosExtra() {
    return creditosOptativosExtra;
  }

  public void setCreditosOptativosExtra(Integer creditosOptativosExtra) {
    this.creditosOptativosExtra = creditosOptativosExtra;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditosAlumno creditosAlumno = (CreditosAlumno) o;
    return Objects.equals(this.creditosObligatorios, creditosAlumno.creditosObligatorios) &&
        Objects.equals(this.creditosOptativos, creditosAlumno.creditosOptativos) &&
        Objects.equals(this.creditosTransversales, creditosAlumno.creditosTransversales) &&
        Objects.equals(this.creditosOptativosExtra, creditosAlumno.creditosOptativosExtra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditosObligatorios, creditosOptativos, creditosTransversales, creditosOptativosExtra);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditosAlumno {\n");
    
    sb.append("    creditosObligatorios: ").append(toIndentedString(creditosObligatorios)).append("\n");
    sb.append("    creditosOptativos: ").append(toIndentedString(creditosOptativos)).append("\n");
    sb.append("    creditosTransversales: ").append(toIndentedString(creditosTransversales)).append("\n");
    sb.append("    creditosOptativosExtra: ").append(toIndentedString(creditosOptativosExtra)).append("\n");
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

