package com.esic.modulo_nominas.service;

import com.esic.modulo_nominas.dto.ContratoDto;
import com.esic.modulo_nominas.repository.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class ContratoService {
    @Autowired
    private FContratoService fContratoService;
    @Autowired
    private ContratoRepository contratoRepository;

    public ContratoDto save(ContratoDto contratoDto){
        return fContratoService.crearContratoDto(contratoRepository.save(fContratoService.crearContrato(contratoDto)));
    }

    public List<ContratoDto> findAll(){
        return fContratoService.crearContratoDto(contratoRepository.findAll());
    }
    public ContratoDto findById(Integer id){
        return fContratoService.crearContratoDto(contratoRepository.findById(id).get());
    }
    public void deleteById(Integer id){
        contratoRepository.deleteById(id);
    }
}
