package com.mobbill.config;

/**
 * Created by dieppa on 26/07/14.
 */

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * This is a configuration file that will contain all the application properties
 * It's loaded by the DropWizard framework
 */
public class AppConfiguration extends Configuration {

    @NotEmpty
    private String value1;

    @JsonProperty
    public String getValue1() {
        return value1;
    }

    @JsonProperty
    public void setValue1(String value1) {
        this.value1 = value1;
    }

}