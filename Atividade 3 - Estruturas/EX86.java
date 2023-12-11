package estruturas;

import java.util.Scanner;

public class EX86 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vet = new int[10];
		System.out.println("Insira 10 valores:");
		for(int i=0; i< vet.length; i++) {
			vet[i]= sc.nextInt();		
		}

		int n = vet.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (vet[j] < vet[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = vet[minIndex];
            vet[minIndex] = vet[i];
            vet[i] = temp;
		
        }
        System.out.println("Vetor ordenado:");
        for(int valor:vet) {
        	System.out.print(valor + " ");
        }
		
		sc.close();
	}

}
