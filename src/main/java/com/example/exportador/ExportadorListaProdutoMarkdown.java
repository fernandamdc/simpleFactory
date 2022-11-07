package com.example.exportador;

import java.util.function.Function;
import java.util.stream.Collectors;

public class ExportadorListaProdutoMarkdown extends AbstractExportadorListaProduto {
    @Override
    public String abrirTabela() {return "";}

    @Override
    public String fecharTabela() {
        return "\n";
    }

    @Override
    public String abrirLinha() {
        return "";
    }

    @Override
    public String fecharLinha() {
        return "\n";
    }

    @Override
    public String abrirLinhaTitulos() {
        return "";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "\n" + getColunas().stream().
                map(coluna -> "|---").collect(Collectors.joining())+ "\n";
    }

    @Override
    public Coluna newColuna(String titulo, Function<Produto, Object> funcaoValor) {
        return new ColunaMarkdow(titulo, funcaoValor);
    }


}
