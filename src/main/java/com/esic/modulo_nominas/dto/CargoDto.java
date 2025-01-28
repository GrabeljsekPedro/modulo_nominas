package com.esic.modulo_nominas.dto;

import com.esic.modulo_nominas.model.Cargo;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CargoDto {
    private Integer idCargo;
    private String cargo;

    public CargoDto(Cargo cargo) {
        this.idCargo = cargo.getIdCargo();
        this.cargo = cargo.getCargo();
    }
}
