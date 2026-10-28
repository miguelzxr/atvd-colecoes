package Lambdas;

import fatoracao.Ebook;
import fatoracao.Produto;

@FunctionalInterface

public interface FiltroProduto {

    boolean aceita(Produto produto);

    static FiltroProduto peloValor(){
        return p-> p.valor() < 100.0;
    }

    static FiltroProduto somenteEbook(){
        return p -> p instanceof Ebook;
    }

    static FiltroProduto somenteAutor(String autor){
        return p -> p.autor().equalsIgnoreCase(autor);
    }

    default  FiltroProduto and(FiltroProduto filtroProduto){
        return p -> this.aceita(p) && filtroProduto.aceita(p);
    }

}
