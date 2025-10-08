package com.proyecto.fitapp.service;

import java.util.List;

import com.proyecto.fitapp.entity.Usuario;
import com.proyecto.fitapp.repository.UsuarioRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class UsuarioService {

    @Inject
    UsuarioRepository usuarioRepository;

    public List<Usuario> listar() {
        return usuarioRepository.listAll();
    }

    @Transactional
    public void crear(Usuario usuario) {
        usuarioRepository.persist(usuario);
    }

    @Transactional
    public void eliminar(Long id) {
        usuarioRepository.deleteById(id);
    }
}