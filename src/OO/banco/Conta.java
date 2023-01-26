package OO.banco;

import java.time.LocalDate;

public abstract class Conta {

    private int idConta;
    private int idPessoa;
    private double saldo = 0;
    private double limiteSaqueDiario = 1000;
    private int tipoConta; // 1- Corrente | 2- Poupança
    private LocalDate dataCriacao;

    public Conta(int idConta, int idPessoa) {
        this.idConta = idConta;
        this.idPessoa = idPessoa;
    }


    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteSaqueDiario() {
        return limiteSaqueDiario;
    }

    public void setLimiteSaqueDiario(double limiteSaqueDiario) {
        this.limiteSaqueDiario = limiteSaqueDiario;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        LocalDate todaysDate = LocalDate.now();
        dataCriacao = (todaysDate);
        this.dataCriacao = dataCriacao;
    }
}
