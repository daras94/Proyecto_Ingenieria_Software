
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Daniel/OneDrive - Universidad de Alcala/Uni/3er Curso/ISA/Practica/MicroservicioMatricula/conf/routes
// @DATE:Mon Dec 18 18:25:50 CET 2017


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
