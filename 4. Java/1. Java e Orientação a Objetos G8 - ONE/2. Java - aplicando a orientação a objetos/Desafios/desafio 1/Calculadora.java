public class Calculadora {
    
    public int calcularDobro(int numero) {
        return numero * 2;
    }
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultado = calc.calcularDobro(5);
        System.out.println("O dobro de 5 é: " + resultado);
    }
}
