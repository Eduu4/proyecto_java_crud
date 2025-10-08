package com.proyecto.fitapp.repository;

import com.proyecto.fitapp.entity.Usuario;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioRepository implements PanacheRepository<Usuario> {
    // Métodos personalizados si los necesitás
}
