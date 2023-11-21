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
    }

    @Test
    void deve_ser_possivel_adicionar_um_jogador_a_uma_partida() throws Exception {
        Jogador jogador = new Jogador("Higor Nucci", LocalDate.of(1986, 4, 25), "higornucci", "higornucci@gmail.com");

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