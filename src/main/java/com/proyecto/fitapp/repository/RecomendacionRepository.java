package com.proyecto.fitapp.repository;

import com.proyecto.fitapp.entity.Recomendacion;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RecomendacionRepository implements PanacheRepository<Recomendacion> {
}