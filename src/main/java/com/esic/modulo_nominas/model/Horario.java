package com.esic.modulo_nominas.model;

import com.esic.modulo_nominas.dto.HorarioDto;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "horario")
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false)
    private Integer horasMes;

    public Horario(HorarioDto horarioDto) {
        this.id = horarioDto.getId();
        this.horasMes = horarioDto.getHorasMes();
    }
}