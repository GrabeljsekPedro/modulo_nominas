package com.esic.modulo_nominas.repository;

import com.esic.modulo_nominas.model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo, Integer> {
}