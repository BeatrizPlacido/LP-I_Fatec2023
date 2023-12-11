package classes;

public class Lapis {
	public double desconto;
	public String marca;
	public int cores;
	public double preço;
	
	public Lapis (String marca, int cores, double preço) {
		this.marca = marca;
		this.cores = cores;
		this.preço = preço;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCores() {
		return cores;
	}

	public void setCores(int cores) {
		this.cores = cores;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	public double preçoPorLapis() {
		return preço/cores;
	}
	
	public double desconto() {
		return preço - (desconto/100) * preço;
	}
	
}
