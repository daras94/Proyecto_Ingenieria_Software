package apimodels;

import java.util.Objects;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * Profesor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T15:37:03.349Z")

public class Profesor   {
  @JsonProperty("NIF")
  private String NIF = null;

  @JsonProperty("Nombre")
  private String nombre = null;

  @JsonProperty("Apellido1")
  private String apellido1 = null;

  @JsonProperty("Apellido2")
  private String apellido2 = null;

  @JsonProperty("FechaNacimiento")
  private String fechaNacimiento = null;

  @JsonProperty("Departamento")
  private Integer departamento = null;

  public Profesor NIF(String NIF) {
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

  public Profesor nombre(String nombre) {
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

  public Profesor apellido1(String apellido1) {
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

  public Profesor apellido2(String apellido2) {
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

  public Profesor fechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }

   /**
   * Get fechaNacimiento
   * @return fechaNacimiento
  **/
    public String getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public Profesor departamento(Integer departamento) {
    this.departamento = departamento;
    return this;
  }

   /**
   * Get departamento
   * @return departamento
  **/
    @NotNull
  public Integer getDepartamento() {
    return departamento;
  }

  public void setDepartamento(Integer departamento) {
    this.departamento = departamento;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profesor profesor = (Profesor) o;
    return Objects.equals(this.NIF, profesor.NIF) &&
        Objects.equals(this.nombre, profesor.nombre) &&
        Objects.equals(this.apellido1, profesor.apellido1) &&
        Objects.equals(this.apellido2, profesor.apellido2) &&
        Objects.equals(this.fechaNacimiento, profesor.fechaNacimiento) &&
        Objects.equals(this.departamento, profesor.departamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NIF, nombre, apellido1, apellido2, fechaNacimiento, departamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profesor {\n");
    
    sb.append("    NIF: ").append(toIndentedString(NIF)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    apellido1: ").append(toIndentedString(apellido1)).append("\n");
    sb.append("    apellido2: ").append(toIndentedString(apellido2)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    departamento: ").append(toIndentedString(departamento)).append("\n");
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

