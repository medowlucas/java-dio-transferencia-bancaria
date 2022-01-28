import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Cliente> clienteList = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void inserirCliente(Cliente cliente){
        this.clienteList.add(cliente);
    }
}
