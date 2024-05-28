package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private List<Livro> livroList;


    public CatalagoLivros(List<Livro> livroList) {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String nome, String author, int ano) {
        livroList.add(new Livro(nome, author, ano));


    }

    public void removerLivro(String nome) {
        List<Livro> removerLivro = new ArrayList<>();

        for (Livro verificacao : livroList) {
            if (verificacao.getTitulo().equalsIgnoreCase(nome)) {

                removerLivro.add(verificacao);


            }
        }

        livroList.removeAll(removerLivro);


    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAuthor = new ArrayList<>();
        if (!livroList.isEmpty()) {


            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAuthor.add(l);
                }
            }


        }


        return livrosPorAuthor;
    }


    public List<Livro> pesquisaPorIntervalo(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {

            for (Livro l : livroList) {
                if (l.getAnoPublicao() >= anoInicial && l.getAnoPublicao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }


            }


        }

        return livrosPorIntervaloAnos;


    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPesquisado = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPesquisado = l;


                    break;
                }

            }


        }

        return livroPesquisado;


    }

    public static void main(String[] args) {

    }
}