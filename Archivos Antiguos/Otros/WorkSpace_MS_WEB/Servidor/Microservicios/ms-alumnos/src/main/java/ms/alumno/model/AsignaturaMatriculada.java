package ms.alumno.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AsignaturaMatriculada
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-16T19:24:41.547Z")

public class AsignaturaMatriculada   {
  @JsonProperty("Codigo")
  private Integer codigo = null;

  @JsonProperty("GrupoTeo")
  private Integer grupoTeo = null;

  @JsonProperty("GrupoLab")
  private Integer grupoLab = null;

  public AsignaturaMatriculada codigo(Integer codigo) {
    this.codigo = codigo;
    return this;
  }

   /**
   * Get codigo
   * @return codigo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public AsignaturaMatriculada grupoTeo(Integer grupoTeo) {
    this.grupoTeo = grupoTeo;
    return this;
  }

   /**
   * Get grupoTeo
   * @return grupoTeo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getGrupoTeo() {
    return grupoTeo;
  }

  public void setGrupoTeo(Integer grupoTeo) {
    this.grupoTeo = grupoTeo;
  }

  public AsignaturaMatriculada grupoLab(Integer grupoLab) {
    this.grupoLab = grupoLab;
    return this;
  }

   /**
   * Get grupoLab
   * @return grupoLab
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getGrupoLab() {
    return grupoLab;
  }

  public void setGrupoLab(Integer grupoLab) {
    this.grupoLab = grupoLab;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsignaturaMatriculada asignaturaMatriculada = (AsignaturaMatriculada) o;
    return Objects.equals(this.codigo, asignaturaMatriculada.codigo) &&
        Objects.equals(this.grupoTeo, asignaturaMatriculada.grupoTeo) &&
        Objects.equals(this.grupoLab, asignaturaMatriculada.grupoLab);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, grupoTeo, grupoLab);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsignaturaMatriculada {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    grupoTeo: ").append(toIndentedString(grupoTeo)).append("\n");
    sb.append("    grupoLab: ").append(toIndentedString(grupoLab)).append("\n");
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

