package atvTratamentoDeErro;


import java.util.Scanner;

public class q12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();

        try {
            boolean formatoValido =
                    cpf.matches("\\d{11}") ||
                            cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");

            if (!formatoValido) {
                throw new IllegalArgumentException(
                        "CPF com formato inválido!"
                );
            }

            System.out.println("Formato do CPF válido!");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
