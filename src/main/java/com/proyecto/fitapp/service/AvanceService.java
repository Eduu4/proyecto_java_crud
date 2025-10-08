package com.proyecto.fitapp.service;

import java.util.List;

import com.proyecto.fitapp.entity.Avance;
import com.proyecto.fitapp.entity.Usuario;
import com.proyecto.fitapp.repository.AvanceRepository;
import com.proyecto.fitapp.repository.UsuarioRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class AvanceService {

    @Inject
    AvanceRepository avanceRepository;

    @Inject
    UsuarioRepository usuarioRepository;

    @Inject
    EntityManager entityManager;

    public List<Avance> listar() {
        return avanceRepository.listAll();
    }

    @Transactional
    public void crear(Avance avance, Long usuaId) {
        Usuario usuario = usuarioRepository.findById(usuaId);
        avance.usuario = usuario;

        // Usamos EntityManager directamente para evitar validación de ID
        entityManager.persist(avance);
    }

    @Transactional
    public void eliminar(Long id) {
        avanceRepository.deleteById(id);
    }
}