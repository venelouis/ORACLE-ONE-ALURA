public class ConversaoDeTemperaturas {
    public static void main(String[] args) {
        // Variável para a temperatura em Celsius
        double temperaturaCelsius = 25.0;

        // Conversão para Fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        // Exibição do valor convertido
        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);

        // Variável inteira para a temperatura em Fahrenheit sem casas decimais
        // Convert the double value to an integer by typecasting
        int temperaturaFahrenheitInteira = (int) temperaturaFahrenheit;

        // Exibição do valor inteiro
        System.out.println("Temperatura em Fahrenheit (sem casas decimais): " + temperaturaFahrenheitInteira);
    }
}
