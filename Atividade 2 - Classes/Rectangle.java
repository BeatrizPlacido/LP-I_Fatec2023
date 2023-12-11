package classes;

public class Rectangle {

	public double a;
	public double b;

	
	public double area() {
		return a * b;
	}
	
	public double perimeter() {
		return 2*a + 2*b;
		
	}
	
	public double diagonal() {
		return Math.sqrt(a*a + b*b);
		
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	
}