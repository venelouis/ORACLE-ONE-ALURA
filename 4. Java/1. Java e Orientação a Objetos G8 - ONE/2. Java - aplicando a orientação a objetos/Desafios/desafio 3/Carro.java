public class Carro {
    protected String modelo;
    protected double[] precosPorAno = new double[3]; // Para 3 anos
    
    // Construtor
    public Carro() {
    }
    
    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precosPorAno[0] = precoAno1;
        this.precosPorAno[1] = precoAno2;
        this.precosPorAno[2] = precoAno3;
    }
    
    public double calcularMenorPreco() {
        double menor = precosPorAno[0];
        for (double preco : precosPorAno) {
            if (preco < menor) {
                menor = preco;
            }
        }
        return menor;
    }
    
    public double calcularMaiorPreco() {
        double maior = precosPorAno[0];
        for (double preco : precosPorAno) {
            if (preco > maior) {
                maior = preco;
            }
        }
        return maior;
    }
    
    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO CARRO ===");
        System.out.println("Modelo: " + modelo);
        System.out.println("Preços por ano:");
        for (int i = 0; i < precosPorAno.length; i++) {
            System.out.println("  Ano " + (i + 1) + ": R$ " + String.format("%.2f", precosPorAno[i]));
        }
        System.out.println("Menor preço: R$ " + String.format("%.2f", calcularMenorPreco()));
        System.out.println("Maior preço: R$ " + String.format("%.2f", calcularMaiorPreco()));
    }
}
