package univasfEX2.empresa;

public class Main {
	
	public static void main(String[]args) {
		Empregado Augusto = new Empregado("Augusto", "Baumgarten", 1200.00);
		System.out.println(Augusto);
		
		
		System.out.println("Salário anual: " + Augusto.salarioAnual());
		//print formatado para resultado com duas casas após a virgula
		System.out.printf("Salário anual com aumento de 10%%: R$%.2f%n",  Augusto.salarioComDezPorcento());
		
		System.out.println("---------------------------------------------------------------------------");
		
		Empregado Fernando = new Empregado("Fernando", "Pereira", 3000.00);
		System.out.println(Fernando);
		
		System.out.println("Salário anual: " + Fernando.salarioAnual());
		//print formatado para resultado com duas casas após a virgula
		System.out.printf("Salário anual com aumento de 10%%: R$%.2f%n",  Fernando.salarioComDezPorcento());
}
}