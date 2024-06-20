package univasf.fatura;

public abstract class  Fatura {
	

	protected String numero;
	protected String descricao;
	protected int quantidadeCompradaItem;
	protected double precoItem;
	
	 public Fatura(String numero, String descricao, int quatidadeCompradaItem, double precoItem) {
		this.numero = numero;
		this.descricao = descricao;
		this.quantidadeCompradaItem = quatidadeCompradaItem;
		this.precoItem = precoItem;
	 }
	
	
	 public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuatidadeCompradaItem() {
		return quantidadeCompradaItem;
	}

	public void setQuatidadeCompradaItem(int quatidadeCompradaItem) {
		this.quantidadeCompradaItem = quatidadeCompradaItem;
	}

	public double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}
	
	public double getTotalFatura(){
		double totalFatura = quantidadeCompradaItem * precoItem;
		if (totalFatura < 0) {
			return 0;
		}else {
			return totalFatura;
		}
	}
	
	@Override
	public String toString() {
		return "Fatura [numero=" + numero + ", descricao=" + descricao + ", quantidadeCompradaItem="
				+ quantidadeCompradaItem + ", precoItem=" + precoItem + "]";
	}
	
}
	 
	 

	

