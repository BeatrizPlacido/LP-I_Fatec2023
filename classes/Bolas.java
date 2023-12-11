package classes;

public class Bolas {
	public String marca;
	public String modalidade;
	public double preço;
	public int quantidade;
	
	public Bolas (String marca, String modalidade, int quantidade, double preço) {
		this.marca = marca;
		this.modalidade = modalidade;
		this.quantidade = quantidade;
		this.preço = preço;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String esporte) {
		this.modalidade = esporte;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	public double valorTotal() {
		return quantidade * preço;
	}
	
	public double desconto() {
		return preço - 0.2 * preço;
	}
}
