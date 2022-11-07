package com.example.exportador;

import java.util.function.Function;

public abstract class AbstractColuna implements Coluna {
    private String titulo;

    private Function<Produto, Object>  funcaoValor;

    AbstractColuna(String titulo, Function<Produto, Object>  funcaoValor) {
        this.titulo = titulo;
        this.funcaoValor = funcaoValor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public Function<Produto, Object> getFuncaoValor() {
        return funcaoValor;
    }
}
