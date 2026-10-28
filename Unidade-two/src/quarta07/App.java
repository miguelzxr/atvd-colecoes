package quarta07;

public class App {
    static void main() {
        Veiculo fusca = new Fusca();
        fusca.acelerar();
        fusca.abastecer();


        Veiculo dolphin = new MiniDolphin();
        dolphin.acelerar();
        dolphin.abscarre("eletrico");

        VeiculoAcombustao ferrari = new Ferrari();
        ferrari.abastecer();
        ferrari.acelerar();


        VeiculoEletrico byd = new Byd();
        byd.acelerar();
        byd.carregar();




    }
}
