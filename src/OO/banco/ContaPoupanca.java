package OO.banco;

public class ContaPoupanca extends Conta{
    double RENDIMENTO_PORCENTAGEM = 0.05;
    double rendimento = getSaldo() * RENDIMENTO_PORCENTAGEM;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void setSaldo(double saldo) {
        super.setSaldo(saldo + rendimento);
    }

    void dadosCP(Cliente cliente, ContaPoupanca cp){
        System.out.println("Conta criada.");
        System.out.printf("----- DADOS DA CONTA -----\n" +
                        "Nome: %d\nId do cliente: %d\nIdade: %d\nCPF: %d\nId da conta: %d\n" +
                        "Tipo de conta: %d\n", cp.cliente.getNome(), cp.getIdPessoa(),
                cp.cliente.getIdade(), cp.cliente.getCpf(), cp.getIdConta(), cp.getTipoConta());
    }
}
