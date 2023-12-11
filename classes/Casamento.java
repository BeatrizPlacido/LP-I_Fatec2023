package classes;

public class Casamento {
	public String noivo;
    public String noiva;
    public int convidados;
    public String estacaoDoAno;


    public Casamento(String noivo, String noiva, int convidados, String estacaoDoAno) {
        this.noivo = noivo;
        this.noiva = noiva;
        this.convidados = convidados;
        this.estacaoDoAno = estacaoDoAno;
    }


    public String getNoivo() {
        return noivo;
    }

    public void setNoivo(String noivo) {
        this.noivo = noivo;
    }

    public String getNoiva() {
        return noiva;
    }

    public void setNoiva(String noiva) {
        this.noiva = noiva;
    }

    public int getConvidados() {
        return convidados;
    }

    public void setConvidados(int convidados) {
        this.convidados = convidados;
    }

    public String getEstacaoDoAno() {
        return estacaoDoAno;
    }

    public void setEstacaoDoAno(String estacaoDoAno) {
        this.estacaoDoAno = estacaoDoAno;
    }
    
    
    public String entrada(){
        return "Banda inicia as músicas para entrada dos noivos";
    }
    
    public String JogarArroz(){
        return "Saída dos noivos! Os padrinhos podem jogar arroz!";
    }
    
    public int presente(){
        int dinheiroLuadeMel = convidados * 50;
        return dinheiroLuadeMel;   
    }


}
