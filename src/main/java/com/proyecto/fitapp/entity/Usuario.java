package com.proyecto.fitapp.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "USUARIOS")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USUA_ID")
    public Long usuaId;

    @Column(name = "USUA_NOMBRE", nullable = false, length = 100)
    public String usuaNombre;

    @Column(name = "USUA_EMAIL", nullable = false, unique = true, length = 100)
    public String usuaEmail;

    @Column(name = "USUA_PASSWORD", nullable = false, length = 255)
    public String usuaPassword;

    @Column(name = "USUA_EDAD")
    public Integer usuaEdad;

    @Column(name = "USUA_PESO")
    public Double usuaPeso;

    @Column(name = "USUA_ALTURA")
    public Double usuaAltura;

    @Column(name = "USUA_NIVEL", length = 20)
    public String usuaNivel;

    @Column(name = "USUA_PREF_ALIMENTICIAS", length = 255)
    public String usuaPrefAlimenticias;

    @Column(name = "USUA_ALERGIAS", length = 255)
    public String usuaAlergias;

    @Column(name = "USUA_INS", insertable = false, updatable = false, length = 30)
    public String usuaIns;

    @Column(name = "FCH_INS", insertable = false, updatable = false)
    public LocalDate fchIns;

    @Column(name = "USUA_UPD", insertable = false, updatable = false, length = 30)
    public String usuaUpd;

    @Column(name = "FCH_UPD", insertable = false, updatable = false)
    public LocalDate fchUpd;
}