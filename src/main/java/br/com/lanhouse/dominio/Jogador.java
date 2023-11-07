package br.com.lanhouse.dominio;

import jakarta.validation.constraints.Email;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Jogador {
    private final String nome;
    private final LocalDate dataDeNascimento;
    private final String nickname;
    @Email(message = "O e-mail deve ter o formato: exemplo@provedor.com")
    private final String email;

    public Jogador(String nome, LocalDate dataDeNascimento, String nickname, String email) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.nickname = nickname;
        this.email = email;
    }
}
