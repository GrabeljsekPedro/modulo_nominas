package com.esic.modulo_nominas.model;

import com.esic.modulo_nominas.dto.CargoDto;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cargo")
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer idCargo;

    @Column(nullable = false, length = 100)
    private String cargo;

    public Cargo(CargoDto cargoDto) {
        this.idCargo = cargoDto.getIdCargo();
        this.cargo = cargoDto.getCargo();
    }
}