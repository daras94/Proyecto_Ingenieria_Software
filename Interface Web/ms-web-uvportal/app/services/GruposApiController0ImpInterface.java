package services;

import models.Grupo;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface GruposApiController0ImpInterface {
    List<Grupo> obtenerGruposNifGet(String nif) throws Exception;

}
