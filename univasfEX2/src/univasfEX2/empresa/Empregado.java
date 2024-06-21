package univasfEX2.empresa;

public class Empregado {
	private String nome;
	private String sobrenome;
	private double salarioMensal;
	
	
	public Empregado(String nome, String sobrenome, double salarioMensal) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioMensal = salarioMensal;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public double getSalarioMensal() {
		return salarioMensal;
	}


	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	//método para calcular o salário anual
	public double salarioAnual() {
		return salarioMensal * 12;
	}
	
	//metodo para calcular o aumento de dez porcento no salário anual
	public double salarioComDezPorcento() {
		return salarioAnual() * 1.10;
	}


	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", sobrenome=" + sobrenome + ", salarioMensal=" + salarioMensal + "]";
	}



	
}
