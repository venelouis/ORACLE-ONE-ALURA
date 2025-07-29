import java.util.ArrayList;
import java.util.List;

public class GeradorPrimo extends NumerosPrimos {
    
    // Método específico da subclasse
    public int gerarProximoPrimo(int numeroBase) {
        int candidato = numeroBase + 1;
        while (!verificarPrimalidade(candidato)) {
            candidato++;
        }
        System.out.println("Próximo primo após " + numeroBase + " é: " + candidato);
        return candidato;
    }
    
    public List<Integer> gerarSequenciaPrimos(int quantidade) {
        List<Integer> sequencia = new ArrayList<>();
        int numero = 2; // Primeiro primo
        
        while (sequencia.size() < quantidade) {
            if (verificarPrimalidade(numero)) {
                sequencia.add(numero);
            }
            numero++;
        }
        
        return sequencia;
    }
    
    public List<Integer> gerarPrimosEmIntervalo(int inicio, int fim) {
        List<Integer> primosNoIntervalo = new ArrayList<>();
        
        for (int i = Math.max(2, inicio); i <= fim; i++) {
            if (verificarPrimalidade(i)) {
                primosNoIntervalo.add(i);
            }
        }
        
        return primosNoIntervalo;
    }
    
    public void gerarEExibirPrimos(int quantidade) {
        System.out.println("=== GERANDO " + quantidade + " PRIMEIROS NÚMEROS PRIMOS ===");
        List<Integer> primos = gerarSequenciaPrimos(quantidade);
        
        System.out.println("Sequência gerada: " + primos);
        
        if (!primos.isEmpty()) {
            System.out.println("Menor primo: " + primos.get(0));
            System.out.println("Maior primo: " + primos.get(primos.size() - 1));
        }
    }
    
    public int gerarPrimoGemeo(int primo) {
        if (!verificarPrimalidade(primo)) {
            System.out.println(primo + " não é um número primo!");
            return -1;
        }
        
        // Verificar se primo+2 ou primo-2 também são primos (números primos gêmeos)
        if (verificarPrimalidade(primo + 2)) {
            System.out.println("Primos gêmeos encontrados: " + primo + " e " + (primo + 2));
            return primo + 2;
        } else if (primo > 2 && verificarPrimalidade(primo - 2)) {
            System.out.println("Primos gêmeos encontrados: " + (primo - 2) + " e " + primo);
            return primo - 2;
        } else {
            System.out.println(primo + " não possui um primo gêmeo.");
            return -1;
        }
    }
    
    @Override
    public void exibirPrimos(int limite) {
        List<Integer> primos = listarPrimos(limite);
        System.out.println("=== NÚMEROS PRIMOS GERADOS ATÉ " + limite + " ===");
        
        // Exibir em formato organizado
        int contador = 0;
        for (int primo : primos) {
            System.out.printf("%4d", primo);
            contador++;
            if (contador % 10 == 0) {
                System.out.println(); // Nova linha a cada 10 números
            }
        }
        
        if (contador % 10 != 0) {
            System.out.println();
        }
        
        System.out.println("Total de primos gerados: " + primos.size());
        
        if (!primos.isEmpty()) {
            System.out.println("Maior primo encontrado: " + primos.get(primos.size() - 1));
        }
    }
    
    public static void main(String[] args) {
        GeradorPrimo gerador = new GeradorPrimo();
        
        // Gerando próximo primo
        gerador.gerarProximoPrimo(10);
        gerador.gerarProximoPrimo(50);
        
        System.out.println();
        
        // Gerando sequência de primos
        gerador.gerarEExibirPrimos(15);
        
        System.out.println();
        
        // Exibindo primos até um limite
        gerador.exibirPrimos(50);
        
        System.out.println();
        
        // Testando primos gêmeos
        int[] primosParaTestar = {3, 5, 11, 17, 29, 41};
        System.out.println("=== TESTANDO PRIMOS GÊMEOS ===");
        for (int primo : primosParaTestar) {
            gerador.gerarPrimoGemeo(primo);
        }
        
        System.out.println();
        
        // Gerando primos em intervalo específico
        List<Integer> primosIntervalo = gerador.gerarPrimosEmIntervalo(20, 40);
        System.out.println("Primos entre 20 e 40: " + primosIntervalo);
    }
}
