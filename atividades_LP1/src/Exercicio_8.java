import java.util.Scanner;
public class Exercicio_8 {
	
	public static void main(String[] args) {	
		try (Scanner sc = new Scanner (System.in)){
			System.out.print("Informe a quantidade de eleitores: ");
			int eleitores = sc.nextInt();
			System.out.print("Votos nulos: ");
			int nulos = sc.nextInt();
			System.out.print("Votos brancos: ");
			int brancos = sc.nextInt();
			System.out.print("Votos válidos: ");
			int validos = sc.nextInt();
			
			double votos_nulos;
			double votos_brancos;
			double votos_validos;
			
			votos_nulos = ((double)nulos/eleitores)*100;
			votos_brancos = ((double)brancos/eleitores)*100;
			votos_validos = ((double)validos/eleitores)*100;
			
			System.out.println("Votos nulos: "+votos_nulos+"%");
			System.out.println("Votos brancos: "+votos_brancos+"%");
			System.out.println("Votos válidos: "+votos_validos+"%");
			
			
		}
	}

}
