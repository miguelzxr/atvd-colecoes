package quarta07;

public class Ferrari implements VeiculoAcombustao{

    @Override
    public void abastecer() {
        System.out.println("ferrari abastecendo");
    }

    @Override
    public void acelerar() {
        System.out.println("ferrari acelerando");
    }
}
