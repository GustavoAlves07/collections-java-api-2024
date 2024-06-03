package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap();
    }

    private Map<String, Integer> agendaContatoMap;

    public void adicionarContato(String nomeContato, Integer numeroContato) {
        agendaContatoMap.put(nomeContato, numeroContato);
    }

    public void removerContato(String nomeContato) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nomeContato);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nomeContato) {
        Integer numeroContato = null;
        if (!agendaContatoMap.isEmpty()){
            numeroContato = agendaContatoMap.get(nomeContato);

        }

        return numeroContato;

    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos() ;

        agendaContatos.adicionarContato("Gustavo",911);
        agendaContatos.exibirContatos();
        agendaContatos.pesquisarPorNome("Gustavo");
        agendaContatos.removerContato("Gustavo");
        agendaContatos.exibirContatos();
    }
}
