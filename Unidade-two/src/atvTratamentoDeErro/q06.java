package atvTratamentoDeErro;

import java.util.Scanner;


import java.util.Scanner;

public class q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            double n1 = Double.parseDouble(sc.nextLine());

            System.out.print("Digite o segundo número: ");
            double n2 = Double.parseDouble(sc.nextLine());

            System.out.println("\nEscolha a operação:");
            System.out.println("+ Soma");
            System.out.println("- Subtração");
            System.out.println("* Multiplicação");
            System.out.println("/ Divisão");

            System.out.print("Operação: ");
            String operacao = sc.nextLine();

            switch (operacao) {
                case "+":
                    System.out.println("Resultado: " + (n1 + n2));
                    break;

                case "-":
                    System.out.println("Resultado: " + (n1 - n2));
                    break;

                case "*":
                    System.out.println("Resultado: " + (n1 * n2));
                    break;

                case "/":
                    if (n2 == 0) {
                        throw new ArithmeticException(
                                "Não é possível dividir por zero!"
                        );
                    }
                    System.out.println("Resultado: " + (n1 / n2));
                    break;

                default:
                    throw new IllegalArgumentException(
                            "Operação inválida!"
                    );
            }

        } catch (NumberFormatException e) {
            System.out.println("Erro: digite números válidos!");

        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        } finally {
            sc.close();
        }
    }
}
