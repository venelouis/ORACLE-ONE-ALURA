public class Servico implements Vendavel {
    private String descricao;
    private double valorHora;
    private double desconto;
    
    public Servico(String descricao, double valorHora) {
        this.descricao = descricao;
        this.valorHora = valorHora;
        this.desconto = 0.0;
    }
    
    @Override
    public double calcularPrecoTotal(int quantidadeHoras) {
        double valorComDesconto = valorHora - (valorHora * desconto / 100);
        return valorComDesconto * quantidadeHoras;
    }
    
    @Override
    public void aplicarDesconto(double percentualDesconto) {
        this.desconto = percentualDesconto;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double getValorHora() {
        return valorHora;
    }
    
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double getDesconto() {
        return desconto;
    }
    
    public void exibirCalculoVenda(int quantidadeHoras) {
        System.out.println("=== Cálculo de Venda - Serviço ===");
        System.out.println("Serviço: " + descricao);
        System.out.printf("Valor por hora: R$ %.2f%n", valorHora);
        System.out.println("Quantidade de horas: " + quantidadeHoras);
        System.out.printf("Desconto aplicado: %.1f%%%n", desconto);
        System.out.printf("Preço total: R$ %.2f%n", calcularPrecoTotal(quantidadeHoras));
    }
    
    public static void main(String[] args) {
        Servico servico = new Servico("Consultoria em TI", 120.00);
        
        servico.exibirCalculoVenda(8);
        System.out.println();
        
        servico.aplicarDesconto(15.0);
        servico.exibirCalculoVenda(8);
    }
}