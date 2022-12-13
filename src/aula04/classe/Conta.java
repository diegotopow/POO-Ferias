package aula04.classe;

public class Conta {
    private double saldo;

    public void depositar(double valor){
        if(valor < 0){
            System.out.println("Não pode depositar valor negativo.");
         }else{
            saldo = saldo + valor;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
        }
    }
    
}
