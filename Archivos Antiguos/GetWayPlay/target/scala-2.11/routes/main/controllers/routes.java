
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/usuario/Documents/GitHub/Proyecto_Ingenieria_Software/GetWayPlay/conf/routes
// @DATE:Mon Dec 18 21:14:08 CET 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLoginApiController LoginApiController = new controllers.ReverseLoginApiController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAlumnoApiController AlumnoApiController = new controllers.ReverseAlumnoApiController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCarreraApiController CarreraApiController = new controllers.ReverseCarreraApiController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApiDocController ApiDocController = new controllers.ReverseApiDocController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMatriculaApiController MatriculaApiController = new controllers.ReverseMatriculaApiController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLoginApiController LoginApiController = new controllers.javascript.ReverseLoginApiController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAlumnoApiController AlumnoApiController = new controllers.javascript.ReverseAlumnoApiController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCarreraApiController CarreraApiController = new controllers.javascript.ReverseCarreraApiController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApiDocController ApiDocController = new controllers.javascript.ReverseApiDocController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMatriculaApiController MatriculaApiController = new controllers.javascript.ReverseMatriculaApiController(RoutesPrefix.byNamePrefix());
  }

}
