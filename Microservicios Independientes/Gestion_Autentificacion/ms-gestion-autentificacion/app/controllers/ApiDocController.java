package controllers;

import javax.inject.*;
import play.mvc.*;

public class ApiDocController extends Controller {

    @Inject
    private ApiDocController() {
    }

    //@Security.Authenticated(Secured.class)
    public Result api() {
        return redirect("/assets/lib/swagger-ui/index.html?/url=/assets/swagger.json").withHeader(Secured.AUTH_TOKEN_HEADER, "349f1c7f-4e38-44a4-85a6-77111d010bf7-OUT_DOOR");
    }
}
