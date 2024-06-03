package map.OperacoesBasicas.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class Compras {
    Map<Long, Produto> estoqueProduto;

   private Compras() {
        this.estoqueProduto = new HashMap<>();
    }

    public void adicionarCompras(long cod, String nome, int quantidade, double preco) {
        estoqueProduto.put(cod, new Produto(nome, preco, quantidade));
        System.out.println(estoqueProduto);

    }

    public void excluirProduto(long cod) {
        estoqueProduto.remove(cod);
    }

    public void exibirProdutos() {
        System.out.println(estoqueProduto);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueProduto.isEmpty()) {
            for (Produto produto : estoqueProduto.values()) {
                valorTotalEstoque += produto.getQuantidade() * produto.getPreco();

            }
        }
        System.out.println(valorTotalEstoque);
        return valorTotalEstoque;
    }

    public void produtoMaisCaro(){
        String produtoNome = null;
        double produtoMaisCaro = 0.0;
        for (Produto produto : estoqueProduto.values()){
            if (produtoMaisCaro< produto.getPreco()){
                produtoNome = produto.getNome();
                produtoMaisCaro = produto.getPreco();

            }

        }

        System.out.println("O produto mais caro é o " + produtoNome + " custando " + "R$" + produtoMaisCaro);
    }


    public void pesquisarProdutorPorNome(String nome) {
        if (!estoqueProduto.isEmpty()){
            estoqueProduto.get(nome);
            System.out.println(estoqueProduto.values());
        }
    }

    public static void main(String[] args) {
        Compras compras = new Compras();

        compras.adicionarCompras(01,"carro",2,250.0);
        compras.exibirProdutos();
        compras.adicionarCompras(02,"navio",1,800);
        compras.produtoMaisCaro();
        compras.calcularValorTotalEstoque();
        compras.excluirProduto(01);
        compras.exibirProdutos();
    }
}
