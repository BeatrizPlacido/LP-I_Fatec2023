package classes;

import java.util.Scanner;
import java.util.Locale;

public class teste{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
        int numero = sc.nextInt();
        System.out.println("1. Lapis");
        System.out.println("2. Bolas");
        System.out.println("3. Triangulo");
        System.out.println("4. Estudante");
        System.out.println("5. Retangulo");
        System.out.println("6. Produto ");
        System.out.println("7. Refrigerante");
        System.out.println("8. Faculdade");
        System.out.println("9. Casasmento");
        System.out.println("10. Notebook");

        if (numero == 1) {
	        //Classe 1
			Lapis lapis = new Lapis("FaberCastell", 24, 24.96 );
	        System.out.println("Marca: " + lapis.getMarca());
	        System.out.println("Preço: " + lapis.getPreço());
	        System.out.println("Preço por unidade: " + lapis.preçoPorLapis());
	        System.out.println("Valor promocional: " + lapis.desconto());
        }  
        else if (numero == 2) {   
	        //Classe 2
	        Bolas bola = new Bolas ("Adidas", "Futebol", 1, 299.99);
	        System.out.println("Marca: " + bola.getMarca());
	        System.out.println("Modalidade: " + bola.getModalidade());
	        System.out.println("Preço: " + bola.getPreço());
	        bola.setQuantidade(2);
	        System.out.printf("Nova quantidade: " + bola.getQuantidade());
	        System.out.printf("Valor final: " + bola.valorTotal());
        }
        else if (numero == 3) {
	        //Classe 3        
			Triangle x, y;
			x = new Triangle(3, 4, 5);
			y = new Triangle(6, 8, 10);
			
			System.out.printf("Triangle X area: %.4f%n", x.area());	
			System.out.printf("Triangle Y area: %.4f%n", y.area());
        }
        else if (numero == 4) {
	        //Classe 4
			Student student = new Student("Luis");
					
			student.name = sc.nextLine();
			student.grade1 = sc.nextDouble();
			student.grade2 = sc.nextDouble();
			student.grade3 = sc.nextDouble();
			
					
			System.out.println("FINAL GRADE = " + student.finalGrade());
        }
        else if (numero == 5) {	
			//Classe 5 
			Rectangle rectangle = new Rectangle();
			
			System.out.println("Enter rectangle width and height:");
			rectangle.a = sc.nextDouble();
			rectangle.b = sc.nextDouble();
			
			System.out.printf("AREA = %.2f%n", rectangle.area());
			System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
			System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		
			sc.close();
        }
        else if (numero == 6) {			
	        //Classe 6 
			Product product = new Product("TV", 600.00, 3);
			
			System.out.println("Valor total do estoque: " + product.getPrice());
			System.out.print("Informe a quantidade de itens a serem adicionados ao estoque: ");
			int quantity = sc.nextInt();
			product.addItem(quantity);
			
			System.out.println("Valor atualizado do estoque: " + product.totalValueInStock());
        }
        else if (numero == 7) {	
	        //Classe 7 
			Refrigerante refri = new Refrigerante("Fanta", 2000, "Uva");
			
	        System.out.println("Digite o tamanho do copo em mL:");
	        refri.setVolume(sc.nextInt());
	        refri.abrir();
	        System.out.println("Sobrou na garrafa (ml): " + refri.colocar());
	        refri.fechar();
        }
        else if (numero == 8) {
	        //Classe 8 
	        Faculdade facul = new Faculdade("Anhembi", 3.5, 2000 );
	        
	        System.out.println("Nota 2022: " + facul.getNotaMec());
	        facul.setNotaMec(4);
	        System.out.println("Nota 2023: " + facul.getNotaMec());
	        
	        facul.setmovimentoAlunos(200);
	        System.out.println("Alunos matriculados após a formatura: " + facul.formatura());
        }
        else if (numero == 9) {	
	        //Classe 9
	        Casamento casamento = new Casamento("Luis", "Beatriz", 120, "Inverno");
	        
	        casamento.entrada();
	        casamento.JogarArroz();
	        System.out.println("Cada convidado doou R$50,00, totalizando: RS" + casamento.presente());
        }
        else if (numero == 10) {	
	        //Classe 10
	        Notebook note = new Notebook("Dell", 2400, "i7");
	        
	        System.out.println("Valor promocional: " + note.promoção()); 
	        note.setPreço(2700);
	        System.out.println("Novo valor: " + note.promoção());
        }
        else {
        	System.out.println("Resposta inválida");
        }
        
	}
}