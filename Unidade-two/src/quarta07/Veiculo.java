package quarta07;

public interface Veiculo {
    void acelerar();
    //void abastecer();

    default void abastecer(){}

    default void carregar(){}


    default void abscarre(String metodo){
        if (metodo.equalsIgnoreCase("eletrico")){
            System.out.println("veiculo carregando");
        }if (metodo.equalsIgnoreCase("combustao")){
            System.out.println("abstecendo");
        }
    }


}


