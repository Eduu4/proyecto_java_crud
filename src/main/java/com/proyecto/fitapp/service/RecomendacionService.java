<<<<<<< HEAD
package com.proyecto.fitapp.service;

import com.proyecto.fitapp.entity.Recomendacion;
import com.proyecto.fitapp.entity.Usuario;
import com.proyecto.fitapp.repository.RecomendacionRepository;
import com.proyecto.fitapp.repository.UsuarioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.List;
import jakarta.persistence.EntityManager;


@ApplicationScoped
public class RecomendacionService {

    @Inject
    RecomendacionRepository recomendacionRepository;

    @Inject
    UsuarioRepository usuarioRepository;

    @Inject
    EntityManager entityManager;

    public List<Recomendacion> listar() {
        return recomendacionRepository.listAll();
    }

    public List<Recomendacion> listarPorUsuario(Long usuaId) {
        return recomendacionRepository.list("usuario.usuaId", usuaId);
    }

    @Transactional
    public void crear(Recomendacion recomendacion, Long usuaId) {
        Usuario usuario = usuarioRepository.findById(usuaId);
        recomendacion.usuario = usuario;
        recomendacionRepository.persist(recomendacion);
    }

    @Transactional
    public void eliminar(Long id) {
        recomendacionRepository.deleteById(id);
    }
=======
package com.proyecto.fitapp.service;

import com.proyecto.fitapp.entity.Recomendacion;
import com.proyecto.fitapp.entity.Usuario;
import com.proyecto.fitapp.repository.RecomendacionRepository;
import com.proyecto.fitapp.repository.UsuarioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.List;
import jakarta.persistence.EntityManager;


@ApplicationScoped
public class RecomendacionService {

    @Inject
    RecomendacionRepository recomendacionRepository;

    @Inject
    UsuarioRepository usuarioRepository;

    @Inject
    EntityManager entityManager;

    public List<Recomendacion> listar() {
        return recomendacionRepository.listAll();
    }

    public List<Recomendacion> listarPorUsuario(Long usuaId) {
        return recomendacionRepository.list("usuario.usuaId", usuaId);
    }

    @Transactional
    public void crear(Recomendacion recomendacion, Long usuaId) {
        Usuario usuario = usuarioRepository.findById(usuaId);
        recomendacion.usuario = usuario;
        recomendacionRepository.persist(recomendacion);
    }

    @Transactional
    public void eliminar(Long id) {
        recomendacionRepository.deleteById(id);
    }
>>>>>>> af9e845 (Docker Compose con Oracle, scripts de inicialización y ajustes recientes)
}