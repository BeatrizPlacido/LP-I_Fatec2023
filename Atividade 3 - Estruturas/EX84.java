package estruturas;

import java.util.Scanner;

public class EX84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor de N: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] soma = new int[n];

        for(int i = 0; i<n; i++){
            System.out.println("Digite o "+ (i+1)+"º valor do vetor A:");
            a[i] = sc.nextInt();
            System.out.println("Digite o "+ (i+1)+"º valor do vetor B:");
            b[i] = sc.nextInt();
        }
        for(int i=0; i < n; i++) {
            soma[i] = a[i] + b[i];
        }

        System.out.println("Vetor Soma: ");
        for(int i=0; i<n; i++) {
            System.out.println(soma[i]);
        }
        
        sc.close();
    }

}
