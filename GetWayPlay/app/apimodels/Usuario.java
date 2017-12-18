package apimodels;

import java.util.Objects;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * Usuario
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-12-18T20:15:03.839Z")

public class Usuario   {
  @JsonProperty("NIF")
  private String NIF = null;

  @JsonProperty("Contrasenna")
  private String contrasenna = null;

  @JsonProperty("TipoUser")
  private String tipoUser = null;

  public Usuario NIF(String NIF) {
    this.NIF = NIF;
    return this;
  }

   /**
   * Get NIF
   * @return NIF
  **/
    public String getNIF() {
    return NIF;
  }

  public void setNIF(String NIF) {
    this.NIF = NIF;
  }

  public Usuario contrasenna(String contrasenna) {
    this.contrasenna = contrasenna;
    return this;
  }

   /**
   * Get contrasenna
   * @return contrasenna
  **/
    public String getContrasenna() {
    return contrasenna;
  }

  public void setContrasenna(String contrasenna) {
    this.contrasenna = contrasenna;
  }

  public Usuario tipoUser(String tipoUser) {
    this.tipoUser = tipoUser;
    return this;
  }

   /**
   * Get tipoUser
   * @return tipoUser
  **/
    @NotNull
  public String getTipoUser() {
    return tipoUser;
  }

  public void setTipoUser(String tipoUser) {
    this.tipoUser = tipoUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Usuario usuario = (Usuario) o;
    return Objects.equals(this.NIF, usuario.NIF) &&
        Objects.equals(this.contrasenna, usuario.contrasenna) &&
        Objects.equals(this.tipoUser, usuario.tipoUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NIF, contrasenna, tipoUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Usuario {\n");
    
    sb.append("    NIF: ").append(toIndentedString(NIF)).append("\n");
    sb.append("    contrasenna: ").append(toIndentedString(contrasenna)).append("\n");
    sb.append("    tipoUser: ").append(toIndentedString(tipoUser)).append("\n");
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

