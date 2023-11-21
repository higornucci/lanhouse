package br.com.lanhouse.dominio;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Periodo {
    private LocalDateTime horarioDeInicio;
    private LocalDateTime horarioDeFim;

    public Periodo(LocalDateTime horarioDeInicio, LocalDateTime horarioDeFim) {
        this.horarioDeInicio = horarioDeInicio;
        this.horarioDeFim = horarioDeFim;
    }
}
