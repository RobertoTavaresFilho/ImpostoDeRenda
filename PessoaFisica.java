package aula43.labs.exerc2;

public class PessoaFisica  extends Contrubuintes{
	
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + " "+"Imposto a ser pago :"+calcularImposto()+ " " + super.toString()+" ]";
	}

	@Override
	public double calcularImposto() {
		double renda = this.getRendaBruta();
		if(renda  <=1400) {
			return 0;
		}else if (renda >140 && renda <= 2100) {
			return (renda * 0.1)-100;
		}else if (renda >2100 && renda <= 2800 ) {
			return (renda* 0.15)-270;
		}else if (renda >2800 && renda <= 3600) {
			return (renda * 0.25)-500;
		}
			return(renda* 0.3)-700;
			
	}
	
	

}
