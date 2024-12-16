import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input temperature value and unit
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Enter unit (C/F/K): ");
        char unit = sc.next().toUpperCase().charAt(0);
        
        // Perform conversion
        if (unit == 'C') {
            System.out.println("Fahrenheit: " + ((temp * 9/5) + 32) + "°F");
            System.out.println("Kelvin: " + (temp + 273.15) + " K");
        } else if (unit == 'F') {
            System.out.println("Celsius: " + ((temp - 32) * 5/9) + "°C");
            System.out.println("Kelvin: " + ((temp - 32) * 5/9 + 273.15) + " K");
        } else if (unit == 'K') {
            System.out.println("Celsius: " + (temp - 273.15) + "°C");
            System.out.println("Fahrenheit: " + ((temp - 273.15) * 9/5 + 32) + "°F");
        } else {
            System.out.println("Invalid unit.");
        }
    }
}
