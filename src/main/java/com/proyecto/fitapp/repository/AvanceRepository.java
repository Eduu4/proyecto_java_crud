package com.proyecto.fitapp.repository;

import com.proyecto.fitapp.entity.Avance;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AvanceRepository implements PanacheRepository<Avance> {
}