package logica;

public class Conta {
    private int numConta;
    private double saldo;

    public Conta(int numero) {
        this.numConta = numero;
        saldo = 0;
    }

    public int getNumero() {
        return numConta;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (saldo >= valor){
            saldo -= valor;
        }
    }
}