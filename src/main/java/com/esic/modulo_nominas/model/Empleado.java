package com.esic.modulo_nominas.model;

import com.esic.modulo_nominas.dto.EmpleadoDto;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer idEmpleado;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String apellidos;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false, length = 100)
    private String correo;

    @Column(nullable = false, length = 10)
    private String centroTrabajo;

    @Column(nullable = false, length = 20)
    private String numSegSoc;

    @Column(nullable = false, length = 20)
    private String documento;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Horario horario;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Cargo cargo;

    public Empleado(EmpleadoDto empleadoDto) {
        this.idEmpleado = empleadoDto.getIdEmpleado();
        this.nombre = empleadoDto.getNombre();
        this.apellidos = empleadoDto.getApellidos();
        this.direccion = empleadoDto.getDireccion();
        this.correo = empleadoDto.getCorreo();
        this.centroTrabajo = empleadoDto.getCentroTrabajo();
        this.numSegSoc = empleadoDto.getNumSegSoc();
        this.documento = empleadoDto.getDocumento();
        this.horario = new Horario(empleadoDto.getHorario());
        this.cargo = new Cargo(empleadoDto.getCargo());
    }
}