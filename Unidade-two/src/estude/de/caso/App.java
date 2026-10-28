package estude.de.caso;

public class App {
    static void main() {

        Livro livroFisico = new LivroFisico("clean code", "Miguel", 220.2);

        Livro ebook = new Ebook("engenharia de software", "luciano", 110.1);

        Livro miniLivro = new MiniLivro("POO", "RENE", 150.5);

        Revistas revista = new Revistas("codigos clean", "clean dev", 220.2);


        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarLivros(livroFisico);
        carrinhoDeCompras.adicionarLivros(ebook);
        carrinhoDeCompras.adicionarLivros(miniLivro);


        System.out.println("total a ser pago: " + carrinhoDeCompras.totalCarrinho());


    }

}
