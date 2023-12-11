package estruturas;

import java.util.Scanner;

public class EX83 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
        int[] vetor = new int[20];
        
        for(int i = 0; i<20; i++){
            System.out.println("Digite o valor:");
            vetor[i] = sc.nextInt();
        }
        System.out.println("Inverso do vetor:");
        for(int i = 19; i>=0; i--){
            System.out.println(vetor[i]);
        }
        sc.close();
    }
}
