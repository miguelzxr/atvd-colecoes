package atvTratamentoDeErro;


public class q07 {
    public static void main(String[] args) {

        String[] valores = {"10.5", "20.8", "abc", "15.2", "ola"};

        double[] numeros = new double[valores.length];

        for (int i = 0; i < valores.length; i++) {
            try {
                numeros[i] = Double.parseDouble(valores[i]);

                System.out.println("Convertido: " + numeros[i]);

            } catch (NumberFormatException e) {
                System.out.println("Erro: '" + valores[i] +
                        "' não é um número válido.");
            }
        }
    }
}
