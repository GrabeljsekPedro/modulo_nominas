package com.esic.modulo_nominas.service;

import com.esic.modulo_nominas.dto.HorarioDto;
import com.esic.modulo_nominas.model.Horario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FHorarioService {
    public Horario crearHorario(HorarioDto horarioDto) {
        return new Horario(horarioDto);
    }

    public HorarioDto crearHorarioDto(Horario horario) {
        return new HorarioDto(horario);
    }

    public List<HorarioDto> crearHorarioDto(List<Horario> listaHorarios) {
        List<HorarioDto> listaHorariosDto = new ArrayList<>();
        listaHorarios.stream().forEach(horario -> listaHorariosDto.add(new HorarioDto(horario)));

        return listaHorariosDto;
    }
}
