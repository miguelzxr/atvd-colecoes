package atvTratamentoDeErro;

import java.util.Scanner;

public class q02 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero inteiro");
        String texto = sc.nextLine();

        while (true){
            try {
                int numero = Integer.parseInt(texto);

                System.out.println("numero convertido" + numero);





            }catch (NumberFormatException e){
                System.out.println("o numero digitad nao e um numero inteiro valido");
            }
        }

    }
}
