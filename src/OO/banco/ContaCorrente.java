package OO.banco;

public class ContaCorrente extends Conta{

    double LIMITE_SAQUE_CC = 5000;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void setLimiteSaqueDiario(double limiteSaqueCC) {
        super.setLimiteSaqueDiario(LIMITE_SAQUE_CC);
    }

    @Override
    public void setTipoConta(int tipoConta) {
        super.setTipoConta(1);
    }

    void dadosCC(Cliente cliente, ContaCorrente cc){
        System.out.println("Conta criada.");
        System.out.printf("----- DADOS DA CONTA -----\n" +
                        "Nome: %d\nId do cliente: %d\nIdade: %d\nCPF: %d\nId da conta: %d\n" +
                        "Tipo de conta: %d\n", cc.cliente.getNome(), cc.getIdPessoa(),
                cc.cliente.getIdade(), cc.cliente.getCpf(), cc.getIdConta(), cc.getTipoConta());
    }


}
