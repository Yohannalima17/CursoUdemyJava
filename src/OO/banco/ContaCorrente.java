package OO.banco;

public class ContaCorrente extends Conta{

    double limiteSaqueCC = 5000;

    public ContaCorrente(int idConta, int idPessoa) {
        super(idConta, idPessoa);
    }

    @Override
    public void setLimiteSaqueDiario(double limiteSaqueCC) {
        super.setLimiteSaqueDiario(limiteSaqueCC);
    }
}
