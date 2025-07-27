public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;
    private boolean tarifaCobrada;
    
    // Construtor
    public ContaCorrente(int numeroConta, String titular, double tarifaMensal) {
        super(numeroConta, titular);
        this.tarifaMensal = tarifaMensal;
        this.tarifaCobrada = false;
    }
    
    // Método específico da subclasse
    public void cobrarTarifaMensal() {
        if (!tarifaCobrada) {
            if (saldo >= tarifaMensal) {
                saldo -= tarifaMensal;
                tarifaCobrada = true;
                System.out.println("Tarifa mensal de R$ " + String.format("%.2f", tarifaMensal) + " cobrada!");
                System.out.println("Saldo após cobrança: R$ " + String.format("%.2f", saldo));
            } else {
                System.out.println("Saldo insuficiente para cobrança da tarifa mensal!");
                System.out.println("Tarifa: R$ " + String.format("%.2f", tarifaMensal) + 
                                 " | Saldo disponível: R$ " + String.format("%.2f", saldo));
            }
        } else {
            System.out.println("Tarifa mensal já foi cobrada este mês!");
        }
    }
    
    public void resetarTarifa() {
        this.tarifaCobrada = false;
        System.out.println("Status da tarifa resetado para o próximo mês.");
    }
    
    @Override
    public void consultarSaldo() {
        System.out.println("=== CONSULTA DE SALDO - CONTA CORRENTE ===");
        System.out.println("Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
        System.out.println("Tarifa mensal: R$ " + String.format("%.2f", tarifaMensal));
        System.out.println("Tarifa cobrada este mês: " + (tarifaCobrada ? "Sim" : "Não"));
    }
    
    @Override
    public void sacar(double valor) {
        // Verifica se há tarifa pendente antes do saque
        if (!tarifaCobrada && saldo >= tarifaMensal) {
            System.out.println("Atenção: Há tarifa mensal pendente de R$ " + 
                             String.format("%.2f", tarifaMensal));
        }
        super.sacar(valor);
    }
    
    // Getters e Setters específicos
    public double getTarifaMensal() {
        return tarifaMensal;
    }
    
    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }
    
    public boolean isTarifaCobrada() {
        return tarifaCobrada;
    }
    
    public static void main(String[] args) {
        // Testando herança
        System.out.println("=== CONTA BANCÁRIA NORMAL ===");
        ContaBancaria contaNormal = new ContaBancaria(12345, "João Silva");
        contaNormal.depositar(1000.00);
        contaNormal.sacar(200.00);
        contaNormal.consultarSaldo();
        
        System.out.println("\n=== CONTA CORRENTE ===");
        ContaCorrente contaCorrente = new ContaCorrente(67890, "Maria Santos", 25.00);
        contaCorrente.depositar(1500.00);
        contaCorrente.consultarSaldo();
        
        // Cobrando tarifa
        contaCorrente.cobrarTarifaMensal();
        
        // Tentando cobrar novamente
        contaCorrente.cobrarTarifaMensal();
        
        contaCorrente.sacar(300.00);
        contaCorrente.consultarSaldo();
        
        // Resetando para próximo mês
        contaCorrente.resetarTarifa();
        contaCorrente.cobrarTarifaMensal();
    }
}
