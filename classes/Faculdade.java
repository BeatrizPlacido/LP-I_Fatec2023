package classes;

public class Faculdade {
	private String nome;
    private double notaMec;
    private int qtdAlunos;
    public int movimentoAlunos;
    
    
    public Faculdade(String nome, double notaMec, int qtdAlunos){
        this.nome = nome;
        this.notaMec = notaMec;
        this.qtdAlunos = qtdAlunos;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaMec() {
        return notaMec;
    }

    public void setNotaMec(double notaMec) {
        this.notaMec = notaMec;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setmovimentoAlunos(int movimentoAlunos) {
        this.movimentoAlunos = movimentoAlunos;
    }
    
    public int getmovimentoAlunos() {
        return movimentoAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }
    
    public int formatura(){
        return qtdAlunos - movimentoAlunos;   
    }

    public int desistencia(){
    	return qtdAlunos - movimentoAlunos;

    }

    public int matricula(){
        return qtdAlunos - movimentoAlunos;


    }
}

