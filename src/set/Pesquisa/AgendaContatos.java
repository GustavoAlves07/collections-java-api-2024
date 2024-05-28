package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String contato, int telefone) {
        contatoSet.add(new Contato(contato, telefone));


    }

    public void exibirContato() {
        System.out.println(contatoSet);

    }

    public Set<Contato> pesquisarPorNome(String contato) {
        Set<Contato> referenciaNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(contato)) {
                referenciaNome.add(c);


            }
        }
        return referenciaNome;

    }

    public Contato alterarNumeroContato(String contato, int numero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equals(contato)) {
                c.setNumero(numero);
                contatoAtualizado = c;
            }


        }

        return contatoAtualizado;


    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();


        agendaContatos.adicionarContato("Gustavo", 998326356);

        agendaContatos.exibirContato();

        agendaContatos.alterarNumeroContato("Gustavo", 911);

        agendaContatos.exibirContato();
    }
}
