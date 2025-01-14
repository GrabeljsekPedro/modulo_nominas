package com.esic.modulo_nominas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "horario")
public class Horario {
    @Id
    @Column(name = "idHorario", nullable = false)
    private Integer id;

    @Column(name = "horasMes", nullable = false)
    private Integer horasMes;

}