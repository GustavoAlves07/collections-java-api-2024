import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    private List<Tarefa> tarefaList;

    public void adicionarTarefa(String descricao){

        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();

        for (Tarefa t: tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(t);


            }

        }
        tarefaList.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefas(){
       return tarefaList.size();
    }

    public void obterDescricaoTarefa(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Lavar carro");
        System.out.println(listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("regular o som");
        System.out.println(listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.removerTarefa("regular o som");
        System.out.println(listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricaoTarefa();

    }
}
