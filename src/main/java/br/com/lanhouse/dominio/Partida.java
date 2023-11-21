package br.com.lanhouse.dominio;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
public class Partida {
    private Jogo jogo;
    private Periodo periodo;
    private Set<Jogador> jogadores;

    public Partida(Jogo jogo, Periodo periodo) {
        this.jogo = jogo;
        this.periodo = periodo;
        this.jogadores = new HashSet<>();
    }

    public void adicionar(Jogador jogador) {
        this.jogadores.add(jogador);
    }
}
