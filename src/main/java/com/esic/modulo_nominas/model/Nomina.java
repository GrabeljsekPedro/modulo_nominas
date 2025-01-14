package com.esic.modulo_nominas.model;

import com.esic.modulo_nominas.DTO.NominaDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name="contratos")

public class Nomina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idNomina", nullable = false)
    private Integer idNomina;
    @Column(name = "idContrato", nullable = false)
    @ManyToOne
    private Contrato idContrato;
    @Column(name = "cantidad", nullable = false)
    private double cantidad;
    @Column(name = "fechapago", nullable = false)
    private LocalDate fechapago;

   public Nomina(NominaDTO nominaDTO){
       this.idNomina = nominaDTO.getidNomina();
       this.idContrato = nominaDTO.getidContrato();
       this.cantidad = nominaDTO.getcantidad();
       this.fechapago = nominaDTO.getfechapago();
   }



}
