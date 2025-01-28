package com.esic.modulo_nominas.controller;

import com.esic.modulo_nominas.dto.CargoDto;
import com.esic.modulo_nominas.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cargos")
public class CargoController {
    @Autowired
    private CargoService cargoService;

    @PostMapping
    public ResponseEntity<CargoDto> save(@RequestBody CargoDto cargoDto) {
        return new ResponseEntity<>(cargoService.save(cargoDto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<CargoDto>> findAll() {
        return new ResponseEntity<>(cargoService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CargoDto> findById(@PathVariable Integer id) {
        try {
            return new ResponseEntity<>(cargoService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
        try {
            cargoService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
