package com.esic.modulo_nominas.service;

import com.esic.modulo_nominas.dto.CargoDto;
import com.esic.modulo_nominas.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService {
    @Autowired
    private FCargoService fCargoService;

    @Autowired
    private CargoRepository cargoRepository;

    public CargoDto save(CargoDto cargoDto) {
        return fCargoService.crearCargoDto(cargoRepository.save(fCargoService.crearCargo(cargoDto)));
    }

    public List<CargoDto> findAll() {
        return fCargoService.crearCargoDto(cargoRepository.findAll());
    }

    public CargoDto findById(Integer id) {
        return fCargoService.crearCargoDto(cargoRepository.findById(id).orElse(null));
    }

    public void deleteById(Integer id) {
        cargoRepository.deleteById(id);
    }
}
