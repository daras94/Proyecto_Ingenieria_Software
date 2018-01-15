package swagger;

import com.google.inject.Inject;
import java.util.Arrays;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import java.util.concurrent.CompletionStage;
import play.Logger;

public class ApiCall extends Action<SwaggerUtils.ApiAction> {
    
    /**
     * Declaracion del log.
     */
    protected Logger.ALogger log = Logger.of(this.getClass());
    protected Result result;
    
    @Inject
    private ApiCall() {}

    public CompletionStage<Result> call(Http.Context ctx) {
        try {
            //TODO: Do stuff you want to handle with each API call (metrics, logging, etc..)
            return delegate.call(ctx);
        } catch (Throwable t) {
            //TODO: log the error in your metric
            log.trace(Arrays.toString(t.getStackTrace()));
            //We rethrow this error so it will be caught in the ErrorHandler
            throw t;
        }
    }
}