package Colecoes;

import java.util.*;

public class App {
    static void main() {

        List<String> nomes = new ArrayList<>();
        nomes.add("jose");
        nomes.add("miguel");
        nomes.add("arcu");
        nomes.add("rato");

        //nomes.forEach(n -> System.out.println(n));

        //nomes.set(2, "nome alterado"); // altera

        //nomes.forEach(n -> System.out.println(n));
        nomes.remove(2); //remove nome na lista pelo indice
        Collections.sort(nomes
        ); // ordena em ordem alfabetica

        //nomes.forEach(n -> System.out.println(n)); // percorre e mostra no print


        List<Integer> idades = new ArrayList<>();
        idades.add(22);
        idades.add(21);
        idades.add(23);

        Collections.sort(idades);

        //idades.forEach(i -> System.out.println(i)); // percorre e printa tudo
        //System.out.println("total de elmentos" + idades.size()); //total de elementos


        //idades.clear();
        // limpa os elementos

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("miguel", "12155320400", 'M', 19));
        pessoas.add(new Pessoa("julia", "12155313462", 'F', 18));
        pessoas.add(new Pessoa("rebeca", "87405270425", 'F', 20));

        //pessoas.forEach(p -> System.out.println(p));// percorreu e printou


        Set<String> veiculos = new HashSet<>();
        veiculos.add("mm");

        Set<Pessoa> pessoas1 = new HashSet<>();
        pessoas1.add(new Pessoa("miguel", "12155320400", 'm', 22));
        pessoas1.add(new Pessoa("gutim", "12155320450", 'm', 19));
        pessoas1.add(new Pessoa("igor", "12155320400", 'm', 18));

        //pessoas1.forEach(p -> System.out.println(p));
        int cont = 1;
        for (Pessoa p : pessoas1){
            System.out.println("pessoa: " + cont++ );
        }

        Map<String, Pessoa> mapPessoa = new HashMap<>();
        mapPessoa.put("123", new Pessoa("mvd", "121", 'f', 22));
        mapPessoa.put("321", new Pessoa("mvd", "121", 'f', 22));
        mapPessoa.put("123", new Pessoa("mvd", "121", 'f', 22));
        //mapPessoa.entrySet().forEach(String -> p);







    }
}
