package services;

import apimodels.GrupoG;
import apimodels.InfoGrupo;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface GruposApiController1ImpInterface {

    List<GrupoG> getGruposGet() throws Exception;

    List<InfoGrupo> getInfoGrupoGet(String NIF) throws Exception;

    void postGrupoAsignadoPost(@NotNull String profesor, @NotNull Integer grupo) throws Exception;

}
