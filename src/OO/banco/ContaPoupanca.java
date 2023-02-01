package OO.banco;

public class ContaPoupanca extends Conta{
    double RENDIMENTO_PORCENTAGEM = 0.05;
    double rendimento = getSaldo() * RENDIMENTO_PORCENTAGEM;

    public ContaPoupanca(){
        setIdPessoa();
        setIdConta();
        setTipoConta(2);
    }
    @Override
    public void setSaldo(double saldo) {
        super.setSaldo(saldo + rendimento);
    }

    void dadosCP(Cliente cliente){
        System.out.println("Conta criada.");
        System.out.println("------- DADOS DA CONTA -------");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Id do cliente: " + getIdPessoa());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Id da conta: " + getIdConta());
        System.out.println("Tipo de conta: " + getTipoConta());
    }
}
