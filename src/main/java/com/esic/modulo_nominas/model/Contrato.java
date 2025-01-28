package com.esic.modulo_nominas.model;

import com.esic.modulo_nominas.dto.ContratoDto;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "nominas")
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idContrato", nullable = false)
    private Integer idContrato;
    @ManyToOne
    @JoinColumn(name = "idEmpleado", nullable = false)
    private Empleado idEmpleado;
    @Column(name = "salarioBruto", nullable = false)
    private double salarioBruto;
    @Column(name = "nPagos", nullable = false)
    private Integer nPagos;
    @Column(name = "inicioContrato", nullable = false)
    private LocalDate inicioContrato;
    @Column(name = "finContrato", nullable = false)
    private LocalDate finContrato;

    public Contrato(ContratoDto contratoDTO){
        this.idContrato = contratoDTO.getIdContrato();
        this.salarioBruto = contratoDTO.getSalarioBruto();
        this.nPagos = contratoDTO.getNPagos();
        this.inicioContrato = contratoDTO.getInicioContrato();
        this.finContrato = contratoDTO.getFinContrato();
        //this.idEmpleado = Empleado(contratoDTO.EmpleadoDto);

    }




}
