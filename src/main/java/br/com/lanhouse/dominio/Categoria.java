package br.com.lanhouse.dominio;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Categoria {
    private String nome;
    private String abreviacao;

    public Categoria(String nome, String abreviacao) {
        this.nome = nome;
        this.abreviacao = abreviacao;
    }
}
