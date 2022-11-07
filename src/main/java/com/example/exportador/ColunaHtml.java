package com.example.exportador;

import java.util.function.Function;

public class ColunaHtml extends AbstractColuna {
    ColunaHtml(String titulo, Function<Produto, Object> funcaoValor) {
        super(titulo, funcaoValor);
    }

    @Override
    public String abrir(String valor) {
        return "<td>" + valor;
    }

    @Override
    public String fechar() {
        return "</td>";
    }

    @Override
    public String exportarCabecalho() {
        return "<th>" + getTitulo() + "</th>";
    }
}
