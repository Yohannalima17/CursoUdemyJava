package OO.banco;

public class ContaPoupanca extends Conta{
    double RENDIMENTO_PORCENTAGEM = 0.05;
    double rendimento = getSaldo() * RENDIMENTO_PORCENTAGEM;


    public ContaPoupanca(int idConta, int idPessoa) {
        super(idConta, idPessoa);
    }

    @Override
    public void setSaldo(double saldo) {
        super.setSaldo(saldo + rendimento);
    }
}
