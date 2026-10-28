package quarta07;

public interface VeiculoAcombustao extends VeiculoGenerico{
    @Override
    default void acelerar() {
        VeiculoGenerico.super.acelerar();
    }

    @Override
    default void abastecer() {
        VeiculoGenerico.super.abastecer();
    }
}
