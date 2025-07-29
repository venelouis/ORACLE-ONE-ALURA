public class Animal {
    protected String nome;
    protected String especie;
    
    // Construtor
    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }
    
    public Animal() {
    }
    
    public void emitirSom() {
        System.out.println("O animal está fazendo algum som...");
    }
    
    public void dormir() {
        System.out.println(nome + " está dormindo...");
    }
    
    public void comer() {
        System.out.println(nome + " está comendo...");
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEspecie() {
        return especie;
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
