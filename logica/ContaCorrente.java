package logica;

public class ContaCorrente extends Conta {
    float taxaDeOperacao;

    public ContaCorrente(int numero) {
        
        super(numero);
    }
    public void taxaDeOperacao(){
        double tempSaldo = ContaCorrente.getSaldo;
        double newSaldo = tempSaldo - 2;
        setSaldo(newSaldo);
    }
    
}
