package br.com.lanhouse.dominio;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JogoTest {

    @Test
    void deve_cadastrar_um_jogo_com_nome_categoria_fornecedor() {
        String nomeEsperado = "The Elder Scrolls V: Skyrim";
        Categoria categoriaEsperada = new Categoria("Role Playing Game", "RPG");
        Fornecedor fornecedorEsperado = new Fornecedor("Bethesda Game Studios");

        Jogo jogoCadastrado = new Jogo(nomeEsperado, categoriaEsperada, fornecedorEsperado);

        assertThat(jogoCadastrado.getNome()).isEqualTo(nomeEsperado);
        assertThat(jogoCadastrado.getCategoria()).isEqualTo(categoriaEsperada);
        assertThat(jogoCadastrado.getFornecedor()).isEqualTo(fornecedorEsperado);
    }

}