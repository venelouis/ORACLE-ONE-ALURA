public class TabuadaMultiplicacao implements Tabuada {
    
    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("=== Tabuada do " + numero + " ===");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d%n", numero, i, resultado);
        }
    }
    
    // Método para mostrar tabuada personalizada
    public void mostrarTabuadaPersonalizada(int numero, int limite) {
        System.out.println("=== Tabuada do " + numero + " (até " + limite + ") ===");
        for (int i = 1; i <= limite; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d%n", numero, i, resultado);
        }
    }
    
    // Método main para demonstração
    public static void main(String[] args) {
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        
        // Mostrando tabuada do 7
        tabuada.mostrarTabuada(7);
        
        System.out.println();
        
        // Mostrando tabuada do 5
        tabuada.mostrarTabuada(5);
        
        System.out.println();
        
        // Mostrando tabuada personalizada
        tabuada.mostrarTabuadaPersonalizada(3, 15);
    }
}