package models;

import java.util.Objects;
import models.GrupoAsignatura;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * MatriculaAlta
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class MatriculaAlta   {
  @JsonProperty("Grupos")
  private List<GrupoAsignatura> grupos = new ArrayList<GrupoAsignatura>();

  @JsonProperty("TipoPago")
  private Integer tipoPago = null;

  public MatriculaAlta grupos(List<GrupoAsignatura> grupos) {
    this.grupos = grupos;
    return this;
  }

  public MatriculaAlta addGruposItem(GrupoAsignatura gruposItem) {
    this.grupos.add(gruposItem);
    return this;
  }

   /**
   * Get grupos
   * @return grupos
  **/
    @NotNull
  public List<GrupoAsignatura> getGrupos() {
    return grupos;
  }

  public void setGrupos(List<GrupoAsignatura> grupos) {
    this.grupos = grupos;
  }

  public MatriculaAlta tipoPago(Integer tipoPago) {
    this.tipoPago = tipoPago;
    return this;
  }

   /**
   * Get tipoPago
   * @return tipoPago
  **/
    @NotNull
  public Integer getTipoPago() {
    return tipoPago;
  }

  public void setTipoPago(Integer tipoPago) {
    this.tipoPago = tipoPago;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatriculaAlta matriculaAlta = (MatriculaAlta) o;
    return Objects.equals(this.grupos, matriculaAlta.grupos) &&
        Objects.equals(this.tipoPago, matriculaAlta.tipoPago);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grupos, tipoPago);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatriculaAlta {\n");
    
    sb.append("    grupos: ").append(toIndentedString(grupos)).append("\n");
    sb.append("    tipoPago: ").append(toIndentedString(tipoPago)).append("\n");
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

