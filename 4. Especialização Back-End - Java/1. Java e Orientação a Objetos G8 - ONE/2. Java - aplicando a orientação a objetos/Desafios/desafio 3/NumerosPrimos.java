import java.util.ArrayList;
import java.util.List;

public class NumerosPrimos {
    
    public boolean verificarPrimalidade(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    public List<Integer> listarPrimos(int limite) {
        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= limite; i++) {
            if (verificarPrimalidade(i)) {
                primos.add(i);
            }
        }
        return primos;
    }
    
    public void exibirPrimos(int limite) {
        List<Integer> primos = listarPrimos(limite);
        System.out.println("Números primos até " + limite + ":");
        System.out.println(primos);
        System.out.println("Total de primos encontrados: " + primos.size());
    }
}
