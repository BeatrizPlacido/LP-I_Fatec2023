import java.util.Scanner;
public class Exercicio_7 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
		/*input*/
		
		System.out.print("Informe a idade em anos: ");
		int anos = sc.nextInt();
		System.out.print("Meses: ");
		int meses = sc.nextInt();
		System.out.print("Dias: ");
		int dias = sc.nextInt();
		
		int idade;
		idade = dias + (meses * 30) + (anos * 365);
		
		System.out.println("Idade em dias: "+idade);
		}
	}
}
