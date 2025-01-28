package com.esic.modulo_nominas.controller;

import com.esic.modulo_nominas.dto.EmpleadoDto;
import com.esic.modulo_nominas.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping
    public ResponseEntity<EmpleadoDto> save(@RequestBody EmpleadoDto empleadoDto) {
        return new ResponseEntity<>(empleadoService.save(empleadoDto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EmpleadoDto>> findAll() {
        return new ResponseEntity<>(empleadoService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpleadoDto> findById(@PathVariable Integer id) {
        try {
            return new ResponseEntity<>(empleadoService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
        try {
            empleadoService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}