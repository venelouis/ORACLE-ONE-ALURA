import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Double> notas;
    
    // Construtor
    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new ArrayList<>();
    }
    
    // Construtor padrão
    public Aluno() {
        this.notas = new ArrayList<>();
    }
    
    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // Getter e Setter para notas
    public List<Double> getNotas() {
        return notas;
    }
    
    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
    
    // Método para adicionar uma nota
    public void adicionarNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.notas.add(nota);
            System.out.println("Nota " + nota + " adicionada com sucesso!");
        } else {
            System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
        }
    }
    
    // Método para calcular a média das notas
    public double calcularMedia() {
        if (this.notas.isEmpty()) {
            System.out.println("Nenhuma nota foi registrada ainda.");
            return 0.0;
        }
        
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        
        return soma / this.notas.size();
    }
    
    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO ALUNO ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Notas: " + this.notas);
        System.out.println("Número de notas: " + this.notas.size());
        System.out.println("Média: " + String.format("%.2f", calcularMedia()));
        
        double media = calcularMedia();
        if (media >= 7.0) {
            System.out.println("Status: APROVADO");
        } else if (media >= 5.0) {
            System.out.println("Status: EM RECUPERAÇÃO");
        } else {
            System.out.println("Status: REPROVADO");
        }
    }
    
    public static void main(String[] args) {
        // Criando aluno
        Aluno aluno = new Aluno("Pedro Santos");
        
        // Adicionando notas
        aluno.adicionarNota(8.5);
        aluno.adicionarNota(7.0);
        aluno.adicionarNota(9.2);
        aluno.adicionarNota(6.8);
        
        aluno.exibirInformacoes();
        
        System.out.println("\n--- Testando outro aluno ---");
        
        // Testando com setters
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Maria Fernanda");
        aluno2.adicionarNota(9.0);
        aluno2.adicionarNota(8.7);
        aluno2.adicionarNota(9.5);
        
        System.out.println("Média do(a) " + aluno2.getNome() + ": " + 
                          String.format("%.2f", aluno2.calcularMedia()));
    }
}
