package com.esic.modulo_nominas.DTO;

import com.esic.modulo_nominas.model.Nomina;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class NominaDTO {
    private Integer idNomina;
    private ContratoDTO contratoDTO;
    private int cantidad;
    private LocalDate fechaPago;

    public NominaDTO(Nomina nomina){
        this.idNomina = Nomina.getidNomina();
    }
}
