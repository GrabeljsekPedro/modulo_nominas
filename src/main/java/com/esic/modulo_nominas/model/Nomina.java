package com.esic.modulo_nominas.model;

import com.esic.modulo_nominas.dto.NominaDto;
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
    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;
    @Column(name = "fechapago", nullable = false)
    private LocalDate fechapago;
    @JoinColumn(name = "idContrato", nullable = false)
    @ManyToOne
    private Contrato idContrato;

   public Nomina(NominaDto nominaDto){
        this.idNomina = nominaDto.getIdNomina();
        this.cantidad = nominaDto.getCantidad();
        this.fechapago = nominaDto.getFechaPago();
        this.idContrato = new Contrato(nominaDto.getContratoDto());
   }
}
