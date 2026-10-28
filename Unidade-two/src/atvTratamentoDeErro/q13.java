package atvTratamentoDeErro;



import java.util.Scanner;

public class  q13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {10, 20, 30, 40, 50};

        try {
            System.out.println("Array:");
            for (int numero : numeros) {
                System.out.print(numero + " ");
            }

            System.out.print("\nDigite o índice que deseja acessar: ");
            int indice = Integer.parseInt(sc.nextLine());

            System.out.println("Valor: " + numeros[indice]);

            System.out.print("Digite o novo valor: ");
            int novoValor = Integer.parseInt(sc.nextLine());

            numeros[indice] = novoValor;

            System.out.println("Array atualizado:");
            for (int numero : numeros) {
                System.out.print(numero + " ");
            }

        } catch (NumberFormatException e) {
            System.out.println("Erro: digite um número inteiro!");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice inexistente no array!");
        }

        sc.close();
    }
}
