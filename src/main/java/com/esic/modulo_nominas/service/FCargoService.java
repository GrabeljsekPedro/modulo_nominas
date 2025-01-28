package com.esic.modulo_nominas.service;

import com.esic.modulo_nominas.dto.CargoDto;
import com.esic.modulo_nominas.model.Cargo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FCargoService {
    public Cargo crearCargo(CargoDto cargoDto) {
        return new Cargo(cargoDto);
    }

    public CargoDto crearCargoDto(Cargo cargo) {
        return new CargoDto(cargo);
    }

    public List<CargoDto> crearCargoDto(List<Cargo> listaCargos) {
        List<CargoDto> listaCargosDto = new ArrayList<>();
        listaCargos.stream().forEach(cargo -> listaCargosDto.add(new CargoDto(cargo)));

        return listaCargosDto;
    }
}
