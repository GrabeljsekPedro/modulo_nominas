package com.esic.modulo_nominas.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @Column(name = "idEmpleado", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idHorario", nullable = false)
    private Horario idHorario;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idCargo", nullable = false)
    private Cargo idCargo;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "apellidos", nullable = false, length = 100)
    private String apellidos;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "correo", nullable = false, length = 100)
    private String correo;

    @Column(name = "centroTrabajo", nullable = false, length = 10)
    private String centroTrabajo;

    @Column(name = "numSegSoc", nullable = false, length = 20)
    private String numSegSoc;

    @Column(name = "documento", nullable = false, length = 20)
    private String documento;

}