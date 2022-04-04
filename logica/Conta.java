package logica;

public abstract class Conta {
    protected int numConta;
    protected double saldo;

    public Conta(int numero) {
        this.numConta = numero;
        saldo = 0;
    }

    public int getNumero() {
        return this.numConta;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (saldo >= valor){
            saldo -= valor;
        }
    }
}