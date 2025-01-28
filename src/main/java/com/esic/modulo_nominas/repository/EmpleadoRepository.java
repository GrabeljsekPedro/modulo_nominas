package com.esic.modulo_nominas.repository;

import com.esic.modulo_nominas.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
}
