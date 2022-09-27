package aula43.labs.exerc2;

public class Teste {

	public static void main(String[] args) {
		
		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Contribuintes 1");
		p1.setRendaBruta(1000);
		p1.setCpf("916.736.710-04");
		
		PessoaFisica p2 = new PessoaFisica();
		p2.setNome("Contribuintes 2");
		p2.setRendaBruta(5000);
		p2.setCpf("043.830.240-09");
		
		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("Contribuintes 3");
		p3.setRendaBruta(2000);
		p3.setCpf("258.494.200-37");
		
		PessoaJuridica p4 = new PessoaJuridica();
		p4.setNome("Contribuintes 4");
		p4.setRendaBruta(3000);
		p4.setCnpj("42.838.782/0001-82");
		
		PessoaJuridica p5 = new PessoaJuridica();
		p5.setNome("Contribuintes 5");
		p5.setRendaBruta(3700);
		p5.setCnpj("99.408.073/0001-84");
		
		PessoaJuridica p6 = new PessoaJuridica();
		p6.setNome("Contribuintes 6");
		p6.setRendaBruta(4000);
		p6.setCnpj("71.913.467/0001-70");
	
		Contrubuintes[] contrubuintes = new Contrubuintes[6];
		contrubuintes[0] = p1;
		contrubuintes[1] = p2;
		contrubuintes[2] = p3;
		contrubuintes[3] = p4;
		contrubuintes[4] = p5;
		contrubuintes[5] = p6;
		
		for (Contrubuintes c : contrubuintes) {
			System.out.println(c.toString());
		}

	}

}
