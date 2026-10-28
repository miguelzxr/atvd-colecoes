package Lambdas;

import fatoracao.Ebook;
import fatoracao.LivroFisico;
import fatoracao.Produto;

import java.util.ArrayList;
import java.util.List;

public class App {
    static void main() {

        List<fatoracao.Produto> livros = new ArrayList<>();

        livros.add(new LivroFisico("dd", "DD", 10));
        livros.add(new Ebook("dd", "miguel", 50));
        livros.add(new Ebook("dd", "miguel", 70));
        livros.add(new Ebook("dd", "miguel", 30));
        livros.add(new Ebook("dd", "miguel", 44));
        livros.add(new LivroFisico("dd", "DD", 400));

        //System.out.println("lista: " + livros);

        System.out.println("_____________________________________________________");
        System.out.println("_____________________________________________________");
        System.out.println("_____________________________________________________");

       // livros.sort(new ComparadorDePreco()); // metodo 1

        //livros.sort((a,b) -> Double.compare(a.valor(), b.valor())); //metodo 2 diminuindo uma classe e ordenando do menor p/ maior

        //System.out.println("lista ordenada: " + livros);

        //livros.sort((a,b) -> a.titulo().compareTo(b.titulo())); // ordena por ordem alfabetica

        List<Produto> livrosFiltrados = new ArrayList<>();
        /*livros.forEach(l -> {
            if (l.valor() < 100.0 && l instanceof Ebook){
                livrosFiltrados.add(l);
            }
        });*/





        FiltroProdutoService fps = new FiltroProdutoService();
        List<Produto> saldao = fps.filtro(livros, FiltroProduto.peloValor() );
       // System.out.println("livros em promo: " + saldao);


        livrosFiltrados = fps.filtro(livros, FiltroProduto.peloValor().and(FiltroProduto.somenteEbook().and(FiltroProduto.somenteAutor("miguel"))));
        System.out.println("lista final" + livrosFiltrados);



    }
}
