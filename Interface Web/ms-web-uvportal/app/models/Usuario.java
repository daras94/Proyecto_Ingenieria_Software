package models;

import java.util.Objects;
import java.util.UUID;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * Usuario
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-12T15:07:34.340Z")

public class Usuario {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("nif")
    private String nif = null;

    @JsonProperty("tipo_user")
    private String tipoUser = null;

    @JsonProperty("authTokent")
    private String authTokent = null;

    @JsonProperty("num_expediente")
    private String numExpediente = null;

    public Usuario name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
  *
     */
    @NotNull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Usuario nif(String nif) {
        this.nif = nif;
        return this;
    }

    /**
     * Get nif
     *
     * @return nif
  *
     */
    @NotNull
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Usuario tipoUser(String tipoUser) {
        this.tipoUser = tipoUser;
        return this;
    }

    /**
     * Get tipoUser
     *
     * @return tipoUser
  *
     */
    @NotNull
    public String getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(String tipoUser) {
        this.tipoUser = tipoUser;
    }

    public Usuario authTokent() {
        this.authTokent = UUID.randomUUID().toString();
        return this;
    }

    /**
     * Get authTokent
     *
     * @return authTokent
  *
     */
    @NotNull
    public String getAuthTokent() {
        return authTokent;
    }

    public void setAuthTokent() {
        this.authTokent = UUID.randomUUID().toString();
    }

    public Usuario numExpediente(String numExpediente) {
        this.numExpediente = numExpediente;
        return this;
    }

    /**
     * Get numExpediente
     *
     * @return numExpediente
  *
     */
    @NotNull
    public String getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(String numExpediente) {
        this.numExpediente = numExpediente;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Usuario usuario = (Usuario) o;
        return Objects.equals(this.name, usuario.name)
                && Objects.equals(this.nif, usuario.nif)
                && Objects.equals(this.tipoUser, usuario.tipoUser)
                && Objects.equals(this.authTokent, usuario.authTokent)
                && Objects.equals(this.numExpediente, usuario.numExpediente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nif, tipoUser, authTokent, numExpediente);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Usuario {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nif: ").append(toIndentedString(nif)).append("\n");
        sb.append("    tipoUser: ").append(toIndentedString(tipoUser)).append("\n");
        sb.append("    authTokent: ").append(toIndentedString(authTokent)).append("\n");
        sb.append("    numExpediente: ").append(toIndentedString(numExpediente)).append("\n");
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
