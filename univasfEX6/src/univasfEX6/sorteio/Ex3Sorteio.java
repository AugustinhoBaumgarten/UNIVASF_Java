package univasfEX6.sorteio;

import java.util.Scanner;

public class Ex3Sorteio {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// randomNum recebe o Math.random() * 1000 que é o tamanho do intervalo e soma mais 0 para indicar o inicio
		//do intervalo, isso tudo é declarado como inteiro pois Math.random() retorna valores tipo double entre 0 e 1

		int randomNum = (int) (Math.random() * 1000) + 0;
		int palpite;
		int contador = 0;
		
		System.out.println("==========================================");

		System.out.println("...Gerando número aleatório de 0 a 1000...");
		
		System.out.println("==========================================");
		do {
		contador += 1;
		
		System.out.println("- De seu palpite: ");
		palpite = scanner.nextInt();
		
		if(palpite == randomNum){
			System.out.println("Parabens você acertou!!");
		}else if(palpite < randomNum){
			System.out.println("menor que o número sorteado");
		}else {
			System.out.println("maior que o numero sorteado");
		}
		
		//System.out.println(randomNum);
		}while(palpite != randomNum);

		System.out.println("Você acertou após " + contador + " tentativas. ");
		scanner.close(); 
		
		
	}
}
