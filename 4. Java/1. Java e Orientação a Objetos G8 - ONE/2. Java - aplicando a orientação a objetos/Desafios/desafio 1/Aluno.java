public class Aluno {
    private String nome;
    private int idade;
    
    // Construtor padrão
    public Aluno() {
    }
    
    // Construtor com parâmetros
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    // Métodos getter e setter
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO ALUNO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }
    
    public static void main(String[] args) {
        // Criando uma instância da classe Aluno
        Aluno aluno = new Aluno();
        
        // Atribuindo valores aos atributos
        aluno.setNome("João Silva");
        aluno.setIdade(20);
        
        // Exibindo as informações
        aluno.exibirInformacoes();
        
        // Exemplo alternativo usando construtor com parâmetros
        System.out.println("\n--- Outro exemplo ---");
        Aluno aluno2 = new Aluno("Maria Santos", 22);
        aluno2.exibirInformacoes();
    }
}
