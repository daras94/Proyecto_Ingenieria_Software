package services;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface DepartamentoApiControllerImpInterface {

    Integer getCargaDocenteGet(Integer departamento) throws Exception;

}
