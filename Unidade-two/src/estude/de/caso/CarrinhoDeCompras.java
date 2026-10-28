package estude.de.caso;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Livro> livros = new ArrayList<>();

    private List<Revistas> revista = new ArrayList<>();

    public void adicionarRevista(Revistas revista){
        this.revista.add(revista);
    }



    public void adicionarLivros(Livro livro){

        this.livros.add(livro);
    }

    public double totalCarrinho(){
        double total = 0;



        for (Livro l : livros){
            total += l.getValor();
        }
        for (Revistas r : revista){
            total += r.getValor();
        }
        return total;

    }


    public void exibirDetalhes(){
        livros.forEach(l-> System.out.println(l.toString()));
        revista.forEach(r-> System.out.println(r.toString()));
    }

}
