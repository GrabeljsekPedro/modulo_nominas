package com.esic.modulo_nominas.service;

import com.esic.modulo_nominas.dto.EmpleadoDto;
import com.esic.modulo_nominas.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
    @Autowired
    private FEmpleadoService fEmpleadoService;

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public EmpleadoDto save(EmpleadoDto empleadoDto) {
        return fEmpleadoService.crearEmpleadoDto(empleadoRepository.save(fEmpleadoService.crearEmpleado(empleadoDto)));
    }

    public List<EmpleadoDto> findAll() {
        return fEmpleadoService.crearEmpleadoDto(empleadoRepository.findAll());
    }

    public EmpleadoDto findById(Integer id) {
        return fEmpleadoService.crearEmpleadoDto(empleadoRepository.findById(id).orElse(null));
    }

    public void deleteById(Integer id) {
        empleadoRepository.deleteById(id);
    }
}
