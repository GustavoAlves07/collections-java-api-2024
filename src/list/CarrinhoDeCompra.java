package list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    public CarrinhoDeCompra() {
        this.compras = new ArrayList<>();
    }

    List<Item> compras = new ArrayList<>();

    public void adicionarItem(String name, Double preco, int quantidade) {
        compras.add(new Item(name, preco, quantidade));
    }

    public void removerItem(String item) {
        List<Item> listaParaRemover = new ArrayList<>();

        for (Item verificacao : compras) {
            if (verificacao.getNome().equalsIgnoreCase(item)) {
                listaParaRemover.add(verificacao);


            }


        }
        compras.removeAll(listaParaRemover);


    }

    public void calcularValor() {
        double totalValue = 0;
        int quantidadeItem = 0;

        for (Item eachItem : compras) {

            quantidadeItem++;
            totalValue = totalValue + eachItem.getPreco();


        }

        System.out.println("O valor total foi de " + totalValue + " e a quantidade de item(s) total foi " + quantidadeItem);


    }

    public void itensDoCarrinho() {
        System.out.println(compras);
    }

    public static void main(String[] args) {

        CarrinhoDeCompra carrinhoDeCompras = new CarrinhoDeCompra();

        carrinhoDeCompras.adicionarItem("Iogurte", 2.50, 1);
        carrinhoDeCompras.adicionarItem("limão", 2.50, 1);
        carrinhoDeCompras.calcularValor();
        carrinhoDeCompras.removerItem("limão");
        carrinhoDeCompras.calcularValor();
        carrinhoDeCompras.itensDoCarrinho();


    }

}
