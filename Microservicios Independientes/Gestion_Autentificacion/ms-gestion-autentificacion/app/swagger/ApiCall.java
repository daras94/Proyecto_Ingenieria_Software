package swagger;

import com.google.inject.Inject;
import controllers.Secured;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import java.util.concurrent.CompletionStage;

public class ApiCall extends Action<SwaggerUtils.ApiAction> {

    @Inject
    private ApiCall() {}

    @Override
    public CompletionStage<Result> call(Http.Context ctx) {
        try {
            //TODO: Do stuff you want to handle with each API call (metrics, logging, etc..)
            Secured.created().session();
            return delegate.call(ctx);
        } catch (Throwable t) {
            //TODO: log the error in your metric

            //We rethrow this error so it will be caught in the ErrorHandler
            throw t;
        }
    }
}