package atvTratamentoDeErro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q03 {

    static void main() {
        String[] nomes = {"miguel", "arthur", "guilherme"};
        Scanner sc = new Scanner(System.in);

        while (true) try {
            System.out.print("digite o numero do indice: ");
            int indice = sc.nextInt();

            System.out.println(nomes[indice]);

            if (indice < nomes.length){
                System.out.println("o numero de indice nao corresponde a quantidade");
            } else {
                System.out.println("nome: " + nomes[indice]);

            }

        } catch (InputMismatchException e) {
            System.out.println("digite um numero: ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
