package br.com.lanhouse.dominio;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Jogo {
    private String nome;
    private Categoria categoria;
    private Fornecedor fornecedor;

    public Jogo(String nome, Categoria categoria, Fornecedor fornecedor) {
        this.nome = nome;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
    }
}
