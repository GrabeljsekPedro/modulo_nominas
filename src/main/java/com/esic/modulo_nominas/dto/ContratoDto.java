package com.esic.modulo_nominas.dto;

import com.esic.modulo_nominas.model.Contrato;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class ContratoDto {
    private Integer idContrato;
    private double salarioBruto;
    private Integer nPagos;
    private LocalDate inicioContrato;
    private LocalDate finContrato;
    private Integer idEmpleado;
    //private EmpleadoDto empleadodto;

    public ContratoDto(Contrato contrato){
        this.idContrato = contrato.getIdContrato();
        this.salarioBruto = contrato.getSalarioBruto();
        this.nPagos = contrato.getNPagos();
        this.inicioContrato = contrato.getInicioContrato();
        this.finContrato = contrato.getFinContrato();
        //this.empleadoDto = new ContratoDto(contrato.getIdEmpleado);
    }
}
