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
@Table(name = "cargo")
public class Cargo {
    @Id
    @Column(name = "idCargo", nullable = false)
    private Integer id;

    @Column(name = "cargo", nullable = false, length = 100)
    private String cargo;

}