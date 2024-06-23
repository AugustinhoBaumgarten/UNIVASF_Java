package univasfEX7;


import java.util.Arrays;
import java.util.Scanner;

public class Permutacao {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número inteiro N1: ");
		int n1 = scanner.nextInt();
		
		System.out.println("Digite o número inteiro N2: ");
		int n2 = scanner.nextInt();
	
		
		
		//chamada do metodo ePermutacao
		if(ePermutacao(n1, n2)) {
			System.out.println("é permuação de " + n2);
		}else {
			System.out.println("não é permutacao de " + n2); 
		}
			
		
		
		
		
		scanner.close();
	}
	//criacao do metodo ePermutacao que vai converter os números inteiro em String str1 e str2
	//Em seguida vai o tamanho da string de str1 e str2 e comparar retornando falso caso diferentes 
	//se der false não será permutação
		public static boolean ePermutacao(int n1, int n2) {
			String str1 = Integer.toString(n1);
			String str2 = Integer.toString(n2);	
		
			if(str1.length() != str2.length()) {
			return false;
		}
			
		//cria a variavel charArray 1 e 2 transformando as strings em caracteres
		//era int 123 depois virou string "123" e aqui tornou-se um array de caracteres ["1","2","3"]
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
	
		//ordena os arrays de caracteres
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
		
		//compara os arrays de caracteres ordenados: charArray1 e charArray2
		// retornando-os ao n1 e n2 (n1 = charArray1 / n2 = charArray2)
		return Arrays.equals(charArray1, charArray2);
		
		}
		
}
	