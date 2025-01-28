package com.esic.modulo_nominas.service;

import com.esic.modulo_nominas.dto.ContratoDto;
import com.esic.modulo_nominas.dto.NominaDto;
import com.esic.modulo_nominas.model.Contrato;
import com.esic.modulo_nominas.model.Nomina;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class FNominasService {
    public Nomina crearNomina(NominaDto nominaDto){
        return new Nomina(nominaDto);
    }

    public NominaDto crearNominaDto(Nomina nomina){
        return new NominaDto(nomina);
    }

    public List<NominaDto> crearNominaDto(List<Nomina> ListaNomina){
        List<NominaDto> nominaDtos = new ArrayList<>();
        ListaNomina.stream().forEach(
                nomina ->{
                    nominaDtos.add(crearNominaDto(nomina));
                }
        );
        return nominaDtos;
    }
}
