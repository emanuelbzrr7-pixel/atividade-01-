public class Atividade02 {
    public static void main(String[] argas) {
// Temperatura fixa em Celsius para exmplo
        double celsius = 30.0;
        // Concersões
   double fahrenheit = (celsius * 9/5)+32;
   double kelvin = celsius + 273.15;
   // Saida formatada
        System.out.println("\nPràticas\n");
        System.out.printf("Temperatura em cesius:%.1f°C\n",celsius);
        System.out.printf("Temperatura em Fahrenheit:%.1f°F\n",fahrenheit);
        System.out.printf("Temperatura em kelvin:%.2fk\n",kelvin);
    }
}

