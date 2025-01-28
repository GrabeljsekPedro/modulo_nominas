package com.esic.modulo_nominas.controller;

import com.esic.modulo_nominas.dto.NominaDto;
import com.esic.modulo_nominas.service.NominasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nominas")
public class NominasController {
    @Autowired
    private NominasService nominasService;

    @PostMapping
    public ResponseEntity<NominaDto> save(@RequestBody NominaDto nominaDto){
        return new ResponseEntity<>(nominasService.save(nominaDto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<NominaDto>> findAll(){
        return new ResponseEntity<>(nominasService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable Integer id){
        try{
            nominasService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
