package com.esic.modulo_nominas.service;

import com.esic.modulo_nominas.dto.EmpleadoDto;
import com.esic.modulo_nominas.model.Empleado;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FEmpleadoService {
    public Empleado crearEmpleado(EmpleadoDto empleadoDto) {
        return new Empleado(empleadoDto);
    }

    public EmpleadoDto crearEmpleadoDto(Empleado empleado) {
        return new EmpleadoDto(empleado);
    }

    public List<EmpleadoDto> crearEmpleadoDto(List<Empleado> listaEmpleados) {
        List<EmpleadoDto> listaEmpleadosDto = new ArrayList<>();
        listaEmpleados.stream().forEach(empleado -> listaEmpleadosDto.add(new EmpleadoDto(empleado)));

        return listaEmpleadosDto;
    }
}
