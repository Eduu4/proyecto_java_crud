package com.proyecto.fitapp.resource;

import java.util.List;

import com.proyecto.fitapp.dto.UsuarioDTO;
import com.proyecto.fitapp.entity.Usuario;
import com.proyecto.fitapp.service.UsuarioService;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/usuarios")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioResource {

    @Inject
    UsuarioService usuarioService;

    @GET
    public List<Usuario> obtenerUsuarios() {
        return usuarioService.listar();
    }

    @POST
    @Transactional
    public Response crearUsuario(UsuarioDTO dto) {
        Usuario usuario = new Usuario();
        usuario.usuaNombre = dto.usuaNombre;
        usuario.usuaEmail = dto.usuaEmail;
        usuario.usuaPassword = dto.usuaPassword;
        usuario.usuaEdad = dto.usuaEdad;
        usuario.usuaPeso = dto.usuaPeso;
        usuario.usuaAltura = dto.usuaAltura;
        usuario.usuaNivel = dto.usuaNivel;
        usuario.usuaPrefAlimenticias = dto.usuaPrefAlimenticias;
        usuario.usuaAlergias = dto.usuaAlergias;

        usuarioService.crear(usuario);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("/{id}")
    public void eliminarUsuario(@PathParam("id") Long id) {
        usuarioService.eliminar(id);
    }
}