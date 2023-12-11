import java.util.Scanner;
public class Exercicio_12 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			System.out.print("Temperatura em Fahrenheit: ");
			double temp_fahrenheit = sc.nextDouble();
			
			double temp_celsius;
			
			temp_celsius = (temp_fahrenheit - 32) * 5 / 9;
			
			System.out.println("Temperatura em Celsius: "+temp_celsius);
		}
	}
}
