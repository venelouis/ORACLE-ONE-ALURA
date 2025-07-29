public class Produto {
    private String nome;
    private double preco;
    
    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    // Construtor padrão
    public Produto() {
    }
    
    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // Getter e Setter para preco
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    // Método para aplicar desconto
    public void aplicarDesconto(double percentualDesconto) {
        if (percentualDesconto > 0 && percentualDesconto <= 100) {
            double valorDesconto = this.preco * (percentualDesconto / 100);
            this.preco = this.preco - valorDesconto;
            System.out.println("Desconto de " + percentualDesconto + "% aplicado!");
            System.out.println("Valor do desconto: R$ " + String.format("%.2f", valorDesconto));
            System.out.println("Novo preço: R$ " + String.format("%.2f", this.preco));
        } else {
            System.out.println("Percentual de desconto inválido! Digite um valor entre 0 e 100.");
        }
    }
    
    public void exibirDetalhes() {
        System.out.println("=== DETALHES DO PRODUTO ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$ " + String.format("%.2f", this.preco));
    }
    
    public static void main(String[] args) {
        // Criando produto
        Produto produto = new Produto("Notebook Gamer", 2500.00);
        produto.exibirDetalhes();
        
        System.out.println();
        
        // Aplicando desconto
        produto.aplicarDesconto(15); // 15% de desconto
        
        System.out.println();
        
        // Testando com outro produto usando setters
        Produto produto2 = new Produto();
        produto2.setNome("Mouse Wireless");
        produto2.setPreco(89.90);
        
        produto2.exibirDetalhes();
        produto2.aplicarDesconto(25); // 25% de desconto
    }
}
