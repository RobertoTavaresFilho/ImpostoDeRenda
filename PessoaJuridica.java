package aula43.labs.exerc2;

public class PessoaJuridica extends Contrubuintes {

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + " " +" Imposto a ser pago "+calcularImposto()+" " +super.toString() + " ]";
	}

	@Override
	public double calcularImposto() {
		return this.getRendaBruta()*0.1;
	}
	
}
