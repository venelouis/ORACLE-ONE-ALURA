public class ModeloCarro extends Carro {
    private String marca;
    private int anoFabricacao;
    
    // Construtor
    public ModeloCarro(String marca, String modelo, int anoFabricacao) {
        super();
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    
    @Override
    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO MODELO ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Preços por ano:");
        for (int i = 0; i < precosPorAno.length; i++) {
            System.out.println("  Ano " + (i + 1) + ": R$ " + String.format("%.2f", precosPorAno[i]));
        }
        System.out.println("Menor preço: R$ " + String.format("%.2f", calcularMenorPreco()));
        System.out.println("Maior preço: R$ " + String.format("%.2f", calcularMaiorPreco()));
        System.out.println("Diferença de preço: R$ " + String.format("%.2f", 
                          calcularMaiorPreco() - calcularMenorPreco()));
    }
    
    public static void main(String[] args) {
        // Criando instância específica
        ModeloCarro civic = new ModeloCarro("Honda", "Civic", 2020);
        
        // Definindo preços para 3 anos
        civic.definirPrecos(85000.00, 90000.00, 95000.00);
        
        // Exibindo informações
        civic.exibirInformacoes();
        
        System.out.println("\n--- Outro exemplo ---");
        
        ModeloCarro corolla = new ModeloCarro("Toyota", "Corolla", 2021);
        corolla.definirPrecos(78000.00, 82000.00, 86000.00);
        corolla.exibirInformacoes();
    }
}
