package fatoracao;

public class Revista implements Produto{

    private String titulo;
    private String editora;
    protected double valor;

    public Revista() {
    }

    public Revista(String titulo, String editora, double valor) {
        this.titulo = titulo;
        this.editora = editora;
        this.valor = valor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String titulo() {
        return "";
    }

    @Override
    public double valor() {
        return this.valor;
    }

    @Override
    public String autor() {
        return this.autor();
    }
}
