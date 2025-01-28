package com.esic.modulo_nominas.controller;

import com.esic.modulo_nominas.dto.HorarioDto;
import com.esic.modulo_nominas.service.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/horarios")
public class HorarioController {
    @Autowired
    private HorarioService horarioService;

    @PostMapping
    public ResponseEntity<HorarioDto> save(@RequestBody HorarioDto horarioDto) {
        return new ResponseEntity<>(horarioService.save(horarioDto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<HorarioDto>> findAll() {
        return new ResponseEntity<>(horarioService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HorarioDto> findById(@PathVariable Integer id) {
        try {
            return new ResponseEntity<>(horarioService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
        try {
            horarioService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}