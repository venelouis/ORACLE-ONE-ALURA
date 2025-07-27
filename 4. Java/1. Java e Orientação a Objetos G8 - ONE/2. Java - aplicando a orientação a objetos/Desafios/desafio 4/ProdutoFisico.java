public class ProdutoFisico implements Calculavel {
    private String nome;
    private double precoBase;
    private double taxaEnvio;
    private double taxaEmbalagem;
    
    // Construtor
    public ProdutoFisico(String nome, double precoBase, double taxaEnvio, double taxaEmbalagem) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.taxaEnvio = taxaEnvio;
        this.taxaEmbalagem = taxaEmbalagem;
    }
    
    // Construtor com taxas padrão
    public ProdutoFisico(String nome, double precoBase) {
        this(nome, precoBase, 15.0, 5.0); // Taxas padrão
    }
    
    @Override
    public double calcularPrecoFinal() {
        return precoBase + taxaEnvio + taxaEmbalagem;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPrecoBase() {
        return precoBase;
    }
    
    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
    
    public double getTaxaEnvio() {
        return taxaEnvio;
    }
    
    public void setTaxaEnvio(double taxaEnvio) {
        this.taxaEnvio = taxaEnvio;
    }
    
    public double getTaxaEmbalagem() {
        return taxaEmbalagem;
    }
    
    public void setTaxaEmbalagem(double taxaEmbalagem) {
        this.taxaEmbalagem = taxaEmbalagem;
    }
    
    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("=== Informações do Produto Físico ===");
        System.out.println("Nome: " + nome);
        System.out.printf("Preço base: R$ %.2f%n", precoBase);
        System.out.printf("Taxa de envio: R$ %.2f%n", taxaEnvio);
        System.out.printf("Taxa de embalagem: R$ %.2f%n", taxaEmbalagem);
        System.out.printf("Preço final: R$ %.2f%n", calcularPrecoFinal());
    }
    
    // Método main para demonstração
    public static void main(String[] args) {
        ProdutoFisico produto1 = new ProdutoFisico("Smartphone", 899.00, 25.0, 10.0);
        produto1.exibirInformacoes();
        
        System.out.println();
        
        ProdutoFisico produto2 = new ProdutoFisico("Notebook", 2500.00);
        produto2.exibirInformacoes();
    }
}