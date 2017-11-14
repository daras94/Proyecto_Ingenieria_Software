package apimodels;

import java.util.Objects;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * Alumno
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-11-14T12:09:33.135Z")

public class Alumno   {
  @JsonProperty("NIF")
  private String NIF = null;

  @JsonProperty("Contrasenna")
  private String contrasenna = null;

  @JsonProperty("Nombre")
  private String nombre = null;

  @JsonProperty("Apellido1")
  private String apellido1 = null;

  @JsonProperty("Apellido2")
  private String apellido2 = null;

  @JsonProperty("FechaNacimiento")
  private Integer fechaNacimiento = null;

  @JsonProperty("Email")
  private String email = null;

  @JsonProperty("CuentaCorriente")
  private Integer cuentaCorriente = null;

  public Alumno NIF(String NIF) {
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

  public Alumno contrasenna(String contrasenna) {
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

  public Alumno nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

   /**
   * Get nombre
   * @return nombre
  **/
    @NotNull
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Alumno apellido1(String apellido1) {
    this.apellido1 = apellido1;
    return this;
  }

   /**
   * Get apellido1
   * @return apellido1
  **/
    @NotNull
  public String getApellido1() {
    return apellido1;
  }

  public void setApellido1(String apellido1) {
    this.apellido1 = apellido1;
  }

  public Alumno apellido2(String apellido2) {
    this.apellido2 = apellido2;
    return this;
  }

   /**
   * Get apellido2
   * @return apellido2
  **/
    @NotNull
  public String getApellido2() {
    return apellido2;
  }

  public void setApellido2(String apellido2) {
    this.apellido2 = apellido2;
  }

  public Alumno fechaNacimiento(Integer fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }

   /**
   * Get fechaNacimiento
   * @return fechaNacimiento
  **/
    @NotNull
  public Integer getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(Integer fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public Alumno email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
    @NotNull
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Alumno cuentaCorriente(Integer cuentaCorriente) {
    this.cuentaCorriente = cuentaCorriente;
    return this;
  }

   /**
   * Get cuentaCorriente
   * @return cuentaCorriente
  **/
    @NotNull
  public Integer getCuentaCorriente() {
    return cuentaCorriente;
  }

  public void setCuentaCorriente(Integer cuentaCorriente) {
    this.cuentaCorriente = cuentaCorriente;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Alumno alumno = (Alumno) o;
    return Objects.equals(this.NIF, alumno.NIF) &&
        Objects.equals(this.contrasenna, alumno.contrasenna) &&
        Objects.equals(this.nombre, alumno.nombre) &&
        Objects.equals(this.apellido1, alumno.apellido1) &&
        Objects.equals(this.apellido2, alumno.apellido2) &&
        Objects.equals(this.fechaNacimiento, alumno.fechaNacimiento) &&
        Objects.equals(this.email, alumno.email) &&
        Objects.equals(this.cuentaCorriente, alumno.cuentaCorriente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NIF, contrasenna, nombre, apellido1, apellido2, fechaNacimiento, email, cuentaCorriente);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Alumno {\n");
    
    sb.append("    NIF: ").append(toIndentedString(NIF)).append("\n");
    sb.append("    contrasenna: ").append(toIndentedString(contrasenna)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    apellido1: ").append(toIndentedString(apellido1)).append("\n");
    sb.append("    apellido2: ").append(toIndentedString(apellido2)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    cuentaCorriente: ").append(toIndentedString(cuentaCorriente)).append("\n");
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

