package quarta07;

public interface VeiculoEletrico extends VeiculoGenerico{
    @Override
    default void acelerar() {
        VeiculoGenerico.super.acelerar();
    }

    @Override
    default void carregar() {
        VeiculoGenerico.super.carregar();
    }
}
