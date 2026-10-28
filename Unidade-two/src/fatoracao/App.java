package fatoracao;

public class App {
    static void main() {

        Produto livroFisico = new LivroFisico("celan code", "miguel", 110.1);
        Produto ebook = new Ebook("fafic", "rene", 550.5);
        Produto miniLivro = new MiniLivro("dev sabio", "luciano", 150.5);
        Produto revista = new Revista("cod contemporaneo", "FAFIC", 244.4);


        CarrinhoDeCompras produtos = new CarrinhoDeCompras();
        produtos.adicionarProduto(livroFisico);
        produtos.adicionarProduto(ebook);
        produtos.adicionarProduto(revista);
        produtos.adicionarProduto(miniLivro);


        produtos.exibirCarrinho();
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println(produtos.totalCarrinho());

    }
}
