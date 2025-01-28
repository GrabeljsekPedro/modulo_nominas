package com.esic.modulo_nominas.dto;

import com.esic.modulo_nominas.model.Contrato;
import com.esic.modulo_nominas.model.Nomina;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class NominaDto {
    private Integer idNomina;
    private Integer cantidad;
    private LocalDate fechaPago;
    private Contrato idContrato;
    private ContratoDto contratoDto;

    public NominaDto(Nomina nomina){
        this.idNomina = nomina.getIdNomina();
        this.cantidad = nomina.getCantidad();
        this.fechaPago = nomina.getFechapago();
        this.contratoDto = new ContratoDto(nomina.getIdContrato());
    }
}
