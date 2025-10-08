package com.proyecto.fitapp.service;

import com.proyecto.fitapp.entity.Entrenamiento;
import com.proyecto.fitapp.entity.Usuario;
import com.proyecto.fitapp.repository.EntrenamientoRepository;
import com.proyecto.fitapp.repository.UsuarioRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class EntrenamientoService {

    @Inject
    EntrenamientoRepository entrenamientoRepository;

    @Inject
    UsuarioRepository usuarioRepository;

    @Inject
    EntityManager entityManager;

    public List<Entrenamiento> listar() {
        return entrenamientoRepository.listAll();
    }

    public List<Entrenamiento> listarPorUsuario(Long usuaId) {
        return entrenamientoRepository.list("usuario.usuaId", usuaId);
    }

    @Transactional
    public void crear(Entrenamiento entrenamiento, Long usuaId) {
        Usuario usuario = usuarioRepository.findById(usuaId);
        entrenamiento.usuario = usuario;

        // Usamos EntityManager para evitar que Hibernate exija ENT_ID
        entityManager.persist(entrenamiento);
    }

    @Transactional
    public void eliminar(Long id) {
        entrenamientoRepository.deleteById(id);
    }
}