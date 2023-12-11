package classes;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public Student (String name){
		this.name = name;
	}
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public double missingPoints() {
		if (finalGrade() > 60) {
			return 0;			
		}
		else {
			return 60 - finalGrade();
		}
	}
	
	public void status() {
		if (finalGrade() > 60) {
			System.out.println("PASS");
			}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", missingPoints());}
	}
}