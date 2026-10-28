package atvTratamentoDeErro;


import java.util.ArrayList;
import java.util.Scanner
public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        while (true) {
            System.out.println("\n1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Acessar");
            System.out.println("4 - Mostrar lista");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            String entrada = sc.nextLine();

            try {
                int opcao = Integer.parseInt(entrada);

                if (opcao == 0) {
                    break;
                }

                switch (opcao) {
                    case 1:
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();

                        System.out.print("Índice: ");
                        int indiceAdd =
                                Integer.parseInt(sc.nextLine());

                        nomes.add(indiceAdd, nome);
                        System.out.println("Nome adicionado!");
                        break;

                    case 2:
                        System.out.print("Índice para remover: ");
                        int indiceRem =
                                Integer.parseInt(sc.nextLine());

                        System.out.println(
                                "Removido: " + nomes.remove(indiceRem)
                        );
                        break;

                    case 3:
                        System.out.print("Índice para acessar: ");
                        int indice = Integer.parseInt(sc.nextLine());

                        System.out.println(nomes.get(indice));
                        break;

                    case 4:
                        System.out.println(nomes);
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Erro: digite um número inteiro!");

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Erro: índice fora dos limites da lista!");
            }
        }

        sc.close();
    }
}

