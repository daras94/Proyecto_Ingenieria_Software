package services;


import javax.validation.constraints.*;
import org.apache.http.HttpResponse;

public interface GestionDeAuthentificacionApiControllerImpInterface {

    HttpResponse loginUser(@NotNull @Pattern(regexp = "^([0-9]{8}|[XYZ]{1}[0-9]{7})[TRWAGMYFPDXBNJZSQVHLCKET]{1}$") @Size(min = 9, max = 9) String nif, @NotNull String password) throws Exception;

    void logoutUser() throws Exception;

}
