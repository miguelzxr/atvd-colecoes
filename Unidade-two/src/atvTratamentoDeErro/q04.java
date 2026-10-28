package atvTratamentoDeErro;

import java.util.Scanner;

public class q04 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite uma string: ");
        String nome = sc.nextLine();

        while (true){
            try {

                for (Character n : nome){
                    if (n.equals("null")){
                        System.out.println("digite novamente a string e nula");
                    }else {
                        System.out.println(n);
                    }
                }

            }catch (Exception e){
                System.out.println(e.getMessage());

            }
        }

    }
}
