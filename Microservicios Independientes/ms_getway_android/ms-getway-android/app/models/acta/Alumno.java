package models.acta;

import java.util.Objects;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * Alumno
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-07T17:55:13.255Z")

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
  private String fechaNacimiento = null;

  @JsonProperty("Email")
  private String email = null;

  @JsonProperty("CuentaCorriente")
  private String cuentaCorriente = null;

  @JsonProperty("Carrera")
  private Integer carrera = null;

  @JsonProperty("Expediente")
  private Integer expediente = null;

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

  public Alumno fechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }

   /**
   * Get fechaNacimiento
   * @return fechaNacimiento
  **/
    @NotNull
  public String getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(String fechaNacimiento) {
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

  public Alumno cuentaCorriente(String cuentaCorriente) {
    this.cuentaCorriente = cuentaCorriente;
    return this;
  }

   /**
   * Get cuentaCorriente
   * @return cuentaCorriente
  **/
    @NotNull
  public String getCuentaCorriente() {
    return cuentaCorriente;
  }

  public void setCuentaCorriente(String cuentaCorriente) {
    this.cuentaCorriente = cuentaCorriente;
  }

  public Alumno carrera(Integer carrera) {
    this.carrera = carrera;
    return this;
  }

   /**
   * Get carrera
   * @return carrera
  **/
    @NotNull
  public Integer getCarrera() {
    return carrera;
  }

  public void setCarrera(Integer carrera) {
    this.carrera = carrera;
  }

  public Alumno expediente(Integer expediente) {
    this.expediente = expediente;
    return this;
  }

   /**
   * Get expediente
   * @return expediente
  **/
    @NotNull
  public Integer getExpediente() {
    return expediente;
  }

  public void setExpediente(Integer expediente) {
    this.expediente = expediente;
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
        Objects.equals(this.cuentaCorriente, alumno.cuentaCorriente) &&
        Objects.equals(this.carrera, alumno.carrera) &&
        Objects.equals(this.expediente, alumno.expediente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NIF, contrasenna, nombre, apellido1, apellido2, fechaNacimiento, email, cuentaCorriente, carrera, expediente);
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
    sb.append("    carrera: ").append(toIndentedString(carrera)).append("\n");
    sb.append("    expediente: ").append(toIndentedString(expediente)).append("\n");
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

