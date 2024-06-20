package univasf.fatura;

public class Main {
	
	public static void main (String[]args) {
	
		
	System.out.println("==================================================================================");
		
	Luz luz = new Luz("123456789", "Fatura de Luz Celesc", 4, 100.0, 0.687,"Bandeira amarela");
	System.out.println(luz.toString());
	
	System.out.println("----------------------------------------------------------------------------------");

	
	Agua agua = new Agua("4444456", "Fatura de água Casan", 2, 68.50, 0.67);
	System.out.println(agua.toString());
	
	System.out.println("----------------------------------------------------------------------------------");

	
	Internet internet = new Internet("555846132146", "Fatura de Internet Claro", 1, 150.0, 300, false, 1 );
	System.out.println(internet.toString());

	System.out.println("==================================================================================");

	}
	
}