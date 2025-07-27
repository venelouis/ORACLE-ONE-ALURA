public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    
    @Override
    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
    
    @Override
    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
    
    // Método para exibir conversão Celsius para Fahrenheit
    public void exibirConversaoCelsiusFahrenheit(double celsius) {
        double fahrenheit = celsiusParaFahrenheit(celsius);
        System.out.printf("%.1f°C = %.1f°F%n", celsius, fahrenheit);
    }
    
    // Método para exibir conversão Fahrenheit para Celsius
    public void exibirConversaoFahrenheitCelsius(double fahrenheit) {
        double celsius = fahrenheitParaCelsius(fahrenheit);
        System.out.printf("%.1f°F = %.1f°C%n", fahrenheit, celsius);
    }
    
    // Método main para demonstração
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        
        System.out.println("=== Conversor de Temperatura ===");
        
        System.out.println("\nConversões Celsius → Fahrenheit:");
        conversor.exibirConversaoCelsiusFahrenheit(0);
        conversor.exibirConversaoCelsiusFahrenheit(25);
        conversor.exibirConversaoCelsiusFahrenheit(37);
        conversor.exibirConversaoCelsiusFahrenheit(100);
        
        System.out.println("\nConversões Fahrenheit → Celsius:");
        conversor.exibirConversaoFahrenheitCelsius(32);
        conversor.exibirConversaoFahrenheitCelsius(77);
        conversor.exibirConversaoFahrenheitCelsius(98.6);
        conversor.exibirConversaoFahrenheitCelsius(212);
    }
}