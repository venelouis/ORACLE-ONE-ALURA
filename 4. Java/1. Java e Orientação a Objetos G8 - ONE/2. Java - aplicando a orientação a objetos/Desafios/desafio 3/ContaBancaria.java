public class ContaBancaria {
    protected int numeroConta;
    protected double saldo;
    protected String titular;
    
    // Construtor
    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + String.format("%.2f", this.saldo));
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }
    
    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + String.format("%.2f", this.saldo));
        } else if (valor > this.saldo) {
            System.out.println("Saldo insuficiente! Saldo disponível: R$ " + String.format("%.2f", this.saldo));
        } else {
            System.out.println("Valor de saque inválido!");
        }
    }
    
    public void consultarSaldo() {
        System.out.println("=== CONSULTA DE SALDO ===");
        System.out.println("Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
    }
    
    // Getters
    public int getNumeroConta() {
        return numeroConta;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getTitular() {
        return titular;
    }
    
    // Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }
}
