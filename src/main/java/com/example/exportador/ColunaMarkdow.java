package com.example.exportador;

import java.util.function.Function;

public class ColunaMarkdow extends AbstractColuna {
    ColunaMarkdow(String titulo, Function<Produto, Object> funcaoValor) {
        super(titulo, funcaoValor);
    }

    @Override
    public String abrir(String valor) {
        return valor;
    }

    @Override
    public String fechar() {
        return "|";
    }

    @Override
    public String exportarCabecalho() {
        return getTitulo() + "|";
    }
}
