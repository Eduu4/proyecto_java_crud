package com.proyecto.fitapp.resource;

import com.proyecto.fitapp.dto.AvanceDTO;
import com.proyecto.fitapp.entity.Avance;
import com.proyecto.fitapp.service.AvanceService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/avances")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AvanceResource {

    @Inject
    AvanceService avanceService;

    @GET
    public List<Avance> obtenerAvances() {
        return avanceService.listar();
    }

    @POST
    @Transactional
    public Response crearAvance(AvanceDTO dto) {
        Avance avance = new Avance();
        avance.avaPeso = dto.avaPeso;
        avance.avaFecha = dto.avaFecha;
        avance.avaObservaciones = dto.avaObservaciones;

        avanceService.crear(avance, dto.usuaId);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("/{id}")
    public void eliminarAvance(@PathParam("id") Long id) {
        avanceService.eliminar(id);
    }
}