package src.exercicio2;

public class Caixa {
    private double saldo;
    private double valor;
    private int lancamentosCredito;
    private int lancamentosDebito;

    public Caixa() {
        this.saldo = 1000.0;
        this.valor = valor;
        this.lancamentosCredito = 0;
        this.lancamentosDebito = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getLancamentosCredito() {
        return lancamentosCredito;
    }

    public void setLancamentosCredito(int lancamentosCredito) {
        this.lancamentosCredito = lancamentosCredito;
    }

    public int getLancamentosDebito() {
        return lancamentosDebito;
    }

    public void setLancamentosDebito(int lancamentosDebito) {
        this.lancamentosDebito = lancamentosDebito;
    }

    public void credito(double valor) {
        saldo += valor;
        lancamentosCredito++;
    }


    public void debito(double valor) {
        saldo -= valor;
        lancamentosDebito++;
    }

}