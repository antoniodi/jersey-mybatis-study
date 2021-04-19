package com.ing.jersey.application;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("api")
public class JerseyConfiguration extends ResourceConfig {

    public JerseyConfiguration() {
//        register(UserQuery.class);
        packages( "com.ing.jersey.application.controllers");
    }
}