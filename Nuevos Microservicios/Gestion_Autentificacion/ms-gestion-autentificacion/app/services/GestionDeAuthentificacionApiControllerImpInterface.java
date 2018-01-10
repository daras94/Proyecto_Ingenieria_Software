package services;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;
import models.LoginForm;
import models.Usuario;
import play.data.Form;

public interface GestionDeAuthentificacionApiControllerImpInterface {

    Usuario loginUser(@NotNull @Pattern(regexp = "^([0-9]{8}|[XYZ]{1}[0-9]{7})[TRWAGMYFPDXBNJZSQVHLCKET]{1}$") @Size(min = 9, max = 9) String nif, @NotNull String password) throws Exception;

    void logoutUser() throws Exception;

}
