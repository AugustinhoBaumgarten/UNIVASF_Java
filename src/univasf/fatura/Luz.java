package univasf.fatura;

public class Luz extends Fatura {

	private double joule;
	private String Bandeira;
	
	public double getJoule() {
		return joule;
	}

	public void setJoule(double joule) {
		this.joule = joule;
	}

	public String getBandeira() {
		return Bandeira;
	}

	public void setBandeira(String bandeira) {
		Bandeira = bandeira;
	}


	public Luz(String numero, String descricao, int quatidadeCompradaItem, double precoItem, double joule,
			String bandeira) {
		super(numero, descricao, quatidadeCompradaItem, precoItem);
		this.joule = joule;
		Bandeira = bandeira;
	}

	@Override
	public String toString() {
		return "Luz [numero=" + numero + ", descricao=" + descricao + ", quantidadeCompradaItem="
				+ quantidadeCompradaItem + ", precoItem=" + precoItem + ", joule=" + joule + ", Bandeira=" + Bandeira
				+ "]";
	}



	
}
