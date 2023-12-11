import java.util.Scanner;
public class Exercicio_11 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			System.out.print("Carros vendidos: ");
			int carros_vendidos = sc.nextInt();
			System.out.print("Valor total de vendas: ");
			double vendas = sc.nextDouble();
			System.out.print("Salário fixo: ");
			double salario = sc.nextDouble();
			System.out.print("Valor por carro: ");
			double comissao = sc.nextDouble();
			
			double salario_final;
			
			salario_final = salario + (comissao * carros_vendidos) + (0.05 * vendas);
			
			System.out.println("Salário final: "+salario_final);
			
		}
	}
}
