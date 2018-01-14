package apimodels;

import java.util.Objects;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * Login
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-12-18T20:15:03.839Z")

public class Login   {
  @JsonProperty("NIF")
  private String NIF = null;

  @JsonProperty("Contrasenna")
  private String contrasenna = null;

  public Login NIF(String NIF) {
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

  public Login contrasenna(String contrasenna) {
    this.contrasenna = contrasenna;
    return this;
  }

   /**
   * Get contrasenna
   * @return contrasenna
  **/
    @NotNull
  public String getContrasenna() {
    return contrasenna;
  }

  public void setContrasenna(String contrasenna) {
    this.contrasenna = contrasenna;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Login login = (Login) o;
    return Objects.equals(this.NIF, login.NIF) &&
        Objects.equals(this.contrasenna, login.contrasenna);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NIF, contrasenna);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Login {\n");
    
    sb.append("    NIF: ").append(toIndentedString(NIF)).append("\n");
    sb.append("    contrasenna: ").append(toIndentedString(contrasenna)).append("\n");
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

