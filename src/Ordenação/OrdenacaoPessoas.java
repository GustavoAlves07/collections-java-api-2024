package Ordenação;

import Pesquisa.Livro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
   private List<Pessoas> pessoas = new ArrayList<>();



    public  OrdenacaoPessoas(List<Pessoas> pessoas){
        this.pessoas = new ArrayList<>();


    }

    public void AdicionarPessoas(String name, int age, double altura){
        pessoas.add(new Pessoas(name,age,altura));


    }

    public List<Pessoas> ordenarPorIdade(){
        List<Pessoas> listaIdade = new ArrayList<>();
        Collections.sort(listaIdade, new Comparator<Pessoas>() {
            @Override
            public int compare(Pessoas o1, Pessoas o2) {
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        });
        return listaIdade;


    }

    public List<Pessoas> ordenarPorAltura(){
        List<Pessoas> listaIdade = new ArrayList<>();
        Collections.sort(listaIdade, new Comparator<Pessoas>() {
            @Override
            public int compare(Pessoas o1, Pessoas o2) {
                return Double.compare(o1.getAltura(),o2.getAltura());
            }
        });
        return listaIdade;


    }
}
