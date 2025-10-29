<<<<<<< HEAD
package com.proyecto.fitapp.service;

import com.proyecto.fitapp.entity.Objetivo;
import com.proyecto.fitapp.entity.Usuario;
import com.proyecto.fitapp.repository.ObjetivoRepository;
import com.proyecto.fitapp.repository.UsuarioRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class ObjetivoService {

    @Inject
    ObjetivoRepository objetivoRepository;

    @Inject
    UsuarioRepository usuarioRepository;

    @Inject
    EntityManager entityManager;

    public List<Objetivo> listar() {
        return objetivoRepository.listAll();
    }

    public List<Objetivo> listarPorUsuario(Long usuaId) {
        return objetivoRepository.list("usuario.usuaId", usuaId);
    }

    @Transactional
    public void crear(Objetivo objetivo, Long usuaId) {
        Usuario usuario = usuarioRepository.findById(usuaId);
        objetivo.usuario = usuario;

        // Usamos EntityManager para evitar que Hibernate exija OBJ_ID
        entityManager.persist(objetivo);
    }

    @Transactional
    public void eliminar(Long id) {
        objetivoRepository.deleteById(id);
    }
=======
package com.proyecto.fitapp.service;

import com.proyecto.fitapp.entity.Objetivo;
import com.proyecto.fitapp.entity.Usuario;
import com.proyecto.fitapp.repository.ObjetivoRepository;
import com.proyecto.fitapp.repository.UsuarioRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class ObjetivoService {

    @Inject
    ObjetivoRepository objetivoRepository;

    @Inject
    UsuarioRepository usuarioRepository;

    @Inject
    EntityManager entityManager;

    public List<Objetivo> listar() {
        return objetivoRepository.listAll();
    }

    public List<Objetivo> listarPorUsuario(Long usuaId) {
        return objetivoRepository.list("usuario.usuaId", usuaId);
    }

    @Transactional
    public void crear(Objetivo objetivo, Long usuaId) {
        Usuario usuario = usuarioRepository.findById(usuaId);
        objetivo.usuario = usuario;

        // Usamos EntityManager para evitar que Hibernate exija OBJ_ID
        entityManager.persist(objetivo);
    }

    @Transactional
    public void eliminar(Long id) {
        objetivoRepository.deleteById(id);
    }
>>>>>>> af9e845 (Docker Compose con Oracle, scripts de inicialización y ajustes recientes)
}