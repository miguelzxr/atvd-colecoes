package quarta07;

public class Byd implements VeiculoEletrico{

    @Override
    public void carregar() {
        System.out.println("byd carregando");
    }

    @Override
    public void acelerar() {
        System.out.println("byd acelerando");
    }
}
