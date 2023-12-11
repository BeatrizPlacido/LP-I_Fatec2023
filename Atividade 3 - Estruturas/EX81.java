package estruturas;

import java.util.ArrayList;
import java.util.Scanner;

public class EX81 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        ArrayList<Integer> q = new ArrayList<Integer>(20);
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Entre com um número inteiro positivo: ");
            int verificador = sc.nextInt();

            if (verificador < 0) {
                System.out.println("É aceito apenas números positivos");
                i--;
            } else {
                q.add(verificador);
            }
        }

        int menorValor = q.get(0);
        int posicao = 0;

        for (int i = 0; i < q.size(); i++) {
            if (q.get(i) < menorValor) {
                menorValor = q.get(i);
                posicao = i;
            }
        }

        System.out.println("Menor Valor: " + menorValor + "\nPosição: " + (posicao + 1));
        sc.close();
    }
}


