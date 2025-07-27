public class VerificadorPrimo extends NumerosPrimos {
    
    // Método específico da subclasse
    public void verificarSeEhPrimo(int numero) {
        boolean ehPrimo = verificarPrimalidade(numero);
        
        if (ehPrimo) {
            System.out.println("✅ O número " + numero + " É um número primo!");
        } else {
            System.out.println("❌ O número " + numero + " NÃO é um número primo.");
        }
        
        // Informações adicionais
        if (numero <= 1) {
            System.out.println("   Motivo: Números menores ou iguais a 1 não são considerados primos.");
        } else if (numero == 2) {
            System.out.println("   Informação: 2 é o único número primo par.");
        } else if (numero % 2 == 0) {
            System.out.println("   Motivo: É divisível por 2.");
        } else if (!ehPrimo && numero > 2) {
            // Encontrar um divisor para explicar
            for (int i = 3; i <= Math.sqrt(numero); i += 2) {
                if (numero % i == 0) {
                    System.out.println("   Motivo: É divisível por " + i + " (" + numero + " ÷ " + i + " = " + (numero/i) + ")");
                    break;
                }
            }
        }
    }
    
    public void verificarIntervalo(int inicio, int fim) {
        System.out.println("=== VERIFICAÇÃO DE INTERVALO [" + inicio + " - " + fim + "] ===");
        int contadorPrimos = 0;
        
        for (int i = inicio; i <= fim; i++) {
            if (verificarPrimalidade(i)) {
                System.out.println(i + " é primo");
                contadorPrimos++;
            }
        }
        
        System.out.println("Total de primos no intervalo: " + contadorPrimos);
    }
    
    public void analisarNumero(int numero) {
        System.out.println("=== ANÁLISE COMPLETA DO NÚMERO " + numero + " ===");
        verificarSeEhPrimo(numero);
        
        if (numero > 1) {
            System.out.println("Próximo primo maior: " + encontrarProximoPrimo(numero));
            if (numero > 2) {
                System.out.println("Primo anterior: " + encontrarPrimoAnterior(numero));
            }
        }
    }
    
    private int encontrarProximoPrimo(int numero) {
        int candidato = numero + 1;
        while (!verificarPrimalidade(candidato)) {
            candidato++;
        }
        return candidato;
    }
    
    private int encontrarPrimoAnterior(int numero) {
        for (int i = numero - 1; i >= 2; i--) {
            if (verificarPrimalidade(i)) {
                return i;
            }
        }
        return 2; // Menor primo
    }
    
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        
        // Testando números específicos
        int[] numerosParaTestar = {2, 17, 25, 29, 100, 97};
        
        for (int numero : numerosParaTestar) {
            verificador.verificarSeEhPrimo(numero);
            System.out.println();
        }
        
        // Análise completa
        verificador.analisarNumero(50);
        
        System.out.println();
        
        // Verificando intervalo
        verificador.verificarIntervalo(10, 30);
    }
}
