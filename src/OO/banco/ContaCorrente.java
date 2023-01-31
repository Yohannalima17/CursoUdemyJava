package OO.banco;

public class ContaCorrente extends Conta{

    double LIMITE_SAQUE_CC = 5000;


    public ContaCorrente(){
        setIdPessoa();
        setIdConta();
        setTipoConta(1);
    }
    @Override
    public void setLimiteSaqueDiario(double limiteSaqueCC) {
        super.setLimiteSaqueDiario(LIMITE_SAQUE_CC);
    }

    void dadosCC(Cliente cliente){
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
