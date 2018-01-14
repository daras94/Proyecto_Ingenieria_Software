package controllers;

import apimodels.Grupo;
import apimodels.InfoGrupo;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface GruposApiControllerImpInterface {
    void grupoAsignadoPost( @NotNull String profesor,  @NotNull Integer grupo, Object cuerpo) throws Exception;

    List<Grupo> gruposGet() throws Exception;

    List<InfoGrupo> infoGrupoNIFGet(String NIF) throws Exception;

}
