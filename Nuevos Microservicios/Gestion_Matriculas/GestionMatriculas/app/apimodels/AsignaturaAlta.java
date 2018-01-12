package apimodels;

import java.util.Objects;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * AsignaturaAlta
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-12T18:22:06.797Z")

public class AsignaturaAlta   {
  @JsonProperty("CodigoAsignatura")
  private Integer codigoAsignatura = null;

  @JsonProperty("CodigoGrupoTeoria")
  private Integer codigoGrupoTeoria = null;

  @JsonProperty("CodigoGrupoLab")
  private Integer codigoGrupoLab = null;

  public AsignaturaAlta codigoAsignatura(Integer codigoAsignatura) {
    this.codigoAsignatura = codigoAsignatura;
    return this;
  }

   /**
   * Get codigoAsignatura
   * @return codigoAsignatura
  **/
    @NotNull
  public Integer getCodigoAsignatura() {
    return codigoAsignatura;
  }

  public void setCodigoAsignatura(Integer codigoAsignatura) {
    this.codigoAsignatura = codigoAsignatura;
  }

  public AsignaturaAlta codigoGrupoTeoria(Integer codigoGrupoTeoria) {
    this.codigoGrupoTeoria = codigoGrupoTeoria;
    return this;
  }

   /**
   * Get codigoGrupoTeoria
   * @return codigoGrupoTeoria
  **/
    @NotNull
  public Integer getCodigoGrupoTeoria() {
    return codigoGrupoTeoria;
  }

  public void setCodigoGrupoTeoria(Integer codigoGrupoTeoria) {
    this.codigoGrupoTeoria = codigoGrupoTeoria;
  }

  public AsignaturaAlta codigoGrupoLab(Integer codigoGrupoLab) {
    this.codigoGrupoLab = codigoGrupoLab;
    return this;
  }

   /**
   * Get codigoGrupoLab
   * @return codigoGrupoLab
  **/
    @NotNull
  public Integer getCodigoGrupoLab() {
    return codigoGrupoLab;
  }

  public void setCodigoGrupoLab(Integer codigoGrupoLab) {
    this.codigoGrupoLab = codigoGrupoLab;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsignaturaAlta asignaturaAlta = (AsignaturaAlta) o;
    return Objects.equals(this.codigoAsignatura, asignaturaAlta.codigoAsignatura) &&
        Objects.equals(this.codigoGrupoTeoria, asignaturaAlta.codigoGrupoTeoria) &&
        Objects.equals(this.codigoGrupoLab, asignaturaAlta.codigoGrupoLab);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoAsignatura, codigoGrupoTeoria, codigoGrupoLab);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsignaturaAlta {\n");
    
    sb.append("    codigoAsignatura: ").append(toIndentedString(codigoAsignatura)).append("\n");
    sb.append("    codigoGrupoTeoria: ").append(toIndentedString(codigoGrupoTeoria)).append("\n");
    sb.append("    codigoGrupoLab: ").append(toIndentedString(codigoGrupoLab)).append("\n");
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

