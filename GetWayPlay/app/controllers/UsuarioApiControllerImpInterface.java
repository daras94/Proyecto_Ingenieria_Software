package controllers;

import apimodels.Usuario;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface UsuarioApiControllerImpInterface {
    Usuario usuarioNIFGet(String NIF) throws Exception;

}
