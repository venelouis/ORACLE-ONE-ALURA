//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println("Catálogo de Filmes (Minha Netflix)");
        System.out.println("Filme: Top Gun: Marverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean includioNoPlapo = true;
        double notaDoFilme = 8.1;
        // médica calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Média: " + media);

        String sinopse;
        
        sinopse = """
        Filme Top Gun
        Filme de aventura com galã dos anos 80
        Muito bom!
        Ano de lançamento
        """ + anoDeLancamento;
                
        System.out.println("Sinopse: " + sinopse);

    }
}