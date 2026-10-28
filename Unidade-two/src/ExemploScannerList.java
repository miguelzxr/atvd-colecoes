import Colecoes.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExemploScannerList {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        String menu = """
                1 - adicionar
                2 - remover
                3 - ver todos
                4 - sair
                """;

        int opcao;

        while (true) {
            System.out.println(menu);
            System.out.print("Digite uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); // limpa o ENTER

            if (opcao == 4) {
                System.out.println("Fechando programa...");
                break;
            }

            if (opcao == 1) {

                System.out.print("Digite a descrição do produto: ");
                String descricao = sc.nextLine();

                System.out.print("Digite o preço: ");
                double preco = sc.nextDouble();

                System.out.print("Digite o estoque: ");
                int estoque = sc.nextInt();

                sc.nextLine(); // limpa o ENTER

                produtos.add(new Produto(descricao, preco, estoque));

                System.out.println("Produto adicionado!");

            } else if (opcao == 2) {

                System.out.print("Digite a descrição do produto para remover: ");
                String descricao = sc.nextLine();

                produtos.removeIf(
                        p -> p.getDescricao().equalsIgnoreCase(descricao)
                );

                System.out.println("Produto removido!");

            } else if (opcao == 3) {

                produtos.forEach(p -> System.out.println(p));

            } else {
                System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
