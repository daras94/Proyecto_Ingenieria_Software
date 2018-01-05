package controllers;

import javax.inject.*;
import models.Secured;
import play.mvc.*;

public class ApiDocController extends Controller {

    @Inject
    private ApiDocController() {
    }

    //@Security.Authenticated(Secured.class)
    public Result api() {
        return redirect("/assets/lib/swagger-ui/index.html?/url=/assets/swagger.json");
    }
}
