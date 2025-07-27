public class Carro {
    private String modelo;
    private int ano;
    private String cor;
    
    // Construtor
    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }
    
    public void exibirFichaTecnica() {
        System.out.println("=== FICHA TÉCNICA DO CARRO ===");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Idade do carro: " + calcularIdade() + " anos");
    }
    
    public int calcularIdade() {
        int anoAtual = 2025; // Ano atual
        return anoAtual - ano;
    }
    
    public static void main(String[] args) {
        Carro carro = new Carro("Honda Civic", 2020, "Preto");
        carro.exibirFichaTecnica();
        
        System.out.println("\nIdade específica: " + carro.calcularIdade() + " anos");
    }
}
