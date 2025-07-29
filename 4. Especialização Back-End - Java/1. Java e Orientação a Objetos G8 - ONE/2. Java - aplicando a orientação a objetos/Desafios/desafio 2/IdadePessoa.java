public class IdadePessoa {
    private String nome;
    private int idade;
    
    // Construtor
    public IdadePessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    // Construtor padrão
    public IdadePessoa() {
    }
    
    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // Getter e Setter para idade
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    // Método para verificar se a pessoa é maior de idade
    public void verificarIdade() {
        if (this.idade >= 18) {
            System.out.println(this.nome + " é maior de idade (" + this.idade + " anos).");
        } else {
            System.out.println(this.nome + " é menor de idade (" + this.idade + " anos).");
        }
    }
    
    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
        verificarIdade();
    }
    
    public static void main(String[] args) {
        // Testando com pessoa maior de idade
        IdadePessoa pessoa1 = new IdadePessoa("Ana Santos", 25);
        pessoa1.exibirInformacoes();
        
        System.out.println();
        
        // Testando com pessoa menor de idade
        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Carlos Silva");
        pessoa2.setIdade(16);
        pessoa2.exibirInformacoes();
        
        System.out.println();
        
        // Testando limite de maioridade
        IdadePessoa pessoa3 = new IdadePessoa("Maria Oliveira", 18);
        pessoa3.verificarIdade();
    }
}
