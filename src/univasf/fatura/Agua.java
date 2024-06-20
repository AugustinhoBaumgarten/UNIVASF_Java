package univasf.fatura;

public class Agua extends Fatura {


	private double valorLitro;

	public double getValorLitro() {
		return valorLitro;
	}

	public void setValorLitro(double valorLitro) {
		this.valorLitro = valorLitro;
	}



	public Agua(String numero, String descricao, int quatidadeCompradaItem, double precoItem, double valorLitro) {
		super(numero, descricao, quatidadeCompradaItem, precoItem);
		this.valorLitro = valorLitro;
	}


	@Override
	public String toString() {
		return "Agua [numero=" + numero + ", descricao=" + descricao + ", quantidadeCompradaItem="
				+ quantidadeCompradaItem + ", precoItem=" + precoItem + ", valorLitro=" + valorLitro + "]";
	}




	
}
