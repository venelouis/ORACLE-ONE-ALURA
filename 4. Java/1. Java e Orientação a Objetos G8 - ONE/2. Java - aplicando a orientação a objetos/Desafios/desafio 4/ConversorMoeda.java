public class ConversorMoeda implements ConversaoFinanceira {
    private double cotacaoDolar;
    
    // Construtor
    public ConversorMoeda(double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }
    
    // Construtor padrão com cotação aproximada
    public ConversorMoeda() {
        this.cotacaoDolar = 5.20; // Cotação padrão
    }
    
    @Override
    public double converterDolarParaReal(double valorDolar) {
        return valorDolar * cotacaoDolar;
    }
    
    // Getters e Setters
    public double getCotacaoDolar() {
        return cotacaoDolar;
    }
    
    public void setCotacaoDolar(double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }
    
    // Método para exibir conversão
    public void exibirConversao(double valorDolar) {
        double valorReal = converterDolarParaReal(valorDolar);
        System.out.printf("US$ %.2f = R$ %.2f (Cotação: R$ %.2f)%n", 
                         valorDolar, valorReal, cotacaoDolar);
    }
    
    // Método main para demonstração
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda(5.25);
        
        System.out.println("=== Conversor de Moeda ===");
        conversor.exibirConversao(100.0);
        conversor.exibirConversao(250.0);
        conversor.exibirConversao(50.0);
        
        // Alterando cotação
        conversor.setCotacaoDolar(5.10);
        System.out.println("\nApós alteração da cotação:");
        conversor.exibirConversao(100.0);
    }
}