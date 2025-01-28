package com.esic.modulo_nominas.dto;

import com.esic.modulo_nominas.model.Empleado;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmpleadoDto {
    private Integer idEmpleado;

    private String nombre;

    private String apellidos;

    private String direccion;

    private String correo;

    private String centroTrabajo;

    private String numSegSoc;

    private String documento;

    private HorarioDto horario;

    private Integer idHorario;

    private CargoDto cargo;

    private Integer idCargo;

    public EmpleadoDto(Empleado empleado) {
        this.idEmpleado = empleado.getIdEmpleado();
        this.nombre = empleado.getNombre();
        this.apellidos = empleado.getApellidos();
        this.direccion = empleado.getDireccion();
        this.correo = empleado.getCorreo();
        this.centroTrabajo = empleado.getCentroTrabajo();
        this.numSegSoc = empleado.getNumSegSoc();
        this.documento = empleado.getDocumento();
        this.horario = new HorarioDto(empleado.getHorario());
        this.cargo = new CargoDto(empleado.getCargo());
    }
}