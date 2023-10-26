package br.com.lanhouse.dominio;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Fornecedor {
    private String nome;

    public Fornecedor(String nome) {
        this.nome = nome;
    }
}
