
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/usuario/Documents/GitHub/Proyecto_Ingenieria_Software/GetWayPlay/conf/routes
// @DATE:Mon Dec 18 21:14:08 CET 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
