public class Cachorro extends Animal {
    private String raca;
    private boolean estaAlegre;
    
    // Construtor
    public Cachorro(String nome, String raca) {
        super(nome, "Cachorro");
        this.raca = raca;
        this.estaAlegre = true;
    }
    
    @Override
    public void emitirSom() {
        System.out.println(nome + " está latindo: Au au au!");
    }
    
    // Método específico da subclasse
    public void abanarRabo() {
        System.out.println(nome + " está abanando o rabo alegremente! 🐕");
        this.estaAlegre = true;
    }
    
    public void buscarObjeto(String objeto) {
        System.out.println(nome + " foi buscar " + objeto + " e trouxe de volta!");
        abanarRabo();
    }
    
    public void darPata() {
        System.out.println(nome + " deu a patinha!");
    }
    
    @Override
    public void comer() {
        System.out.println(nome + " está comendo ração com muito apetite!");
    }
    
    public String getRaca() {
        return raca;
    }
    
    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public boolean isEstaAlegre() {
        return estaAlegre;
    }
    
    public void setEstaAlegre(boolean estaAlegre) {
        this.estaAlegre = estaAlegre;
    }
    
    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO CACHORRO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Está alegre: " + (estaAlegre ? "Sim" : "Não"));
    }
}
