public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private double altura;
    private double largura;
    
    // Construtor
    public CalculadoraSalaRetangular(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }
    
    @Override
    public double calcularArea() {
        return altura * largura;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }
    
    // Getters e Setters
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getLargura() {
        return largura;
    }
    
    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    // Método para exibir informações da sala
    public void exibirInformacoes() {
        System.out.println("=== Informações da Sala Retangular ===");
        System.out.printf("Dimensões: %.2f x %.2f metros%n", altura, largura);
        System.out.printf("Área: %.2f m²%n", calcularArea());
        System.out.printf("Perímetro: %.2f m%n", calcularPerimetro());
    }
    
    // Método main para demonstração
    public static void main(String[] args) {
        CalculadoraSalaRetangular sala1 = new CalculadoraSalaRetangular(4.0, 5.0);
        sala1.exibirInformacoes();
        
        System.out.println();
        
        CalculadoraSalaRetangular sala2 = new CalculadoraSalaRetangular(3.5, 6.2);
        sala2.exibirInformacoes();
    }
}