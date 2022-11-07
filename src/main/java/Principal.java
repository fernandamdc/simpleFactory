import com.example.exportador.ExportadorListaProduto;
import com.example.exportador.Produto;

import java.util.List;

public class Principal {
    public static void main (String[] args){
        List<Produto> produtos = List.of(
                new Produto("TV", "LG", "12", 10),
                new Produto("Notebook", "LG", "12", 10)
        );
        var fabrica = ExportadorListaProduto.newInstance();
        fabrica.addColuna(fabrica.newColuna("Id", Produto::getId));
        fabrica.addColuna(fabrica.newColuna("Descrição", Produto::getDescricao));
        fabrica.addColuna(fabrica.newColuna("Estoque", Produto::getEstoque));
        System.out.println(fabrica.exportar(produtos));

        ExportadorListaProduto exportadorMarkdow = ExportadorListaProduto.newInstance("md");
        exportadorMarkdow.addColuna(exportadorMarkdow.newColuna("Id", Produto::getId));
        exportadorMarkdow.addColuna(exportadorMarkdow.newColuna("Descrição", Produto::getDescricao));
        exportadorMarkdow.addColuna(exportadorMarkdow.newColuna("Estoque", Produto::getEstoque));
        System.out.println(exportadorMarkdow.exportar(produtos));
    }

}
