package Colecoes;

import java.util.List;

public class ExemplosList {

    static void main() {

        List<Produto> listaProdutos =
                List.of(
                        new Produto("teclado", 220, 10),
                        new Produto("mouse", 200, 15),
                        new Produto("gabinete", 250, 16));


        System.out.println(listaProdutos);

        listaProdutos.add(new Produto("rtx5060", 3100, 10));

        System.out.println(listaProdutos);
    }


}
