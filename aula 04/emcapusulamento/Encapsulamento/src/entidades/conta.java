package entidades;

public class conta {
    public String titular;
    public double saldo;

    public conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void depositar(double valor){
        if (valor<=0) {
            System.out.println("Valor invalido");
        } else {
            this.saldo += valor;
            System.out.println("Saldo depositado com sucesso");
        }
    }

    public void sacar(double valor){
        if (valor<=0 && valor > this.saldo) {
            System.out.println("Valor invalido");
        } else  {
            this.saldo -= valor;
            System.out.println("Saldo sacado com sucesso");
        }
    }
}
