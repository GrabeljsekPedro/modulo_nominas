package com.esic.modulo_nominas.service;

import com.esic.modulo_nominas.dto.ContratoDto;
import com.esic.modulo_nominas.dto.NominaDto;
import com.esic.modulo_nominas.repository.ContratoRepository;
import com.esic.modulo_nominas.repository.NominaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NominasService {
    @Autowired
    private FNominasService fNominasService;
    @Autowired
    private NominaRepository nominaRepository;

    public NominaDto save(NominaDto nominaDto){
        return fNominasService.crearNominaDto(nominaRepository.save(fNominasService.crearNomina(nominaDto)));
    }

    public List<NominaDto> findAll(){
        return fNominasService.crearNominaDto(nominaRepository.findAll());
    }
    public NominaDto findById(Integer id){
        return fNominasService.crearNominaDto(nominaRepository.findById(id).get());
    }
    public void deleteById(Integer id){
        nominaRepository.deleteById(id);
    }
}
