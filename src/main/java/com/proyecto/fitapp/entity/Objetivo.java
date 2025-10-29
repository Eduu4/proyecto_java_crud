<<<<<<< HEAD
package com.proyecto.fitapp.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "OBJETIVOS")
public class Objetivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OBJ_ID", insertable = false, updatable = false)
    public Long objId;

    @ManyToOne
    @JoinColumn(name = "USUA_ID", nullable = false)
    public Usuario usuario;

    @Column(name = "OBJ_TIPO", length = 50)
    public String objTipo;

    @Column(name = "OBJ_DESCRIPCION", length = 255)
    public String objDescripcion;

    @Column(name = "OBJ_PESO_OBJETIVO")
    public Double objPesoObjetivo;

    @Column(name = "OBJ_FECHA_OBJETIVO")
    public LocalDate objFechaObjetivo;

    @Column(name = "USUA_INS", insertable = false, updatable = false, length = 30)
    public String usuaIns;

    @Column(name = "FCH_INS", insertable = false, updatable = false)
    public LocalDate fchIns;

    @Column(name = "USUA_UPD", insertable = false, updatable = false, length = 30)
    public String usuaUpd;

    @Column(name = "FCH_UPD", insertable = false, updatable = false)
    public LocalDate fchUpd;
=======
package com.proyecto.fitapp.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "OBJETIVOS")
public class Objetivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OBJ_ID", insertable = false, updatable = false)
    public Long objId;

    @ManyToOne
    @JoinColumn(name = "USUA_ID", nullable = false)
    public Usuario usuario;

    @Column(name = "OBJ_TIPO", length = 50)
    public String objTipo;

    @Column(name = "OBJ_DESCRIPCION", length = 255)
    public String objDescripcion;

    @Column(name = "OBJ_PESO_OBJETIVO")
    public Double objPesoObjetivo;

    @Column(name = "OBJ_FECHA_OBJETIVO")
    public LocalDate objFechaObjetivo;

    @Column(name = "USUA_INS", insertable = false, updatable = false, length = 30)
    public String usuaIns;

    @Column(name = "FCH_INS", insertable = false, updatable = false)
    public LocalDate fchIns;

    @Column(name = "USUA_UPD", insertable = false, updatable = false, length = 30)
    public String usuaUpd;

    @Column(name = "FCH_UPD", insertable = false, updatable = false)
    public LocalDate fchUpd;
>>>>>>> af9e845 (Docker Compose con Oracle, scripts de inicialización y ajustes recientes)
}