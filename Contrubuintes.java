package aula43.labs.exerc2;



public abstract class Contrubuintes {
	
	private String nome;
	private double rendaBruta;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	@Override
	public String toString() {
		return "Contrubuintes [nome=" + nome + ", rendaBruta=" + rendaBruta + "]";
	}
	
	public abstract double calcularImposto();
		
		
		
		
	
	

	
	
}
