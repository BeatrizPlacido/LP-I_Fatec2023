import java.util.Scanner;
public class Exercicio_9 {
	
	public static void main(String [] args) {
		try(Scanner sc = new Scanner (System.in)){
			System.out.print("Salário atual: ");
			double salario_atual = sc.nextDouble();
			System.out.print("Percentual de aumento: ");
			double percentual = sc.nextDouble();
			
			double salario_ajustado;
			
			salario_ajustado = salario_atual * (1+(percentual/100));
			
			System.out.println("Salário ajustado: "+salario_ajustado);
		}
	}

}
