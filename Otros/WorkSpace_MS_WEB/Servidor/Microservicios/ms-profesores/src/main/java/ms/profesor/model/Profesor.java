package ms.profesor.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Profesor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-16T19:13:21.767Z")

public class Profesor   {
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

  @JsonProperty("Categoria")
  private String categoria = null;

  @JsonProperty("Antiguedad")
  private Integer antiguedad = null;

  @JsonProperty("TramosInvestigacion")
  private Integer tramosInvestigacion = null;

  @JsonProperty("TramosDocentes")
  private String tramosDocentes = null;

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
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getNIF() {
    return NIF;
  }

  public void setNIF(String NIF) {
    this.NIF = NIF;
  }

  public Profesor contrasenna(String contrasenna) {
    this.contrasenna = contrasenna;
    return this;
  }

   /**
   * Get contrasenna
   * @return contrasenna
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getContrasenna() {
    return contrasenna;
  }

  public void setContrasenna(String contrasenna) {
    this.contrasenna = contrasenna;
  }

  public Profesor nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

   /**
   * Get nombre
   * @return nombre
  **/
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public Profesor email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Profesor cuentaCorriente(String cuentaCorriente) {
    this.cuentaCorriente = cuentaCorriente;
    return this;
  }

   /**
   * Get cuentaCorriente
   * @return cuentaCorriente
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCuentaCorriente() {
    return cuentaCorriente;
  }

  public void setCuentaCorriente(String cuentaCorriente) {
    this.cuentaCorriente = cuentaCorriente;
  }

  public Profesor categoria(String categoria) {
    this.categoria = categoria;
    return this;
  }

   /**
   * Get categoria
   * @return categoria
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public Profesor antiguedad(Integer antiguedad) {
    this.antiguedad = antiguedad;
    return this;
  }

   /**
   * Get antiguedad
   * @return antiguedad
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getAntiguedad() {
    return antiguedad;
  }

  public void setAntiguedad(Integer antiguedad) {
    this.antiguedad = antiguedad;
  }

  public Profesor tramosInvestigacion(Integer tramosInvestigacion) {
    this.tramosInvestigacion = tramosInvestigacion;
    return this;
  }

   /**
   * Get tramosInvestigacion
   * @return tramosInvestigacion
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getTramosInvestigacion() {
    return tramosInvestigacion;
  }

  public void setTramosInvestigacion(Integer tramosInvestigacion) {
    this.tramosInvestigacion = tramosInvestigacion;
  }

  public Profesor tramosDocentes(String tramosDocentes) {
    this.tramosDocentes = tramosDocentes;
    return this;
  }

   /**
   * Get tramosDocentes
   * @return tramosDocentes
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getTramosDocentes() {
    return tramosDocentes;
  }

  public void setTramosDocentes(String tramosDocentes) {
    this.tramosDocentes = tramosDocentes;
  }

  public Profesor departamento(Integer departamento) {
    this.departamento = departamento;
    return this;
  }

   /**
   * Get departamento
   * @return departamento
  **/
  @ApiModelProperty(required = true, value = "")
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
        Objects.equals(this.contrasenna, profesor.contrasenna) &&
        Objects.equals(this.nombre, profesor.nombre) &&
        Objects.equals(this.apellido1, profesor.apellido1) &&
        Objects.equals(this.apellido2, profesor.apellido2) &&
        Objects.equals(this.fechaNacimiento, profesor.fechaNacimiento) &&
        Objects.equals(this.email, profesor.email) &&
        Objects.equals(this.cuentaCorriente, profesor.cuentaCorriente) &&
        Objects.equals(this.categoria, profesor.categoria) &&
        Objects.equals(this.antiguedad, profesor.antiguedad) &&
        Objects.equals(this.tramosInvestigacion, profesor.tramosInvestigacion) &&
        Objects.equals(this.tramosDocentes, profesor.tramosDocentes) &&
        Objects.equals(this.departamento, profesor.departamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NIF, contrasenna, nombre, apellido1, apellido2, fechaNacimiento, email, cuentaCorriente, categoria, antiguedad, tramosInvestigacion, tramosDocentes, departamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profesor {\n");
    
    sb.append("    NIF: ").append(toIndentedString(NIF)).append("\n");
    sb.append("    contrasenna: ").append(toIndentedString(contrasenna)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    apellido1: ").append(toIndentedString(apellido1)).append("\n");
    sb.append("    apellido2: ").append(toIndentedString(apellido2)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    cuentaCorriente: ").append(toIndentedString(cuentaCorriente)).append("\n");
    sb.append("    categoria: ").append(toIndentedString(categoria)).append("\n");
    sb.append("    antiguedad: ").append(toIndentedString(antiguedad)).append("\n");
    sb.append("    tramosInvestigacion: ").append(toIndentedString(tramosInvestigacion)).append("\n");
    sb.append("    tramosDocentes: ").append(toIndentedString(tramosDocentes)).append("\n");
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

