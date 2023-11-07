package br.com.lanhouse.dominio;

import br.com.lanhouse.dominio.exception.IdadeNaoPermitidaException;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class JogadorTest {

    @Test
    void deve_criar_um_jogador() throws IdadeNaoPermitidaException {
        String nome = "Higor Nucci";
        LocalDate dataDeNascimento = LocalDate.of(1986, 4, 25);
        String nickname = "higornucci";
        String email = "higornucci@gmail.com";

        Jogador jogador = new Jogador(nome, dataDeNascimento, nickname, email);

        assertThat(jogador.getNome()).isEqualTo(nome);
        assertThat(jogador.getDataDeNascimento()).isEqualTo(dataDeNascimento);
        assertThat(jogador.getNickname()).isEqualTo(nickname);
        assertThat(jogador.getEmail()).isEqualTo(email);
    }

    @Test
    void deve_usar_um_email_valido() throws IdadeNaoPermitidaException {
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

        String nome = "Higor Nucci";
        LocalDate dataDeNascimento = LocalDate.of(1986, 4, 25);
        String nickname = "higornucci";
        String emailInvalido = "higornucciARROBAgmail.com";

        Jogador jogador = new Jogador(nome, dataDeNascimento, nickname, emailInvalido);
        Set<ConstraintViolation<Jogador>> violations =
                validator.validate(jogador);

        assertThat(violations).hasSize(1);
        assertThat(violations.iterator().next().getMessage()).isEqualTo("O e-mail deve ter o formato: exemplo@provedor.com");
    }

    @Test
    void deve_permitir_apenas_jogadores_acima_de_quatorze_anos() {
        String nome = "Higor Nucci";
        LocalDate dataDeNascimento = LocalDate.now().minusYears(14);
        String nickname = "higornucci";
        String email = "higornucci@gmail.com";

        assertThatExceptionOfType(IdadeNaoPermitidaException.class)
                .isThrownBy(() ->
                        new Jogador(nome, dataDeNascimento, nickname, email))
                .withMessage("Apenas jogadores acima de 14 anos são permitidos");
    }
}