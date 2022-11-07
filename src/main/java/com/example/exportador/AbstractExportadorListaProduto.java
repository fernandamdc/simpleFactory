package com.example.exportador;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractExportadorListaProduto implements ExportadorListaProduto {
    private  List<Coluna> colunas = new ArrayList<>();

    @Override
    public void addColuna(Coluna col) {
        getColunas().add(col);
    }

    @Override
    public String exportar(List<Produto> listaProdutos) {
        var builder = new StringBuilder();
        builder.append(abrirTabela())
                .append(gerarColunas())
                .append(gerarLinhaProdutos(listaProdutos))
                .append(fecharTabela());

        return builder.toString();
    }

    private String gerarLinhaProdutos(List<Produto> listaProdutos) {
        var builder = new StringBuilder();
        builder.append(abrirLinha());
        for (Produto prod : listaProdutos) {
            for (Coluna col : getColunas()) {
                var funcaoValor = col.getFuncaoValor();
                String val = col.getFuncaoValor().apply(prod).toString();
                builder.append(col.abrir(val)+ col.fechar());

            }
            builder.append(fecharLinha());


        }

        return builder.toString();
    }


    private String gerarColunas() {

        var builder = new StringBuilder();

        var stringColunas = getColunas()
                .stream()
                .map(col -> col.exportarCabecalho())
                .collect(Collectors.joining());
        builder
                .append(abrirLinhaTitulos())
                .append(stringColunas)
                .append(fecharLinhaTitulos());


        return builder.toString();
    }

    public List<Coluna> getColunas() {
        return colunas;
    }
}
