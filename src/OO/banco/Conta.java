package OO.banco;

import java.time.LocalDate;
import java.util.Random;

public abstract class Conta {

    private int idConta;
    private int idPessoa;
    private double saldo = 0;
    private double limiteSaqueDiario = 1000;
    private int tipoConta; // 1- Corrente | 2- Poupança
    private LocalDate dataCriacao;
    Cliente cliente;


    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public int idadeCliente(){
        return cliente.getIdade();
    }

    public Long cpfCliente(){
        return cliente.getCpf();
    }


    public int getIdConta() {
        return idConta;
    }

    void gerarIdConta() {
        Random rand = new Random(5);
        this.idConta = rand.nextInt(99999);

    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        Random rand = new Random(4);
        this.idPessoa = rand.nextInt(9999);
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

    public String getTipoConta() {
        String tipoDaConta = "";
        if (tipoConta == 1){
            tipoDaConta = "Conta Corrente";
        } else if (tipoConta == 2) {
            tipoDaConta = "Conta Poupança";
        }
        return tipoDaConta;
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
