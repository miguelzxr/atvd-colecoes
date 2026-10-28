package atvTratamentoDeErro;

import exemplosInterface.NaoPodeDividirPorZeroException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q01 {
    static void main() {

        int number1;
        int number2;

        Scanner sc = new Scanner(System.in);

        while (true){

            try {

                System.out.println("digite o dividendo: ");
                number1 = sc.nextInt();

                System.out.println("digite o divisor: ");
                number2 = sc.nextInt();





            } catch (NaoPodeDividirPorZeroException e) {
                System.out.println("digite um divisor diferente de zeero");
            }catch (InputMismatchException e){
                System.out.println("digite o numero valido!!!");
            }finally {
                System.out.println("vai ser executado");
            }

        }

    }

    static double calcular(int a, int b){

        return a/b;
    }

}
