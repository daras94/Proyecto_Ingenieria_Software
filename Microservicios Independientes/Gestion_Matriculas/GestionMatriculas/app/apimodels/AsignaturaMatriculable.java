package apimodels;

import java.util.Objects;
import apimodels.Asignatura;
import apimodels.GruposAsignatura;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;
/**
 * AsignaturaMatriculable
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-12T18:22:06.797Z")

public class AsignaturaMatriculable   {
  @JsonProperty("Asignatura")
  private Asignatura asignatura = null;

  @JsonProperty("Grupos")
  private List<GruposAsignatura> grupos = new ArrayList<GruposAsignatura>();

  public AsignaturaMatriculable asignatura(Asignatura asignatura) {
    this.asignatura = asignatura;
    return this;
  }

   /**
   * Get asignatura
   * @return asignatura
  **/
    @NotNull
  public Asignatura getAsignatura() {
    return asignatura;
  }

  public void setAsignatura(Asignatura asignatura) {
    this.asignatura = asignatura;
  }

  public AsignaturaMatriculable grupos(List<GruposAsignatura> grupos) {
    this.grupos = grupos;
    return this;
  }

  public AsignaturaMatriculable addGruposItem(GruposAsignatura gruposItem) {
    this.grupos.add(gruposItem);
    return this;
  }

   /**
   * Get grupos
   * @return grupos
  **/
    @NotNull
  public List<GruposAsignatura> getGrupos() {
    return grupos;
  }

  public void setGrupos(List<GruposAsignatura> grupos) {
    this.grupos = grupos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsignaturaMatriculable asignaturaMatriculable = (AsignaturaMatriculable) o;
    return Objects.equals(this.asignatura, asignaturaMatriculable.asignatura) &&
        Objects.equals(this.grupos, asignaturaMatriculable.grupos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asignatura, grupos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsignaturaMatriculable {\n");
    
    sb.append("    asignatura: ").append(toIndentedString(asignatura)).append("\n");
    sb.append("    grupos: ").append(toIndentedString(grupos)).append("\n");
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

