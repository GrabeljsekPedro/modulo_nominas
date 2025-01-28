package com.esic.modulo_nominas.repository;

import com.esic.modulo_nominas.model.Horario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorarioRepository extends JpaRepository<Horario, Integer> {
}