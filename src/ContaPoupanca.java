public class ContaPoupanca extends Conta{

    public ContaPoupanca() {
        super();
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Poupança ***");
        System.out.println(String.format("Agência: %d",agencia));
        System.out.println(String.format("Número: %d",numero));
        System.out.println(String.format("Saldo: %.2f",saldo));
    }

}
