import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Cliente(String nome, Conta conta) {
        this.nome = nome;
        this.inserirConta(conta);
    }

    public void inserirConta(Conta conta){
        this.contas.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", contas=" + contas +
                '}';
    }
}
