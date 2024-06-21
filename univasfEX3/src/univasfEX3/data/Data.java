package univasfEX3.data;

public class Data {
	private int mes;
	private int dia;
	private int ano;
	
	public Data(int mes, int dia, int ano) {
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void displayData() {
		System.out.printf("%02d/%02d/%d%n", mes, dia, ano);
	}

	//no caso o exercicio pediu para fazer o método displayData mas deixei como plus o método toString 
	//que também poderia ser usado para o exercício que se propõe
	@Override
	public String toString() {
		return "Data [mes=" + mes + ", dia=" + dia + ", ano=" + ano + "]";
	}
	
	
}
