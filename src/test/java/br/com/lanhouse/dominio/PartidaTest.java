package br.com.lanhouse.dominio;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.assertj.core.api.Assertions.assertThat;

class PartidaTest {

    @Test
    void deve_criar_uma_partida() throws Exception {
        Jogo jogo = criarJogo();
        Periodo periodo = criarPeriodo();

        Partida partida = new Partida(jogo, periodo);

        assertThat(partida.getJogo()).isEqualTo(jogo);
        assertThat(partida.getPeriodo()).isEqualTo(periodo);
        assertThat(partida.getJogadores()).isEmpty();
    }

    @Test
    void deve_ser_possivel_adicionar_um_jogador_a_uma_partida() throws Exception {
        Jogo jogo = criarJogo();
        Periodo periodo = criarPeriodo();
        Jogador jogador = new Jogador("Higor Nucci", LocalDate.of(1986, 4, 25), "higornucci", "higornucci@gmail.com");

        Partida partida = new Partida(jogo, periodo);
        partida.adicionar(jogador);

        assertThat(partida.getJogadores())
                .containsOnly(jogador);
    }

    @Test
    void deve_ser_possivel_adicionar_mais_de_um_jogador_a_uma_partida() throws Exception {
        Jogo jogo = criarJogo();
        Periodo periodo = criarPeriodo();
        Jogador jogador1 = new Jogador("Higor Nucci", LocalDate.of(1986, 4, 25), "higornucci", "higornucci@gmail.com");
        Jogador jogador2 = new Jogador("Enrico Nucci", LocalDate.of(2003, 5, 4), "enriconucci", "enriconucci@gmail.com");

        Partida partida = new Partida(jogo, periodo);
        partida.adicionar(jogador1);
        partida.adicionar(jogador2);

        assertThat(partida.getJogadores())
                .containsOnly(jogador1, jogador2);
    }

    private static Periodo criarPeriodo() {
        LocalDate data = LocalDate.of(2023,11,30);
        LocalTime horaInicio = LocalTime.of(10,20);
        LocalTime horaFim = LocalTime.of(11,0);
        LocalDateTime horarioDeInicio = LocalDateTime.of(data, horaInicio);
        LocalDateTime horarioDeFim = LocalDateTime.of(data, horaFim);
        Periodo periodo = new Periodo(horarioDeInicio, horarioDeFim);
        return periodo;
    }

    private static Jogo criarJogo() {
        Categoria categoriaEsperada = new Categoria("Role Playing Game", "RPG");
        Fornecedor fornecedorEsperado = new Fornecedor("Bethesda Game Studios");
        Jogo jogo = new Jogo("The Elder Scrolls V: Skyrim", categoriaEsperada, fornecedorEsperado);
        return jogo;
    }
}