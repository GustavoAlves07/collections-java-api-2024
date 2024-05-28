package set.Ordenacao;

import java.util.*;

public class CadastroProdutos {
    protected Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, int codigo, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));


    }

    public void exibirProdutosPorNome() {
        List<Produto> produtoOrdenado = new ArrayList<>(produtoSet);

        Collections.sort(produtoOrdenado, (p1,p2) -> p1.getNome().compareTo(p2.getNome()));

        for (Produto p : produtoSet){
            System.out.println(produtoOrdenado);
        }



    }

    public void exibirPorPreco(){
        List<Produto> produtoPreco = new ArrayList<>(produtoSet);

        Collections.sort(produtoPreco,(p1,p2) -> Double.compare(p1.getPreco(),p2.getPreco()));

        for (Produto p: produtoSet){
            System.out.println(produtoPreco);
        }


    }


}
