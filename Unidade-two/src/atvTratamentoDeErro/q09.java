package atvTratamentoDeErro;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q09 {

    public static double calcularMedia(List<Double> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException(
                    "A lista não pode estar vazia ou ser null."
            );
        }

        double soma = 0;

        for (Double numero : numeros) {
            if (numero == null || numero.isNaN()
                    || numero.isInfinite()) {
                throw new IllegalArgumentException(
                        "A lista contém um valor inválido."
                );
            }

            soma += numero;
        }

        return soma / numeros.size();
    }

    public static void main(String[] args) {
        try {
            List<Double> numeros =
                    Arrays.asList(7.0, 8.0, 9.0);

            System.out.println("Média: " + calcularMedia(numeros));

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

