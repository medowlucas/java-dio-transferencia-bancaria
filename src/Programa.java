public class Programa {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        Conta pp = new ContaPoupanca();

        cc.depositar(100.0);
        cc.imprimirExtrato();
        cc.transferir(50.0, pp);
        cc.imprimirExtrato();
        pp.imprimirExtrato();

        Banco banco = new Banco("BANCO DO BRASIL");
        Cliente cliente = new Cliente("Lucas", cc);
        cliente.inserirConta(pp);
        System.out.println("Lista de Contas do Cliente " + cliente.getNome() + " : " + cliente.getContas() );
        banco.inserirCliente(cliente);
        System.out.println("Lista de Clientes do Banco " + banco.getNome() + " : " + banco.getClienteList() );

    }
}
