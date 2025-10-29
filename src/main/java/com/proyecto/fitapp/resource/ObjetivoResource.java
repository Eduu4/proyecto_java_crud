<<<<<<< HEAD
package com.proyecto.fitapp.resource;

import com.proyecto.fitapp.dto.ObjetivoDTO;
import com.proyecto.fitapp.entity.Objetivo;
import com.proyecto.fitapp.service.ObjetivoService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/objetivos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ObjetivoResource {

    @Inject
    ObjetivoService objetivoService;

    @GET
    public List<Objetivo> obtenerObjetivos() {
        return objetivoService.listar();
    }

    @GET
    @Path("/usuario/{id}")
    public List<Objetivo> obtenerPorUsuario(@PathParam("id") Long id) {
        return objetivoService.listarPorUsuario(id);
    }

    @POST
    @Transactional
    public Response crearObjetivo(ObjetivoDTO dto) {
        Objetivo objetivo = new Objetivo();
        objetivo.objTipo = dto.objTipo;
        objetivo.objDescripcion = dto.objDescripcion;
        objetivo.objPesoObjetivo = dto.objPesoObjetivo;
        objetivo.objFechaObjetivo = dto.objFechaObjetivo;

        objetivoService.crear(objetivo, dto.usuaId);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("/{id}")
    public void eliminarObjetivo(@PathParam("id") Long id) {
        objetivoService.eliminar(id);
    }
=======
package com.proyecto.fitapp.resource;

import com.proyecto.fitapp.dto.ObjetivoDTO;
import com.proyecto.fitapp.entity.Objetivo;
import com.proyecto.fitapp.service.ObjetivoService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/objetivos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ObjetivoResource {

    @Inject
    ObjetivoService objetivoService;

    @GET
    public List<Objetivo> obtenerObjetivos() {
        return objetivoService.listar();
    }

    @GET
    @Path("/usuario/{id}")
    public List<Objetivo> obtenerPorUsuario(@PathParam("id") Long id) {
        return objetivoService.listarPorUsuario(id);
    }

    @POST
    @Transactional
    public Response crearObjetivo(ObjetivoDTO dto) {
        Objetivo objetivo = new Objetivo();
        objetivo.objTipo = dto.objTipo;
        objetivo.objDescripcion = dto.objDescripcion;
        objetivo.objPesoObjetivo = dto.objPesoObjetivo;
        objetivo.objFechaObjetivo = dto.objFechaObjetivo;

        objetivoService.crear(objetivo, dto.usuaId);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("/{id}")
    public void eliminarObjetivo(@PathParam("id") Long id) {
        objetivoService.eliminar(id);
    }
>>>>>>> af9e845 (Docker Compose con Oracle, scripts de inicialización y ajustes recientes)
}