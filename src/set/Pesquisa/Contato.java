package set.Pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numero;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Contato(String nome, int numero){
        this.nome = nome;
        this.numero = numero;

    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    public int getNumero() {
        return numero;
    }
}
