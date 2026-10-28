package atvTratamentoDeErro;

public class NaoPodeDivisaoPorZero extends RuntimeException {
    public NaoPodeDivisaoPorZero(String message) {
        super(message);
    }
}
