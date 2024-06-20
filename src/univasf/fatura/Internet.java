package univasf.fatura;

public class Internet extends Fatura {
	

	private int consumoEmMega;
	private boolean requisitouAssistencia;
	private int quantidadeAssistencia;

	
	public Internet(String numero, String descricao, int quatidadeCompradaItem, double precoItem, int consumoEmMega,
			boolean requisitouAssistencia, int quantidadeAssistencia) {
		super(numero, descricao, quatidadeCompradaItem, precoItem);
		this.consumoEmMega = consumoEmMega;
		this.requisitouAssistencia = requisitouAssistencia;
		this.quantidadeAssistencia = quantidadeAssistencia;
	}
	
	public int getConsumoEmMega() {
		return consumoEmMega;
	}


	public void setConsumoEmMega(int consumoEmMega) {
		this.consumoEmMega = consumoEmMega;
	}


	public boolean isRequisitouAssistencia() {
		return requisitouAssistencia;
	}


	public void setRequisitouAssistencia(boolean requisitouAssistencia) {
		this.requisitouAssistencia = requisitouAssistencia;
	}


	public int getQuantidadeAssistencia() {
		return quantidadeAssistencia;
	}


	public void setQuantidadeAssistencia(int quantidadeAssistencia) {
		this.quantidadeAssistencia = quantidadeAssistencia;
	}


	@Override
	public String toString() {
		return "Internet [numero=" + numero + ", descricao=" + descricao + ", quantidadeCompradaItem="
				+ quantidadeCompradaItem + ", precoItem=" + precoItem + ", consumoEmMega=" + consumoEmMega
				+ ", requisitouAssistencia=" + requisitouAssistencia + ", quantidadeAssistencia="
				+ quantidadeAssistencia + "]";
	}

	
	
	
}
