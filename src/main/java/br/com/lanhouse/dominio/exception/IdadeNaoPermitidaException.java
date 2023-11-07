package br.com.lanhouse.dominio.exception;

public class IdadeNaoPermitidaException extends Exception {
    public IdadeNaoPermitidaException() {
        super("Apenas jogadores acima de 14 anos são permitidos");
    }
}
