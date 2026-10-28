package atividadeColecoesFramework.q01;

import java.util.HashMap;

public class q15 {
    public static void main(String[] args) {

        HashMap<Integer, String> dias = new HashMap<>();

        dias.put(1, "Segunda-feira");
        dias.put(2, "Terça-feira");
        dias.put(3, "Quarta");
        dias.put(4, "Quinta-feira");
        dias.put(5, "Sexta-feira");


        System.out.println("Mapa original:");
        System.out.println(dias);


        dias.replace(3, "Quarta-feira");

        System.out.println("\nApós replace na chave 3:");
        System.out.println(dias);


        dias.replace(6, "Sábado");


        System.out.println("\nA chave 6 existe? " + dias.containsKey(6));
    }
}