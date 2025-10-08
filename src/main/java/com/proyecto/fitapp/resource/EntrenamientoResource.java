package com.proyecto.fitapp.resource;

import com.proyecto.fitapp.dto.EntrenamientoDTO;
import com.proyecto.fitapp.entity.Entrenamiento;
import com.proyecto.fitapp.service.EntrenamientoService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/entrenamientos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EntrenamientoResource {

    @Inject
    EntrenamientoService entrenamientoService;

    @GET
    public List<Entrenamiento> obtenerEntrenamientos() {
        return entrenamientoService.listar();
    }

    @GET
    @Path("/usuario/{id}")
    public List<Entrenamiento> obtenerPorUsuario(@PathParam("id") Long id) {
        return entrenamientoService.listarPorUsuario(id);
    }

    @POST
    @Transactional
    public Response crearEntrenamiento(EntrenamientoDTO dto) {
        Entrenamiento entrenamiento = new Entrenamiento();
        entrenamiento.entTipo = dto.entTipo;
        entrenamiento.entDuracion = dto.entDuracion;
        entrenamiento.entFecha = dto.entFecha;

        entrenamientoService.crear(entrenamiento, dto.usuaId);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("/{id}")
    public void eliminarEntrenamiento(@PathParam("id") Long id) {
        entrenamientoService.eliminar(id);
    }
}