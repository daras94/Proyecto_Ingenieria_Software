package apimodels;

import java.util.Objects;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * Nomina
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-14T17:04:47.834Z")

public class Nomina   {
  @JsonProperty("NIF")
  private String NIF = null;

  @JsonProperty("Numero")
  private Integer numero = null;

  @JsonProperty("Fecha")
  private String fecha = null;

  @JsonProperty("Salario")
  private BigDecimal salario = null;

  public Nomina NIF(String NIF) {
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

  public Nomina numero(Integer numero) {
    this.numero = numero;
    return this;
  }

   /**
   * Get numero
   * @return numero
  **/
    public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public Nomina fecha(String fecha) {
    this.fecha = fecha;
    return this;
  }

   /**
   * Get fecha
   * @return fecha
  **/
    public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public Nomina salario(BigDecimal salario) {
    this.salario = salario;
    return this;
  }

   /**
   * Get salario
   * @return salario
  **/
    @NotNull
  public BigDecimal getSalario() {
    return salario;
  }

  public void setSalario(BigDecimal salario) {
    this.salario = salario;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Nomina nomina = (Nomina) o;
    return Objects.equals(this.NIF, nomina.NIF) &&
        Objects.equals(this.numero, nomina.numero) &&
        Objects.equals(this.fecha, nomina.fecha) &&
        Objects.equals(this.salario, nomina.salario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NIF, numero, fecha, salario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Nomina {\n");
    
    sb.append("    NIF: ").append(toIndentedString(NIF)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    salario: ").append(toIndentedString(salario)).append("\n");
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

