package Colecoes;

import java.util.Comparator;
import java.util.Objects;

public class Pessoa  {
    private String nome;
    private String cpf;
    private char genero;
    private int idade;



    public Pessoa(String nome, String cpf, char genero, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", genero=" + genero +
                ", idade=" + idade +
                '}';
    }
    }








