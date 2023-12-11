package estruturas;

import java.util.Scanner;

public class EX78 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
			String v[] = new String[10];
			boolean encontou = false;
			for (int i=0; i<10; i++){
			    String nome = sc.nextLine();
			    v[i] = nome;
			}

			System.out.print ("Digite o nome que deseja procurar: ");
			String procurar_nome = sc.next();
			for (int i=0;i<10;i++) {
			    if (v[i].equals(procurar_nome)) {
			        System.out.println("ACHEI " + procurar_nome);
			        encontou = true;
			        break;
			    }}
			if (!encontou) {
			    System.out.println ("NÃO ACHEI");
			}
		}
    }
}
