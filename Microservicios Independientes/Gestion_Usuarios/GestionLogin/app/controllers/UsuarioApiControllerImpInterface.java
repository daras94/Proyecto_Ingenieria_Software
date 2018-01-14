package controllers;

import apimodels.Cuenta;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface UsuarioApiControllerImpInterface {
    Cuenta loginNifContrasennaPost(String nif, String contrasenna) throws Exception;

}
