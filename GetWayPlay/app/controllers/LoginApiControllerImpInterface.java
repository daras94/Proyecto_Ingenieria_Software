package controllers;


import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface LoginApiControllerImpInterface {
    String loginGet( @NotNull String NIF,  @NotNull String contrasenna) throws Exception;

}
