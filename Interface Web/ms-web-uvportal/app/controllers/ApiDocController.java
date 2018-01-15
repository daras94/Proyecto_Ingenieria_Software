package controllers;

import controllers.authentificacion.Secured;
import javax.inject.*;
import play.mvc.*;

public class ApiDocController extends Controller {

    @Inject
    private ApiDocController() {
    }

    public Result api() {
        return redirect("/assets/lib/swagger-ui/index.html?/url=/assets/swagger.json");
    }
}
