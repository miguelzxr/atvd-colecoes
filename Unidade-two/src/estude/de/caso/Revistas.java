package estude.de.caso;

public class Revistas {
    private String titulo;
    private String editora;
    private double valor;

    public Revistas(){}

    public Revistas(String titulo, String editora, double valor) {
        this.titulo = titulo;
        this.editora = editora;
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Revistas{" +
                "titulo='" + titulo + '\'' +
                ", editora='" + editora + '\'' +
                ", valor=" + valor +
                '}';
    }
}
