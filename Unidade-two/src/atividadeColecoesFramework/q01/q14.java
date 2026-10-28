package atividadeColecoesFramework.q01;

import java.util.HashMap;

public class q14 {
    public static void main(String[] args) {

        HashMap<String, Pessoa> pessoas = new HashMap<>();


        pessoas.put("111.111.111-11", new Pessoa("Ana", 25, "22"));
        pessoas.put("222.222.222-22", new Pessoa("Bruno", 30,"22"));
        pessoas.put("333.333.333-33", new Pessoa("Carla", 28, "22"));


        System.out.println("Todas as pessoas:");
        for (var entrada : pessoas.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }


        System.out.println("\nPessoa com CPF 222.222.222-22:");
        System.out.println(pessoas.get("222.222.222-22"));


        Pessoa pessoaAntiga = pessoas.put(
                "222.222.222-22",
                new Pessoa("Bruna", 20," ")
        );


        System.out.println("\nValor retornado por put:");
        System.out.println(pessoaAntiga);


        System.out.println("\nPessoa após a substituição:");
        System.out.println(pessoas.get("222.222.222-22"));
    }
}
