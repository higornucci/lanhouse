package br.com.lanhouse.dominio;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PeriodoTest {

    @Test
    void deve_criar_um_periodo_de_inicio_e_fim() {
        LocalDate data = LocalDate.of(2023,11,30);
        LocalTime horaInicio = LocalTime.of(10,20);
        LocalTime horaFim = LocalTime.of(11,0);
        LocalDateTime horarioDeInicio = LocalDateTime.of(data, horaInicio);
        LocalDateTime horarioDeFim = LocalDateTime.of(data, horaFim);

        Periodo periodo = new Periodo(horarioDeInicio, horarioDeFim);

        assertThat(periodo.getHorarioDeInicio()).isEqualTo(horarioDeInicio);
        assertThat(periodo.getHorarioDeFim()).isEqualTo(horarioDeFim);
    }
}