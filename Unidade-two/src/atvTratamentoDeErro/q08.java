package atvTratamentoDeErro;


import java.util.Scanner;

public class q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número inteiro ou 'sair': ");
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                int numero = Integer.parseInt(entrada);
                System.out.println("Número digitado: " + numero);
            } catch (NumberFormatException e) {
                System.out.println("Erro: digite um número inteiro válido!");
            }
        }

        sc.close();
        System.out.println("Programa encerrado.");
    }
}

