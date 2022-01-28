public abstract class Conta implements ContaOperacoes{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected Integer numero;
    protected Integer agencia;
    protected Double saldo;

    public Conta() {
        this.saldo = 0.0;
        this.numero = SEQUENCIAL++;
        this.agencia = AGENCIA_PADRAO;
    }

    protected void imprimeDados() {
        System.out.println(String.format("Agência: %d",this.agencia));
        System.out.println(String.format("Número: %d",this.numero));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }
    @Override
    public void transferir(double valor, Conta contadestino) {
        this.sacar(valor);
        contadestino.depositar(valor);
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", agencia=" + agencia +
                ", saldo=" + saldo +
                '}';
    }
}
