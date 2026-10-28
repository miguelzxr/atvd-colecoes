package exemplosInterface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaBancaria {

    //private double saldo // erro de ompilacao n tem o  ; ou sintaxe
    static void main() {

        int [] numeros = {20, 30, 40, 50};

        //System.out.println(numeros[5]); //erro de execucao o codigo compila mas quebra


        //erro de logica

        System.out.println("iniciou o sistema!!!!!");
        int num1 = 100;
        int num2 = 0;
        //System.out.println("parametros recebidos!!!");
        //System.out.println(num1 / num2); //erro de codigo, pois n existe divisao por zero

        System.out.println("calculo realizado");



        //double n1 = 8, n2 = 6;// tem cmo fazer iss, erro de logica

        //double media = num1 + num2 / 2; // erro de logica, pois ele segue o principio matematico de dividir primeiro

        Scanner sc = new Scanner(System.in);


        while (true){


            try {
                System.out.println("digite o dividendo");
                int dividendo = sc.nextInt();

                System.out.println("dgite o divisor");
                int divisor = sc.nextInt();

                //  System.out.println(calcular(dividendo, divisor));

            }catch (InputMismatchException e){
                System.out.println("algo de errado aconteceu dados invalidas");
                sc.nextLine();
            } catch (NaoPodeDividirPorZeroException e) {
                System.out.println("nao pode dividir por zero!!!");
            }
            finally {
                System.out.println("sempre sera eecutado!!!"); //e usado com banco de dado=

        }













    }
   /* static double calcular(double n1, double n2){
           try {
               return n1/n2;
           }catch (Exception ex){
               throw new NaoPodeDividirPorZeroException("algo de errado aconteceu" + ex.getMessage())
           }*/

        


    }


}
