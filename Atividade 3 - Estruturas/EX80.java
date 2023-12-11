package estruturas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX80 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        List<Integer> q = new ArrayList<>();
        
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

        int maiorValor = 0;
        int posicao = 0;

        for (int i = 0; i < q.size(); i++) {
            if (q.get(i) > maiorValor) {
                maiorValor = q.get(i);
                posicao = i;
            }
        }

        System.out.println("Maior Valor: " + maiorValor + "\nPosição: " + (posicao + 1));
        sc.close();
    }
}
