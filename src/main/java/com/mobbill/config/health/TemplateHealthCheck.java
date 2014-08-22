package com.mobbill.config.health;

import com.codahale.metrics.health.HealthCheck;

/**
 * Created by dieppa on 26/07/14.
 */
public class TemplateHealthCheck extends HealthCheck {

    private final String value1;

    public TemplateHealthCheck(String value1) {
        this.value1 = value1;
    }

    @Override
    protected Result check() throws Exception {
        final String saying = String.format(value1, "TEST");
        if (!saying.contains("TEST")) {
            return Result.unhealthy("template doesn't include a name");
        }
        return Result.healthy();
    }

}
