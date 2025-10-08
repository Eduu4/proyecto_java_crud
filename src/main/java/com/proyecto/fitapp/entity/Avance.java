package com.proyecto.fitapp.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import java.time.LocalDate;

@Entity
@Table(name = "AVANCES")
public class Avance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AVA_ID", insertable = false, updatable = false)
    public Long avaId;


    @ManyToOne
    @JoinColumn(name = "USUA_ID", nullable = false)
    public Usuario usuario;

    @Column(name = "AVA_PESO")
    public Double avaPeso;

    @Column(name = "AVA_FECHA")
    public LocalDate avaFecha;

    @Column(name = "AVA_OBSERVACIONES", length = 255)
    public String avaObservaciones;

    @Column(name = "USUA_INS", insertable = false, updatable = false, length = 30)
    public String usuaIns;

    @Column(name = "FCH_INS", insertable = false, updatable = false)
    public LocalDate fchIns;

    @Column(name = "USUA_UPD", insertable = false, updatable = false, length = 30)
    public String usuaUpd;

    @Column(name = "FCH_UPD", insertable = false, updatable = false)
    public LocalDate fchUpd;
}