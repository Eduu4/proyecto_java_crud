<<<<<<< HEAD
package com.proyecto.fitapp.resource;

import com.proyecto.fitapp.dto.RecomendacionDTO;
import com.proyecto.fitapp.entity.Recomendacion;
import com.proyecto.fitapp.service.RecomendacionService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/recomendaciones")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RecomendacionResource {

    @Inject
    RecomendacionService recomendacionService;

    @GET
    public List<Recomendacion> obtenerRecomendaciones() {
        return recomendacionService.listar();
    }

    @GET
    @Path("/usuario/{id}")
    public List<Recomendacion> obtenerPorUsuario(@PathParam("id") Long id) {
        return recomendacionService.listarPorUsuario(id);
    }

    @POST
    @Transactional
    public Response crearRecomendacion(RecomendacionDTO dto) {
        Recomendacion recomendacion = new Recomendacion();
        recomendacion.recTipo = dto.recTipo;
        recomendacion.recFecha = dto.recFecha;

        recomendacionService.crear(recomendacion, dto.usuaId);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("/{id}")
    public void eliminarRecomendacion(@PathParam("id") Long id) {
        recomendacionService.eliminar(id);
    }
=======
package com.proyecto.fitapp.resource;

import com.proyecto.fitapp.dto.RecomendacionDTO;
import com.proyecto.fitapp.entity.Recomendacion;
import com.proyecto.fitapp.service.RecomendacionService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/recomendaciones")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RecomendacionResource {

    @Inject
    RecomendacionService recomendacionService;

    @GET
    public List<Recomendacion> obtenerRecomendaciones() {
        return recomendacionService.listar();
    }

    @GET
    @Path("/usuario/{id}")
    public List<Recomendacion> obtenerPorUsuario(@PathParam("id") Long id) {
        return recomendacionService.listarPorUsuario(id);
    }

    @POST
    @Transactional
    public Response crearRecomendacion(RecomendacionDTO dto) {
        Recomendacion recomendacion = new Recomendacion();
        recomendacion.recTipo = dto.recTipo;
        recomendacion.recFecha = dto.recFecha;

        recomendacionService.crear(recomendacion, dto.usuaId);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("/{id}")
    public void eliminarRecomendacion(@PathParam("id") Long id) {
        recomendacionService.eliminar(id);
    }
>>>>>>> af9e845 (Docker Compose con Oracle, scripts de inicialización y ajustes recientes)
}