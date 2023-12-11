import java.util.Scanner;
public class Exercicio_10 {
	
	public static void main(String [] args) {
		try (Scanner sc = new Scanner (System.in)){
			System.out.print("nforme o custo de fábrica: ");
			double custo_fabrica = sc.nextDouble();
			
			double distribuidor;
			double impostos;
			double custo_final;
			
			distribuidor = 0.28 * custo_fabrica;
			impostos = 0.45 * custo_fabrica;
			
			custo_final = custo_fabrica + distribuidor + impostos;
			
			System.out.println("Valor final: "+custo_final);
			
		}
	}
}
