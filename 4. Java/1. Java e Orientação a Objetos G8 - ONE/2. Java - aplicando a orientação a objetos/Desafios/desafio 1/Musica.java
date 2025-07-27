public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private double avaliacao;
    private int numAvaliacoes;
    
    // Construtor
    public Musica(String titulo, String artista, int anoLancamento) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
        this.avaliacao = 0.0;
        this.numAvaliacoes = 0;
    }
    
    public void exibirFichaTecnica() {
        System.out.println("=== FICHA TÉCNICA ===");
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + calcularMediaAvaliacoes());
        System.out.println("Número de Avaliações: " + numAvaliacoes);
    }
    
    public void avaliarMusica(double nota) {
        if (nota >= 0 && nota <= 10) {
            avaliacao = (avaliacao * numAvaliacoes + nota) / (numAvaliacoes + 1);
            numAvaliacoes++;
            System.out.println("Avaliação registrada com sucesso!");
        } else {
            System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
        }
    }
    
    public double calcularMediaAvaliacoes() {
        if (numAvaliacoes > 0) {
            return Math.round(avaliacao * 100.0) / 100.0; // Arredonda para 2 casas decimais
        }
        return 0.0;
    }
    
    public static void main(String[] args) {
        Musica musica = new Musica("Bohemian Rhapsody", "Queen", 1975);
        
        musica.avaliarMusica(9.5);
        musica.avaliarMusica(8.7);
        musica.avaliarMusica(9.8);
        
        musica.exibirFichaTecnica();
    }
}
