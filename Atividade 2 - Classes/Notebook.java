package classes;

public class Notebook {
	public String marca;
	public double preço;
	public String processador;
	
	public Notebook(String marca, double preço, String processador) {
		super();
		this.marca = marca;
		this.preço = preço;
		this.processador = processador;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public double promoção() {
		return preço - 0.2 * preço;
	}
	
}
