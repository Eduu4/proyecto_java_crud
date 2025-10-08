package com.proyecto.fitapp.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "RECOMENDACIONES")
public class Recomendacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REC_ID", insertable = false, updatable = false)
    public Long recId;

    @ManyToOne
    @JoinColumn(name = "USUA_ID", nullable = false)
    public Usuario usuario;

    @Column(name = "REC_TIPO", length = 50)
    public String recTipo;

    @Column(name = "REC_FECHA")
    public LocalDate recFecha;

    @Column(name = "USUA_INS", insertable = false, updatable = false, length = 30)
    public String usuaIns;

    @Column(name = "FCH_INS", insertable = false, updatable = false)
    public LocalDate fchIns;

    @Column(name = "USUA_UPD", insertable = false, updatable = false, length = 30)
    public String usuaUpd;

    @Column(name = "FCH_UPD", insertable = false, updatable = false)
    public LocalDate fchUpd;
}