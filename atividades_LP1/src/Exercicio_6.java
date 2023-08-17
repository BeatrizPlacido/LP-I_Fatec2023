import java.util.Scanner;
public class Exercicio_6 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
		/*input*/
		
		System.out.print("Informe o valor da base: ");
		int base = sc.nextInt();	
		System.out.print("Informe o valor da altura: ");
		int altura = sc.nextInt();
		
		int area;
		area = base * altura;
		
		System.out.println("Área do retângulo = "+area);
		}
	}
}