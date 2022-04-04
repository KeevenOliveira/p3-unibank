package logica;

import java.util.ArrayList;
import java.util.Random;

public class Banco extends Conta {
    private ArrayList<Conta> contas = new ArrayList<Conta>();

    public Banco(int numero){
        super(numero);
    }
    
    public int criarConta() {
        Random r = new Random();
        int numero = Math.abs(r.nextInt());
        Conta newAccount = new Banco(numero);
        Boolean created = contas.add(newAccount);
        if(created){
            return numero;
        }
        throw new RuntimeException("Erro enquanto cria uma conta");
    }



    public void mostrarDados(int numero) {
        for(int i = 0; i < this.contas.size(); i++){
            Conta search = this.contas.get(i);
            if(search.numConta == numero){
                System.out.println("Saldo: " + search.saldo);
                System.out.println("Número da Conta: " + search.saldo);
            }
        }
    }

    public void depositar(int numero, double valor) {
        Conta c = null;
        for (Conta conta : contas) {
            if (conta.getNumero() == numero){
                conta.depositar(valor);
            }
        }
    }

    public double consultaSaldo(int numero) {
        Conta c = null;
        for (Conta conta : contas) {
            if (conta.getNumero() == numero){
                return conta.getSaldo();
            }
        }
        return 0;
    }

    public void sacarConta(int numero, double valor) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero){
                conta.sacar(valor);
            }
        }
    }

    public void transferir(int numeroOri, int numeroDest, double valor) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroOri){
                conta.sacar(valor);
            }

            if (conta.getNumero() == numeroDest){
                conta.depositar(valor);
            }
        }
    }
}