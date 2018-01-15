package services;


import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;
import models.Usuario;
import org.apache.http.HttpResponse;

public interface AuthentificacionApiControllerImpInterface {
    HttpResponse logoutUser( @NotNull String tokenUser) throws Exception;
    
    HttpResponse loginUser( @NotNull  @Pattern(regexp="^([0-9]{8}|[XYZ]{1}[0-9]{7})[TRWAGMYFPDXBNJZSQVHLCKET]{1}$") @Size(min=9,max=9)String nif,  @NotNull String password) throws Exception;


}
