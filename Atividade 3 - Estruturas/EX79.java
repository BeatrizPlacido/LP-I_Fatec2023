package estruturas;

import java.util.Scanner;

public class EX79 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Double vet[] = new Double[20];
        double nota_aluno = 0.0;
        double soma_total = 0.0;
        double media_total = 0.0;
        int alunos_aptos = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite a nota do Aluno " + (i +1));
            nota_aluno = sc.nextDouble();
            vet[i] = nota_aluno;
            soma_total = soma_total + vet[i];
        }
        media_total = soma_total / 20;

        for (int i = 0; i < 20; i++) {
            if (vet[i] >= media_total){
                alunos_aptos = alunos_aptos + 1;
            }
        }
        System.out.println("Média da sala: " + media_total);
        System.out.println("Alunos aptos: " + alunos_aptos);
        
        sc.close();
    }
}
