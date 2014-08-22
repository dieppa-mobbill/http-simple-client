package com.mobbill;


import com.mobbill.config.AppConfiguration;
import com.mobbill.config.health.TemplateHealthCheck;
import com.mobbill.webservice.ClientRest;

import com.mobbill.webservice.exception.handlers.ExceptionHandlerMapper;
import com.mobbill.webservice.exception.handlers.RuntimeExceptionHandlerMapper;
import com.mobbill.webservice.exception.handlers.ThroableHandlerMapper;
import com.mobbill.webservice.exception.handlers.WSExceptionHandlerMapper;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 *
 */
public class App extends Application<AppConfiguration> {

    private Environment         env;
//    private ApplicationContext  appContext;

    public static void main(String[] args) throws Exception {

        new App().run(args);
    }


    @Override
    public String getName() {
        return "Nectirini Project";
    }

    @Override
    public void initialize(Bootstrap<AppConfiguration> bootstrap) {
    }

    @Override
    public void run(AppConfiguration configuration,
                    Environment env) {

        this.env        = env;

        this.registerRestServices();
        this.registerExceptionHandlers();

        final TemplateHealthCheck healthCheck =
                new TemplateHealthCheck(configuration.getValue1());
        env.healthChecks().register("template", healthCheck);

    }

    private void registerRestServices(){
        env.jersey().register(new ClientRest());
    }

    private void registerExceptionHandlers(){
        env.jersey().register(new WSExceptionHandlerMapper());
        env.jersey().register(new ExceptionHandlerMapper());
        env.jersey().register(new ThroableHandlerMapper());
        env.jersey().register(new RuntimeExceptionHandlerMapper());
    }
}