package br.com.lanhouse.dominio;

import br.com.lanhouse.dominio.exception.IdadeNaoPermitidaException;
import jakarta.validation.constraints.Email;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Jogador {
    private static final int IDADE_LIMITE = 15;
    private final String nome;
    private LocalDate dataDeNascimento;
    private final String nickname;
    @Email(message = "O e-mail deve ter o formato: exemplo@provedor.com")
    private final String email;

    public Jogador(String nome, LocalDate dataDeNascimento, String nickname, String email) throws IdadeNaoPermitidaException {
        this.alterarDataDeNascimento(dataDeNascimento);
        this.nome = nome;
        this.nickname = nickname;
        this.email = email;
    }

    public void alterarDataDeNascimento(LocalDate novaData) throws IdadeNaoPermitidaException {
        validarIdade(novaData);
        this.dataDeNascimento = novaData;
    }

    private static void validarIdade(LocalDate dataDeNascimento) throws IdadeNaoPermitidaException {
        int idade = LocalDate.now().compareTo(dataDeNascimento);
        if(idade < IDADE_LIMITE) {
            throw new IdadeNaoPermitidaException();
        }
    }
}
