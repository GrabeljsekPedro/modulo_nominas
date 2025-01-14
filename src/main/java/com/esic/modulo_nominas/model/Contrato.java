package com.esic.modulo_nominas.model;

import com.esic.modulo_nominas.DTO.ContratoDTO;
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
    @Column(name = "idEmpleado", nullable = false)
    private Empleado idEmpleado;
    @Column(name = "salarioBruto", nullable = false)
    private double salarioBruto;
    @Column(name = "nPagos", nullable = false)
    private int nPagos;
    @Column(name = "inicioContrato", nullable = false)
    private LocalDate inicioContrato;
    @Column(name = "dinContrato", nullable = false)
    private LocalDate finContrato;

    public Contrato(ContratoDTO contratoDTO){
       this.idContrato = contratoDTO.getidContrato();
       this.idEmpleado = contratoDTO.getidEmpleado();
       this.salarioBruto = contratoDTO.getsalarioBruto();
       this.nPagos = contratoDTO.getnPagos();
       this.inicioContrato = contratoDTO.getinicioContrato();
       this.finContrato = contratoDTO.getfinContrato();
    }





}
