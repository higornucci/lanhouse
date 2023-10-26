package br.com.lanhouse.dominio;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FornecedorTest {
    @Test
    void deve_cadastrar_um_fornecedor() {
        String nomeEsperado = "Bethesda Game Studios";
        Fornecedor fornecedor = new Fornecedor(nomeEsperado);
        assertThat(fornecedor.getNome()).isEqualTo(nomeEsperado);
    }
}