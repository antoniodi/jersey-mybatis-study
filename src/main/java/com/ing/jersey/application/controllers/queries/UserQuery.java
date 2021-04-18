package com.ing.jersey.application.controllers.queries;

import com.ing.jersey.domain.model.entities.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/users")
public class UserQuery {

    private static final List<User> listaUsuarios = new ArrayList<User>() {
        {
            add(new User("Rosa", "Marfil"));
            add(new User("Pepito", "Grillo"));
            add(new User("Manuela", "Lago"));
        }
    };

    /**
     * URL: http://localhost:8080/API_REST_WS-RS/api/users
     * @return Response list Users
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers() {
        return Response.ok( listaUsuarios ).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getUsers( User user ) {
        listaUsuarios.add( user );
        return Response.ok( listaUsuarios ).build();
    }

}
