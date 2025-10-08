package com.proyecto.fitapp.repository;

import com.proyecto.fitapp.entity.Objetivo;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ObjetivoRepository implements PanacheRepository<Objetivo> {
}