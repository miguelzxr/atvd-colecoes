package atvTratamentoDeErro;


public class q05 {
    public static void main(String[] args) {

        String[] palavras = {"java", "programacao", null, " escola", "computador"};

        for (int i = 0; i < palavras.length; i++) {
            try {
                palavras[i] = palavras[i].toUpperCase();
                System.out.println(palavras[i]);

            } catch (NullPointerException e) {
                System.out.println("Erro: elemento " + i + " é null.");
            }
        }
    }
}

