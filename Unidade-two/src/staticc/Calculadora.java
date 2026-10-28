package staticc;
@FunctionalInterface

public interface Calculadora {
    int calcular(int a, int b);

    static Calculadora somar(){
        return (a,b) -> a + b;
    }

    static Calculadora multiplica(){
        return (a,b) -> a * b;
    }
}
