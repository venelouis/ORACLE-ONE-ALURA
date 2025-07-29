public class Livro {
    private String titulo;
    private String autor;
    
    // Construtor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    // Construtor padrão
    public Livro() {
    }
    
    // Getter e Setter para titulo
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    // Getter e Setter para autor
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    // Método para exibir detalhes do livro
    public void exibirDetalhes() {
        System.out.println("=== DETALHES DO LIVRO ===");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
    }
    
    // Método adicional para verificar se o livro está completo
    public boolean isCompleto() {
        return this.titulo != null && !this.titulo.trim().isEmpty() &&
               this.autor != null && !this.autor.trim().isEmpty();
    }
    
    public void exibirResumo() {
        if (isCompleto()) {
            System.out.println("\"" + this.titulo + "\" por " + this.autor);
        } else {
            System.out.println("Informações do livro incompletas.");
        }
    }
    
    public static void main(String[] args) {
        // Criando livro com construtor
        Livro livro1 = new Livro("1984", "George Orwell");
        livro1.exibirDetalhes();
        
        System.out.println();
        
        // Criando livro com setters
        Livro livro2 = new Livro();
        livro2.setTitulo("Dom Casmurro");
        livro2.setAutor("Machado de Assis");
        livro2.exibirDetalhes();
        
        System.out.println();
        
        // Testando getters
        System.out.println("Título do primeiro livro: " + livro1.getTitulo());
        System.out.println("Autor do segundo livro: " + livro2.getAutor());
        
        System.out.println();
        
        // Testando método de resumo
        livro1.exibirResumo();
        livro2.exibirResumo();
        
        // Testando livro incompleto
        Livro livro3 = new Livro();
        livro3.setTitulo("O Cortiço");
        livro3.exibirResumo(); // Falta o autor
    }
}
