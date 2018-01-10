package apimodels;

import java.util.Objects;
import apimodels.AsignaturaMatriculada;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * Matricula
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-10T11:25:04.680Z")

public class Matricula   {
  @JsonProperty("Asignaturas")
  private List<AsignaturaMatriculada> asignaturas = new ArrayList<AsignaturaMatriculada>();

  @JsonProperty("Anno")
  private Integer anno = null;

  public Matricula asignaturas(List<AsignaturaMatriculada> asignaturas) {
    this.asignaturas = asignaturas;
    return this;
  }

  public Matricula addAsignaturasItem(AsignaturaMatriculada asignaturasItem) {
    this.asignaturas.add(asignaturasItem);
    return this;
  }

   /**
   * Get asignaturas
   * @return asignaturas
  **/
    @NotNull
  public List<AsignaturaMatriculada> getAsignaturas() {
    return asignaturas;
  }

  public void setAsignaturas(List<AsignaturaMatriculada> asignaturas) {
    this.asignaturas = asignaturas;
  }

  public Matricula anno(Integer anno) {
    this.anno = anno;
    return this;
  }

   /**
   * Get anno
   * @return anno
  **/
    @NotNull
  public Integer getAnno() {
    return anno;
  }

  public void setAnno(Integer anno) {
    this.anno = anno;
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
    return Objects.equals(this.asignaturas, matricula.asignaturas) &&
        Objects.equals(this.anno, matricula.anno);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asignaturas, anno);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Matricula {\n");
    
    sb.append("    asignaturas: ").append(toIndentedString(asignaturas)).append("\n");
    sb.append("    anno: ").append(toIndentedString(anno)).append("\n");
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

