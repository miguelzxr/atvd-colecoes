package staticc;

public class App {
    static void main() {

        Calculadora somar = Calculadora.somar();
        System.out.println(somar.calcular(4,5)); // invocamos o metodo somar

        Calculadora multiplicar = Calculadora.multiplica();
        System.out.println(multiplicar.calcular(5,6));//invocamos o metodo multiplicar


    }
}
