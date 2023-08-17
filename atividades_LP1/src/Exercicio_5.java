import java.util.Scanner;
public class Exercicio_5 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
		/*input*/
		
		System.out.print("Informe um valor inteiro:");
		int x = sc.nextInt();
		
		int ant;
		ant = x - 1;
		
		System.out.println("Antecessor: "+ant);
		}
	}
}