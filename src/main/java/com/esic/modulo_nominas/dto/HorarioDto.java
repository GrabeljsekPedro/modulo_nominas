package com.esic.modulo_nominas.dto;

import com.esic.modulo_nominas.model.Horario;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HorarioDto  {
    private Integer id;

    private Integer horasMes;

    public HorarioDto(Horario horario) {
        this.id = horario.getId();
        this.horasMes = horario.getHorasMes();
    }
}