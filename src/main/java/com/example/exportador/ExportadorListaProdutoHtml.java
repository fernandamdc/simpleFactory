package com.example.exportador;

import java.util.function.Function;

public class ExportadorListaProdutoHtml extends AbstractExportadorListaProduto {
    @Override
    public String abrirTabela() {
        return "<html>\n";
    }

    @Override
    public String fecharTabela() {
        return "</html>\n";
    }

    @Override
    public String abrirLinha() {
        return "<tr>";
    }

    @Override
    public String fecharLinha() {
        return "</tr>\n";
    }

    @Override
    public String abrirLinhaTitulos() {
        return "<tr>";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "</tr>\n";
    }

    @Override
    public Coluna newColuna(String titulo, Function<Produto, Object> funcaoValor) {
        return new ColunaHtml(titulo, funcaoValor);
    }


}
