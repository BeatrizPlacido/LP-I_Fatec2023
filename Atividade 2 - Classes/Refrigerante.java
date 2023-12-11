package classes;

public class Refrigerante {
	
	private String marca;
    private int volume;
    private String sabor;
    private int copo;


    public Refrigerante(String marca, int volume, String sabor) {
        this.marca = marca;
        this.volume = volume;
        this.sabor = sabor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String abrir() {
        return "Você abriu o refrigeramte! Beba com moderação!!!";
    }

    public int colocar() {
        return volume - copo;
    }

    public String fechar() {
      return  "Você fechou seu Refrigerante! Isso mantén o gás por mais tempo!";
    }

}
