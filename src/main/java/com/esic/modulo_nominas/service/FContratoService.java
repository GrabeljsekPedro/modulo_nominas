package com.esic.modulo_nominas.service;

import com.esic.modulo_nominas.dto.ContratoDto;
import com.esic.modulo_nominas.model.Contrato;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class FContratoService {

    public Contrato crearContrato(ContratoDto contratoDto){
        return new Contrato(contratoDto);
    }

    public ContratoDto crearContratoDto(Contrato contrato){
        return new ContratoDto(contrato);
    }

    public List<ContratoDto> crearContratoDto(List<Contrato> ListaContrato){
        List<ContratoDto> contratoDtos = new ArrayList<>();
        ListaContrato.stream().forEach(
                contrato ->{
                    contratoDtos.add(crearContratoDto(contrato));
                }
        );
        return contratoDtos;
    }
}
