package com.esic.modulo_nominas.service;

import com.esic.modulo_nominas.dto.HorarioDto;
import com.esic.modulo_nominas.repository.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorarioService {
    @Autowired
    private FHorarioService fHorarioService;

    @Autowired
    private HorarioRepository horarioRepository;

    public HorarioDto save(HorarioDto horarioDto) {
        return fHorarioService.crearHorarioDto(horarioRepository.save(fHorarioService.crearHorario(horarioDto)));
    }

    public List<HorarioDto> findAll() {
        return fHorarioService.crearHorarioDto(horarioRepository.findAll());
    }

    public HorarioDto findById(Integer id) {
        return fHorarioService.crearHorarioDto(horarioRepository.findById(id).orElse(null));
    }

    public void deleteById(Integer id) {
        horarioRepository.deleteById(id);
    }
}