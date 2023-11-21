package br.com.lanhouse.dominio;

import lombok.Getter;

@Getter
public class Partida {
    private Jogo jogo;
    private Periodo periodo;

    public Partida(Jogo jogo, Periodo periodo) {
        this.jogo = jogo;
        this.periodo = periodo;
    }
}
