package com.example.exportador;

import java.util.List;
import java.util.function.Function;

public interface ExportadorListaProduto  {


    String abrirTabela();

    String fecharTabela();

    String abrirLinha();

    String fecharLinha();

    String abrirLinhaTitulos();


    String fecharLinhaTitulos();

    String exportar(List<Produto> listaProdutos );
    void addColuna(Coluna col);
   static ExportadorListaProduto newInstance() {
        return newInstance("html");

    }
  static ExportadorListaProduto newInstance(String extencaoArquivoExportacao) {
       if(extencaoArquivoExportacao.equalsIgnoreCase("html"))
           return new ExportadorListaProdutoHtml();


      if(extencaoArquivoExportacao.equalsIgnoreCase("md"))
          return new ExportadorListaProdutoMarkdown();


        throw new UnsupportedOperationException("Formato solicitado nao esta implementado.");



  }

  Coluna newColuna (String titulo, Function<Produto, Object> funcaoValor);

}
