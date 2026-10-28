package fatoracao;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Produto> produto = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        this.produto.add(produto);
    }

    public double totalCarrinho(){

        double total = 0.0;

        for(Produto p : produto){
            total += p.valor();
        }
        return total;
    }

    public void exibirCarrinho(){
        produto.forEach(p-> System.out.println(p.toString()));
    }


}
