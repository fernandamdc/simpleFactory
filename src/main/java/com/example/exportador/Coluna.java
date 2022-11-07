package com.example.exportador;

import java.util.function.Function;

public interface Coluna {
    String abrir(String valor);

    String fechar();


    String getTitulo();

    void setTitulo(String titulo);

    String exportarCabecalho();

    Function<Produto, Object> getFuncaoValor();
}
