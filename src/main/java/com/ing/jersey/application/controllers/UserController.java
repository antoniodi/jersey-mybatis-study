package com.ing.jersey.application.controllers;

import com.ing.jersey.domain.model.entities.User;
import com.ing.jersey.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/users")
public class UserController {

    private static final List<User> listaUsuarios = new ArrayList<User>() {
        {
            add(new User( "1", "Rosa", "Marfil"));
            add(new User( "2", "Pepito", "Grillo"));
            add(new User( "3", "Manuela", "Lago"));
        }
    };

    @Autowired
    private UsersMapper usersMapper;

    /**
     * URL: http://localhost:8080/API_REST_WS-RS/api/users
     * @return Response list Users
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers() {
        List<User> users = this.usersMapper.findAll();
        return Response.ok( users ).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createUser( User user ) {
        this.usersMapper.createUser( user );
        List<User> users = this.usersMapper.findAll();
        return Response.ok( users ).build();
    }
}
