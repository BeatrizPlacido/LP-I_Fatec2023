package estruturas;

import java.util.Scanner;

public class EX82 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
	     int[] a = new int[10];
	     int[] m = new int[10];
	     int x;
	        

	     for(int i = 0; i<10; i++){
	    	 System.out.println("Digite o valor");
	         a[i] = sc.nextInt();
	     }
	     System.out.println("Digite o valor de X: ");
	     x = sc.nextInt();

	     for(int i = 0; i<10;i++){
	    	 m[i] = a[i]*x;
	     }
	     for(int i = 0; i<10;i++){
	    	 System.out.println("M["+i+"] = "+m[i]);
	        }
		 sc.close();
	    }

}
