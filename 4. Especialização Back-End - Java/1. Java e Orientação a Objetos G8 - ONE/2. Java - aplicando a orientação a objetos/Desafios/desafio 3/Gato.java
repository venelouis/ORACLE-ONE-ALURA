public class Gato extends Animal {
    private String cor;
    private boolean estaRonronando;
    
    // Construtor
    public Gato(String nome, String cor) {
        super(nome, "Gato");
        this.cor = cor;
        this.estaRonronando = false;
    }
    
    @Override
    public void emitirSom() {
        System.out.println(nome + " está miando: Miau miau!");
    }
    
    // Método específico da subclasse
    public void arranharMoveis() {
        System.out.println(nome + " está arranhando os móveis! 🐱");
    }
    
    public void ronronar() {
        System.out.println(nome + " está ronronando de contentamento: Purrr...");
        this.estaRonronando = true;
    }
    
    public void subirEmLugaresAltos() {
        System.out.println(nome + " subiu em um lugar alto e está observando tudo!");
    }
    
    public void brincarComNovelo() {
        System.out.println(nome + " está brincando com um novelo de lã!");
        ronronar();
    }
    
    @Override
    public void comer() {
        System.out.println(nome + " está comendo ração delicadamente.");
        ronronar();
    }
    
    @Override
    public void dormir() {
        System.out.println(nome + " está dormindo enroscado como uma bolinha...");
        this.estaRonronando = true;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public boolean isEstaRonronando() {
        return estaRonronando;
    }
    
    public void setEstaRonronando(boolean estaRonronando) {
        this.estaRonronando = estaRonronando;
    }
    
    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO GATO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("Está ronronando: " + (estaRonronando ? "Sim" : "Não"));
    }
    
    public static void main(String[] args) {
        // Testando polimorfismo
        System.out.println("=== DEMONSTRAÇÃO DE POLIMORFISMO ===");
        
        Animal animal1 = new Cachorro("Rex", "Golden Retriever");
        Animal animal2 = new Gato("Mimi", "Branco");
        
        // Chamando método sobrescrito
        animal1.emitirSom();
        animal2.emitirSom();
        
        System.out.println("\n=== MÉTODOS ESPECÍFICOS ===");
        
        // Usando referências específicas
        Cachorro dog = new Cachorro("Buddy", "Labrador");
        Gato cat = new Gato("Luna", "Preto");
        
        dog.abanarRabo();
        dog.buscarObjeto("a bolinha");
        
        cat.arranharMoveis();
        cat.brincarComNovelo();
        
        System.out.println("\n=== INFORMAÇÕES ===");
        dog.exibirInformacoes();
        System.out.println();
        cat.exibirInformacoes();
    }
}
