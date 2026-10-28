package Colecoes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploIterator {
    static void main() {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("arroz", 4.5, 5));
        produtos.add(new Produto("acucar", 8, 10));
        produtos.add(new Produto("cuscuz", 10.5, 0));
        produtos.add(new Produto("feijao", 5.5, 0));

        System.out.println("Estoque: " + produtos);
        //for(Produto p : produtos){
        //    if (p.getEstoque() == 0){ // nao permite remover, nem add, nao pode mexer na lista
        //        produtos.remove(p);
        //    }
        //}
        //System.out.println("--------------");

        //System.out.println("Estoque: " + produtos);


        Iterator<Produto> produtoIterator = produtos.iterator();

        while (produtoIterator.hasNext()){ // aqui ja pode remover a add na lista
            Produto produto = produtoIterator.next();

            if (produto.getEstoque() == 0){
                produtoIterator.remove();
            }
        }

        System.out.println("pos iterator");
        System.out.println("Estoque: " + produtos);





    }

}
