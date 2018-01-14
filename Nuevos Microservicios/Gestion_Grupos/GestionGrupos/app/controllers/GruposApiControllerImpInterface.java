package controllers;

import apimodels.Grupo;
import apimodels.InfoGrupo;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface GruposApiControllerImpInterface {
    List<Grupo> getGruposGet() throws Exception;

    List<InfoGrupo> getInfoGrupoGet(String NIF) throws Exception;

    void postGrupoAsignadoPost( @NotNull String profesor,  @NotNull Integer grupo, Object cuerpo) throws Exception;

}
