public class Livro implements Calculavel {
    private String titulo;
    private String autor;
    private double precoBase;
    private double descontoPromocional; // percentual de desconto
    
    // Construtor
    public Livro(String titulo, String autor, double precoBase, double descontoPromocional) {
        this.titulo = titulo;
        this.autor = autor;
        this.precoBase = precoBase;
        this.descontoPromocional = descontoPromocional;
    }
    
    // Construtor sem desconto
    public Livro(String titulo, String autor, double precoBase) {
        this(titulo, autor, precoBase, 0.0);
    }
    
    @Override
    public double calcularPrecoFinal() {
        return precoBase - (precoBase * descontoPromocional / 100);
    }
    
    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public double getPrecoBase() {
        return precoBase;
    }
    
    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
    
    public double getDescontoPromocional() {
        return descontoPromocional;
    }
    
    public void setDescontoPromocional(double descontoPromocional) {
        this.descontoPromocional = descontoPromocional;
    }
    
    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("=== Informações do Livro ===");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.printf("Preço base: R$ %.2f%n", precoBase);
        System.out.printf("Desconto: %.1f%%%n", descontoPromocional);
        System.out.printf("Preço final: R$ %.2f%n", calcularPrecoFinal());
    }
    
    // Método main para demonstração
    public static void main(String[] args) {
        Livro livro1 = new Livro("1984", "George Orwell", 45.00, 15.0);
        livro1.exibirInformacoes();
        
        System.out.println();
        
        Livro livro2 = new Livro("Clean Code", "Robert Martin", 89.90, 10.0);
        livro2.exibirInformacoes();
    }
}