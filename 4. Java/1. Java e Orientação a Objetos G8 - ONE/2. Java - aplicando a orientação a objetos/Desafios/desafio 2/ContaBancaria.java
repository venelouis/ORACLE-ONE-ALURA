public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular; // Atributo público conforme solicitado
    
    // Construtor
    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }
    
    // Getter e Setter para numeroConta
    public int getNumeroConta() {
        return numeroConta;
    }
    
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    // Getter e Setter para saldo
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    // Métodos auxiliares para operações bancárias
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }
    
    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saque inválido! Verifique o valor ou saldo disponível.");
        }
    }
    
    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DA CONTA ===");
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }
    
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(12345, "João Silva");
        
        conta.depositar(1000.0);
        conta.sacar(250.0);
        conta.exibirInformacoes();
        
        // Testando getters e setters
        System.out.println("\nSaldo atual: R$ " + conta.getSaldo());
        conta.setSaldo(1500.0);
        System.out.println("Novo saldo: R$ " + conta.getSaldo());
    }
}
