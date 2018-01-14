package ms.alumno.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ms.alumno.model.AsignaturaMatriculada;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Matricula
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-16T19:24:41.547Z")

public class Matricula   {
  @JsonProperty("ID_Alumno")
  private Integer idAlumno = null;

  @JsonProperty("Promocion")
  private Integer promocion = null;

  @JsonProperty("Asignaturas_Matriculadas")
  private List<AsignaturaMatriculada> asignaturasMatriculadas = new ArrayList<AsignaturaMatriculada>();

  public Matricula idAlumno(Integer idAlumno) {
    this.idAlumno = idAlumno;
    return this;
  }

   /**
   * Get idAlumno
   * @return idAlumno
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getIdAlumno() {
    return idAlumno;
  }

  public void setIdAlumno(Integer idAlumno) {
    this.idAlumno = idAlumno;
  }

  public Matricula promocion(Integer promocion) {
    this.promocion = promocion;
    return this;
  }

   /**
   * Get promocion
   * @return promocion
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getPromocion() {
    return promocion;
  }

  public void setPromocion(Integer promocion) {
    this.promocion = promocion;
  }

  public Matricula asignaturasMatriculadas(List<AsignaturaMatriculada> asignaturasMatriculadas) {
    this.asignaturasMatriculadas = asignaturasMatriculadas;
    return this;
  }

  public Matricula addAsignaturasMatriculadasItem(AsignaturaMatriculada asignaturasMatriculadasItem) {
    this.asignaturasMatriculadas.add(asignaturasMatriculadasItem);
    return this;
  }

   /**
   * Get asignaturasMatriculadas
   * @return asignaturasMatriculadas
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<AsignaturaMatriculada> getAsignaturasMatriculadas() {
    return asignaturasMatriculadas;
  }

  public void setAsignaturasMatriculadas(List<AsignaturaMatriculada> asignaturasMatriculadas) {
    this.asignaturasMatriculadas = asignaturasMatriculadas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Matricula matricula = (Matricula) o;
    return Objects.equals(this.idAlumno, matricula.idAlumno) &&
        Objects.equals(this.promocion, matricula.promocion) &&
        Objects.equals(this.asignaturasMatriculadas, matricula.asignaturasMatriculadas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAlumno, promocion, asignaturasMatriculadas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Matricula {\n");
    
    sb.append("    idAlumno: ").append(toIndentedString(idAlumno)).append("\n");
    sb.append("    promocion: ").append(toIndentedString(promocion)).append("\n");
    sb.append("    asignaturasMatriculadas: ").append(toIndentedString(asignaturasMatriculadas)).append("\n");
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

