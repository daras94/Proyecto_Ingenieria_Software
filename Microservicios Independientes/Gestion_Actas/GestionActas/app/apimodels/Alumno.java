package apimodels;

import java.util.Objects;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * Alumno
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-10T16:49:20.722Z")

public class Alumno   {
  @JsonProperty("DNI")
  private String DNI = null;

  @JsonProperty("Nombre")
  private String nombre = null;

  @JsonProperty("Apellido1")
  private String apellido1 = null;

  @JsonProperty("Apellido2")
  private String apellido2 = null;

  @JsonProperty("Email")
  private String email = null;

  @JsonProperty("Nota")
  private Double nota = null;
  
  @JsonProperty("Expediente")
  private Integer expediente = null;

  public Alumno DNI(String DNI) {
    this.DNI = DNI;
    return this;
  }

   /**
   * Get DNI
   * @return DNI
  **/
    @NotNull
  public String getDNI() {
    return DNI;
  }

  public void setDNI(String DNI) {
    this.DNI = DNI;
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

  public Alumno nota(Double nota) {
    this.nota = nota;
    return this;
  }

   /**
   * Get nota
   * @return nota
  **/
    @NotNull
  public Double getNota() {
    return nota;
  }

  public void setNota(Double nota) {
    this.nota = nota;
  }
  
  public Alumno expediente(Integer expediente) {
    this.expediente = expediente;
    return this;
  }

   /**
   * Get DNI
   * @return DNI
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
    return Objects.equals(this.DNI, alumno.DNI) &&
        Objects.equals(this.nombre, alumno.nombre) &&
        Objects.equals(this.apellido1, alumno.apellido1) &&
        Objects.equals(this.apellido2, alumno.apellido2) &&
        Objects.equals(this.email, alumno.email) &&
        Objects.equals(this.nota, alumno.nota)&&
        Objects.equals(this.expediente, alumno.expediente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DNI, nombre, apellido1, apellido2, email, nota);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Alumno {\n");
    
    sb.append("    DNI: ").append(toIndentedString(DNI)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    apellido1: ").append(toIndentedString(apellido1)).append("\n");
    sb.append("    apellido2: ").append(toIndentedString(apellido2)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    nota: ").append(toIndentedString(nota)).append("\n");
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

