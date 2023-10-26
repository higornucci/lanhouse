package br.com.lanhouse.dominio;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CategoriaTest {

    @Test
    void deve_ser_possivel_cadastrar_uma_categoria_com_seu_nome_e_abreviacao() {
        String nomeEsperado = "Role Playing Game";
        String abreviacaoEsperada = "RPG";
        Categoria categoria = new Categoria(nomeEsperado, abreviacaoEsperada);
        assertThat(categoria.getNome()).isEqualTo(nomeEsperado);
        assertThat(categoria.getAbreviacao()).isEqualTo(abreviacaoEsperada);
    }
}