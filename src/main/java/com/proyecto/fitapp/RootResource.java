package com.proyecto.fitapp;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class RootResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String root() {
        return "🚀 FitApp API corriendo correctamente. Visita /q/swagger-ui para ver endpoints";
    }
}