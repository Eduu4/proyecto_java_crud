<<<<<<< HEAD
package com.proyecto.fitapp.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ENTRENAMIENTOS")
public class Entrenamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ENT_ID", insertable = false, updatable = false)
    public Long entId;

    @ManyToOne
    @JoinColumn(name = "USUA_ID", nullable = false)
    public Usuario usuario;

    @Column(name = "ENT_TIPO", length = 50)
    public String entTipo;

    @Column(name = "ENT_DURACION")
    public Integer entDuracion;

    @Column(name = "ENT_FECHA")
    public LocalDate entFecha;

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

@Entity
@Table(name = "ENTRENAMIENTOS")
public class Entrenamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ENT_ID", insertable = false, updatable = false)
    public Long entId;

    @ManyToOne
    @JoinColumn(name = "USUA_ID", nullable = false)
    public Usuario usuario;

    @Column(name = "ENT_TIPO", length = 50)
    public String entTipo;

    @Column(name = "ENT_DURACION")
    public Integer entDuracion;

    @Column(name = "ENT_FECHA")
    public LocalDate entFecha;

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