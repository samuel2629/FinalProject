package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;


@Api(
        name = "jokeApi", version = "v1", namespace = @ApiNamespace(
        ownerDomain = "backend.builditbigger.gradle.udacity.com",
        ownerName = "backend.builditbigger.gradle.udacity.com",
        packagePath = ""
))
public class JokeEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "putJoke")
    public JokeBean tellJoke(JokeBean bean) {
        JokeBean response = new JokeBean();
        response.setData(response);

        return response;
    }

}
